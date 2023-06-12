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
    void threeNumbersOrMoreWillTHrowsException() {
        assertThatThrownBy(() -> new StringCalulator().add("1.1,2.2,3.3")).isInstanceOf(StringCalulatorException.class);
        assertThatThrownBy(() -> new StringCalulator().add("1.1,2.2,3.3,4.4")).isInstanceOf(StringCalulatorException.class);
        assertThatThrownBy(() -> new StringCalulator().add("1.1,2.2,3.3,4.4,5.5")).isInstanceOf(StringCalulatorException.class);
    }


}
