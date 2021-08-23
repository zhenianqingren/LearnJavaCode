package service;

public class Data {
    public static final int EMPLOYEE = 10;
    public static final int PROGRAMMER = 11;
    public static final int DESIGNER = 12;
    public static final int ARCHITECT = 13;

    public static final int PC = 21;
    public static final int NOTEBOOK = 22;
    public static final int PRINTER = 23;
    //    EMPLOYEE      10, id, name, age, salary
//    PROGRAMMER    11, id, name, age, salary
//    DESIGNER      12, id, name, age, salary, bonus
//    ARCHITECT     13, id, name, age, salary, bonus, stock
    public static final String[][] EMPLOYEES = {
            {"10", "1", "马 云", "22", "3000"},
            {"13", "2", "马化腾", "32", "18000", "15000", "2000"},
            {"11", "3", "李彦宏", "23", "7000"},
            {"11", "4", "刘强东", "24", "7300"},
            {"12", "5", "雷 军", "28", "10000", "5000"},
            {"11", "6", "任志强", "22", "6800"},
            {"12", "7", "柳传志", "29", "10800", "5200"},
            {"13", "8", "杨元庆", "30", "19800", "15000", "2500"},
            {"12", "9", "史玉柱", "26", "9800", "5500"},
            {"11", "10", "丁 磊", "21", "6600"},
            {"11", "11", "张朝阳", "25", "7100"},
            {"12", "12", "杨致远", "27", "9600", "4800"}
    };
    //    following equipments matches upper employees
//    PC        :21, model, display
//    NoteBook  :22, model, price
//    Printer   :23, name,  type
    public static final String[][] EQUIPMENTS = {
            {},
            {"22", "LenvenoT4", "6000"},
            {"21","Dell","NEC17inch"},
            {"23","Jianeng2900","laser"},
            {"21","ASUS","SAMSUNG17inch"},
            {"21","ASUS","SAMSUNG17inch"},
            {"23","HPm6","5800"},
            {"23","HPm6","5800"},
            {"21","Dell","NEC17inch"},
            {"21","ASUS","SAMSUNG17inch"},
            {"23","HPm6","5800"},
            {"22","MacBookPro","12000"}
    };
}
