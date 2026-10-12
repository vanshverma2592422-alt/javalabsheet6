import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("===== MCA203P-AS06 JAVA PROGRAMS =====");
        System.out.println("1. Animal and Cat");
        System.out.println("2. Vehicle and Car");
        System.out.println("3. Shape and Rectangle");
        System.out.println("4. Employee and HRManager");
        System.out.println("5. BankAccount and SavingsAccount");
        System.out.println("6. Abstract Animal: Lion and Tiger");
        System.out.println("7. Abstract Shape: Circle and Triangle");
        System.out.println("8. Abstract BankAccount");
        System.out.println("9. Animal: Eat and Sleep");
        System.out.println("10. Abstract Employee");
        System.out.println("11. Average of Ten Numbers");
        System.out.print("Enter question number (1-11): ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1: q1(); break;
            case 2: q2(); break;
            case 3: q3(); break;
            case 4: q4(); break;
            case 5: q5(); break;
            case 6: q6(); break;
            case 7: q7(); break;
            case 8: q8(); break;
            case 9: q9(); break;
            case 10: q10(); break;
            case 11: q11(); break;
            default: System.out.println("Invalid question number.");
        }
    }

    // QUESTION 1: Animal and Cat - Method Overriding
    static void q1() {
        Animal1 a = new Animal1();
        Cat1 c = new Cat1();

        a.makeSound();
        c.makeSound();
    }

    // QUESTION 2: Vehicle and Car - Method Overriding
    static void q2() {
        Vehicle2 v = new Vehicle2();
        Car2 c = new Car2();

        v.drive();
        c.drive();
    }

    // QUESTION 3: Shape and Rectangle - Calculate Area
    static void q3() {
        Rectangle3 r = new Rectangle3(10, 5);
        System.out.println("Area of rectangle: " + r.getArea());
    }

    // QUESTION 4: Employee and HRManager
    static void q4() {
        HRManager4 hr = new HRManager4(50000);

        hr.work();
        System.out.println("Salary: " + hr.getSalary());
        hr.addEmployee();
    }

    // QUESTION 5: BankAccount and SavingsAccount
    static void q5() {
        SavingsAccount5 account = new SavingsAccount5(500);

        account.deposit(200);
        account.withdraw(300);
        account.withdraw(350);
        System.out.println("Final balance: " + account.getBalance());
    }

    // QUESTION 6: Abstract Animal - Lion and Tiger
    static void q6() {
        Animal6 lion = new Lion6();
        Animal6 tiger = new Tiger6();

        lion.sound();
        tiger.sound();
    }

    // QUESTION 7: Abstract Shape - Circle and Triangle
    static void q7() {
        Shape7 circle = new Circle7(5);
        Shape7 triangle = new Triangle7(3, 4, 5);

        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Circle perimeter: " + circle.calculatePerimeter());

        System.out.println("Triangle area: " + triangle.calculateArea());
        System.out.println("Triangle perimeter: " + triangle.calculatePerimeter());
    }

    // QUESTION 8: Abstract BankAccount
    static void q8() {
        BankAccount8 savings = new SavingsAccount8(1000);
        BankAccount8 current = new CurrentAccount8(2000);

        savings.deposit(500);
        savings.withdraw(300);
        System.out.println("Savings balance: " + savings.getBalance());

        current.deposit(1000);
        current.withdraw(500);
        System.out.println("Current balance: " + current.getBalance());
    }

    // QUESTION 9: Abstract Animal - Eat and Sleep
    static void q9() {
        Animal9 lion = new Lion9();
        Animal9 tiger = new Tiger9();
        Animal9 deer = new Deer9();

        lion.eat();
        lion.sleep();

        tiger.eat();
        tiger.sleep();

        deer.eat();
        deer.sleep();
    }

    // QUESTION 10: Abstract Employee - Manager and Programmer
    static void q10() {
        Employee10 manager = new Manager10("Aman", 60000);
        Employee10 programmer = new Programmer10("Rohan", 45000);

        manager.displayInfo();
        System.out.println("Manager salary: " + manager.calculateSalary());

        programmer.displayInfo();
        System.out.println("Programmer salary: " + programmer.calculateSalary());
    }

    // QUESTION 11: Average of Ten Numbers using this keyword
    static void q11() {
        double[] numbers = new double[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextDouble();
        }

        AverageCalculator11 calculator = new AverageCalculator11(numbers);
        calculator.calculate();
    }
}

// QUESTION 1 CLASSES
class Animal1 {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat1 extends Animal1 {
    @Override
    void makeSound() {
        System.out.println("Cat barks");
    }
}

// QUESTION 2 CLASSES
class Vehicle2 {
    void drive() {
        System.out.println("Vehicle is driving");
    }
}

class Car2 extends Vehicle2 {
    @Override
    void drive() {
        System.out.println("Repairing a car");
    }
}

// QUESTION 3 CLASSES
class Shape3 {
    double getArea() {
        return 0;
    }
}

class Rectangle3 extends Shape3 {
    private double length;
    private double width;

