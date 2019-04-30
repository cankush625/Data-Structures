package Searching;
import java.util.Scanner;

public class binarySearch {
    private static Scanner scanner = new Scanner(System.in);

    private static int search(int[] array, int beg, int end, int x){
        int mid;
        //beg = 0;
        //end = array.length - 1;

        if(end >= beg) {
            mid = (beg + end) / 2;

            if (array[mid] == x) {
                System.out.println("Element " + x + " is found in the array!");
            } else if (array[mid] < x) {
                beg = mid + 1;
                end = array.length - 1;
                return search(array, beg, end, x);
            }
            else {
                beg = 0;
                end = mid - 1;
                return search(array, beg, end, x);
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int x;
        int[] array = {2, 3, 4, 6, 7, 8, 9};

        System.out.println("Enter an element to be search");
        x = scanner.nextInt();

        search(array, 0, array.length-1, x);
    }
}

// by  Ankush Chavan