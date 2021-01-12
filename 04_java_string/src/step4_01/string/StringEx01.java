package step4_01.string;

import java.util.Scanner;

/*
 * 
 * # 문자열 입력
 * 
 * 	1) next()		: 공백을 기준으로 한 단어만 입력을 받는다.		(띄어쓰기 포함x)
 * 	2) nextLine()	: enter 입력 전까지 전체의 문자열을 입력 받는다.(띄어쓰기 포함o)
 * 
 * 	nextLine()은 버퍼관련 이슈가 생길 수 있으니 버퍼를 정리해 주어야 한다.
 * 
 * */

public class StringEx01 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("# 이름을 입력하세요: ");
		//String name = scan.next(); 	// 띄어쓰기를 제외한 문자열 입력
		String name = scan.nextLine();  // 띄어쓰기를 포함한 문자열 입력
		
		System.out.println("name : " + name);
		
		
		//////////////////////////////////////////////
		
		// 버퍼 관련 이슈
		
		System.out.print("#나이를 입력하세요 : ");
		int age = scan.nextInt();
		System.out.println("age : " + age);
		
		
		scan.nextLine(); // 버퍼에 있는 enter를 제거 (버퍼 비우기)
		
		
		System.out.print("#특이사항을 입력하세요 : ");
		String comment = scan.nextLine();
		
		System.out.println("comment : " + comment);				
		
		
		scan.close();
		
	}

}


