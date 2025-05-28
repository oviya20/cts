                                                             JAVA solutions(single code)

import java.io.*;
import java.net.http.*;
import java.net.URI;
import java.util.*;
import java.util.concurrent.*;
import java.util.stream.*;
import java.lang.reflect.*;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

interface Playable {
    void play();
}

class Guitar implements Playable {
    public void play() { System.out.println("Playing Guitar"); }
}

class Piano implements Playable {
    public void play() { System.out.println("Playing Piano"); }
}

class Animal {
    void makeSound() { System.out.println("Some animal sound"); }
}

class Dog extends Animal {
    @Override
    void makeSound() { System.out.println("Bark"); }
}

class Car {
    String make, model;
    int year;

    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    void displayDetails() {
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year);
    }
}

record Person(String name, int age) {}

public class CoreJavaExercises {
    public static void main(String[] args) throws Exception {
        helloWorld();
        simpleCalculator();
        evenOrOddChecker();
        leapYearChecker();
        multiplicationTable();
        dataTypeDemo();
        typeCastingExample();
        operatorPrecedence();
        gradeCalculator();
        numberGuessingGame();
        factorialCalculator();
        methodOverloading();
        recursiveFibonacci();
        arraySumAndAverage();
        stringReversal();
        palindromeChecker();
        classAndObjectCreation();
        inheritanceExample();
        interfaceImplementation();
        tryCatchExample();
        customExceptionDemo();
        fileWriting();
        fileReading();
        arrayListExample();
        hashMapExample();
        threadCreation();
        lambdaExpressions();
        streamAPIExample();
        recordsExample();
        patternMatchingExample(42);
        basicJDBC();
        insertUpdateJDBC();
        transactionJDBC();
        javaModules();
        tcpChat();
        httpClientAPI();
        javapDemo();
        decompileClass();
        reflectionExample();
        virtualThreads();
        executorServiceCallable();
    }

    static void helloWorld() {
        System.out.println("Hello, World!");
    }

    static void simpleCalculator() {
        int a = 10, b = 5;
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
    }

    static void evenOrOddChecker() {
        int num = 4;
        System.out.println(num + " is " + (num % 2 == 0 ? "Even" : "Odd"));
    }

    static void leapYearChecker() {
        int year = 2024;
        boolean leap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println(year + " is " + (leap ? "Leap Year" : "Not a Leap Year"));
    }

    static void multiplicationTable() {
        int n = 5;
        for (int i = 1; i <= 10; i++)
            System.out.println(n + " x " + i + " = " + (n * i));
    }

    static void dataTypeDemo() {
        int i = 10;
        float f = 10.5f;
        double d = 20.5;
        char c = 'A';
        boolean b = true;
        System.out.println(i + " " + f + " " + d + " " + c + " " + b);
    }

    static void typeCastingExample() {
        double d = 9.78;
        int i = (int) d;
        int j = 5;
        double jd = j;
        System.out.println("Double to int: " + i);
        System.out.println("Int to double: " + jd);
    }

    static void operatorPrecedence() {
        int result = 10 + 5 * 2;
        System.out.println("Result: " + result);
    }

    static void gradeCalculator() {
        int marks = 85;
        char grade = (marks >= 90) ? 'A' : (marks >= 80) ? 'B' :
                     (marks >= 70) ? 'C' : (marks >= 60) ? 'D' : 'F';
        System.out.println("Grade: " + grade);
    }

    static void numberGuessingGame() {
        int secret = 42, guess = 42;
        System.out.println("Guessed correctly: " + (guess == secret));
    }

    static void factorialCalculator() {
        int num = 5, fact = 1;
        for (int i = 1; i <= num; i++) fact *= i;
        System.out.println("Factorial: " + fact);
    }

    static void methodOverloading() {
        System.out.println(add(2, 3));
        System.out.println(add(2.5, 3.5));
        System.out.println(add(1, 2, 3));
    }

    static int add(int a, int b) { return a + b; }
    static double add(double a, double b) { return a + b; }
    static int add(int a, int b, int c) { return a + b + c; }

    static void recursiveFibonacci() {
        int n = 5;
        System.out.println("Fibonacci(" + n + ") = " + fibonacci(n));
    }

