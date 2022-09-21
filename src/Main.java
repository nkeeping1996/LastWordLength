public class Main {
    public static void main(String[] args) {

        String s = "Pour one ounce of broth into the stew please";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        return s.split(" ")[s.split(" ").length-1].length();
    }
}