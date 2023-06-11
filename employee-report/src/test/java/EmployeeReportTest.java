import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;


public class EmployeeReportTest {


    EmployeeReport buildEmployeeReport() {
        return new EmployeeReport(
            new Employee("Max", 17),
            new Employee("Sepp", 18),
            new Employee("Nina", 15),
            new Employee("Mike", 51)
        );
    }

    @Test
    void testGetAdultList() {
        EmployeeReport employeeReport = buildEmployeeReport();
        
        assertThat(employeeReport.getAdult()).containsOnly("Sepp", "Mike");
    }

    @Test
    void testGetAscendingSortedList() {
        EmployeeReport employeeReport = buildEmployeeReport();
        assertThat(employeeReport.getSorted(EmployeeReport.SortOrder.ASCENDING)).isEqualTo(
                Arrays.asList("Max", "Mike", "Nina", "Sepp")
        );
    }

    @Test
    void testGetCapitalizedList() {
        EmployeeReport employeeReport = buildEmployeeReport();
        assertThat(employeeReport.getCapitalized()).isEqualTo(
                Arrays.asList("MAX", "SEPP", "NINA", "MIKE")
        );
    }

    @Test
    void testGetDescendingSortedList() {
        EmployeeReport employeeReport = buildEmployeeReport();
        assertThat(employeeReport.getSorted(EmployeeReport.SortOrder.DESCENDING)).isEqualTo(
                Arrays.asList("Sepp", "Nina", "Mike", "Max")
        );
    }
}
