/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.helloworld2025;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;


/**
 *
 * @author Wyclif
 */
public class HelloWorld2025  {

    public static void main(String[] args) {
     System.out.println("Hello World!");
         int age=23;
    String name="Wyclif Ouma";
   char city='A';
    System.out.print("Name is " + name +"  and age is  " + age + " and you are from " +city);
    
SayHello hello=new SayHello("Hello","World");
        System.out.println(hello.getHelloWorld());
    Person wyclif=new Person("Hello","World");
            System.out.println("Your full name is "+ wyclif.getfullName());
            wyclif.setfirstName("Wyclif ");
            wyclif.setsecondName("Ouma");
            System.out.println("Your first name is  "+ wyclif.getfirstName()+" and your second name is "+ wyclif.getsecondName()+" and your full name is  "+wyclif.getfullName());
            ArrayExplanation sampleArray=new ArrayExplanation();
           System.out.println("The array" + Arrays.toString(sampleArray.getArray()));
           System.out.println("THe arrays declared or  pre defined" + Arrays.toString(sampleArray.getarrayDeclared()));
           sampleArray.printArray(sampleArray.getarrayDeclared());
           wyclif.getBrain().setpersonBrainType("Neuron Brain");
           System.out.println("Your Brain is "+ wyclif.getBrain().getpersonBrainType());
           
Laptop laptop=new Laptop();
laptop.setlaptopName("Lenovo");
Backpack backpack=new Backpack();
backpack.setLaptop(laptop);
System.out.println( backpack.getLaptop().getlaptopName());


Student student=new Student(1,"Wyclif","Ouma");
Student studentTwo=new Student(2,"Carlito","Maseno");
Course computer_science=new Course(1,"Computer Science");
computer_science.setstudentsEnrolled(student);
computer_science.setstudentsEnrolled(studentTwo);
ArrayList<Student> students=computer_science.getstudentsEnrolled();

        System.out.println("The student details are "+ students.getFirst().getFiullName());
Employee wyclifEmployee=new Employee(1,"Wyclif","Ouma" );
Employee gabriel=new Employee(2,"Gabriel","Otieno");
Employee ochisky=new Employee(3,"Wyclif","Ochisky");
Department ictDepartment=new Department(1,"ICT");
ictDepartment.setemployees(wyclifEmployee);
ictDepartment.setemployees(gabriel);
ictDepartment.setemployees(ochisky);
ArrayList<Employee> employees= ictDepartment.getemployees();
System.out.println("The employees in "+ictDepartment.getDepartmentName()+" at first is "+employees.getFirst().getFullNAme());

    Book book=new Book("Memories We lost","Longhorn Publisher",new Date(), (float) 23.23);
        System.out.println("The book ID is "+ book.getID()+" \n  and the Book type is  "+book.getType()+" \n  and"
                + " the date published is  "+book.getdatePublished()+"\n The book price is "+book.getprice()+" \n The Book title is  "+book.gettitle());
    
    }
}
