import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = Integer.parseInt(scn.nextLine());
        int[] array = new int[n];
        for (int i = 0; i< n; i++){
            System.out.print("Number "+(i+1)+":");
            array[i] = Integer.parseInt(scn.nextLine());
        }
        for (int i = 0 ; i < n ; i++) System.out.print(array[i]+" ");
        System.out.println();
        int d = median(array,n);
        System.out.println(d);

    }
    public static int median (int[] arr, int x) {
        int tg;
        for (int i = x - 1; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                if (arr[j - 1] > arr[j]) {
                    tg = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tg;
                }
            }
        }
        return arr[(x-1)/2];
    }
}
// Cách 2 dùng đánh dấu từ 0->99 ( xong đếm khi nào gặp n/2 thì dừng)
