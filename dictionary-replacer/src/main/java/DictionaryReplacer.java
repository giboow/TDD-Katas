import java.util.Map;

public class DictionaryReplacer {

    private static final String SEPARATOR = "$";

    private static String nothingToDo(String s, String o) {
        return s;
    }

    private static String replaceEntry(String s, Map.Entry<String, String> e) {
        return s.replace(SEPARATOR + e.getKey() + SEPARATOR, e.getValue());
    }

    public String replace(String input, Map<String, String> dictionary) {
        return dictionary.entrySet().stream()
                .reduce(
                        input,
                        DictionaryReplacer::replaceEntry,
                        DictionaryReplacer::nothingToDo
                );
    }
}
