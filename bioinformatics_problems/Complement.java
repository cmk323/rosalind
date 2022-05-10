package bioinformatics_problems;

// generate the reverse complement of a DNA string

public class Complement {
	public static String DNA;
	
	public static String complement(String DNA) {
		// reverse the string
		String reverse = "";
		for (int i = 0; i < DNA.length(); i++) {
			char old_nt = DNA.charAt(i);
			reverse = old_nt + reverse;
		}

		String complement = "";
		for (int i = 0; i < reverse.length(); i++) {
			if (reverse.charAt(i) == 'A') 
				complement = complement + 'T';
			if (reverse.charAt(i) == 'T') 
				complement = complement + 'A';
			if (reverse.charAt(i) == 'C') 
				complement = complement + 'G';
			if (reverse.charAt(i) == 'G') 
				complement = complement + 'C';	
		}
		
		return complement;
	}
	
	public static void main(String[] args) {
		DNA = "AAAACCCGGT";		// add DNA string here
		System.out.println(complement(DNA));
	}
}
