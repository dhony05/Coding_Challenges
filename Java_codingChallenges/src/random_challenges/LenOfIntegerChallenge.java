package random_challenges;

public class LenOfIntegerChallenge {

	public static void main(String[] args) {
		
		getIntLenth(500);
		getIntLenth(5003);
		getIntLenth(500222);
		getIntLenth(5002222);
		getIntLenth(500223333);
		getIntLenth(5004444);

	}

	private static int getIntLenth(int i) {
		int count = 0;
		while( i> 0) {
			 i = i/10;
			 count ++;
		}
		System.out.println(count);
		return count;
		
	}

}
