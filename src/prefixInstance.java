package src;

public class prefixInstance {
    public static void main(String[] args) {
        String input = "a";
        int count = 1;

        boolean result = prefixChecks(input, count);
        System.out.println("Final result: " + result);

    }

    public static boolean prefixChecks(String str, int count){
        int prefixOccurs = 0;

        for(int i =1; i<=str.length()-1; i++){
            String prefix = str.substring(0, i);
            boolean match = false;

            for(int j = 1; j<=str.length()-i; j++){
                if(str.substring(j, j+i).equals(prefix)){
                    match = true;
                    break;
                }
            }
            if(match){
                prefixOccurs++;
            }
            if(prefixOccurs>=count){
                return true;
            }
        }
        return false;
    }
}


//String input = "xyzxyxyxy";
//        int count = 2;
///Library/Java/JavaVirtualMachines/jdk-18.0.2.1.jdk/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar=62476 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/kanakraghav/IdeaProjects/Course/out/production/Course src.prefixInstance
//Final result: true


//String input = "a";
//        int count = 1;
///Library/Java/JavaVirtualMachines/jdk-18.0.2.1.jdk/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar=62511 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/kanakraghav/IdeaProjects/Course/out/production/Course src.prefixInstance
//Final result: false


//String input = "Hi12345Hi6789Hi10";
//        int count = 2;
///Library/Java/JavaVirtualMachines/jdk-18.0.2.1.jdk/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar=62537 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/kanakraghav/IdeaProjects/Course/out/production/Course src.prefixInstance
//Final result: true


//String input = "Hi12345Hi6789Hi10";
//        int count = 3;
///Library/Java/JavaVirtualMachines/jdk-18.0.2.1.jdk/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar=62541 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/kanakraghav/IdeaProjects/Course/out/production/Course src.prefixInstance
//Final result: true


//String input = "aa";
//        int count = 1;
///Library/Java/JavaVirtualMachines/jdk-18.0.2.1.jdk/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar=62816 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/kanakraghav/IdeaProjects/Course/out/production/Course src.prefixInstance
//Final result: true