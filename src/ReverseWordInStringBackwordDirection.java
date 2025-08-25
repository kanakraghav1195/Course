package src;

public class ReverseWordInStringBackwordDirection {
    public static void main(String[] args) {
        String str = "This is Java";
        reverseWords(str);

    }

    //    reverse a single word
    public static String reverseWord(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }
        return reversed;
    }

    //    reverse word from right to left
    public static void reverseWords(String str) {
//        split the string into words
        String[] words = str.split(" ");
//       now, applying the loop move in backword direction from the last word
        for (int i = words.length - 1; i >= 0; i--) {
//            now, have to reverse current word
            words[i] = reverseWord(words[i]);

            for (int j = 0; j < words.length; j++) {
                System.out.print(words[j] + " ");
            }
            System.out.println();
        }
    }
}
