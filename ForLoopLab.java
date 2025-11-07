import java.util.Scanner;

public class ForLoopLab {
    public static void main() {

        //Counting the letter "e"
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word(s): ");
        String text = sc.next();
        int e = 0;
        for (int l = 0; l < text.length(); l++) {
            if (text.substring(l, l + 1).equals("e")) {
                e++;
            }
        }
        System.out.println("e's: " + e);

        //The Ladder
        int height = 4;
        for (int row = 1; row <= height; row++) {
            String line = "";
            for (int star = 1; star <= row; star++) {
                line = line + "*";
            }
            System.out.println(line);
        }
        for (int row = height; row >= 1; row--) {

            String line = "";
            for (int star = row; star >= 1; star--) {
                line = line + "*";
            }
            System.out.println(line);
        }

        //Christmas Tree
        for (int row = 1; row <= height; row++) {
            String line = "";
            for (int star = 1; star <= row; star++) {
                line = line + "*";
            }
            System.out.println(line);
        }
        for (int row = height-1; row >= 1; row--) {

            String line = "";
            for (int star = row; star >= 1; star--) {
                line = line + "*";
            }
            System.out.println(line);
        }
    }
}

