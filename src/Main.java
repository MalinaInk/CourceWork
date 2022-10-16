public class Main {
    private static Employee[] employees = new Employee[10];

    //Объявляем массив вне метода как поле, чтобы сделать его видимым
//static, т.к. метод main - static
    public static void main(String[] args) {
        //в методе - заполняем
        employees[0] = new Employee("Тиунов Георгий", 35_000);
        employees[1] = new Employee("Сафуанов Артем", 28_000);
        employees[2] = new Employee("Булдаков Илья", 42_000);
        employees[3] = new Employee("Горяева Дарья", 58_000);
        employees[4] = new Employee("Денисенко Светлана", 52_000);
        employees[5] = new Employee("Гимберг Александр", 32_000);
        employees[6] = new Employee("Лавринов Вячеслав", 34_000);
        employees[7] = new Employee("Морева Дарья", 46_000);
        employees[8] = new Employee("Осипов Андрей", 39_000);
        employees[9] = new Employee("Ганич Евгения", 51_000);
        System.out.println("Сумма всех зарплат: " + calculateSumSalary());
        System.out.println("Средняя зарплата равна " + getAverageSalary(calculateSumSalary(), employees));
        System.out.println("Сотрудник с максимальной зарплатой: " + getEmployeeWithMaxSalary());
        System.out.println("Сотрудник с минимальной зарплатой: " + getEmployeeWithMinSalary());
        printAllEmployees();
        printAllFullName();

    }

    // отдельный статический метод, который работает со статическим полем, объявленным выше
    private static int calculateSumSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            //проверка на null
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    private static int getAverageSalary(int sumSalary, Employee arr[]) {
        int averageSalary = sumSalary / arr.length;
        return averageSalary;
    }

    private static Employee getEmployeeWithMaxSalary() {
        int max = Integer.MIN_VALUE;
        //Задаем минимально допустимое значение внутри типа инт
        Employee targetEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > max) {
                max = employee.getSalary();
                targetEmployee = employee;
            }
        }
        return targetEmployee;
    }

    private static Employee getEmployeeWithMinSalary() {
        int min = Integer.MAX_VALUE;
        Employee targetEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < min) {
                min = employee.getSalary();
                targetEmployee = employee;
            }
        }
        return targetEmployee;
    }


    private static void printAllEmployees() {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            System.out.println(employee.toString());
        }
    }

    private static void printAllFullName() {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            System.out.println(employee.getFullName());
        }
    }
}


