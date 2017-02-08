package structural.flyweight.improved;

import java.util.Map;
import java.util.WeakHashMap;

public class LetterFactory {
    private Map<Character, Letter> letterCache = new WeakHashMap<>();

    public Letter createLetter(Character key) {
        if (letterCache.containsKey(key)) {
            return letterCache.get(key);
        }

        final Letter letter = new Letter(key);
        letterCache.put(key, letter);
        return letter;
    }
}
