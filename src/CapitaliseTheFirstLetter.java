package src;

import java.util.Scanner;

public class CapitaliseTheFirstLetter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter sentence");
        String sentence = scan.nextLine();

        String result = "";

        for (int i = 0; i < sentence.length(); i++) {

//            gt the current character in string
            String currentCharacter = sentence.substring(i, i + 1);

            if (i == 0) {
//                first character change in capital
                currentCharacter = currentCharacter.toUpperCase();
            } else {
//                checking the previous character
                String previousCharacter = sentence.substring(i - 1, i);
                if (previousCharacter.equals(" ")) {
                    currentCharacter = currentCharacter.toUpperCase();
                }
            }
            result = result + currentCharacter;
        }
        System.out.println(result);
    }
}


///Library/Java/JavaVirtualMachines/jdk-18.0.2.1.jdk/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar=63168 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/kanakraghav/IdeaProjects/Course/out/production/Course src.CapitaliseTheFirstLetter
//Enter sentence
//the quick brown fox jumps over the lazy dog
//The Quick Brown Fox Jumps Over The Lazy Dog