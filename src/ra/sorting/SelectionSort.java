package ra.sorting;

public class SelectionSort {
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1 ; i++) {
            // giả sử giá trị min là pần tử đầu tiên của mảng cần duyệt
            int minValue = arr[i];
            int indexMin = i;
            for(int j = i +1; j< arr.length; j++){ // tìm phần tử nho nhất trong mảng
                if (arr[j] < minValue){
                    minValue = arr[j];
                    indexMin = j;
                }
            }
            // đổi chỗ với phần tử đầu tiên nếu như vị trí khác vị trí đầu tiên
            if (indexMin != i){
                arr[indexMin] = arr[i];
                arr[i] = minValue;
            }
        }

    }
}
