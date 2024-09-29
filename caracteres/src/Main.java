public class Main {
    public static void main(String[] args) {
        StringReverser reverser = new StringReverser();

        String input = "exemplo";

        String inverted = reverser.reverseString(input);

        System.out.println("String original: " + input);
        System.out.println("String invertida: " + inverted);
    }
}
