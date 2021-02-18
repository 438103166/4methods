//this is project to write 4  over loading methods .
// it has various mathematical operations 
import java.util.*;
public class New1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("enter the firs number");
int a = input.nextInt();
System.out.println("enter the socend number");
int b = input.nextInt();
math(a,b);
System.out.println("enter the firs number");
double c = input.nextDouble();
System.out.println("enter the socend number");
double d = input.nextDouble();
System.out.println("enter the third number");
double q = input.nextDouble();
math(a,b,c);
System.out.println("enter the firs number");
int f = input.nextInt();
System.out.println("enter the socend number");
double h = input.nextDouble();
math(a,b);
System.out.println("enter the firs number");
double g = input.nextDouble();
System.out.println("enter the socend number");
int k = input.nextInt();
math (a,b);
	}
public static int math(int a,int b){
	int math=(a*b);
	System.out.println("the factorial equals ;"+math);
	return math;
}	
	public static double math(double a,double b,double c){
		double math=(a-b-c);
		System.out.println("the substrahend equal ;"+ math);
		return math;
	
}
	public static void math(int a,double b){
		double math=(a+b);
		System.out.println("the sum equal ;"+ math);
		
}
	public static void  math(double a,int b){
		double  math=(a/b);
		System.out.println("the divisor equal ;"+ math);	
}
}