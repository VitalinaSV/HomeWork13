package homeWork15;

public class Account {
    private String name;
    private String surname;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private String email;
    private String numberPhone;
    private int weight;
    private String bloodPressure;
    private int steps;
    private int age;



    public Account(String name, String surname, int dayOfBirth, int monthOfBirth, int yearOfBirth, String email, String numberPhone, int weight, String bloodPressure, int steps) {
        this.name = name;
        this.surname = surname;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
        this.numberPhone = numberPhone;
        this.weight = weight;
        this.bloodPressure = bloodPressure;
        this.steps = steps;
        this.age = 2021-yearOfBirth+1;

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }
    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public void printAccountInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Surname: " + getSurname());
        System.out.println("BirthDay: " + getDayOfBirth() + "."+getMonthOfBirth() + "."+getYearOfBirth());
        System.out.println("Age,years: " + getAge());
        System.out.println("Email address: " + getEmail());
        System.out.println("Contact: " + getNumberPhone());
        System.out.println("Weight,kg: " + getWeight());
        System.out.println("BloodPressure: " + getBloodPressure());
        System.out.println("Steps: " + getSteps());
        System.out.println();

    }
}