    static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static void arraySumAndAverage() {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = Arrays.stream(arr).sum();
        double avg = sum / (double) arr.length;
        System.out.println("Sum: " + sum + ", Avg: " + avg);
    }

    static void stringReversal() {
        String s = "hello";
        String reversed = new StringBuilder(s).reverse().toString();
        System.out.println("Reversed: " + reversed);
    }

    static void palindromeChecker() {
        String s = "Madam";
        String cleaned = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        String reversed = new StringBuilder(cleaned).reverse().toString();
        System.out.println("Is Palindrome: " + cleaned.equals(reversed));
    }

    static void classAndObjectCreation() {
        Car car = new Car("Toyota", "Camry", 2022);
        car.displayDetails();
    }

    static void inheritanceExample() {
        Animal a = new Animal();
        Dog d = new Dog();
        a.makeSound();
        d.makeSound();
    }

    static void interfaceImplementation() {
        Playable g = new Guitar();
        Playable p = new Piano();
        g.play();
        p.play();
    }

    static void tryCatchExample() {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
        }
    }

    static void customExceptionDemo() {
        int age = 17;
        try {
            if (age < 18)
                throw new InvalidAgeException("Age must be 18+");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }

    static void fileWriting() throws IOException {
        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write("Hello File!");
        }
    }

    static void fileReading() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
            System.out.println("File Content: " + reader.readLine());
        }
    }

    static void arrayListExample() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        System.out.println(names);
    }

    static void hashMapExample() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "Alice");
        map.put(102, "Bob");
        System.out.println("ID 101: " + map.get(101));
    }

    static void threadCreation() {
        Runnable task = () -> System.out.println("Thread Running");
        new Thread(task).start();
    }

    static void lambdaExpressions() {
        List<String> list = Arrays.asList("Banana", "Apple", "Cherry");
        list.sort((a, b) -> a.compareTo(b));
        System.out.println(list);
    }

    static void streamAPIExample() {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> evens = nums.stream().filter(n -> n % 2 == 0).toList();
        System.out.println("Evens: " + evens);
    }

    static void recordsExample() {
        List<Person> people = List.of(new Person("Karo", 22), new Person("Anna", 17));
        people.stream().filter(p -> p.age() > 18).forEach(System.out::println);
    }

    static void patternMatchingExample(Object obj) {
        switch (obj) {
            case Integer i -> System.out.println("Integer: " + i);
            case String s -> System.out.println("String: " + s);
            case Double d -> System.out.println("Double: " + d);
            default -> System.out.println("Unknown type");
        }
    }

    static void basicJDBC() {
        System.out.println("Simulate JDBC SELECT query");
    }

    static void insertUpdateJDBC() {
        System.out.println("Simulate JDBC INSERT/UPDATE");
    }

    static void transactionJDBC() {
        System.out.println("Simulate JDBC Transaction");
    }

    static void javaModules() {
        System.out.println("Simulate Java modules");
    }

    static void tcpChat() {
        System.out.println("Simulate TCP Chat Server");
    }

    static void httpClientAPI() throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(new URI("https://api.github.com")).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("Status: " + response.statusCode());
        System.out.println("Body: " + response.body().substring(0, 100) + "...");
    }

    static void javapDemo() {
        System.out.println("Compile and inspect bytecode using javap externally.");
    }

    static void decompileClass() {
        System.out.println("Use JD-GUI or CFR to view decompiled source.");
    }

    static void reflectionExample() throws Exception {
        Class<?> c = Class.forName("java.lang.String");
        for (Method m : c.getDeclaredMethods()) {
            System.out.println("Method: " + m.getName());
            break;
        }
    }

    static void virtualThreads() throws Exception {
        for (int i = 0; i < 10; i++) {
            Thread.startVirtualThread(() -> System.out.println("Virtual thread: " + Thread.currentThread()));
        }
        Thread.sleep(100);
    }

    static void executorServiceCallable() throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Callable<Integer> task = () -> 123;
        Future<Integer> future = executor.submit(task);
        System.out.println("Future result: " + future.get());
        executor.shutdown();
    }
}
