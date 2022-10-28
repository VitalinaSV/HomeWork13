package homeWork14;

public class SmartPhonesMain {
    public static void main(String[] args) {
        IPhones iPhone = new IPhones();
        Androids androids = new Androids();

        iPhone.showInfo();
        System.out.println("************************************");
        androids.showInfo();
    }

}
