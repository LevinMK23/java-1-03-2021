package lesson5.hw;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee[] employees = new Employee[5];

        employees[0] = new Employee(
                "Ivanov Ivan",
                "developer",
                "email@email.ru",
                "88005553535",
                45,
                160000
        );
        employees[1] = new Employee(
                "Petrov Petr",
                "junior QA engineer",
                "email@email.ru",
                "88005553535",
                21,
                60000
        );
        employees[2] = new Employee(
                "Sidorov Oleg",
                "Senior developer",
                "email@email.ru",
                "88005553535",
                33,
                260000
        );
        employees[3] = new Employee(
                "Alekseeva Natalia",
                "Senior QA engineer",
                "email@email.ru",
                "88005553535",
                46,
                210000
        );
        employees[4] = new Employee(
                "Serge Mac. Duck",
                "director",
                "email@email.ru",
                "88005553535",
                25,
                2699999
        );

        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                employee.printInfo();
            }
        }
    }
}
