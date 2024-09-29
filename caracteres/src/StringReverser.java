public class StringReverser {

    public String reverseString(String input) {
        char[] characters = input.toCharArray();

        int start = 0;
        int end = characters.length - 1;

        while (start < end) {
            char temp = characters[start];
            characters[start] = characters[end];
            characters[end] = temp;

            start++;
            end--;
        }

        return new String(characters);
    }
}
