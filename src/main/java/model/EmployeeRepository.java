package model;

import java.util.List;

import model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import com.javatechie.h2.api.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    List<Employee> findByDept(String dept);
    List<Employee> findById(long id);

}
