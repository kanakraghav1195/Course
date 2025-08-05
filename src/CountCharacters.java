package src;

public class CountCharacters {
    public static void main(String[] args) {
        String input = "this is java";
        int count = 0;

        for(int i =0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(ch != ' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
