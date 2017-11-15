import java.util.Scanner;
class EvenNumber{


	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter from range-->");
	int from=sc.nextInt();	
	System.out.println("enter to range-->");
	int to=sc.nextInt();
	isEven(to,from);

	
	}
	public static void isEven(int to , int from){
		if(from<to){
		for(;from<=to;from++){
			if(from%2==0){
				System.out.println("even number-->"+from);
			}
		}
	}
	else{
		for(;from>=to;from--){
			if(from%2==0){
				System.out.println("even number-->"+from);
			}
		}
	}
	}

}