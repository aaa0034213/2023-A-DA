package ex0003;

public class MemberService {
	
		
	Member [] members = {
			new Member("anno1","11q2w3e4r","김철수",20),
			new Member("anno2","11q2w124r","김민수",10),
			new Member("anno3","11q1e4r","이영표",20)
			
	};
	
	
	
	
		public boolean login(String userId,String password) {
			for(Member member : members) {
			if(member.userId.equals(userId)&& member.password.equals(password)) {
			return true;
		}
			}
		return false;
		}

	public Member findBy(String userId) {
		
		for(Member member : members) {
			if(member.userId.equals(userId)) {
				return member;
			}
		}
		return null;
		
	}
}
