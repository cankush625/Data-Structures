package LinkedList;
import java.util.Scanner;

public class DoublyLinkedList {
    private static Scanner scanner = new Scanner(System.in);

    static class node{
        int data;
        node next;
        node prev;

        public node(int data) {
            this.data = data;
        }
    }

    public static int countNodes(node head){
        int count = 1;
        node current = head;
        while (current.next != null){
            current = current.next;
            count += 1;
        }
        return count;
    }
    
    private static void appendNode(node head, int data){
        if (head == null){
            head = new node(data);
        }
        node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = new node(data);
        current.next.next = null;
        current.next.prev = current;
    }

    private static void prepend(node head, int data){
        node newHead = new node(data);
        newHead.next = head;
        head = newHead;
    }

    private static void deleteNode(node head, int data){
        node current = head;
        if (head == null){
            return;
        }

        if (head.data == data){
            head = head.next;
            return;
        }
        while(current.next != null){
            if (current.next.data == data){
                current.next = current.next.next;
                return;
            }
            current = current.next;
            current.prev = current.prev.prev; //not sure if this is right
        }
    }

    public static void main(String[] args){
        node head = new node(2);
        node nodeB = new node(3);
        node nodeC = new node(5);
        node nodeD = new node(7);

        head.next = nodeB;
        head.prev = null;
        nodeB.next = nodeC;
        nodeB.prev = head;
        nodeC.next = nodeD;
        nodeC.prev = nodeB;
        nodeD.next = null;
        nodeD.prev = nodeC;

        System.out.println("1. Add data at the end \n2. Add data at the head \n3. Delete the data \n4. Count no. of entries \n5. Exit");
        boolean test = false;

        while(!test) {
            System.out.println("Enter your choice : ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    int appVal;
                    System.out.println("Enter the data to be insert");
                    appVal = scanner.nextInt();
                    appendNode(head, appVal);
                    System.out.println(appVal + " added to the end successfully!");
                    break;
                case 2:
                    int headVal;
                    System.out.println("Enter the data to be insert");
                    headVal = scanner.nextInt();
                    prepend(head, headVal);
                    System.out.println(headVal + " added to the head successfully!");
                    break;
                case 3:
                    int delVal;
                    System.out.println("Enter the data to be delete");
                    delVal = scanner.nextInt();
                    deleteNode(head, delVal);
                    System.out.println(delVal + " deleted successfully!");
                    break;
                case 4:
                    System.out.println(countNodes(head));
                    break;
                case 5:
                    System.out.println("Exiting the application");
                    test = true;
                    break;
            }
        }
    }
}
