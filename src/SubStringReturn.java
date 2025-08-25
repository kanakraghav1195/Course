package src;

public class SubStringReturn {

    public static String returnPart(String str, int index) {
                if (index < 0 || index >= str.length()) {
                    index = 0;
                }
                if (index == str.length() - 1) {
                    return str.charAt(index) + "" + str.charAt(0);
                }

                // return substring of length 2
                return str.substring(index, index + 2);
            }
            public static void main(String[] args) {

                System.out.println(returnPart("happen", 3));
                System.out.println(returnPart("hello", 0));
                System.out.println(returnPart("hello", 99));
                System.out.println(returnPart("yay", 1));
                System.out.println(returnPart("java", 0));
                System.out.println(returnPart("java", 2));
                System.out.println(returnPart("java", 3));
            }
        }
