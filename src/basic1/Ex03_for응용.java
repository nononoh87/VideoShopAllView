package basic1;

public class Ex03_for응용 {

	public static void main(String[] args) {
		//[1]
		for (int i = 0; i < 26; i++) {
			for (char ch = 'A'; ch <= 'Z'; ch++) {
				System.out.print(ch);
			}
			System.out.println();
		}
		//[2]
		for (int i = 0; i < 26; i++) {
			for (char ch = 'A'; ch <= 'A'+i; ch++) {
				System.out.print(ch);
			}
			System.out.println();
		}
		//[3]
		for(int i = 0; i < 26; i++) {
			for(char ch = 'A'; ch <= 'Z'-i; ch++) {
			System.out.print(ch);
			}
			System.out.println();
		}
		//[4]
		for(int i = 0; i < 26; i++) {
			for(char ch = 'Z'; ch >= 'Z'-i; ch--) {
			System.out.print(ch);
			}
			System.out.println();
		}
		//[5]
		for(int i = 0; i < 26; i++) {
			for(int j = 0; j < i; j++) {
			System.out.print(" ");
			}
			for(char ch = (char) ('A'+i); ch <= 'Z'; ch++) {
			System.out.print(ch);
			}
			System.out.println();
			}
		}

}
