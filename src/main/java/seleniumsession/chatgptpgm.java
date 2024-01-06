package seleniumsession;

public class chatgptpgm {
    public static void main(String[] args) {
        String inputString = "test123code456";
        String reversedString = reverseNumbers(inputString);
        System.out.println("Original String: " + inputString);
        System.out.println("Reversed String: " + reversedString);
    }

    private static String reverseNumbers(String input) {
        char[] chars = input.toCharArray();
        int start = 0;
        int end = 0;

        while (end < chars.length) {
            // Find the start of a number
            while (end < chars.length && !Character.isDigit(chars[end])) {
                end++;
            }

            // Find the end of the number
            start = end;
            while (end < chars.length && Character.isDigit(chars[end])) {
                end++;
            }

            // Reverse the number
            reverse(chars, start, end - 1);
        }

        return new String(chars);
    }

    private static void reverse(char[] chars, int start, int end) {
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }
}