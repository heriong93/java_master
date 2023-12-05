package chap13;

import lombok.Data;

@Data
public class Member {
	private String membeNum;
	private String memberName;
	private String point;

	public Member(String memberNum, String memberName, String point) {
		this.membeNum = memberNum;
		this.memberName = memberName;
		this.point = point;
	}

	// hashCode, equals 정의하는지에 따라서 동일객체

	public String getMembeNum() {
		return membeNum;
	}

	public String getMemberName() {
		return memberName;
	}

	public String getPoint() {
		return point;
	}

	public void setMembeNum(String membeNum) {
		this.membeNum = membeNum;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public void setPoint(String point) {
		this.point = point;
	}

}
