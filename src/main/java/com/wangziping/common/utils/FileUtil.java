package com.wangziping.common.utils;

/**
 * @ClassName: FileUtil
 * @Description: TODO
 * @author: wangziping
 * @date: 2020年3月11日 下午2:35:19
 */
public class FileUtil {

	/*
	 * 方法1：给定一个文件名，返回该文件名的扩展名，例如“aaa.jpg”，返回“.jpg”(10分)
	 */
	public static String getExtendName(String fileName) {
		return fileName.substring(fileName.lastIndexOf("."));
	}
	
}
