import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("How many integers? ");
        int n = Integer.parseInt(scn.nextLine());
        int[] evenArray = new int[n];
        int d =0;
        for (int i = 0; i < n; i ++)
        {
            System.out.print("Next integer? ");
            int t = Integer.parseInt(scn.nextLine());
            if (t % 2 ==0) {

                evenArray[d] = t;
                d++;
            }
        }
        int s = 0,max = evenArray[0];
        for (int i =0; i < evenArray.length; i++){
            if (max < evenArray[i]) max = evenArray[i];
            s = s + evenArray[i];
        }
        System.out.println("Even Sum: "+s);
        System.out.printf("Even Max: "+max);
    }
}
