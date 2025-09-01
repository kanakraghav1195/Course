package src;

public class UpperLowerConversion {
    public static void main(String[] args) {

        String input = "AbC#$dEf";
        String output = convert(input);


        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }

    public static String convert(String a){
        String result = "";

        for(int i = 0; i<a.length(); i++){
            String ch = String.valueOf(a.charAt(i));

            if(ch.equals(ch.toUpperCase()) && !ch.equals(ch.toLowerCase())){
                result = result + ch.toLowerCase();
        } else if (ch.equals(ch.toLowerCase()) && !ch.equals(ch.toUpperCase())) {
                result = result+ch.toUpperCase();

            }
            else{
                result = result+ch;
            }
        }
        return result;
    }
}



///Library/Java/JavaVirtualMachines/jdk-18.0.2.1.jdk/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar=50144 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/kanakraghav/IdeaProjects/Course/out/production/Course src.UpperLowerConversion
//Input: AbC#$dEf
//Output: aBc#$DeF