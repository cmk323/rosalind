package bioinformatics_problems;


// counting DNA nucleotides

public class CountNucleotides {
	public static String sequence;
	public static char nucleotide;
	
	public static int count(String sequence, char nucleotide) {
		
		int count = 0;
		for (int i = 0; i < sequence.length(); i++) {
			if (sequence.charAt(i) == nucleotide) {
				count++;
			}
		}
		
		return count;
	}

	
	public static void main(String[] args) {
		// add DNA string here
		sequence = "AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC";
		
		nucleotide = 'A';
		int countA = count(sequence, nucleotide);
		nucleotide = 'T';
		int countT = count(sequence, nucleotide);
		nucleotide = 'C';
		int countC = count(sequence, nucleotide);
		nucleotide = 'G';
		int countG = count(sequence, nucleotide);
		
		System.out.println(countA + " " + countC + " " + countG + " " + countT);
	}
}
