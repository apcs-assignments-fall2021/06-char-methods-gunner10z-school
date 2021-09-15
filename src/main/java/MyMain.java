public class MyMain {

    // Changes a capital letter to a lowercase letter
    // If the char is not an uppercase letter, 
    // it is returned unchanged. 
    public static char toLower(char ch) {
        // REPLACE WITH YOUR CODE
        if (ch>='A'&&ch<='Z'){
            return (char)(ch+=32);
        }
        else{
            return ch;
        }
    }

    // Changes a lowercase letter to an uppercase letter
    // If the char is not a lowercase letter,
    // it is returned unchanged.
    public static char toUpper(char ch) {
        // REPLACE WITH YOUR CODE HERE

        if (ch>='a'&&ch<='z'){
            return (char)(ch-=32);
        }
        else{
            return ch;
        }
    }

    // The method is given a String as input and returns a
    // new String where all of the numbers have been removed
    // from the original String.
    public static String removeNumbers(String str) {
        String newStr="";
        for(int i = 0; i<str.length(); i++) {

            // access each character
            char a = str.charAt(i);
            if (a<'0'||a>'9') {
                newStr += a;
            }
        }
        return newStr;
    }

    // Write some code to test your methods!
    public static void main(String[] args) {
        System.out.println(toLower('A'));
        System.out.println(toUpper('a'));
        System.out.println(removeNumbers("asdf1234"));
    }
}
