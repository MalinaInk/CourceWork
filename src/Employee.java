public class Employee {
    private int salary;
    private int department;
    private final String fullName;
    //final - значение можно установить только в конструкторе.
    //обезопасить от того, чтобы модифицировать переменную случайно.
    //у final невозможно написать сеттер
    //одно и то же значение на весь срок жизни объекта
    //с массивами и объектами не работает, состояние объекта можно поменять, ссылку - нет
    private final int id;
    //final - относится к полю объекта
    //private - относится к полю класса
    private static int counter = 0;

    public Employee (String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = ++counter;
        //инкрементируем счетчик, начиная с 1-го отдела
    }

    public int getSalary() {
        return salary;
    }

    public String getFullName() {
        return fullName;
    }

    public int getId() {
        return id;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Сотрудник = " + fullName +
                ", Отдел - " + department +
                ", Зарплата = " + salary;
    }
   }

