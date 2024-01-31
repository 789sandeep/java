package lab5;

import java.util.Scanner;
  public class Rectangular_matrix {
		private static void rectangulaMatrixD(int[][] mat,int rw,int cl) {
			// TODO Auto-generated method stub
			for(int i=0; i<rw; i++) {
				for(int j=0; j<cl; j++) {
					mat[i][j]+=1;
				}
			}
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row number :");
		int rw=sc.nextInt();
		System.out.println("Enter the column number :");
		int cl=sc.nextInt();
		
		int [][] mat=new int [rw][cl];
		
		for(int i=0; i<rw; i++) {
			for(int j=0; j<cl; j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		
		rectangulaMatrixD(mat,rw,cl);
		
		for(int i=0; i<rw; i++) {
			for(int j=0; j<cl; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}

}

}
