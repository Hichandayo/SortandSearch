package ra.searching;

public class BinarySearch {
    public int binarySearch(int[] arr, int value) {
        int start = 0;
        int end = arr.length - 1;
        // khi mà start <= end vẫn thực hiện tìm kiếm
        while (start <= end) {
            int mid = start + (end - start) / 2;//chống tràn giá trị
            if (arr[mid] == value) {
                return mid;
            } else if (arr[mid] > value) {
                 end = mid - 1;
            }else{
                start = mid +1;
            }
        }
        return -1;
    }
}
