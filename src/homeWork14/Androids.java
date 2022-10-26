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

    public void showProgrammingLanguageLinuxOS() {
        System.out.println("Programming language: LinuxOS basically written in C language and assembly language.");
    }

    public void showInfo() {
        sms();
        call();
        internet();
        showProgrammingLanguageLinuxOS();

    }
}
