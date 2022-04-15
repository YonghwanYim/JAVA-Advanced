package ch08;

public class Person {
	//User Information
	public int userTall;
	public int userHeight;
	public String userGender;
	public String userName;
	public int userAge;
	
	//Order Information
	public int orderNumber;
	public int phoneNumber;
	public String userAddress;
	public int orderDate;
	public int orderTime;
	public int orderPrice;
	public int menuNumber;
	
	
	public Person () {}
		
	public Person(int userTall, int userHeight, String userGender, String userName, int userAge) {
		this.userTall = userTall;
		this.userHeight = userHeight;
		this.userGender = userGender;
		this.userName = userName;
		this.userAge = userAge;
		}
	
	public String showUserInfo() {
		return "키가" + userTall + "이고, 몸무게가" + userHeight + "킬로 인 남성이 있습니다";
	}
	public String userProfile() {
		return "이름은" + userName + "이고 나이는" + userAge + "세 입니다";
	}
	
	
	public String order() {
		return "음식점에 배달 주문이 들어왔습니다." +  "주문 접수 번호";
	}
}
