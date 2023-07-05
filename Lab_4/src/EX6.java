import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EX6 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        HashMap<String,Integer> countMap = new HashMap<>();
        System.out.printf("Input String: ");
        String string = scn.nextLine();
        String[] arr = string.split(" ");
        for (int i=0; i<arr.length;i++){
            if (countMap.containsKey(arr[i])) {
                countMap.put(arr[i],countMap.get(arr[i])+1);
            } else countMap.put(arr[i],1);
        }
        boolean check = false;
        for(Map.Entry<String, Integer> entry : countMap.entrySet())
            if (entry.getValue()>=3) {
                check = true;
                break;
            }
        if (check) System.out.printf("True");
        else System.out.printf("False");
    }

}
