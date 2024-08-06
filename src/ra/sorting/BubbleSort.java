package ra.sorting;

public class BubbleSort {
    public static void bubbleSort(int[] arr){
        boolean isNext = true;
        for(int i=0; i< arr.length-1 && isNext; i++){ // duyệt đến phần tử gần cuối
            System.out.println("Vòng lặp i : "+i);
            isNext = false;
            for (int j = 0; j< arr.length-1-i; j++){
                System.out.println("\tvòng lặp j :"+j);
                if (arr[j] > arr[j+1]){
                    // đổi vị trí 2 phần tử
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isNext = true; // nếu như có sự đổi chỗ 2 phâ ử thì mảng vẫn cần được sắp xếp
                }
            }
        }
    }
}
