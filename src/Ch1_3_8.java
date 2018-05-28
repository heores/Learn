/*
 * 类和构造函数
 * 
 * 
 */
public class Ch1_3_8 {

	int age = 20;
	int id = 1;

	public Ch1_3_8(int j, int k) {
		age = j;
		id = k;
	}

	public static void main(String[] aras) {
		Ch1_3_8 one = new Ch1_3_8(23, 15);
		System.out.println("Hello World!");
		System.out.println("one的年龄是" + one.age + "  id是" + one.id);
	}
}

