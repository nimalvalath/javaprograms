class StaticVariableDemo{
	
int rollno;
String name;
static String collegeName="METS";

StaticVariableDemo(){}
StaticVariableDemo(int i, String n){
	rollno=i;
	name=n;
}

//static block
//runs first before main() if present/
static{System.out.println("hello will always get the first chance to run");}
static void changeCollegeName(){
collegeName="CETTKR";
//display();   Error
//cannot reference a non static variable or method
//or class or object 
//inside static method
}
void display(){
	//collegeName="vast";
	System.out.println("id: "+rollno+" name: "+name+" college: "+collegeName);
}

	public static void main(String[] args) {
		StaticVariableDemo s1= new StaticVariableDemo(1,"nimal");
		StaticVariableDemo s2= new StaticVariableDemo(1,"dinoop");
		s1.display();
		s2.display();
		System.out.println(StaticVariableDemo.collegeName);
		changeCollegeName();
		s2.display();
		s1.display();

		System.exit(0);

		///this code below wont execute
		//since we called System.exit(0);
		while(true){

		}
	}
}