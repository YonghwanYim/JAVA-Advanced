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
		return "Ű��" + userTall + "�̰�, �����԰�" + userHeight + "ų�� �� ������ �ֽ��ϴ�";
	}
	public String userProfile() {
		return "�̸���" + userName + "�̰� ���̴�" + userAge + "�� �Դϴ�";
	}
	
	
	public String order() {
		return "�������� ��� �ֹ��� ���Խ��ϴ�." +  "�ֹ� ���� ��ȣ";
	}
}
