public class Employee {
    private int salary;
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

    public Employee (String fullName, int salary) {
        this.fullName = fullName;
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

    @Override
    public String toString() {
        return "Зарплата = " + salary +
                ", Сотрудник = " + fullName +
                ", Отдел - " + id;
    }
   }

