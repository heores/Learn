/*
 * Copyright (c) 1997, 2002, Li Guo xin. All rights reserved.
 * 标准的注释是这样的，最上边用这个说明的注释，在package之前.
 * package之后的注释javadoc可以读取位html的用户说明文档.
 * 
 * 不带包的java文件编译命令
 * javac Helloworld.java
 * java Helloworld
 * 
 * 带包com.java的java文件编译命令
 * javac -d . Helloworld.java
 * java com.java.Helloworld
 * 
 * 
*/
package com.helloworld;
/**
* An Annotation object is used as a wrapper for a text attribute value if
* the attribute has annotation characteristics. These characteristics are:
* @see AttributedCharacterIterator
* @since 1.2
*/
public class Helloworld {
	

	public static void main(String[] args) {
		System.out.println("我是一个有包的Hello World!");
	}
}