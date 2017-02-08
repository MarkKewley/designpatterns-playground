package structural.flyweight.improved;


public class Client {

    public static void main(String[] args) {
        final WordProcessor wordProcessor = new WordProcessor();

        final String textToAdd = "Hello i'm aaaa wwworddd pprocessorrrr";

        final LetterFactory letterFactory = new LetterFactory();

        for (final Character character : textToAdd.toCharArray()) {
            wordProcessor.addLetter(letterFactory.createLetter(character));
        }

        wordProcessor.printLetters();

    }


}
