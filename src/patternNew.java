import java.util.Scanner;

public class patternNew {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n=sc.nextInt();
		int i;
		int j;
		/*//B
		for(i=0;i<=n-1;i++) {
			for(j=0;j<=n-1;j++) {
				if(i==0&&j!=(n-1)||j==0||i==(n-1)&&j!=(n-1)||j==(n-1)&&i!=0&&i!=(n-1)||i==(n/2)) {
				System.out.print(" * ");		
				}
				else {
					System.out.print("   ");
				}
			}
      System.out.println("");
}
}
}
		*///v
		for(i=0;i<=n-1;i++) {
			for(j=0;j<=n-1;j++) {
				if(j==0&&i<=(n/2)||i+j==(n-1)+(n/2)||i-j==(n/2)||j==(n-1)&&i<=(n/2)) {
				System.out.print(" * ");		
				}
				else {
					System.out.print("   ");
				}
			}
      System.out.println("");
}
}
}