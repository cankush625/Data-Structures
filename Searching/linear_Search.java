package Searching;
import java.util.Scanner;

public class linear_Search {
    private static Scanner scanner = new Scanner(System.in);

    private static void search(int[] array, int x){
        int flag = 0;
        for (int anArray : array) {      //Its equal to :  for(int i = 0; i < array.length; i++){
            if (anArray == x) {          //if(array[i] == x){
                flag = 1;
            } else {
                flag = 0;
            }
        }
        if (flag == 1){
            System.out.println("Element " + x + " is found in the array!");
        }else {
            System.out.println("Element " + x + " is not found in the array!");
        }
    }

    public static void main(String[] args){
        int x;
        int[] array = {2, 4, 6, 3, 9, 7};

        System.out.println("Enter the value of the element to be search");
        x = scanner.nextInt();

        search(array, x);
    }
}

// by Ankush Chavan