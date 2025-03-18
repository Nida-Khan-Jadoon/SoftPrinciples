DESCRIPTION OF CODE WITH PRINCIPLE
The payment system example demonstrates polymorphism in Java by simulating different payment methods like 
Credit Card, PayPal, and Cash. In the polymorphic approach, an abstract class `Payment` defines a c
ommon method `makePayment()`, and each payment type (`CreditCard`, `PayPal`, `Cash`) extends this class, 
providing its own implementation. This allows the main class to handle all payments using a single reference
 type, making the code more reusable, scalable, and easier to maintain. In contrast, the
 non-polymorphic approach creates separate classes for each payment type without a common structure,
 leading to code duplication and reduced flexibility. Adding a new payment method in this approach would
 require modifying multiple parts of the code, making it harder to maintain. Polymorphism helps in
 organizing code efficiently, reducing redundancy, and making future expansions simpler.


DESCRIPTION OF CODE WITHOUT-PRINCIPLE
The payment system without polymorphism creates separate classes for each payment method, such as
 Credit Card, PayPal, and Cash, without a common structure. Each class has its own method to process
 payments, meaning that if a new payment method is introduced, a separate class and method must be created,
 leading to code duplication and reduced flexibility. In the main class, objects of these individual
 classes are created, and their respective methods are called separately. This approach makes the code
less reusable and harder to maintain since every change requires modifying multiple parts of the
 codebase. Unlike polymorphism, which allows handling different payment types under a single reference, 
the non-polymorphic approach requires explicit handling of each type, making the system less scalable
 and more difficult to extend.