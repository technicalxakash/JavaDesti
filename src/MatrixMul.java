
public class MatrixMul {

	public static void main(String[] args) {
		int a[][]= {
				{1,2,3},
				{4,5,6}
		            };
		int b[][]= {
				{1,2},
				{3,4},
				{5,6}
		};

		int sum=0;
		int res[][]=new int[2][2];
		for(int i=0;i<2;i++) {
			for( int j=0;j<2;j++) {
				for(int k=0;k<3;k++) {
					sum=sum+a[i][k]+b[k][j];
				}
				res[i][j]=sum;
				sum=0;
			}
	
			}
	
	
	 for(int i=0;i<2;i++) {
		 for(int j=0;j<2;j++) {
		
			System.out.print(res[i][j]+"   ");
		 } 
		System.out.println();

	}

}
}
