package src;

public class CheckStringEnd {
    public static void main(String[] args) {
        CheckStringEnd object = new CheckStringEnd();

        System.out.println(object.checkEnd("For", "yourfor"));
        System.out.println(object.checkEnd("up", "downandup"));
        System.out.println(object.checkEnd("test", "downthelinetestr"));
        System.out.println(object.checkEnd("", "for"));
        System.out.println(object.checkEnd("abc", "abLMabc"));
        System.out.println(object.checkEnd("abc", "2abc"));
        System.out.println(object.checkEnd("abcDFE", "abcDEF"));
    }

    public boolean checkEnd(String x, String y){
//        now, have to convert to lowercase both strings

        String a1 = x.toLowerCase();
        String a2 = y.toLowerCase();

//        now, i have to check s2 end with s1 or s1 end with s2
        if(a2.endsWith(a1) || a1.endsWith(a2)){
            return true;
        }
        return false;
    }

}


///Library/Java/JavaVirtualMachines/jdk-18.0.2.1.jdk/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar=57604 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/kanakraghav/IdeaProjects/Course/out/production/Course src.CheckStringEnd
//true
//true
//false
//true
//true
//true
//false