    Rectangle3(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double getArea() {
        return length * width;
    }
}

// QUESTION 4 CLASSES
class Employee4 {
    protected double salary;

    Employee4(double salary) {
        this.salary = salary;
    }

    void work() {
        System.out.println("Employee is working");
    }

    double getSalary() {
        return salary;
    }
}

class HRManager4 extends Employee4 {
    HRManager4(double salary) {
        super(salary);
    }

    @Override
    void work() {
        System.out.println("HR Manager is managing employees");
    }

    void addEmployee() {
        System.out.println("New employee added");
    }
}

// QUESTION 5 CLASSES
class BankAccount5 {
    protected double balance;

    BankAccount5(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Withdrawal not allowed");
        }
    }

    double getBalance() {
        return balance;
    }
}

class SavingsAccount5 extends BankAccount5 {
    SavingsAccount5(double balance) {
        super(balance);
    }

    @Override
    void withdraw(double amount) {
        if (amount > 0 && balance - amount >= 100) {
            balance -= amount;
            System.out.println("Withdrawal successful: " + amount);
        } else {
            System.out.println("Withdrawal denied: minimum balance of 100 required");
        }
    }
}

// QUESTION 6 CLASSES
abstract class Animal6 {
    abstract void sound();
}

class Lion6 extends Animal6 {
    @Override
    void sound() {
        System.out.println("Lion roars");
    }
}

class Tiger6 extends Animal6 {
    @Override
    void sound() {
        System.out.println("Tiger growls");
    }
}

// QUESTION 7 CLASSES
abstract class Shape7 {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Circle7 extends Shape7 {
    private double radius;

    Circle7(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Triangle7 extends Shape7 {
    private double a, b, c;

    Triangle7(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double calculateArea() {
        double s = (a + b + c) / 2.0;
        double value = s * (s - a) * (s - b) * (s - c);
        return Math.sqrt(Math.max(0, value));
    }

    @Override
    double calculatePerimeter() {
        return a + b + c;
    }
}

// QUESTION 8 CLASSES
abstract class BankAccount8 {
    protected double balance;

    BankAccount8(double balance) {
        this.balance = balance;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);

    double getBalance() {
        return balance;
    }
}

class SavingsAccount8 extends BankAccount8 {
    SavingsAccount8(double balance) {
        super(balance);
    }

    @Override
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Savings deposit: " + amount);
        }
    }

    @Override
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Savings withdrawal: " + amount);
        } else {
            System.out.println("Savings withdrawal denied");
        }
    }
}

class CurrentAccount8 extends BankAccount8 {
    CurrentAccount8(double balance) {
        super(balance);
    }

    @Override
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Current account deposit: " + amount);
        }
    }

    @Override
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Current account withdrawal: " + amount);
        } else {
            System.out.println("Current account withdrawal denied");
        }
    }
}

// QUESTION 9 CLASSES
abstract class Animal9 {
    abstract void eat();
    abstract void sleep();
}

class Lion9 extends Animal9 {
    @Override
    void eat() {
        System.out.println("Lion eats meat");
    }

    @Override
    void sleep() {
        System.out.println("Lion sleeps in its resting area");
    }
}

class Tiger9 extends Animal9 {
    @Override
    void eat() {
        System.out.println("Tiger eats meat");
    }

    @Override
    void sleep() {
        System.out.println("Tiger rests in the forest");
    }
}

class Deer9 extends Animal9 {
    @Override
    void eat() {
        System.out.println("Deer eats grass and plants");
    }

    @Override
    void sleep() {
        System.out.println("Deer rests in a safe area");
    }
}

// QUESTION 10 CLASSES
abstract class Employee10 {
    protected String name;
    protected double salary;

    Employee10(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract double calculateSalary();
    abstract void displayInfo();
}

class Manager10 extends Employee10 {
    Manager10(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calculateSalary() {
        return salary;
    }

    @Override
    void displayInfo() {
        System.out.println("Manager name: " + name);
    }
}

class Programmer10 extends Employee10 {
    Programmer10(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calculateSalary() {
        return salary;
    }

    @Override
    void displayInfo() {
        System.out.println("Programmer name: " + name);
    }
}

// QUESTION 11 CLASS
class AverageCalculator11 {
    private double[] numbers;

    AverageCalculator11(double[] numbers) {
        this.numbers = numbers; // Using this keyword
    }

    void calculate() {
        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        double average = sum / numbers.length;
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > average) {
                count++;
            }
        }

        System.out.println("Average: " + average);
        System.out.println("Numbers above average: " + count);
    }
}
