package utils;

import java.util.Scanner;
public class ArrayUtility {
    public static Scanner sc = new Scanner(System.in);
    public static int[] inputArray(){
        System.out.print("Enter no. of elements in an array : ");
        int size = sc.nextInt();
        int[] newArray = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter element no."+(i+1)+" : ");
            newArray[i] = sc.nextInt();
        }
        System.out.println();
        return newArray;
    }
    public static int[][] input2DArray(){
        System.out.print("Enter no. of rows in an array : ");
        int row = sc.nextInt();
        System.out.print("Enter no. of columns in an array : ");
        int col = sc.nextInt();
        int[][] newArray = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print("Enter ("+(i+1)+","+(j+1)+")th element : ");
                newArray[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        return newArray;
    }
    public static void display(int[] arr){
        System.out.print("Array Elements are : ");
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static int noOfOccurrences(int[] arr,int num){
        int count = 0;
        for(int i : arr){
            if(i==num) count++;
        }
        return count;
    }
    public static int[] deleteElementFromArray(int[] arr,int num) {
        int occ  = ArrayUtility.noOfOccurrences(arr,num);
        if(occ==0){
            System.out.println("Element not found ");
            return arr;
        }
        int newSize = arr.length - occ;
        int[] newArr = new int[newSize];
        int j = 0;
        for (int k : arr) {
            if (k != num) {
                newArr[j] = k;
                j++;
            }
        }
        return newArr;
    }
    public static boolean isAscending(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]) return false;
        }
        return true;
    }
    public static boolean isDescending(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]) return false;
        }
        return true;
    }
}
