package controller;

public interface EmployeProcess {
   default  void ContractEmp(){
       System.out.println("Process ");
   }
    void permanentEmp();
}
