import java.util.Scanner;

class DaysInMonth{
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the nth month-->");
	int intMonth=0;
	do{

		 intMonth=sc.nextInt();
		 if(intMonth<=12 && intMonth!=0)
		 	break;
		 else
		 	System.out.println("wrong input");
		 	System.out.println("enter the nth month-->");
		 
	}while(true);
	System.out.println("no of days -->"+daysInMonth(intMonth));

	

	}

	public static int daysInMonth(int number){
		
			if (number==1 || number==3 || number==5 || number==7 || number==8 || number==10 || number==12)
				return 31;
			else if (number==2 || number==4 || number==6 || number==9 || number==11)
				return 30;
			
			
		return 0;
	}
}