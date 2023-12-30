package decorator;

public class Main {
    public static void main(String[] args) {

        INotifier notifyAll = new FacebookDecorator(new WhatsappDecorator(new Notifier("Amna")));
        notifyAll.send("Like and Subscribe!!!");

        INotifier notifyFbMail = new FacebookDecorator(new Notifier("Amna"));
        notifyFbMail.send("Like and Subscribe!!!");

    }

}
