package Model;
import Model.Department;

import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Employee {
    private int id;
    private String name;
    @Autowired
    private Department department;
  

    public void details(){
        department.setDepartment("IT");
        System.out.println("Id: " + id + "\nName: " + name +
                "\nDep: " + department.getDepartment());
    }
}
