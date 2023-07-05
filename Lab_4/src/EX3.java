import java.util.Scanner;

public class EX3 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String[] arr = new String[]{"foo", "buzz", "bar", "fork", "bort", "spoon", "!", "dude"};
        int i = 0; int n = arr.length;
        while (i<n)  {
            if (arr[i].length()%2==0) {
                if (i!=n-1) {
                    for (int j = i; j < n -1 ; j++) {
                        arr[j] = arr[j + 1];
                    }
                }
                n--;

            } else i++;
        }
        for ( i=0; i<n; i++) System.out.printf(arr[i]+" ");
    }
}
