public class wine {

	/**
	 * @param args
	 */
	public static int all = 50;
	public static int leftBottle;
	public static int leftTop;

	public static void main(String[] args) {
		all = all + drink(50, 50);
		System.out.println("总共能喝" + all);
		System.out.println("剩下酒瓶个数" + leftBottle);
		System.out.println("剩下盖子个数" + leftTop);
	}

	public static int drink(int bottle, int top) {
		if (bottle >= 2 || top >= 4) {
			leftBottle = (bottle / 2) + (bottle % 2) + (top / 4);
			leftTop = (top / 4) + (top % 4) + (bottle / 2);

			return (bottle / 2) + (top / 4) + drink(leftBottle, leftTop);
		}
		return 0;
	}
}

class Test{
	public static void main(String[] args){
	System.out.println("hello world!");
}
}