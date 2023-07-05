import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Input n:");
        int n = Integer.parseInt(scn.nextLine());
        int[] array = new int[n];
        System.out.println("Input elements of Array: ");
        for (int i=0;i<n;i++){
            System.out.print("Input element "+(i+1)+":");
            array[i] = Integer.parseInt(scn.nextLine());
        }

        System.out.print("Input number to find index: ");
        int number = Integer.parseInt(scn.nextLine());
        System.out.println("The last of index "+number+" is "+(lastIndexOf(array,number)));

    }
    public static int lastIndexOf(int[] arr,int x){
        int d=-1;
        for (int t = arr.length-1;t>=0;t--)
            if (x == arr[t]) {
                d = t;
                break;
            }
        return d;
    }
}
