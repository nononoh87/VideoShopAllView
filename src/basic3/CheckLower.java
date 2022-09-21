package basic3;

public class CheckLower {
	//[1]
	static boolean checkLower(char a){
		if(Character.isUpperCase(a)) return false; //인자가 대문자일 경우 false 반환
		else return true;
		}
	
	//[2]
	static char checkUpper(char a){
		if(Character.isLowerCase(a)){ // 인자가 소문자일 경우 대문자로 변환
		a -= 32;
		}
		return a;
		}
	
	// [3] 메소드
	static void multiple(int a, int b){ //인자가 int, int일 경우
	System.out.println(a*b); //두 수를 곱한 값 출력
	}

	static void multiple(int a, char ch){ //인자가 int, char 일 경우
	for(int i=0;i<a;i++){
	System.out.print(ch+" "); //int 만큼 char 출력
	}
	System.out.println();
	}

	static void multiple(int a, int b, char ch){ //인자가 int, int, char일 경우
	char [][] arr = new char[a][b]; //2차원 배열 생성

	for(int i=0;i<a;i++){
	for(int j=0;j<b;j++){
	arr[i][j] = ch; //각 배열에 char 입력 (이중 for문 이용)
	}
	}

	for(int i=0;i<a;i++){
	for(int j=0;j<b;j++){
	System.out.print(arr[i][j]+" "); //배열 출력 (이중 for문 이용)
	}
	System.out.println();
	}
	}

	public static void main(String[] args) {
		//[1]
		System.out.println("[1]=====");
		boolean method1 = checkLower('a'); //소문자 입력
		boolean method1_2 = checkLower('A'); //대문자 입력
		System.out.println(method1);
		System.out.println(method1_2);

		//[2]
		System.out.println("[2]=====");
		char method2 = checkUpper('b'); //소문자 입력
		char method2_2 = checkUpper('B'); //대문자 입력
		System.out.println(method2);
		System.out.println(method2_2);

		//[3]
		System.out.println("[3]=====");
		multiple(2,3);
		multiple(4,'ㅋ');
		multiple(2,3, 'ㅋ');
		}	

	
	 
}
