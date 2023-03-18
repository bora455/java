package p25;

public class Member {
	public String name;
	public int age;
	
	public Member(String name, int age) {
	this.name = name;
	this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age==age);
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
	//set : 중복된 개체 들어올 수 없음

}
