package ex0003;

import java.util.Scanner;

public class MemberApp {

	

	public static void main(String[] args) {
		
		MemberService memberSerive = new MemberService();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("로그인 할 사용자를 입력하세요:");
		String uersId=scanner.nextLine().trim();
		
		
		
		while(true) {
			Member member = memberSerive.findBy(userId);
			if(member != null) {
				break;
			}
			
			System.out.println("없는 아이디 입니다. 다시 로그인할 사용자를 입력하세요: ");
			userId = scanner.nextLine().trim();
			}
			
		
			System.out.println("없는 아이디입니다. 다시 로그인할 사용자르 입력하시요:");
			userId=scanner.nextLine().trim();
		
		
			boolean isLoginsuccss= memberSerive.login(userId, password);
			if(isLoginsuccss) {
			
			System.out.println("로그인에 성공했습니다.");
		} else {
			System.out.println("로그인에 실패했습니다.");
			
		}
		
		scanner.close();
		
		
		
	}
	
	

}
