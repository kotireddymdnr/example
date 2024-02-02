package exampl;

import java.util.Scanner;

public class summationGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc=new Scanner(System.in);
int sum=0;
Scanner Sc=new Scanner(System.in);
int n=Sc.nextInt();
int i=0;
while(i<n) {
	sum=sum+i;
	System.out.println(sum);
	i=i+1;
	
}
System.out.println(sum);

	}

}
