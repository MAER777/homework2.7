import java.util.HashMap;
import java.util.Map;

public class EmployeeBook {
    private final Map<String, Employee> stringMap;

    public EmployeeBook() {
        this.stringMap = new HashMap<>();
    }

    public void add (Employee emp) {
        if (!stringMap.containsKey(emp.getNameEmployee())) {
            this.stringMap.put(emp.getNameEmployee(), emp);
            System.out.println("Добавлен: " + emp);
        } else {
            System.out.println("Такой сотрудник уже есть: " + emp);
        }
    }

    public void remove (Employee emp) {
        if (stringMap.containsKey(emp.getNameEmployee())) {
            this.stringMap.remove(emp.getNameEmployee());
            System.out.println("Удален " + emp);
        } else {
            System.out.println("Не найден " + emp);
        }
    }

    public String print() {
        return stringMap.toString();
    }

    public Employee onePrint(String n) {
        return stringMap.get(n);
    }
}
