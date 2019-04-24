public class Merge_Sort {
    public static void mergeSort(int[] array){
        mergeSort(array, new int[array.length], 0, array.length - 1);
    }

    public static void mergeSort(int[] array, int[] temp, int leftStart, int rightEnd){ //we are creating a temporary array temp
        if(leftStart >= rightEnd){
            return;
        }

        int middle = (leftStart + rightEnd)/2;
        mergeSort(array, temp, leftStart, middle);
        mergeSort(array, temp, middle + 1, rightEnd);
        mergeHalves(array, temp, leftStart, rightEnd);
    }

    public static void mergeHalves(int[] array, int[] temp, int leftStart, int rightEnd){
        int leftEnd = (rightEnd + leftStart)/2;
        int rightStart = leftEnd + 1;
        int size = rightEnd - leftStart + 1;

        int left = leftStart;
        int right = rightStart;
        int index = leftStart;

        while(left <= leftEnd && right <= rightEnd){
            if(array[left] <= array[right]){
                temp[index] = array[left];
                index++;
                left++;
            }else{
                temp[index] = array[right];
                index++;
                right++;
            }
        }

        System.arraycopy(array, left, temp, index, leftEnd - left + 1);
        System.arraycopy(array, right, temp, index, rightEnd - right + 1);
        System.arraycopy(temp, leftStart, array, leftStart, size);
    }

    public static void main(String[] args){
        int[] array = {2, 5, 3, 9, 7};
        mergeSort(array);

        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

//by Ankush Chavan