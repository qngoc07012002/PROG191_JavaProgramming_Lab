import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("How many numbers do you want to enter? ");
        int n = Integer.parseInt(scn.nextLine());
        int[] array = new int[n];
        for (int i = 0; i<n;i++){
            System.out.print("Number 1: ");
            array[i] = Integer.parseInt(scn.nextLine());
        }
        System.out.println("Largest: "+(findMax(array,n)));
        System.out.println("Smallest: "+(findMin(array,n)));
    }
    public static int findMax(int[] arr,int x){
        int max = arr[0];
        for (int i=1;i<arr.length;i++)
            if (max<arr[i]) max = arr[i];
        return max;
    }
    public static int findMin(int[] arr,int x){
        int min = arr[0];
        for (int i=1;i<arr.length;i++)
            if (min>arr[i]) min = arr[i];
        return min;
    }

}
