# GRASP Principle: Polymorphism in Java - Payment System Example

## Introduction
This project demonstrates the **Polymorphism** principle from GRASP (General Responsibility Assignment Software Patterns) using a payment system example. Polymorphism allows objects of different classes to be treated through a common interface or superclass, enabling flexibility and scalability in software design.

## Code with Principle (Polymorphism)
The payment system example demonstrates polymorphism in Java by simulating different payment methods like **Credit Card**, **PayPal**, and **Cash**. In the polymorphic approach, an abstract class `Payment` defines a common method `makePayment()`, and each payment type (`CreditCard`, `PayPal`, `Cash`) extends this class, providing its own implementation. This allows the main class to handle all payments using a single reference type, making the code more reusable, scalable, and easier to maintain.

### Benefits:
- **Reusability:** Adding new payment methods requires minimal changes.
- **Scalability:** Supports easy extension without modifying existing code.
- **Maintainability:** Reduces code duplication and keeps the structure organized.

## Code without Principle (Non-Polymorphic Approach)
The payment system without polymorphism creates separate classes for each payment method, such as **Credit Card**, **PayPal**, and **Cash**, without a common structure. Each class has its own method to process payments, meaning that if a new payment method is introduced, a separate class and method must be created, leading to code duplication and reduced flexibility.

### Drawbacks:
- **Code Duplication:** Similar logic repeated across multiple classes.
- **Reduced Flexibility:** Hard to introduce new payment methods.
- **Complex Maintenance:** Modifying one part of the system requires changes across multiple classes.

## How to Run the Code
1. Clone the repository:
   ```bash
   git clone <repository-link>
   cd <repository-folder>
