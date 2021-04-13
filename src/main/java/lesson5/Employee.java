package lesson5;

public class Employee {
    String fio;
    String post;
    String email;
    int phone;
    int salary;
    int age = 1000; // тест дефолтного коструктора

    public Employee() {
// дефолтный коструктор по "Нулям"
    }

    public Employee(String fio, String post, String email, int phone, int salary, int age) {
        this.fio = fio;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

    }

    public static void main(String[] args) {

        Employee[] user = new Employee[7];
        user[0] = new Employee("Ivanov Ivan", "Boss", "boss@mao;.ru", 2514578, 150000, 55);
        user[1] = new Employee("Petrov Petr", "ZamBoss", "zamboss@mail.ru", 2516589, 80000, 50);
        user[2] = new Employee("Vasilev Vasya", "engineer", "engineer@mail.ru", 2515263, 75000, 50);
        user[3] = new Employee("Ivanov Petr", "security", "security@mail.ru", 2519685, 50000, 45);
        user[4] = new Employee("Petrov Ivan", "janiter", "juniter@mail.ru", 2514596, 40000, 40);
        user[5] = new Employee("Vasya Pupkin", "security_2", "security_2@mail.ru", 2514763, 40000, 35);
        user[6] = new Employee(); // провека дефолтного коструктора

        for (int i = 0; i < user.length; i++) {

            System.out.println("ФИО: " + user[i].fio + ";  должность:  " + user[i].post + "; Почта: " + user[i].email +
                    "; Телефон:  " + user[i].phone + "; Зарплата:  " + user[i].salary + "; Возраст: " + user[i].age);

        }

        System.out.println();
        System.out.println();
        for (int i = 0; i < user.length; i++) {
            if (user[i].age >= 40) {
                System.out.println("ФИО: " + user[i].fio + ";  должность:  " + user[i].post + "; Почта: " + user[i].email +
                        "; Телефон:  " + user[i].phone + "; Зарплата:  " + user[i].salary + "; Возраст: " + user[i].age);
            }

        }
    }

}
