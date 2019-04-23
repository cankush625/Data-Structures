public class Insertion_Sort {
    public static void main(String[] args){
        int[] array = {2, 10, 3, 8, 5, 43,6};

        for(int k = 1; k<array.length; k++){
            int temp = array[k];
            int j = k - 1;

            while(j >= 0 && temp <= array[j]) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = temp;
        }
        System.out.println("Sorted elements are : ");

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}

/*
Sorted elements are :
2
3
5
6
8
10
43
*/

//By Ankush Chavan