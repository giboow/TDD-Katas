import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;

public class EmployeeReport {

    public enum SortOrder {
        ASCENDING, DESCENDING
    }

    List<Employee> employees;

    public EmployeeReport(Employee... employees) {
        this.employees = Arrays.asList(employees);
    }

    public List<String> getAdult() {
        return employees.stream()
                .filter(Employee::isAdult)
                .map(Employee::getName)
                .collect(Collectors.toList());
    }

    public List<String> getSorted(SortOrder sortOrder) {
        return employees.stream().map(Employee::getName)
                .sorted(sortOrder == SortOrder.DESCENDING ? Comparator.reverseOrder() : Comparator.naturalOrder())
                .toList();
    }


    public List<String> getCapitalized() {
        return employees.stream()
                .map(employee -> employee.getName().toUpperCase())
                .collect(Collectors.toList());
    }
}
