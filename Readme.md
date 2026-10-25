# Java Programming Paradigms: Object-Oriented Programming

Welcome to **Java-paradigm**! This repository is dedicated to learning, teaching, and demonstrating fundamental Java programming concepts, with a primary focus on **Object-Oriented Programming (OOP)**.

The repository uses practical Java examples to explain how classes, objects, constructors, methods, encapsulation, object relationships, and collections work in real programs.

## 🎯 Learning Objectives

By exploring this repository, learners will be able to:

- Understand Java program structure and the `main()` method.
- Declare variables and work with Java data types.
- Create classes and instantiate objects.
- Use constructors to initialize objects.
- Implement getters and setters to access and modify object properties.
- Understand encapsulation and object composition.
- Establish relationships between objects.
- Work with arrays, `ArrayList`, and Java collections.
- Model real-world entities using Java classes.
- Write, compile, run, and debug Java programs.

## 📚 Concepts Covered

### 1. Java Fundamentals

Introduction to basic Java syntax and program execution.

Topics include:
- The `main()` method and program entry points.
- Output using `System.out.print()` and `System.out.println()`.
- Variables and data types, including `int`, `String`, and `char`.
- String concatenation.
- Object creation using the `new` keyword.
- Importing Java classes and packages.

### 2. Classes and Objects

A class defines the structure and behavior of objects, while an object is an instance of a class.

The repository demonstrates object creation through classes such as `Person`, `Laptop`, `Backpack`, `Student`, `Employee`, and `Book`.

Example:

```java
Person person = new Person("Hello", "World");

System.out.println(person.getfullName());

person.setfirstName("Wyclif");
person.setsecondName("Ouma");

System.out.println(person.getfullName());
```

This example illustrates object instantiation, method calls, and modifying object state.

### 3. Constructors

Constructors initialize objects when they are created.

Examples in the repository include:

```java
Student student = new Student(1, "Wyclif", "Ouma");

Course course = new Course(1, "Computer Science");
```

These examples demonstrate passing values to constructors to initialize object properties.

### 4. Encapsulation: Getters and Setters

Encapsulation involves controlling access to an object's internal state.

The repository demonstrates getter and setter methods for accessing and modifying properties, including names, brain type, and laptop details.

Example:

```java
laptop.setlaptopName("Lenovo");

System.out.println(laptop.getlaptopName());
```

### 5. Object Composition and Relationships

Java objects can contain references to other objects, allowing classes to collaborate.

The repository demonstrates relationships through examples such as:

- `Backpack` containing a `Laptop` reference.
- `Person` having a `Brain` object.
- `Course` maintaining a collection of enrolled students.
- `Department` maintaining a collection of employees.

Example:

```java
Laptop laptop = new Laptop();
laptop.setlaptopName("Lenovo");

Backpack backpack = new Backpack();
backpack.setLaptop(laptop);

System.out.println(backpack.getLaptop().getlaptopName());
```

This demonstrates object composition or association through an object reference.

### 6. Arrays and Collections

The repository introduces arrays and Java's `ArrayList` collection.

Topics include:
- Declaring and accessing arrays.
- Printing arrays using `Arrays.toString()`.
- Creating and using `ArrayList`.
- Adding objects to collections.
- Retrieving objects from a collection.

Example:

```java
ArrayList<Student> students = new ArrayList<>();

students.add(new Student(1, "Wyclif", "Ouma"));
students.add(new Student(2, "Carlito", "Maseno"));

System.out.println(students.getFirst().getFiullName());
```

This example uses `ArrayList` to store multiple student objects. The `getFirst()` method is available in modern Java versions, including Java 21 and later.

### 7. Modeling Real-World Entities

Object-oriented programming helps represent real-world entities and their relationships in software.

Examples in the repository include:

| Class | Example concept |
|---|---|
| `Person` | Personal details and behavior |
| `Brain` | An object associated with a person |
| `Laptop` | Device properties |
| `Backpack` | Relationship with a laptop |
| `Student` | Student information |
| `Course` | Course and enrolled students |
| `Employee` | Employee information |
| `Department` | Department and employees |
| `Book` | Title, publisher, publication date, price, and ID |

These examples help learners understand how software objects can represent entities from real-world domains.

## 🛠️ Technologies and Tools

- **Programming Language:** Java
- **IDE:** Apache NetBeans
- **Version Control:** Git
- **Repository Hosting:** GitHub
- **Core APIs:** Java Collections Framework, `java.util.Date`, `java.util.Arrays`, and other standard Java libraries.

## 🚀 Getting Started

### Prerequisites

- Install a JDK compatible with the Java version used by the project.
- Install Apache NetBeans or another Java IDE.
- Have basic familiarity with programming fundamentals.

### Clone the Repository

```bash
git clone https://github.com/Wyclifo/Java-paradigm.git
```

### Open the Project

1. Launch Apache NetBeans.
2. Select **File → Open Project**.
3. Locate the cloned repository or the Java project directory.
4. Open the project.
5. Run `HelloWorld2025.java` or the configured main class.

### Explore the Code

Start with `HelloWorld2025.java` and follow the examples that instantiate and use other classes.

Review the corresponding class definitions to understand their constructors, properties, getters, setters, and relationships.

## 🧑‍🏫 Intended Audience

This repository is suitable for:

- Beginners learning Java programming.
- Students studying Object-Oriented Programming.
- Instructors demonstrating Java concepts through practical examples.
- Developers revising classes, objects, encapsulation, and collections.
- Learners preparing for Java programming assignments and practical examinations.

## 📈 Future Learning Topics

Potential extensions to the repository include:

- Inheritance and method overriding.
- Polymorphism and dynamic method dispatch.
- Abstraction using abstract classes and interfaces.
- Access modifiers and data hiding.
- Method overloading.
- Static members and final variables.
- Exception handling.
- Packages and modular program organization.
- Generics and collection interfaces.
- File handling and database connectivity.
- SOLID principles and basic object-oriented design patterns.
- Unit testing with JUnit.

These are suggested future topics and may not yet be implemented in the current source code.

## 🤝 Contributing

Contributions that improve the learning experience are welcome.

You can contribute by:
1. Adding examples for new Java concepts.
2. Improving code comments and explanations.
3. Fixing errors in existing examples.
4. Adding exercises and practical assignments.
5. Improving documentation.

To contribute, fork the repository, create a branch, make your changes, and submit a pull request.

## 📄 License

No license has been specified in this README. Add a suitable license file if you intend to define how others may use, modify, or distribute this repository.

---

**Happy coding and learning Java!** ☕

