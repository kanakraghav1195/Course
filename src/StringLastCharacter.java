package src;

public class StringLastCharacter {
    public static void main(String[] args) {
        StringLastCharacter ls = new StringLastCharacter();

        System.out.println(ls.lastCharacter("last", "chars"));
        System.out.println(ls.lastCharacter("", "hello"));
        System.out.println(ls.lastCharacter("", ""));
        System.out.println(ls.lastCharacter("kitten", "zip"));

    }
    public String lastCharacter(String a, String b){
        char firstCharacter;
        char lastCharacter;

        if(a.length()== 0){
            firstCharacter = '@';
        }else{
            firstCharacter = a.charAt(0);
        }
        if(b.length()==0){
            lastCharacter = '@';
        }else{
            lastCharacter = b.charAt(b.length()-1);
        }
        return "" + firstCharacter+lastCharacter;
    }
}
