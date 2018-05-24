/**
 * 打印Hello World!
 * 注释的多种方式
 * 这是多行注释
 */

/*
 这是另一种多行注释
 这是一个例子
 */

// 这是单行注释

public class Ch1_1_0 {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		int i = 8;
		double j = 9;
		//print的输出结果不会换行
		System.out.print("用print输出i的值为：" + i+"  ");
		//println的输出结果自动换行
		System.out.println("用println输出i的值为:" + i);
		//printf按照格式输出
		//printf()函数的调用格式为: printf("<格式化字符串>", <参量表>)。
		System.out.printf("i的值为%d,j的值为%f", i, j);
	}
}