package sec01;

public class Member {

	public String id;

	public Member(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			// 매개변수 타입을 멤버로 강제 변환
			Member member = (Member) obj;
			if (this.id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}

}
