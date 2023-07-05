import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.printf("Input n: ");
        int n = Integer.parseInt(scn.nextLine());
        int[] array = new int[n];
        for (int i = 0; i< n; i++){
            System.out.print("Number "+(i+1)+":");
            array[i] = Integer.parseInt(scn.nextLine());
        }
        if (n<2) System.out.println("Minimum 'gap' between adjacent values is 0");
        else
        System.out.println("Minimum 'gap' between adjacent values is "+(minGap(array,n)));

    }
    public static int minGap (int[] arr,int x){
        int min = arr[1]-arr[0];
        for (int i = 2; i < x; i++){
            if (min > (arr[i] - arr[i-1])) min = arr[i] - arr[i-1];
        }
        return min;
    }
}

