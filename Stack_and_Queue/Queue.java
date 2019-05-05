package Stack_and_Queue;
import java.util.Scanner;

public class Queue {
    private static Scanner scanner = new Scanner(System.in);
    private static class node{
        private int data;
        private node next;

        private node(int data){
            this.data = data;
        }
    }

    private static node head; //remove from here
    private static node tail; //add things here

    public static boolean isEmpty(){
        return head == null;
    }

    public static int peek(){
        if (head == null){
            return 0;
        }
        return head.data;
    }

    public static int addData(int data){
        node newNode = new node(data);
        if (tail != null){
            tail.next = newNode;
        }
        tail = newNode;
        if (head == null){
            head = newNode;
        }
        return 0;
    }

    public static int remove(){
        int data = head.data;
        head = head.next;
        if (head == null){
            tail = null;
        }
        return data;
    }

    public static void main(String[] args){
        boolean test = false;
        while(!test){
            System.out.println("1. Is empty?");
            System.out.println("2. Peek value");
            System.out.println("3. Add data");
            System.out.println("4. Remove data");
            System.out.println("5. Exit");

            System.out.println("Enter your choice : ");
            int choice = scanner.nextInt();

            switch (choice){
                case 1 :
                    System.out.println(isEmpty());
                    break;
                case 2 :
                    System.out.println(peek());
                    break;
                case 3 :
                    System.out.println("Enter a value to add in the queue");
                    int value = scanner.nextInt();
                    addData(value);
                    break;
                case 4 :
                    System.out.println(remove() + " successfully removed!");
                    break;
                case 5 :
                    System.out.println("Exiting the application");
                    test = true;
                    break;
            }
        }
    }
}

//by Ankush Chavan