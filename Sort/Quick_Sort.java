public class Quick_Sort {
//    public static void quickSort(int[] array){
//        quickSort(array, 0, array.length - 1);
//    }

    public static void quickSort(int[]  array, int left, int right){
        if(left <= right){
            return;
        }

        int pivot = (left + right)/2;
        int index = partition(array, left, right, pivot);
        quickSort(array, left, index - 1 );
        quickSort(array, index, right);
    }

    public static int partition(int[] array, int left, int right, int pivot){
        while (left <= right){
            while(array[left] < pivot){
                left++;
            }

            while (array[right] > pivot){
                right--;
            }

            if (left <= right){
                swap(array, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    public static void swap(int[] array, int left, int right){
        int temp;
        temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

    public static void main(String[] args){
        int[] array = {2, 5, 3, 9, 7};
        quickSort(array, 0, array.length - 1);
        System.out.println(array);
    }
}

/*
Output :
2
5
3
9
7
*/

//By Ankush Chavan