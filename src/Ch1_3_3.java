/*
 * 
 * ���ַ���д��100���ڿ��Ա�9������ǰ�����
 */
public class Ch1_3_3 {
	public static void main(String[] args) {
		int num = 0;
		for (int i = 1; i < 100; i++) {
			if (i % 9 == 0) {
				num = num + 1;
				System.out.println(i);
			}
			if (num == 5)
				break;
		}

	}

}

class T {
	public static void main(String[] args) {
		int i = 1;
		int num = 0;
		while (i < 100) {
			
			if (i % 9 == 0) {
				System.out.println(i);
				num++;
			}
			
			if (num == 5)
				break;
			i++;
		}

	}

}
