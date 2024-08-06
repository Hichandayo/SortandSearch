package ra.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length  ; i++) {
            System.out.println("Vòng lặp i :" +i +" Giá trị curent : " +arr[i] );
            int currentValue = arr[i];
            int indexInsert = i;
            for (int k = i-1 ; k >= 0 && currentValue < arr[k]; k--){
                System.out.println("So sách 2 giá trị "+currentValue +" và "+arr[k]);
                arr[k+1] = arr[k];
                indexInsert = k;
                System.out.println("Mảng sau khi dịch phần tử "+ Arrays.toString(arr));
                System.out.println("Vị trí cần chèn "+indexInsert);
            }
            arr[indexInsert] = currentValue;
        }
    }
}
