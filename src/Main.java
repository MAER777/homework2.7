import java.util.*;

public class Main {
    public static void main(String[] args) {
        Employee alex1 = new Employee("Краснов В.И", 1, 14_000);
        Employee alex2 = new Employee("Чиров В.К", 1, 14_000);
        Employee alex3 = new Employee("Лудин Г.И", 2, 13_000);
        Employee alex4 = new Employee("Лошника Г.Б", 3, 121_000);
        Employee alex5 = new Employee("Лошника Г.Б", 3, 333_020);
        Employee alex6 = new Employee("Матрешкина Х.В", 5, 13_500.2);
        Employee alex7  = new Employee("Черникова К.К", 4, 11_000);
        Employee alex8  = new Employee("Ерохин М.К", 2, 1_000);
        Employee alex9  = new Employee("Обломов Р.К", 5, 13_000);
        Employee alex10  = new Employee("Чекалова С.И", 4, 12_000);

        EmployeeBook ss = new EmployeeBook();
        ss.add(alex4);
        ss.add(alex5);
        ss.add(alex2);
        System.out.println("ss.onePrint(alex4) = " + ss.onePrint("Лошника Г.Б"));
        ss.remove(alex6);

        System.out.println("ss.print() = " + ss.print());

//        task();
//        Map <Integer, Employee> book = new HashMap<>();
//        book.put(1, alex1);
//        book.put(2, alex2);
//        System.out.println("book.get(1).toString() = " + book.get(1).toString());
//
//
//
//
//        System.out.println("book.get(1) = " + book.get(1));
//        Map <Integer, Employee> employeeMap = new HashMap<>();
//        employeeMap.put(1,alex1);
//        employeeMap.put(2,alex2);
//        employeeMap.put(3,alex3);
//        System.out.println("employeeMap.toString() = " + employeeMap.toString());
//        System.out.println("employeeMap.get(1).getNameEmployee() = " + employeeMap.get(1).getNameEmployee());
//        EmployeeBook ss = new EmployeeBook(stringMap);
//        ss.add("ddd", alex4);
//        ss.add("ddа", alex3);
//        System.out.println("ss.print() = " + ss.print());
    }

    public static void task() {

    }
}