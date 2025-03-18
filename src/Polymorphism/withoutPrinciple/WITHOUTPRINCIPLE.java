
package Polymorphism.withoutPrinciple;

class CreditCardPayment {
    private double amount;
    private String cardNumber;

    public CreditCardPayment(double amount, String cardNumber) {
        this.amount = amount;
        this.cardNumber = cardNumber;
    }

    public void payWithCreditCard() {
        System.out.println("Paid $" + amount + " using Credit Card: " + cardNumber);
    }
}


class PayPalPayment {
    private double amount;
    private String email;

    public PayPalPayment(double amount, String email) {
        this.amount = amount;
        this.email = email;
    }

    public void payWithPayPal() {
        System.out.println("Paid $" + amount + " using PayPal: " + email);
    }
}


class CashPayment {
    private double amount;

    public CashPayment(double amount) {
        this.amount = amount;
    }

    public void payWithCash() {
        System.out.println("Paid $" + amount + " in Cash.");
    }
}


public class WITHOUTPRINCIPLE {
    public static void main(String[] args) {
        CreditCardPayment payment1 = new CreditCardPayment(100.0, "1234-5678-9876-5432");
        PayPalPayment payment2 = new PayPalPayment(50.0, "user@example.com");
        CashPayment payment3 = new CashPayment(20.0);

        
        payment1.payWithCreditCard();
        payment2.payWithPayPal();
        payment3.payWithCash();
    }
}
