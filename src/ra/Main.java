package ra;

import ra.searching.BinarySearch;
import ra.searching.LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

import static ra.sorting.BubbleSort.bubbleSort;
import static ra.sorting.InsertionSort.insertionSort;
import static ra.sorting.SelectionSort.selectionSort;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Bài tập 1: Tìm kiếm tuyến tính (Linear Search)
        //1. Nhập vào một mảng các số nguyên.
        //2. Nhập vào một số nguyên cần tìm.
        //3. Thực hiện tìm kiếm và hiển thị kết quả.

//        System.out.println("Nhập vào số lượng phần tử của mảng : ");
//        int n = Integer.parseInt(sc.nextLine());
//        int [] array = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.println("Nhâp phân tử thứ " + (i + 1) + " :");
//            array[i] = Integer.parseInt(sc.nextLine());
//        }
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//        LinearSearch linearSearch = new LinearSearch();
//        System.out.println("Nhập vào một số nguyên cần tìm : ");
//        int index = linearSearch.linearSearch(array, sc.nextInt());
//        System.out.println("vị trí: " + index);

        //Bài tập 2: Tìm kiếm nhị phân (Binary Search)
        // 1. Nhập vào một mảng các số nguyên đã được sắp xếp.
        // 2. Nhập vào một số nguyên cần tìm.
        // 3. Thực hiện tìm kiếm và hiển thị kết quả.

//        System.out.println("Nhập vào số lượng phần tử của mảng : ");
//        int n = Integer.parseInt(sc.nextLine());
//        int [] array = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.println("Nhâp phân tử thứ " + (i + 1) + " :");
//            array[i] = Integer.parseInt(sc.nextLine());
//        }
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//        BinarySearch binarySearch = new BinarySearch();
//        System.out.println("Nhập vào một số nguyên cần tìm : ");
//        int index = binarySearch.binarySearch(array, sc.nextInt());
//        System.out.println("vị trí :  "+index);

        //Bài tập 3: Sắp xếp nổi bọt cơ bản (Bubble Sort)
        // 1. Nhập vào một mảng các số nguyên.
        // 2. Thực hiện sắp xếp và hiển thị mảng đã sắp xếp.

//        System.out.println("Nhập vào số lượng phần tử của mảng : ");
//        int n = Integer.parseInt(sc.nextLine());
//        int [] array = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.println("Nhâp phân tử thứ " + (i + 1) + " :");
//            array[i] = Integer.parseInt(sc.nextLine());
//        }
//        bubbleSort(array);

        // Bài tập 4: Đếm số lần hoán đổi trong Bubble Sort
        // 1. Nhập vào một mảng các số nguyên.
        // 2. Sắp xếp mảng và đếm số lần hoán đổi.
        // 3. Hiển thị mảng đã sắp xếp và số lần hoán đổi.

//        System.out.println("Nhập vào số lượng phần tử của mảng : ");
//        int n = Integer.parseInt(sc.nextLine());
//        int [] array = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.println("Nhâp phân tử thứ " + (i + 1) + " :");
//            array[i] = Integer.parseInt(sc.nextLine());
//        }
//        bubbleSort(array);

        //Bài tập 5: Sắp xếp chọn cơ bản (Selection Sort)
        //1. Nhập vào một mảng các số nguyên.
        //2. Thực hiện sắp xếp và hiển thị mảng đã sắp xếp.

//        System.out.println("Nhập vào số lượng phần tử của mảng : ");
//        int n = Integer.parseInt(sc.nextLine());
//        int [] array = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.println("Nhâp phân tử thứ " + (i + 1) + " :");
//            array[i] = Integer.parseInt(sc.nextLine());
//        }
//        selectionSort(array);

        //Bài tập 6: Sắp xếp chọn với đối tượng
        //1. Tạo một lớp Person với thuộc tính name và age.
        //2. Nhập vào một mảng các đối tượng Person.
        //3. Sắp xếp các đối tượng theo age và hiển thị danh sách đã sắp xếp.

//        System.out.println("Nhập vào số lượng phần tử của mảng : ");
//        int n = Integer.parseInt(sc.nextLine());
//        int [] array = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.println("Nhâp phân tử thứ " + (i + 1) + " :");
//            array[i] = Integer.parseInt(sc.nextLine());
//        }
//        selectionSort(array);
//
        //Bài tập 7: Sắp xếp chèn cơ bản (Insertion Sort)
        //1. Nhập vào một mảng các số nguyên.
        //2. Thực hiện sắp xếp và hiển thị mảng đã sắp xếp

//        System.out.println("Nhập vào số lượng phần tử của mảng : ");
//        int n = Integer.parseInt(sc.nextLine());
//        int [] array = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.println("Nhâp phân tử thứ " + (i + 1) + " :");
//            array[i] = Integer.parseInt(sc.nextLine());
//        }
//                insertionSort(array);
//
        //Bài tập 8: Sắp xếp chèn cho chuỗi
        //1. Nhập vào một mảng các chuỗi.
        //2. Sắp xếp các chuỗi và hiển thị kết quả.

//        System.out.println("Nhập vào số lượng phần tử của mảng : ");
//        int n = Integer.parseInt(sc.nextLine());
//        int [] array = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.println("Nhâp phân tử thứ " + (i + 1) + " :");
//            array[i] = Integer.parseInt(sc.nextLine());
//        }
//        insertionSort(array);

    }
}
