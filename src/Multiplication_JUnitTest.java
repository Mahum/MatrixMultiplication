import static org.junit.Assert.*;

import org.junit.Test;

public class Multiplication_JUnitTest {
// We developed unit test to check multiplication by both iterative and strssers method
	@Test
	

	public void test() {
		Integer [][] A = {{2,3},{4,5}};
		Integer [][] B = {{1,2},{3,4}};
		Integer [][] Output = new Integer [2][2];
		
		Output = MatrixMultiplicationLib.iterativeMultiplication(A, B);
		Integer [][] Result= {{11,16}, {19,28}};

		assertArrayEquals(Output, Result );

		//Test Passed
	//	fail("Not yet implemented");
	}

}
