/**
 * 
 */
package chap1_ArraysStrings;

/**
 * @author Amruta Kajrekar
 *
 */
public class UniqueChars {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] words = {"sample", "duplicated"};
		for (String string : words) {
			System.out.println("word: " + string + " is unique " + checkIfUnique(string));
		}
	}

	public static boolean checkIfUnique(String string) {
		boolean[] chars = new boolean[128];
		for(int i=0; i<string.length(); i++){
			int val = string.charAt(i);
			if(chars[val]) return false;
			else {
				chars[val] = true;
			}
		}
		return true;
	}

}
