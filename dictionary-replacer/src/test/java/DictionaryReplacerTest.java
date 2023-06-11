import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class DictionaryReplacerTest {

    @Test
    void emptyStringWithEmptyDictionaryReturnsEmptyValue() {
        DictionaryReplacer dictionaryReplacer = new DictionaryReplacer();
        assertThat(dictionaryReplacer.replace("", Map.of())).isEmpty();
    }

    @Test
    void nullStringWithDictionnaryReturnNull() {
        DictionaryReplacer dictionaryReplacer = new DictionaryReplacer();
        assertThat(dictionaryReplacer.replace("", Map.of("temp", "temporary"))).isEmpty();
    }

    @Test
    void stringContainingOnlyTheDictionaryEntryReplaceEntry() {
        DictionaryReplacer dictionaryReplacer = new DictionaryReplacer();
        assertThat(dictionaryReplacer.replace("$temp$", Map.of("temp", "temporary"))).isEqualTo("temporary");
    }

    @Test
    void stringContainingMultipleEntriesReplaceAllEntries() {
        DictionaryReplacer dictionaryReplacer = new DictionaryReplacer();
        assertThat(dictionaryReplacer.replace("$temp$ here comes the name $name$",
                Map.of("temp", "temporary", "name", "John Doe"))
        ).isEqualTo("temporary here comes the name John Doe");
    }

}
