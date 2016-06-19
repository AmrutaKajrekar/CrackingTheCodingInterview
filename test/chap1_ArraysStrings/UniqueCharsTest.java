/**
 * 
 */
package chap1_ArraysStrings;

import org.junit.Assert;
import org.junit.Test;

import chap1_ArraysStrings.UniqueChars;

/**
 * @author Amruta Kajrekar
 *
 */
public class UniqueCharsTest {

	@Test
	public void shouldReturnExpectedOutput(){
		boolean[] expectedResult = {false, false, true};
		boolean[] actualResult = new boolean[3];
		String[] input = {"unique", "strings", "true"};
		
		for(int i=0; i<input.length; i++){
			actualResult[i] = UniqueChars.checkIfUnique(input[i]);
		}
		
		Assert.assertArrayEquals(expectedResult, actualResult);
	}
}
