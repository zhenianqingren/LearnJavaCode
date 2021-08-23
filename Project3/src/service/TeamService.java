package service;

import domain.*;

//manage team:include delete add members
public class TeamService {
    private static int counter = 1;//give memberID a value
    private final int MAX_MEMBER = 5;
    private Programmer team[] = new Programmer[MAX_MEMBER];
    private int total;

    public Programmer[] getTeam() {
        Programmer team[] = new Programmer[total];
        for (int i = 0; i < total; i++)
            team[i] = this.team[i];
        return team;
    }

    public void addMember(Employee e) throws TeamException {
        JudgeLegal(e);
        Programmer p = (Programmer) e;
        team[total++] = p;
        p.setMemberId(counter++);
        p.setStatus(Status.BUSY);
    }

    private boolean isExist(Employee e) {
        for (int i = 0; i < total; i++)
            if (team[i].getId() == e.getId())
                return true;
        return false;
    }

    private int[] getNumOfType() {
        int NumOfType[] = new int[]{0, 0, 0};
        for (int i = 0; i < total; i++) {
            if (team[i] instanceof Architect)
                NumOfType[0]++;
            else if (team[i] instanceof Designer)
                NumOfType[1]++;
            else if (team[i] instanceof Programmer)
                NumOfType[2]++;
        }
        return NumOfType;
    }

    private int TypeIllegal(int NumOfType[], Programmer p) {
        if (p instanceof Architect && NumOfType[0] >= 1)
            return 0;
        else if (p instanceof Designer && NumOfType[1] >= 2)
            return 1;
        else if (p instanceof Programmer && NumOfType[2] >= 3)
            return 2;
        else
            return 3;
    }

    public void JudgeLegal(Employee e) throws TeamException {
        //        full member
        if (total == MAX_MEMBER) {
            throw new TeamException("开发团队成员已满");
        }
//        e is not programmer
        if (!(e instanceof Programmer)) {
            throw new TeamException("该员工不属于开发人员");
        }
//        e has already been in this team
        if (isExist(e)) {
            throw new TeamException("该员工已在此开发团队中");
        }
//        e has already in another team
//        e is on vacation
        Programmer p = (Programmer) e;
        if ("BUSY".equalsIgnoreCase(p.getStatus().getNAME())) {
            throw new TeamException("该员工已加入另一开发团队");
        } else if ("VOCATION".equalsIgnoreCase(p.getStatus().getNAME())) {
            throw new TeamException("该员工正在休假");
        }
//        every team's architect is less than 2
//        every team's designers is less than 3
//        every team's programmers is less than 4
        switch (TypeIllegal(getNumOfType(), p)) {
            case 0:
                throw new TeamException("架构师超出上限");
            case 1:
                throw new TeamException("设计师超出上限");
            case 2:
                throw new TeamException("程序员超出上限");
            case 3:
                break;
        }
    }

    public void removeMember(int memberID) throws TeamException {
        if(total==0)
            throw new TeamException("团队员工数为0");
        int i = 0;
        for (; i < total; i++)
            if (team[i].getMemberId() == memberID) {
                team[i].setStatus(Status.FREE);
                break;
            }
        if(i==total)
            throw new TeamException("未找到指定员工");
        for(int j=i;j<total-1;j++)
            team[j]=team[j+1];
        team[--total]=null;
    }
}
