package Prac;

public class Ifelse {

	public static void main(String[] args) {
		int age = 12;
		int charge;
		
		if(age < 9) {
			charge = 1500;
			System.out.println("�ʵ��л��Դϴ�");
		}
		else if(age < 14) {
			charge = 2000;
			System.out.println("���л��Դϴ�");
		}
		else if (age < 19) {
			charge = 2500;
			System.out.println("����л��Դϴ�");
		}
		else {
			charge = 3000;
			System.out.println("�����Դϴ�");
		}
		
		System.out.println("�����" + charge + "�� �Դϴ�");
	}

}
