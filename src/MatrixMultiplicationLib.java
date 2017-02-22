import java.util.Scanner;

public class MatrixMultiplicationLib {
	
	//Takes number of rows and Columns and Returns a Populated Matrix
	
	public static Integer[][] populateMatrix(Integer rows, Integer columns){
		
		Integer [][] matrix = new Integer[rows][columns];
		
		Scanner input = new Scanner(System.in);
		System.out.println(" Please choose %n R: Populate with random integers %n M: Enter values Manually");
		char choice = input.next().charAt(0);
		
		for (int i = 0 ; i < rows ; i++){
			for (int j=0 ; j< columns; j++){
				if (choice=='R' || choice == 'r')
					matrix[i][j]= (int)(Math.random() *10);
				
				else if (choice =='M' ||choice =='m') {
					System.out.print("Enter Element at R"+i+" C"+j+":\n");
					matrix[i][j]= input.nextInt();
				}
			}
		}
		printMatrix(matrix,"A");
		return matrix;
		
	}
	
	
	//Pass the matrix and it's name to print it's elements
	public static void printMatrix(Integer[][] matrix, String name){
		System.out.println("Matrix " + name);
		for (int i = 0 ; i < matrix.length ; i++){
			for (int j=0 ; j< matrix[0].length; j++){
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
		
		
	}
	
	//Iterative Multiplication
	public static Integer[][] iterativeMultiplication(Integer [][] A, Integer [][] B){
		//check if multiplication is possible 
		
		Integer [][] C = new Integer[A[0].length][B.length];
		
		Integer sum=0;
		
		for (int i =0; i<A.length ; i++ ){
			for (int j= 0; j< B[0].length ; j++){
				for (int k= 0; k< B.length ; k++){
					sum = sum + A[i][k]* B[k][j];
				}
				C[i][j] = sum;
				sum = 0;
			}
		}
			
	return C;
	}
	
	
	
	//for testing purposes 
	public static void main(String[] args) {
		Integer [][] A = {{2,3},{4,5}};
		Integer [][] B = {{1,2},{3,4}};	
		Integer [][] C = iterativeMultiplication(A,B);
		printMatrix(C, "r");
	}
}
