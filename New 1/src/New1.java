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
sum(a,b);
System.out.println("enter the firs number");
double c = input.nextDouble();
System.out.println("enter the socend number");
double d = input.nextDouble();
System.out.println("enter the third number");
double q = input.nextDouble();
sum2(a,b,d);
System.out.println("enter the firs number");
int f = input.nextInt();
System.out.println("enter the socend number");
double h = input.nextDouble();
sum3(a,b);
System.out.println("enter the firs number");
double g = input.nextDouble();
System.out.println("enter the socend number");
int k = input.nextInt();
sum4(a,b);
	}
public static int sum(int a,int b){
	int sum=(a*b);
	System.out.println("the factorial equals ;"+sum);
	return sum;
}	
	public static double sum2(double a,double b,double d){
		double sum2=(a-b-d);
		System.out.println("the substrahend equal ;"+sum2);
		return sum2;
	
}
	public static void sum3(int a,double b){
		double sum3=(a+b);
		System.out.println("the sum equal ;"+sum3);
		
}
	public static void sum4(double a,int b){
		double sum4=(a/b);
		System.out.println("the divisor equal ;"+sum4);	
}
}