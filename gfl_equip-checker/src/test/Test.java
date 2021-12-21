package test;

import com.kyj.gfl.controller.FileChecker;

public class Test {
	public static void main(String[] args) {
		String filePath = "D:\\Kim YJ\\프로그램\\gf_alarm\\Info\\";
		String fileName = "칼로타_881387_equip_info.csv";
		
		FileChecker fc = new FileChecker();
		fc.check(filePath, fileName);
	}
}
