//5. A university application has a parent class Person with a parameterized 
//constructor that accepts name and age. A subclass Student has an additional
//attribute rollNumber. The subclass must initialize the parent attributes using 
//super().
//
//Write a Java program demonstrating constructor execution in inheritance
//using super() and display all student details.

package FirstProgram;
class Person{
	String name;
	int age;
	
	Person(String name,int age){
		this.name = name;
		this.age = age;
		
	}
}

class Student extends Person{
	int rollNum;
	
	Student(String name,int age,int rollNum){
		super(name,age);
		this.rollNum=rollNum;
		}
	
	void display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(rollNum);
	}
	}


public class UniversityApplication {

	public static void main(String[] args) {
		
		Student obj = new Student("afrah",21,101);
		
	}
	}
