package juint;

import domain.Employee;
import domain.TeamException;
import service.NameListService;

public class NameListServiceTest {
    public void TestgetAllEmployees(){
        NameListService service=new NameListService();
        Employee[]employees=service.getAllEmployees();
        for (int i=0;i<employees.length;i++)
            System.out.println(employees[i]);
    }
    public void TestgetEmployee(){
        for(int i=0;i<=16;i++) {
            try {
                System.out.println(new NameListService().getEmployee(i));
            } catch (TeamException e) {
                System.out.println("未找到此员工");
            }
        }
    }
    public static void main(String args[]){
        new NameListServiceTest().TestgetEmployee();
    }
}
