package jibitesh;

public class Q4 {
	public static void main(String args[]) {
		char marks[] = {'C', 'A', 'R'};
		for(int i = 0; i<=2; i++) {
			for ( int j = 0; j<=2; j++) {
				for(int k = 0; k<=2; k++) {
					if(i!=j && j!=k && k!=i) {
						System.out.println(marks[i] +""+ marks[j] + marks[k]);
					}
				}
			}
		}
	}
	

}
