package tests;

public class Demo {

	public static void main(String[] args)
	{
		int[] a[],b = {20};
		
		a = new int[3][3];
		//b = new int[3];
		b=new int[3];

		// print 1D array
		for (int i = 0; i < 3; i++){
			b[0]=38;
			System.out.println(b[i]);
		}

		// print 2D array
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = 100;
				System.out.print(a[i][j]+" ");
			}
			System.out.println(" ");
		}
	}

	
}
