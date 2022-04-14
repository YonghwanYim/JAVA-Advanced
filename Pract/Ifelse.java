package Prac;

public class Ifelse {

	public static void main(String[] args) {
		int age = 12;
		int charge;
		
		if(age < 9) {
			charge = 1500;
			System.out.println("초등학생입니다");
		}
		else if(age < 14) {
			charge = 2000;
			System.out.println("중학생입니다");
		}
		else if (age < 19) {
			charge = 2500;
			System.out.println("고등학생입니다");
		}
		else {
			charge = 3000;
			System.out.println("성인입니다");
		}
		
		System.out.println("요금은" + charge + "원 입니다");
	}

}
