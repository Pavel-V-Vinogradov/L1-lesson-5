public class Main {
    public static void main(String[] args) {
        Employee[] employee = new Employee[5];
        employee[0] = new Employee("Комаров", "Игорь", "Владимирович",
                "Управляющий директор","komarov.i.v@company.ru", "+7(495)123-45-01", 100,50);
        employee[1] = new Employee("Сидоров", "Александр", "Петрович",
                "Исполнительный директор","sidorov.a.p@company.ru", "+7(495)123-45-02", 90,45);
        employee[2] = new Employee("Федосеев", "Петр", "Сергеевич",
                "эксперт","phedoseev.p.s@company.ru", "+7(495)123-45-03", 80,41);
        employee[3] = new Employee("Самохвалов", "Сергей", "Иванович",
                "ведущий специалист","samokhvalov.s.i@company.ru", "+7(495)123-45-04", 29,25);
        employee[4] = new Employee("Звонарёв", "Семён", "Борисович",
                "специалист","zvonarev.s.b@company.ru", "+7(495)123-45-05", 25,20);

        for (Employee value : employee) {
            if (value.getAge() > 40) {
                System.out.println(value.info());
            }
        }
    }
}
