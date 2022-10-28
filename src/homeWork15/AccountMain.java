package homeWork15;

public class AccountMain {
    public static void main(String[] args) {
        Account user1 = new Account("Charles", "Hunnam", 10, 4,1980,"charles@mail.com",
                                    "+44(0)2072296412",88,"120/80",18_560);
        Account user2 = new Account("Angelina", "Jolie",4, 6, 1975, "croft@mail.com",
                                    "310-275-7900", 55,"110/74",12_474 );
        Account user3 = new Account("Brad", "Pitt", 18,12,1963,"brady@mail.com",
                                    "310-275-5978", 78,"137/97",11_989);
        user1.printAccountInfo();
        user2.printAccountInfo();
        user3.printAccountInfo();

        user2.setSurname("Pitt");
        user2.setWeight(52);
        user2.setBloodPressure("105/69");

        user3.setWeight(80);
        user3.setBloodPressure("140/110");
        user3.setSteps(9_200);

        user2.printAccountInfo();
        user3.printAccountInfo();
    }
}
