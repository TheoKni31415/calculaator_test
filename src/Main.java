import java.util.Arrays;
import java.util.Scanner;


class Main {
    public static void main (String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        String[] words = text.split(" ");
        String[] numbers = new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] symbs = new String[] {"-", "+", "*", "/"};

        if (words.length == 3) {
            if (isNumber(words[0]) && isNumber(words[2])){
                if (Arrays.asList(numbers).contains(words[0]) && Arrays.asList(numbers).contains(words[2])){
                    if (Arrays.asList(symbs).contains(words[1])) {
                        switch (words[1]) {
                            case "-":
                                System.out.println(Integer.parseInt(words[0]) - Integer.parseInt(words[2]));
                                break;
                            case "+":
                                System.out.println(Integer.parseInt(words[0]) + Integer.parseInt(words[2]));
                                break;
                            case "*":
                                System.out.println(Integer.parseInt(words[0]) * Integer.parseInt(words[2]));
                                break;
                            case "/":
                                System.out.println(Integer.parseInt(words[0]) / Integer.parseInt(words[2]));
                                break;
                        }
                    } else {
                        isExc();
                    }
                } else {
                    isExc();
                }
            } else {
                isExc();
            }
        } else {
            isExc();
        }
    }
    static boolean isNumber (String str) {
        try {
            Integer.parseInt(str);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    static void isExc () {
        try {
            throw new Exception("throws Exception");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}