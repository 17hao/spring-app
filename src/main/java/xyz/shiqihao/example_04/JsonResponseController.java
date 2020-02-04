package xyz.shiqihao.example_04;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class JsonResponseController {

    @GetMapping(value = "/employees")
    public List<Employee> getAllEmployee() {
        List<Employee> employees = new ArrayList<>();

        Employee empl1 = new Employee("002", "John", "Doe", 25, 5000d);
        Employee empl2 = new Employee("003", "Steve", "Smith", 22, 4500d);
        Employee empl3 = new Employee("004", "Rob", "D", 27, 6000.50);

        employees.add(empl1);
        employees.add(empl2);
        employees.add(empl3);

        return employees;
    }
}
