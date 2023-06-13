import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalulator {

    final String regex = "^((\\d+\\.?\\d*([,\\n])?)*)";

    public String add(String input) throws StringCalulatorException {
        if (StringUtils.isEmpty(input)) {
            return "0";
        }
        checkInput(input);

        return convert(input);
    }

    private String convert(String input) {
        return Arrays.stream(input.split("[,\\n]"))
                .map(BigDecimal::new)
                .reduce(BigDecimal.ZERO, BigDecimal::add)
                .toPlainString();
    }

    private void checkInput(String input) throws StringCalulatorException {
        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(input);
        int matchLenght = matcher.find() ? matcher.group(1).length() : 0;
        if (matchLenght != input.length()) {
            String charFound = input.substring(matchLenght, matchLenght + 1);
            throw new StringCalulatorException(MessageFormat.format("Number expected but ''{0}'' found at position {1}.", charFound, matchLenght));
        }
    }
}
