package com.kyj.gfl.model;

public class Equipment {
	private String korFanName; // 별명
	private String regName; // 정식 이름
	private String regName_16LAB; // 16LAB 장비 이름
	private int count = 0; // 보유 수량
	private int need = 0; // 필요 수량

	public Equipment(String name1, String name2) {
		this.korFanName = name1;
		this.regName = name2;
	}
	
	public Equipment(String name1, String name2, String name3) {
		this.korFanName = name1;
		this.regName = name2;
	}
	
	public void addCount() {
		count++;
	}
	
	public String getKorFanName() {
		return korFanName;
	}

	public String getRegName() {
		return regName;
	}

	public String getRegName_16LAB() {
		return regName_16LAB;
	}
	
	public int getCount() {
		return count;
	}
	
	public int getNeed() {
		return need;
	}

	public void setNeed(int need) {
		this.need = need;
	}

	public void introduce() {
		System.out.print(korFanName+": "+count+"/"+need+" - ");
		if (count < need) System.out.println(need-count+"개 부족");
		else if (count == need) System.out.println("충분");
		else System.out.println("남음");
	}
}
