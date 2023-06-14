import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringCalulatorTest {

    @Test
    void emptyStringWillReturn0() {
        assertThat(new StringCalulator().add("")).isEqualTo("0");
    }

    @Test
    void addOneNumberWillReturnSameNumber() {
        assertThat(new StringCalulator().add("1")).isEqualTo("1");
    }

    @Test
    void addTwoNumbersWillReturnSum() {
        assertThat(new StringCalulator().add("1.1,2.2")).isEqualTo("3.3");
    }

    @Test
    void threeNumbersOrMoreWillWorks() {
        assertThat(new StringCalulator().add("1.1,2.2,3.3")).isEqualTo("6.6");
        assertThat(new StringCalulator().add("1.1,2.2,3.3,4.4")).isEqualTo("11.0");
        assertThat(new StringCalulator().add("1.1,2.2,3.3,4.4,5.5")).isEqualTo("16.5");
    }

    @Test
    void newLineIsASeparator() {
        assertThat(new StringCalulator().add("1\n2,3")).isEqualTo("6");
    }

    @Test
    void newLineAfterCommaWillThrowError() {
        assertThatThrownBy(() -> new StringCalulator().add("175.2,\n35"))
                .isInstanceOf(StringCalulatorException.class)
                .hasMessage("Number expected but ',' found at position 5.");
    }

    @Test
    void invalidInputAtStartWillThrowError() {
        assertThatThrownBy(() -> new StringCalulator().add("a1234,678"))
                .isInstanceOf(StringCalulatorException.class)
                .hasMessage("Number expected but 'a' found at position 0.");
    }

    @Test
    void missingNumberInLastPosition() {
        assertThatThrownBy(() -> new StringCalulator().add("1,3,"))
                .isInstanceOf(StringCalulatorException.class)
                .hasMessage("Number expected but EOF found.");

        assertThatThrownBy(() -> new StringCalulator().add("1,3\n"))
                .isInstanceOf(StringCalulatorException.class)
                .hasMessage("Number expected but EOF found.");
    }


}
