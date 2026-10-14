import java.util.*;
public class Main{

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Random random=new Random();
		int n=random.nextInt(6)+1;
		int minimun=(int)Math.pow(10, n-1);
		int maximum=(int)Math.pow(10, n)-1;
		int num=minimun+random.nextInt(maximum-minimun+1);
		//System.out.println(num);
		Check check=new Check();


System.out.println("*******************************************************************");
System.out.println("*****************  Number Gusseing Game  **************************");
System.out.println("*******************************************************************");
System.out.println("* Hint: There is a "+check.digitCount(num)+" digit number || HINT:: between "+check.rangeFindMin(check.digitCount(num))+" to "+check.rangeFindMax(check.digitCount(num)));
System.out.println("* Guess The number...... ");
System.out.print("* ");
int number=sc.nextInt();
while(Check.checkingInput(number, num)==false){
    System.out.print("* ");
	number=sc.nextInt();
		
}
	}
}
