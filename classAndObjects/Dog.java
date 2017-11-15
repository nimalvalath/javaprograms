

import java.lang.*;
public class Dog implements Cloneable {
	String name;
	String breed;
	String color;
	int age;

	public Dog(String name,String breed,String color,int age){
		this.name=name;
		this.breed=breed;
		this.color=color;
		this.age=age;
	}
	public String toString(){
		return (""+this.name+" "+this.breed+" "+this.color+" "+this.age);

	}
public static void main(String[] args) throws ClassNotFoundException {
	//using constructor
	Dog tuffy= new Dog("tuffy","papilion","white",5);
	
	System.out.println(tuffy.toString());
	//using clone() from Clonable interface
	try{
	Dog tuttu= (Dog)tuffy.clone();	
	String tutus=	tuttu.toString();
	System.out.println(tutus);
	
	}
	catch(CloneNotSupportedException e){
		e.printStackTrace();
	}
	try{
		Dog papu= (Dog)Class.forName("Dog").newInstance();	
		System.out.println(papu.toString());
	}
	catch(InstantiationException e){
		e.printStackTrace();
	}
	catch(IllegalAccessException e){
		e.printStackTrace();
	}
	//errror runtime
		
}

}