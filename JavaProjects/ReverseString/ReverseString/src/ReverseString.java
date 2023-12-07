public class ReverseString
{
	
	public static void main (String[]args) {
		
		
		String str = "HelloNathan";
		String result = "";
		
		for(int i = str.length()-1; i>=0; i--)
			
			result += str.charAt(i);
		
		
		System.out.println(result);
		
		
		
	}
	
	
	
	
}



// Here's a breakdown of how it works:

// Initialization:

// String str = "HelloNathan";: Initializes a string variable str with the value "HelloNathan".
// String result = "";: Initializes an empty string result where the reversed string will be stored.
// Reversing the String:

// for(int i = str.length()-1; i>=0; i--): Initiates a for loop starting from the last character of the original string str and moving backwards.
// result += str.charAt(i);: Inside the loop, it accesses each character of the original string str starting from the end (str.charAt(i)) and appends it to the result string. This effectively constructs the reversed string by adding characters in reverse order.
// Printing the Reversed String:

// System.out.println(result);: Finally, it prints the reversed string (result) to the console.
// In summary, the code reverses the string "HelloNathan" by iterating through the characters of the original string in reverse order and constructing a new string (result) with those characters.

// Please note that while this code works fine for small strings, concatenating strings using the += operator in a loop can be inefficient for large strings due to the immutable nature of strings in Java, as it creates new strings in memory for each concatenation. For larger operations, using a StringBuilder for string manipulation is generally more efficient.

