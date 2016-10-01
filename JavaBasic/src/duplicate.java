public class duplicate {
	static int scoreOfAlphabets(String word) {
		int score = 0;
		byte temp[] = new byte[26];
		for (int i = 0; i < word.length(); i++) {
			if (temp[(word.charAt(i) - 97)] != -1) {
				temp[word.charAt(i)-97] = -1;
				switch (word.charAt(i)) {
				case 'a':
					score++;
					break;
				case 'u':
					score++;
					break;
				case 'o':
					score++;
					break;
				case 'i':
					score++;
					break;
				case 'e':
					score++;
					break;
				default:
					score += 2;
					break;
				}
			}
		}
		return score;
	}
	public static void main(String[] args) {
		System.out.println(scoreOfAlphabets("aaaaabcd"));	
	}
}
