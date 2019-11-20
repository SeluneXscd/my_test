package com.selune.test.lambda.test;

import java.io.File;
import java.io.FileFilter;

/**
 * @Author xyp
 * @Time 2019/11/20 11:32
 */

public class HidingFiles {
	
	public static void main(String[] args) {
		File[] files = new File(".").listFiles(new FileFilter() {
			@Override
			public boolean accept(File file) {
				return file.isHidden();
			}
		});
		
		File[] files1 = new File(".").listFiles(File::isHidden);
	}
}
