package strings;

public class CountWordOccurrences {
	public static void main(String[] args) {
        String sentence = "hello java world javas       java only    java Java";
        String wordToCount = "java";

        // Split the sentence into an array of words
        String[] words = sentence.split(" ");

        int count = 0;
        for (String word : words) {
            // Convert both words to lowercase and compare
            if (toLowerCase(word).equals(toLowerCase(wordToCount))) {
                count++;
            }
        }

        System.out.println("The word \"" + wordToCount + "\" is repeated " + count + " times.");
    }

    // Custom implementation of toLowerCase() for comparison
    private static String toLowerCase(String word) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            result.append(ch);
        }

        return result.toString();
    }

}
