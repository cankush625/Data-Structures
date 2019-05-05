package Stack_and_Queue;
import java.util.Scanner;

public class Stack {
    private static Scanner scanner = new Scanner(System.in);
    private static class node{
        private int data;
        private node next;

        node(int data){
            this.data = data;
        }
    }

    private static node top;

    public static boolean isEmpty(){
        return top == null;
    }

    public static int peek(){
        if (top == null){
            return 0;
        }
        return top.data;
    }

    public static void push(int data){
        node newNode = new node(data);
        newNode.next = top;
        top = newNode;
    }

    public static int pop(){
        int data = top.data;
        top = top.next;
        if (top == null){
            System.out.println("Stack is empty");
        }
        return data;
    }

    public static void main(String[] args){
        boolean test = false;
        while(!test){
            System.out.println("1. Is empty?");
            System.out.println("2. Peek value");
            System.out.println("3. Push data");
            System.out.println("4. Pop data");
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
                    push(value);
                    break;
                case 4 :
                    System.out.println(pop() + " successfully popped out!");
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