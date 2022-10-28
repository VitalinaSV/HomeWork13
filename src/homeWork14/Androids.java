package homeWork14;

public class Androids implements SmartPhones, LinuxOS {

    public void sms() {

        System.out.println("SMS: Android allows users to log onto GTalk for instant messages.");
    }

    public void call() {
        System.out.println("Call: Android allows the user to send one of a number of self-composed texts as autoreplies when declining a call. ");
    }

    public void internet() {

        System.out.println("Internet: Android uses Google Chrome.");
    }

    public void connectedToComputerUsingUSB() {
        System.out.println("Features an LinuxOS: Access Internal Storage Over USB");
    }

    public void showInfo() {
        sms();
        call();
        internet();
        connectedToComputerUsingUSB();


    }
}
