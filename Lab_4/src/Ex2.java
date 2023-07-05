import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Input string: ");
        String st = scn.nextLine();
        String[] arr = st.split(" ");
        for (int i=0; i < arr.length;i++){
            if (i % 2 !=0){
                System.out.printf(arr[i]+" ");
            }
        }
    }
}
