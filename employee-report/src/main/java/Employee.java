import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {

    private String name;

    private Integer age;

    boolean isAdult() {
        return age >= 18;
    }

}
