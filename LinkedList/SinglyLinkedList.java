package LinkedList;

public class SinglyLinkedList {
     static class node{
        int data;
        node next;
        node(int data){
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

    public static void main(String[] args){
         node head = new node(2);
         node nodeB = new node(4);
         node nodeC = new node(7);
         node nodeD = new node(8);

         head.next = nodeB;
         nodeB.next = nodeC;
         nodeC.next = nodeD;

        System.out.println(countNodes(head));
    }
}

//by Ankush Chavan

/*
   Output :
    4
 */