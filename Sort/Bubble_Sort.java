public class Bubble_Sort{
    public static void bubble_sort(int[] array1){
//        boolean isSorted = false;
//        while(!isSorted) {
//            isSorted = true;
            for (int i = 0; i < array1.length - 1; i++) {
                if (array1[i] > array1[i + 1]) {
                    swap(array1, i, i + 1);
//                    isSorted = false;
//                }
            }
        }
        System.out.println(array1);
    }

    public static void swap(int[] array1, int i, int j){
        int temp = array1[i];
        array1[i] = array1[j];
        array1[j] = temp;
    }

    public static void main(String[] args){
        int[] array1 = {2, 5, 3, 9, 7};
        bubble_sort(array1);
    }
}

/*
Output :
2
3
5
7
9
*/

//By Ankush Chavan