class CopyConstructor{
	
	int id;
	String name;

	CopyConstructor(){}
	CopyConstructor(int i,String n){
		id=i;
		name=n;

	}
	CopyConstructor(CopyConstructor s){
		id=s.id;
		name=s.name;
	}

	void display(){
		System.out.println(id +" " + name);
	}
	
	public static void main(String[] args) {
		
		CopyConstructor s1=new CopyConstructor(1,"nimal");
		CopyConstructor s2= new CopyConstructor(s1);
		s2.display();
	}	

}