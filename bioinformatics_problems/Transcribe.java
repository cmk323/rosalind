package bioinformatics_problems;

// transcribing DNA into RNA

public class Transcribe {
	public static String DNA;			// DNA sequence (coding strand)
	
	public static String transcribe(String DNA) {
		String RNA = DNA.replace('T', 'U');
		
		return RNA;
	}
	
	public static void main(String[] args) {
		DNA = "GATGGAACTTGACTACGTAAATT";		// add DNA string here
		System.out.println(transcribe(DNA));
	}
}
