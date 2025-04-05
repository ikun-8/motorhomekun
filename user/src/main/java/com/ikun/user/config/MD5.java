package com.ikun.user.config;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {
	public static void main(String[] args) {
		String str=MD5Code("abcd");
		System.out.println("加密后:"+str);
		//性能最优  支持3位以下  字母数字下划线密码解密
		MD5.back(str);
		System.out.println("解密后:"+result);
	}
	public static String MD5Code(String content) {
		char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
		try {
			byte[] byteArray = content.getBytes("UTF-8");
			MessageDigest messageDigest = MessageDigest.getInstance("MD5");
			messageDigest.update(byteArray);
			byte[] digest = messageDigest.digest();
			int length = digest.length;
			char str[] = new char[length * 2];
			int k = 0;
			for (int i = 0; i < length; i++) {
				byte mData = digest[i];
				str[k++] = hexDigits[mData >>> 4 & 0xf];
				str[k++] = hexDigits[mData & 0xf];
			}
			return new String(str);
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException("不支持hash算法：MD5",e);
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException("不支持UTF-8编码",e);
		}
	}


	private static final char code[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g',
			'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
			'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G',
			'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
			'U', 'V', 'W', 'X', 'Y', 'Z', '_','0', '1', '2', '3', '4', '5',
			'6', '7', '8', '9' };
	public static String result;
	public static void back(String md5){
		StringBuilder testPW;
		for(int a=0;a<code.length;a++){
			testPW=new StringBuilder();
			testPW.append(code[a]);
			if(getResult(testPW.toString(),md5)) return;
			for(int b=0;b<code.length;b++){
				testPW=new StringBuilder(testPW.substring(0,1));
				testPW.append(code[b]);
				if(getResult(testPW.toString(),md5)) return;
				for(int c=0;c<code.length;c++){
					testPW=new StringBuilder(testPW.substring(0,2));
					testPW.append(code[c]);
					if(getResult(testPW.toString(),md5)) return;
//					for(int d=0;d<code.length;d++){
//						testPW=new StringBuilder(testPW.substring(0,3));
//						testPW.append(code[d]);
//						if(getResult(testPW.toString(),md5)) return;
//					}
				}
			}
		}
	}
	public static boolean getResult(String testPW,String md5){
		if(md5.equalsIgnoreCase(MD5.MD5Code(testPW))){
			result=testPW;
			return true;
		}
		return false;
	}
}
