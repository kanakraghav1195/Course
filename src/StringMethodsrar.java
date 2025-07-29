package src;

public class StringMethodsrar {
    public static void main(String[] args) {
        StringMethodsrar st = new StringMethodsrar();

        System.out.println(st.containRar("r9r"));
        System.out.println(st.containRar("123arcrcdrarxyz"));
        System.out.println(st.containRar("r12"));
    }

    public boolean containRar(String str){
        char[] letters = str.toCharArray();
        for(int i =0; i< letters.length-2; i++){
            char first = letters[i];
            char third = letters[i+2];

            if(first == 'r'){
                if(third == 'r'){
                    return true;
                }
            }
            }
        return false;
        }
    }

