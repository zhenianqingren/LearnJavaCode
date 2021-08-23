package service;

import domain.Employee;
import domain.Programmer;
import domain.TeamException;
import view.TSUtility;

public class TeamView {
    private NameListService listService = new NameListService();
    private TeamService teamService = new TeamService();

    public void enterMenu() {
        boolean loopFlag = true;
        char menu = 0;
        while (loopFlag) {
            if (menu != '1') {
                listAllEmployees();
            }
            System.out.println("1-团队列表 2-添加团队成员 3-删除团队成员 4-退出 请选择（1-4）：");
            menu = TSUtility.readMenuSelection();
            switch (menu) {
                case '1':
                    getTeam();
                    break;
                case '2':
                    AddMember();
                    break;
                case '3':
                    DeleteMember();
                    break;
                case '4':
                    if (isExit()) {
                        loopFlag = false;
                        System.out.println("退出成功");
                    }
                    break;
            }
        }
    }

    private boolean isExit() {
        System.out.println("是否要退出(Y/N)");
        char confirm = TSUtility.readConfirmSelection();
        if (confirm == 'Y')
            return true;
        return false;
    }

    private void listAllEmployees() {
//        System.out.println("显示公司所有员工");
        System.out.println("------------------------开发团队调度软件------------------------");
        Employee employees[] = listService.getAllEmployees();
        if (employees == null || employees.length == 0)
            System.out.println("开发团队中无任何员工");
        else
            for (int i = 0; i < employees.length; i++)
                System.out.println(employees[i]);
        System.out.println("-------------------------------------------------------------");
    }

    private void getTeam() {
        System.out.println("------------------查看开发团队情况------------------");
        Programmer team[] = teamService.getTeam();
        if (team == null || team.length == 0) {
            System.out.println("开发团队中无任何员工");
            return;
        } else
            for (int i = 0; i < team.length; i++) {
                System.out.print(team[i].getMemberId());
                System.out.println("\\"+team[i]);
            }
        System.out.println("-------------------------------------------------");
    }

    private void AddMember() {
        System.out.println("------------------添加团队员工------------------");
        System.out.println("请输入要添加的员工ID:");
        int id=TSUtility.readInt();
        Employee employee= null;
        try {
            employee = listService.getEmployee(id);
            teamService.addMember(employee);
            System.out.println("添加成功");

        } catch (TeamException e) {
            System.out.println("添加失败，原因"+e.getMessage());
        }
        TSUtility.readReturn();
    }

    private void DeleteMember() {
        System.out.println("------------------删除团队员工------------------");
        System.out.println("请输入要删除的员工ID:");
        int id=TSUtility.readInt();
        System.out.println("请确认是否要删除该员工(Y/N)");
        char selection=TSUtility.readConfirmSelection();
        if(selection=='N')
            return;
        try {
            Employee employee= listService.getEmployee(id);
            teamService.removeMember(employee.getId());
        } catch (TeamException e) {
            System.out.println("删除失败，原因是"+e.getMessage());
        }
        TSUtility.readReturn();
    }

    public static void main(String args[]) {
        TeamView view = new TeamView();
        view.enterMenu();
    }
}
