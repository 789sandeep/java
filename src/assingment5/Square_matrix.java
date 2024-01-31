package assingment5;
import java.util.Scanner;
public class Square_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int mat[][]=new int [3][3];
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}

}
