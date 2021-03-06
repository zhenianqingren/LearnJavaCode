package domain;

public class Designer extends Programmer{
    private double bonus;

    public Designer() {
    }

    public Designer(int id, String name, int age, int salary, Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public String toString(){
        return getDetails()+"\t设计师\t"+getStatus()+"\t"+bonus+"\t\t\t"+getEquipment().getDescription();
    }
}
