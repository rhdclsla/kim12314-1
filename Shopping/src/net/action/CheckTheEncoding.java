package net.action;

import java.io.UnsupportedEncodingException;

public class CheckTheEncoding {

	public static void main(String[] age) throws UnsupportedEncodingException {
		
		String word = "인코딩 문제인가? 이클립스 문제인가? WAS문제 인가 그것이 알고 싶다....";
		System.out.println("utf-8 -> euc-kr        : " + new String(word.getBytes("utf-8"), "euc-kr"));
		System.out.println("utf-8 -> ksc5601       : " + new String(word.getBytes("utf-8"), "ksc5601"));
		System.out.println("utf-8 -> x-windows-949 : " + new String(word.getBytes("utf-8"), "x-windows-949"));
		System.out.println("utf-8 -> iso-8859-1    : " + new String(word.getBytes("utf-8"), "iso-8859-1"));
		System.out.println("iso-8859-1 -> euc-kr        : " + new String(word.getBytes("iso-8859-1"), "euc-kr"));
		System.out.println("iso-8859-1 -> ksc5601       : " + new String(word.getBytes("iso-8859-1"), "ksc5601"));
		System.out.println("iso-8859-1 -> x-windows-949 : " + new String(word.getBytes("iso-8859-1"), "x-windows-949"));
		System.out.println("iso-8859-1 -> utf-8         : " + new String(word.getBytes("iso-8859-1"), "utf-8"));
		System.out.println("euc-kr -> utf-8         : " + new String(word.getBytes("euc-kr"), "utf-8"));
		System.out.println("euc-kr -> ksc5601       : " + new String(word.getBytes("euc-kr"), "ksc5601"));
		System.out.println("euc-kr -> x-windows-949 : " + new String(word.getBytes("euc-kr"), "x-windows-949"));
		System.out.println("euc-kr -> iso-8859-1    : " + new String(word.getBytes("euc-kr"), "iso-8859-1"));
		System.out.println("ksc5601 -> euc-kr        : " + new String(word.getBytes("ksc5601"), "euc-kr"));
		System.out.println("ksc5601 -> utf-8         : " + new String(word.getBytes("ksc5601"), "utf-8"));
		System.out.println("ksc5601 -> x-windows-949 : " + new String(word.getBytes("ksc5601"), "x-windows-949"));
		System.out.println("ksc5601 -> iso-8859-1    : " + new String(word.getBytes("ksc5601"), "iso-8859-1"));
		System.out.println("x-windows-949 -> euc-kr     : " + new String(word.getBytes("x-windows-949"), "euc-kr"));
		System.out.println("x-windows-949 -> utf-8      : " + new String(word.getBytes("x-windows-949"), "utf-8"));
		System.out.println("x-windows-949 -> ksc5601    : " + new String(word.getBytes("x-windows-949"), "ksc5601"));
		System.out.println("x-windows-949 -> iso-8859-1 : " + new String(word.getBytes("x-windows-949"), "iso-8859-1"));


	}
}
