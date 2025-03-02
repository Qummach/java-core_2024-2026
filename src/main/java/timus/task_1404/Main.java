package timus.task_1404;

public class Main {
    public static void main(String[] args) {
        String codedWord = "xbduyr";

        int[] letterNumber = new int[codedWord.length()];
        int[] originalLetterNumbers = new int[codedWord.length()];
        char[] decodedChars = new char[codedWord.length()];


        for (int i = 0; i < codedWord.length(); i++) {
            letterNumber[i] = codedWord.charAt(i) - ('a');
        }

        originalLetterNumbers[0] = (letterNumber[0] - 5 + 26) % 26;
        for (int i = 1; i < letterNumber.length; i++) {
            originalLetterNumbers[i] = (letterNumber[i] - letterNumber[i - 1] + 26) % 26;
        }

        for (int i = 0; i < letterNumber.length; i++) {
            decodedChars[i] = (char) (originalLetterNumbers[i] + 'a');
        }

        System.out.println(new String(decodedChars));
    }
}
