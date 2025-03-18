package Polymorphism.withPrinciple;
abstract class Payment {
    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }


    public abstract void makePayment();
}


class CreditCard extends Payment {
    private String cardNumber;

    public CreditCard(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void makePayment() {
        System.out.println("Paid $" + amount + " using Credit Card: " + cardNumber);
    }
}


class PayPal extends Payment {
    private String email;

    public PayPal(double amount, String email) {
        super(amount);
        this.email = email;
    }

    @Override
    public void makePayment() {
        System.out.println("Paid $" + amount + " using PayPal: " + email);
    }
}


class Cash extends Payment {
    public Cash(double amount) {
        super(amount);
    }

    @Override
    public void makePayment() {
        System.out.println("Paid $" + amount + " in Cash.");
    }
}

public class WITHPRINCIPLE{
    public static void main(String[] args) {
        Payment payment1 = new CreditCard(100.0, "1234-5678-9876-5432");
        Payment payment2 = new PayPal(50.0, "user@example.com");
        Payment payment3 = new Cash(20.0);

       
        payment1.makePayment();
        payment2.makePayment();
        payment3.makePayment();
    }
}
