package streams.questions;

public class Main {

    public static void main(String[] args) {
        String input = "abcd%$&$#efgh";
        String result = reverseString(input);
        System.out.println(result);
    }

    public static String reverseString(String input) {
        char[] chars = input.toCharArray();
        int left = 0, right = chars.length - 1;

        while (left < right) {
            if (!Character.isLetter(chars[left])) {
                left++;
            } else if (!Character.isLetter(chars[right])) {
                right--;
            } else {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }

        return new String(chars);
    }
}
