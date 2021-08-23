package domain;

public class Architect extends Designer{
    private double stock;

    public Architect() {
    }

    public Architect(int id, String name, int age, int salary,Equipment equipment, double bonus, double stock) {
        super(id, name, age, salary, equipment, bonus);

        this.stock = stock;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }
    public String toString(){
        return getDetails()+"\t架构师\t"+getStatus()+"\t"+getBonus()+"\t"+stock+"\t"+getEquipment().getDescription();
    }
}
