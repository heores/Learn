/*
 * 不带包的java文件编译命令
 * javac Helloworld.java
 * java Helloworld
 * 
 * 带包com.java的java文件编译命令
 * javac -d . Helloworld.java
 * java com.java.Helloworld
 * 
 * 这个是为了和com.helloworld包里的Helloworld做区分.
*/
public class Ch1_1_4 {

	public static void main(String[] args) {
		System.out.println("我是一个没有包的Hello World!");
	}
}

