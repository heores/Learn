import java.util.Scanner;

/*
 * 
 * ���ַ���д��101��500֮�������
 */
public class Ch1_3_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("��������ֵ�� ");
		int n = input.nextInt();
		switch(n){
		case 1:
			System.out.println("A");
			break;
		case 2:
			System.out.println("B");
			break;
		case 3:
			System.out.println("C");
			break;
		case 4:
			System.out.println("D");
			break;
		case 5:
			System.out.println("E");
			break;
		case 6:
			System.out.println("F");
			break;
		case 7:
			System.out.println("G");
			break;
		case 8:
			System.out.println("H");
			break;
		case 9:
			System.out.println("J");
			break;
		case 10:
		case 11:
		case 12:
		case 13:
			System.out.println("�н�����");
			break;
		default:
			System.out.println("Error");
			break;
		}
	}
}
