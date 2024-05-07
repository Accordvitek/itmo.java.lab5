package itmo.lab5;

public class Task01 {
    public static void main(String[] args) {
        String text = "Самое длинное слово в тексте";

        System.out.println(text);
        System.out.println("Самое длинное слово: " + getLongestWord(text));
    }

    private static String getLongestWord(String text) {
        int maxLength = 0;
        String longestWord = "";

        for (String word : text.split(" ")) {
            int thisLength = word.length();
            if (thisLength > maxLength) {
                maxLength = thisLength;
                longestWord = word;
            }
        }

        return longestWord;
    }
}
