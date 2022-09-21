package basic3;

public class Ex10_메소드 {
	//[1]
	/*(문제 1) 영문자를 입력하여 이 문자를 넘겨받아 이 문자가 소문자이면 true을 반환 그렇지 않으면 false을 반환하는 메소드를 작성하시오. 
		함수명 : checkLower
		인자 : char
		리턴(반환) : boolean
	*/
	static boolean checkLower(char a){
		if(Character.isUpperCase(a)) return false; //인자가 대문자일 경우 false 반환
		else return true;
		}
	/*(문제 2) 영문자를 입력하여 이 문자를 넘겨받아 이 문자가 소문자이면 대문자로 변환하여 반환하고 대문자라면 그대로 반환하는 메소드를 작성하시오. 
		함수명 : checkUpper
		인자 : char
		리턴(반환) : char
    */
	//[2]
	static char checkUpper(char a){
		if(Character.isLowerCase(a)){ // 인자가 소문자일 경우 대문자로 변환
		a -= 32;
		}
		return a;
		}
	/*(문제 3) multiple 메소드 만들기
	   - 2개의 int 인자인 경우는 곱셈계산 한 결과를 출력
	   - 1개의 int 인자와 1개의 char 인자인 경우는 int 인자 수 만큼 char 인자 문자를 출력
	   - 2개의 int 인자와 1개의 char 인자인 경우는 char 인자 문자를 n * m 형식의 행과 열로 출력 
	*/
	 
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
		
		/*[예시]
		- multiple (2, 3) 호출         	[출력결과] 6      
		- multiple (4, 'ㅋ') 호출       [출력결과]	ㅋㅋㅋㅋ
		- multiple (2, 3 , 'ㅋ') 호출   [출력결과]	ㅋㅋㅋ
				                               	ㅋㅋㅋ
		*/
		//[3]
		System.out.println("[3]=====");
		multiple(2,3);
		multiple(4,'ㅋ');
		multiple(2,3, 'ㅋ');
		}	

	
	 
}
