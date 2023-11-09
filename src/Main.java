import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String a;
        String b;
        boolean anagramCheck = false;

        System.out.println("Enter a word: ");
        a = scan.nextLine();
        a = a.toLowerCase();
        System.out.println();
        System.out.println("Enter another word, must be the same length: ");
        b = scan.nextLine();
        b = b.toLowerCase();


        if (a.length() == b.length()) {
            for(int i = 0; i < a.length(); i++) {
                if(b.contains(a.substring(i, i+1))) {
                    anagramCheck = true;
                } else {
                    anagramCheck = false;
                    break;
                }
            }

            if(anagramCheck) {
                System.out.println();
                System.out.println(a + " and " + b + " are anagrams.");
            } else {
                System.out.println();
                System.out.println(a + " and " + b + " aren't anagrams.");
            }

        } else {
            System.out.println();
            System.out.println("Error: the words must be the same length");
        }

    }
}