package Ex1;

import java.util.OptionalInt;
import java.util.Scanner;

public class Main {
    public static Scanner scn = new Scanner(System.in);
    public static void main (String[] args){

        System.out.printf("Input String: ");
        String string = scn.nextLine();

        System.out.println("1. Number Of Character");
        System.out.println("2. Check String Length");
        System.out.println("3. Check SubString ");
        System.out.println("4. Count numeral characters, vowel characters, consonant characters and special characters ");
        System.out.println("5. Display Lower and Upper Case");
        System.out.println("6. Replace letters that are identical and uninterrupted by one (abcbbbcca -> abcbca)");
        System.out.println("7. Remove Unesscessary Blanks");
        System.out.println("8. Count the number of presence of each letter");
        System.out.println("9. Input an integer n then output n letters from the right side of string");
        System.out.println("10. Convert Input To Title Case");
        System.out.println("11. Convert Input To English Name");
        System.out.println("12. Reserve Input Each Word");
        System.out.print("Which method do you want to use? ");
        int choice = Integer.parseInt(scn.nextLine());
        switch (choice)
        {
            case 1->numberOfCharacter(string);
            case 2->checkStringLength(string);
            case 3->compareString(string);
            case 4->countNumber(string);
            case 5->displayLowerAndUpperCase(string);
            case 6->replaceIdenticalUniterruped(string);
            case 7->removeUnesscessaryBlanks(string);
            case 8->countTheNumberOfPresenceOfEachLetter(string);
            case 9->displayRightSideOfString(string);
            case 10->convertInputToTitleCase(string);
            case 11->convertInputToEnglishName(string);
            case 12->reserveInputEachWord(string);
        }



    }
    public static void numberOfCharacter(String st){
        int d=0;
        for (int i =0; i<st.length();i++){
            if (st.charAt(i) != ' ') d++;
        }
        System.out.println("Number of Character: "+d);
    }
    public static void checkStringLength(String st){
        if (st.length()>2) System.out.println("The third character: "+st.charAt(2));
        else System.out.println("Undifined because string's length <= 3");
    }
    public static void compareString(String st){
        System.out.println("Compare 2 string ");
        String st1 = st;
        System.out.printf("Input String 2: ");
        String st2 = scn.nextLine();
        if (st1.contains(st2)) {
            System.out.println("Second string exists within the first string at "+st1.indexOf(st2));
        } else System.out.println("The second string does not exist in the first string");
    }
    public static void countNumber(String st){
        int numeral = 0,vowel = 0,consonant = 0,special = 0;
        for (int i=0; i<st.length();i++){
            if (st.charAt(i)>='0' && st.charAt(i)<='9') numeral++;
            else if ( st.charAt(i) == 'a' || st.charAt(i) == 'A' ||
                    st.charAt(i) == 'e' || st.charAt(i) == 'E' ||
                    st.charAt(i) == 'i' || st.charAt(i) == 'I' ||
                    st.charAt(i) == 'o' || st.charAt(i) == 'O' ||
                    st.charAt(i) == 'u' || st.charAt(i) == 'U') vowel++;
            else if ((st.charAt(i)>='a' && st.charAt(i)<='z') || (st.charAt(i)>='A' && st.charAt(i) <= 'Z')) consonant++;
            else if (st.charAt(i)!=' ') special++;

        }
        System.out.println("Numeral Characters: "+numeral);
        System.out.println("Vowel: "+vowel);
        System.out.println("Consonant: "+consonant);
        System.out.println("Special: "+special);

    }
    public static void displayLowerAndUpperCase(String st){
        String lower = "", upper = "";

        for (int i=0;i<st.length();i++){
            if (st.charAt(i) == Character.toLowerCase(st.charAt(i))) lower = lower + st.charAt(i);
            if (st.charAt(i) == Character.toUpperCase(st.charAt(i))) upper = upper + st.charAt(i);
        }
        System.out.println("Lower: "+lower);
        System.out.println("Upper: "+upper);
    }
    public static void replaceIdenticalUniterruped(String st){
        for (int i=0;i<st.length()-1;i++){
            if (st.charAt(i) != st.charAt(i+1)) System.out.printf(st.charAt(i)+"");
        }
        if (st.charAt(st.length()-1)!=st.charAt(st.length()-2)) System.out.printf(""+st.charAt(st.length()-1));
    }
    public static void removeUnesscessaryBlanks(String st){
        System.out.println(st.trim().replaceAll("\\s{2,}", " "));
    }
    public static void countTheNumberOfPresenceOfEachLetter(String st){
        int i=0;
        while (i<st.length()){
            if (i == st.length()-1 && st.charAt(i) != ' ') System.out.println(st.charAt(i)+": 1");
            else
            if (st.charAt(i) == st.charAt(i+1))
            {
                int d=2;
                for (int j=i+2;j<st.length();j++){
                    if (st.charAt(i)!=st.charAt(j) && st.charAt(i) != ' ') break;
                    else d++;
                }
                i = i + d -1;
                System.out.println(st.charAt(i)+": "+d);
            }
            else {
                if (st.charAt(i) != st.charAt(i+1) && st.charAt(i) != ' ') System.out.println(st.charAt(i)+": 1");
            }
            i++;
        }
    }
    public static void displayRightSideOfString(String st){
        System.out.printf("Input n: ");
        int n = Integer.parseInt(scn.nextLine());
        int t = st.length()-1-n;
        for (int i=t+1;i<st.length();i++) System.out.printf(st.charAt(i)+"");
    }
    public static void convertInputToTitleCase(String st){
        st = st.trim().replaceAll("\\s{2,}", " ");
        String[] arr = st.split(" ");
        for (int i=0;i<arr.length;i++){
            System.out.printf(Character.toUpperCase(arr[i].charAt(0))+"");
            for (int j=1; j<arr[i].length();j++) System.out.printf(arr[i].charAt(j)+"");
            System.out.printf(" ");
        }
    }
    public static void convertInputToEnglishName(String st){
        st = st.trim().replaceAll("\\s{2,}", " ");
        String[] arr = st.split(" ");
        System.out.printf(arr[arr.length-1]+" ");
        for (int i=0;i<arr.length-1;i++) System.out.printf(arr[i]+" ");
    }
    public static void reserveInputEachWord(String st){
        st = st.trim().replaceAll("\\s{2,}", " ");
        String[] arr = st.split(" ");
        for (int i = arr.length-1;i>=0;i--){
            System.out.printf(arr[i]+" ");
        }
    }
}
