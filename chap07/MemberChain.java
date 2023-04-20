package chap07;

public class MemberChain {

	String firstName;
	String country;
	int age;
	
	public MemberChain() {
		this("홍길순");
	}
	
	public MemberChain(String mName) {
		this(mName,20);
		
	}
	
	public MemberChain(String mName, int mAge) {
		this(mName, mAge, "대한민국");
	}
	
	public MemberChain(String mName, int mAge, String mCon) {
		firstName = mName;
		country = mCon; 
		age = mAge;
		System.out.println(mName+" "+mCon+" "+mAge);
	}
}
