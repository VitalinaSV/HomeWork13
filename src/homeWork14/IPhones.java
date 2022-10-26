package homeWork14;

public class IPhones implements SmartPhones, IOS {
    public void sms() {
        System.out.println("SMS: Iphones does not offer a native way to chat to non-Apple users. Users can message over Apple users using iMessage.");
    }

    public void call() {

        System.out.println("Call: iOS’s phone app has the ability to reply to a phonecall with a canned text message instead of answering, or to set a callback reminder.");
    }

    public void internet() {
        System.out.println("Internet: iOS uses Safari.");

    }

    public void showProgrammingLanguageIOS() {
        System.out.println("Programming language: IOS is mainly written in C, C++, Objective-C, assembly language and Swift.");
    }

    public void showInfo() {
        sms();
        call();
        internet();
        showProgrammingLanguageIOS();
    }
}


