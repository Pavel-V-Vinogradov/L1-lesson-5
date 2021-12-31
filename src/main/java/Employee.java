public class Employee {
    private final String surname;
    private final String name;
    private final String patronymic;
    private final String position;
    private final String eMail;
    private final String phone;
    private final int salary;
    private final int age;

    public Employee(String surname, String name, String patronymic, String position, String eMail, String phone, int salary, int age) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.position = position;
        this.eMail = eMail;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getPosition() {
        return position;
    }

    public String geteMail() {
        return eMail;
    }

    public String getPhone() {
        return phone;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    String info() {
        return String.format("ФИО: %s %s %s Должность: %s Email: %s тел. %s Зарплата: %s Возраст: %s",
                surname, name, patronymic, position, eMail, phone, salary, age);
    }
}
