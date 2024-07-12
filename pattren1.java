package allpattern;

import java.util.Scanner;

class Patterns{
	int i,n,j,k,s;
	public
	void fun1() {
		System.out.println("Who many Lines of Pattern :: ");
		Scanner o=new Scanner(System.in);
		n=o.nextInt();
		for(i=0;i<n;i++) {
			
			for(j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	void fun2() {
		System.out.println("Who many Lines of Pattern :: ");
		Scanner o=new Scanner(System.in);
		n=o.nextInt();
		for(i=0;i<n;i++) {
			for(k=i;k<n;k++) {
				System.out.print(" ");
			}
			for(j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	void fun3() {
		System.out.println("Who many Lines of Pattern :: ");
		Scanner o=new Scanner(System.in);
		n=o.nextInt();
		for(i=0;i<=n;i++) {
			for(k=i;k<n;k++) {
				System.out.print(" ");
			}
			for(j=1;j<=i*2-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	void fun4() {
		System.out.println("Who many Lines of Pattern :: ");
		Scanner o=new Scanner(System.in);
		n=o.nextInt();
		for(i=0;i<n;i++) {
			
			for(j=n;j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	void fun5() {
		System.out.println("Who many Lines of Pattern :: ");
		Scanner o=new Scanner(System.in);
		n=o.nextInt();
		for(i=0;i<n;i++) {
			for(k=0;k<i;k++) {
				System.out.print(" ");
			}
			for(j=n;j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	void fun6() {
		System.out.println("Who many Lines of Pattern :: ");
		Scanner o=new Scanner(System.in);
		n=o.nextInt();
		for(i=0;i<=n;i++) {
			for(k=0;k<i;k++) {
				System.out.print(" ");
			}
			
				if(i!=0) {
					for(j=n*2-1;j>=i*2-1;j--) {
				System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	void fun7() {
		System.out.println("Enter the n Number of Pattern Matrix");
		Scanner o=new Scanner(System.in);
		n=o.nextInt();
		System.out.println("Printed the Your pattern Matrix :: ");
		int t=n;
		for(i=1;i<=n*2-1;i++){
			for(j=1;j<=n*2-1;j++){
				if(i==1 || i==n*2-1 || j==1 || j==n*2-1)
			System.out.print(t);
				else if(i==2 || i==n*2-2 ||j==2||j==n*2-2){
					System.out.print(t-1);
				}
				else if(i==3 || i==n*2-3 ||j==3 || j==n*2-3){
					System.out.print(t-2);
				}
				else if (i==4 || i== n*2-4 || j==4 || j==n*2-4){
					System.out.print(t-3);
				}
			
				else{
					System.out.print(t-4);
				}
			}
			System.out.println();
		}
		
	}
	
	void fun8() {
		System.out.println("Enter the n Number of Pattern ");
		Scanner o=new Scanner(System.in);
		n=o.nextInt();
		System.out.println("Printed the Your pattern  :: ");
		int t=0;
		int te=0;
		for(i=0;i<n;i++) {
			int tem=1;
			for(int a=1;a<=n-i;a++) {
				System.out.print(tem);
				tem++;
			}
			for(int b=0;b<i*2-1;b++) {
				System.out.print("_");
			}
			for(int c=n-i;c>0;c--) {
				System.out.print(c);
			}
			System.out.println();
		}
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(j);
			}
			for( k=n*2-3;k>t;k--) {
				System.out.print("_");
				
			}
			for(int x=i;x>=1;x--) {
				System.out.print(x);
			}
			te++;
			t=t+2;
			System.out.println();
		}
	}
}
public class pattren1 {
	public static void main(String args[]) throws Exception {
		Patterns obj=new Patterns();
//		obj.fun6();
//		obj.fun7();
		obj.fun8();
		
	}
}
