package sec01;

public class Member {

	public String id;

	public Member(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			// �Ű����� Ÿ���� ����� ���� ��ȯ
			Member member = (Member) obj;
			if (this.id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}

}
