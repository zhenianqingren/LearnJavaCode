package service;

import domain.*;

public class NameListService {
    Employee employees[];

    public NameListService() {
        employees = new Employee[Data.EMPLOYEES.length];
        for (int i = 0; i < Data.EMPLOYEES.length; i++) {
            int type = Integer.parseInt(Data.EMPLOYEES[i][0]);
            int id = Integer.parseInt(Data.EMPLOYEES[i][1]);
            String name = Data.EMPLOYEES[i][2];
            int age = Integer.parseInt(Data.EMPLOYEES[i][3]);
            int salary = Integer.parseInt(Data.EMPLOYEES[i][4]);
            Equipment equipment=null;
            double bonus=0;
            switch (type) {
                case Data.EMPLOYEE:
                    employees[i] = new Employee(id, name, age, salary);
                    break;
                case Data.PROGRAMMER:
                    equipment=createEquipment(i);
                    employees[i] = new Programmer(id, name, age, salary,equipment);
                    break;
                case Data.DESIGNER:
                    bonus=Double.parseDouble(Data.EMPLOYEES[i][5]);
                    equipment=createEquipment(i);
                    employees[i]=new Designer(id, name, age, salary,equipment,bonus);
                    break;
                case Data.ARCHITECT:
                    bonus=Double.parseDouble(Data.EMPLOYEES[i][5]);
                    equipment=createEquipment(i);
                    double stock=Double.parseDouble(Data.EMPLOYEES[i][6]);
                    employees[i]=new Architect(id, name, age, salary,equipment,bonus,stock);
                    break;
            }
        }
    }

    private Equipment createEquipment(int i) {
        int type = Integer.parseInt(Data.EQUIPMENTS[i][0]);
        switch (type) {
            case Data.PC:
                return new PC(Data.EQUIPMENTS[i][1], Data.EQUIPMENTS[i][2]);
            case Data.NOTEBOOK:
                return new NoteBook(Data.EQUIPMENTS[i][1], Double.parseDouble(Data.EQUIPMENTS[i][2]));
            case Data.PRINTER:
                return new Printer(Data.EQUIPMENTS[i][1], Data.EQUIPMENTS[i][2]);
        }
        return null;
    }

    public Employee[] getAllEmployees() {
        return employees;
    }

    public Employee getEmployee(int id) throws TeamException {
        for(int i=0;i<employees.length;i++)
            if (employees[i].getId()==id)
                return employees[i];
        throw new TeamException("找不到指定员工");
    }
}
