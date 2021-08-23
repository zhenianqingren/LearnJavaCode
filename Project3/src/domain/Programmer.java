package domain;

public class Programmer extends Employee{
    private int memberId;
    private Status status=Status.FREE;
    private Equipment equipment;

    public Programmer() {
        super();
    }

    public Programmer(int id,String name,int age,int salary,Equipment equipment) {
        super(id,name,age,salary);
        this.equipment = equipment;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }
    public String toString(){
        return getDetails()+"\t程序员\t"+status+"\t\t\t\t\t"+equipment.getDescription();
    }
}
