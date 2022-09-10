package org.example;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10,14,19,26,27,31,33,35,42,44,45,71,81,87};
        int number = 81;
        int mid;
        int l = 0;
        int r = arr.length -1;
        for (int i = 0; i < arr.length; i++){
            mid = ((l+r)/2);
            if (arr[mid] == number){
                System.out.println("tìm thấy ở vòng if đầu và giá trị ở ô thứ "+mid);
                break;
            }
            if (arr[mid] < number){
                l = mid + 1;
            }
            if (arr[mid] > number){
                r = mid - 1;
            }
        }
    }
//     code này không sử dụng được đâu
//    code này sửa được chết liền
}
