import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class StringCalulator {
    public String add(String input) {
        if (StringUtils.isEmpty(input)) {
            return "0";
        }

        List<String> inputList = Arrays.asList(input.split(","));

        if (inputList.size() > 3) {
            throw new StringCalulatorException();
        }

        return inputList.stream()
                .map(BigDecimal::new)
                .reduce(BigDecimal.ZERO, BigDecimal::add)
                .toPlainString();
    }
}
