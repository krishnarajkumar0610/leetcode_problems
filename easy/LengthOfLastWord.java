package easy;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "Hello world";
    }

    public static int lengthOfLastWord(String s) {
        String[] words = s.trim().split(" ");
        int length = words[words.length - 1].length();
        return length;
    }
}
