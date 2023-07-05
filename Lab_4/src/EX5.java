import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String[] arr = new String[]{"be", "be", "is","not", "or", "question", "that", "the", "to", "to"};
        int i=0; int n = arr.length;
        while (i<n){
            int j=i+1;
            while (j<n){
               if (arr[i].equals(arr[j])) {
                   for (int t = j; t < n -1 ; t++) {
                       arr[t] = arr[t + 1];
                   }
                   n--;
               } else j++;
            }
            i++;
        }
        for ( i=0; i<n; i++) System.out.printf(arr[i]+" ");
    }
}
