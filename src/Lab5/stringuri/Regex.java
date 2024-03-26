package Lab5.stringuri;

public class Regex {

    public static boolean matchPattern1(String testString) {
        return testString.matches("[abc]");
    }

    public static boolean matchPattern2(String testString) {
        return testString.matches("[^abc]");
    }

    public static boolean matchPattern3(String testString) {
        return testString.matches("[a-z]");
    }

    public static boolean matchPattern4(String testString) {
        return testString.matches("[a-zA-Z]");
    }

    public static boolean matchPattern5(String testString) {
        return testString.matches("[a-z][A-Z]");
    }

    public static boolean matchPattern6(String testString) {
        return testString.matches("[abc]+");
    }

    public static boolean matchPattern7(String testString) {
        return testString.matches("[abc]*");
    }

    public static boolean matchPattern8(String testString) {
        return testString.matches("[abc]{5}");
    }

    public static boolean matchPattern9(String testString) {
        return testString.matches("[abc]{5,}");
    }

    public static boolean matchPattern10(String testString) {
        return testString.matches("[abc]{5,10}");
    }

    public static void main(String[] args) {

        System.out.println("Pattern 1 match: " + matchPattern1("a"));
        System.out.println("Pattern 2 match: " + matchPattern2("d"));
        System.out.println("Pattern 3 match: " + matchPattern3("m"));
        System.out.println("Pattern 4 match: " + matchPattern4("M"));
        System.out.println("Pattern 5 match: " + matchPattern5("aA"));
        System.out.println("Pattern 6 match: " + matchPattern6("aaa"));
        System.out.println("Pattern 7 match: " + matchPattern7(""));
        System.out.println("Pattern 8 match: " + matchPattern8("aaaaa"));
        System.out.println("Pattern 9 match: " + matchPattern9("aaaaaaa"));
        System.out.println("Pattern 10 match: " + matchPattern10("aaaaabbbb"));

        String text = "Odata creat un sir de caractere cu continutul sau nu mai poate fi modificat.";

        System.out.println("Length: " + text.length());

        System.out.println("Only letters: " + text.matches("[a-zA-Z ]+"));

        String[] words = text.split("\\s+");
        if (words.length % 2 == 0) {
            System.out.println("Middle words: " + words[(words.length / 2) - 1] + " " + words[words.length / 2]);
        } else {
            System.out.println("Middle word: " + words[words.length / 2]);
        }

        StringBuilder sb = new StringBuilder(text);
        System.out.println("Reversed string: " + sb.reverse().toString());
    }
}
