import java.util.*;
class Fibonacci 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER HOW MANY VALUES YOU WANT TO DISPLAY");
		int input=sc.nextInt();
		
		int n1=0,n2=1,result=0;
		for(int i=1; i<=input;i++){
			if(n1==0&&n2==1){
				result=n1+n2;
				n2=n1;
				n1=result;
			}
			else{
				result=n1+n2;
				n2=n1;
				n1=result;
			

			}
			
				
			System.out.print(result+",");
			

		}
	}
}
