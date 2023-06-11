import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class DictionaryReplacerTest {

    @Test
    void emptyStringWithEmptyDictionaryReturnsEmptyValue() {
        DictionaryReplacer dictionaryReplacer = new DictionaryReplacer();
        assertThat(dictionaryReplacer.replace("", new HashMap<>())).isEmpty();
    }

}
