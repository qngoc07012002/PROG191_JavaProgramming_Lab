import java.util.Scanner;

public class EX4 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String[] arr = new String[]{"how", "are", "you?"};
        String[] arr2 = new String[arr.length*2];
        int j=0;
        for (int i=0; i<arr.length;i++){
            arr2[j] = arr[i];
            j++;
            arr2[j] = arr[i];
            j++;
        }
        for (int i=0;i<arr2.length;i++){
            System.out.printf(arr2[i]+" ");
        }
    }
}
