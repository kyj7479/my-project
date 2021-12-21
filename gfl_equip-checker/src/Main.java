import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		String fileLocation = "D:\\Kim YJ\\프로그램\\gf_alarm\\Info\\";
		String fileName = "칼로타_881387_equip_info.csv";
		
		BufferedReader br = null;
		
//		[00] 옵티컬	VFL 6-24X56			16Lab6-24X56	
//		[01] 이오텍	EOT 518		
//		[02] 레드닷	ITI MARS			16LabMARS
//		[03] 조준기	RMR T4 레드닷	
//		[04] 야시경	PEQ-16A				16Lab 적외선지시기	
//		[05] 소음기	AC4소음기		
//		[06] 철갑탄	Mk211고폭철갑탄		16Lab 차구경철갑탄	
//		[07] 저격탄	M1022 저격탄
//		[08] 특철탄 Mk1000SLAP
//		[09] 고속탄	APCR고속탄			16Lab 고속탄	
//		[10] 할포탄	ILM HP탄			16Lab HP탄	
//		[11] 신호탄 신호탄
//		[12] 벅 샷	#000벅 샷			16Lab벅 샷	
//		[13] 버드샷	#7.5 버드샷
//		[14] 섬광탄 산탄총 섬광탄
//		[15] 슬러그	SABOT 슬러그탄		
//		[16] 칩  셋	#2 연산칩
//		[17] 갓골격	IOP T4 외골격		16LabT4 외골격	
//		[18] 똥골격	IOP X4외골격		
//		[19] 방탄판	Type3 방탄판		16Lab 방탄판	
//		[20] 탄약통	IOP대용량 탄약통		
//		[21] 슈트	열광학 미채 슈트	16lab 열광학 슈트	
		
		ArrayList<Equipment> EquipColl = new ArrayList<Equipment>();
		EquipColl.add(new Equipment("옵티컬", "VFL 6-24X56", "16Lab6-24X56"));
		EquipColl.add(new Equipment("이오텍", "EOT 518"));
		EquipColl.add(new Equipment("레드닷", "ITI MARS", "16LabMARS"));
		EquipColl.add(new Equipment("조준기", "RMR T4 레드닷"));
		EquipColl.add(new Equipment("야시경", "PEQ-16A", "16Lab 적외선지시기"));
		EquipColl.add(new Equipment("소음기", "AC4소음기"));
		EquipColl.add(new Equipment("철갑탄", "Mk211고폭철갑탄", "16Lab 차구경철갑탄"));
		EquipColl.add(new Equipment("저격탄", "M1022 저격탄"));
		EquipColl.add(new Equipment("특철탄", "Mk1000SLAP"));
		EquipColl.add(new Equipment("고속탄", "APCR고속탄", "16Lab 고속탄"));
		EquipColl.add(new Equipment("할포탄", "ILM HP탄", "16Lab HP탄"));
		EquipColl.add(new Equipment("신호탄", "신호탄"));
		EquipColl.add(new Equipment("벅  샷", "#000벅 샷", "16Lab벅 샷"));
		EquipColl.add(new Equipment("버드샷", "#7.5 버드샷"));
		EquipColl.add(new Equipment("섬광탄", "산탄총 섬광탄"));
		EquipColl.add(new Equipment("슬러그", "SABOT 슬러그탄"));
		EquipColl.add(new Equipment("칩  셋", "#2 연산칩"));
		EquipColl.add(new Equipment("갓골격", "IOP T4 외골격", "16LabT4 외골격"));
		EquipColl.add(new Equipment("똥골격", "IOP X4외골격"));
		EquipColl.add(new Equipment("방탄판", "Type3 방탄판", "16Lab 방탄판"));
		EquipColl.add(new Equipment("탄약통", "IOP대용량 탄약통"));
		EquipColl.add(new Equipment("슈  트", "열광학 미채 슈트", "16lab 열광학 슈트"));
		
		 EquipColl.get(0).setNeed(42);  // 옵티컬: 42개
		 EquipColl.get(1).setNeed(24);  // 이오텍: 24개
		 EquipColl.get(2).setNeed(24);  // 레드닷: 24개 - 국지전 대비용
		 EquipColl.get(3).setNeed(24);  // 조준기: 24개 - 국지전 대비용
		 EquipColl.get(4).setNeed(36);  // 야시경: 36개 - 14제대 AR 2.5명 풀착용
		 EquipColl.get(5).setNeed(36);  // 소음기: 36개 - 14제대 탱커 2.5명 풀착용
		 EquipColl.get(6).setNeed(36);  // 철갑탄: 36개 - 14제대 RF+MG 2.5명 풀착용
		 EquipColl.get(7).setNeed(12);  // 저격탄: 12개
		 EquipColl.get(8).setNeed(24);  // 특철탄: 12개 - 국지전 대비용
		 EquipColl.get(9).setNeed(36);  // 고속탄: 36개 - 14제대 AR 2.5명 풀착용 
		 EquipColl.get(10).setNeed(36); // 할포탄: 36개 - 이미 36개를 얻어놔서 그냥
		 EquipColl.get(11).setNeed(36); // 신호탄: 36개 - 14제대 탱커 2.5명 풀착용
		 EquipColl.get(12).setNeed(18); // 벅  샷: 18개
		 EquipColl.get(13).setNeed(6);  // 버드샷:  6개 - 우사스, 혹시 모르니 1줄만
		 EquipColl.get(14).setNeed(12); // 섬광탄: 12개
		 EquipColl.get(15).setNeed(24); // 슬러그: 24개 - 이미 24개를 얻어놔서 그냥
		 EquipColl.get(16).setNeed(36); // 칩  셋: 36개 - 14제대 AR 2.5명 풀착용
		EquipColl.get(17).setNeed(36);  // 갓골격: 36개 - 14제대 탱커 2.5명 풀착용
		EquipColl.get(18).setNeed(24);  // 똥골격: 24개
		EquipColl.get(19).setNeed(24);  // 방탄판: 24개 - 국지전 대비용
		EquipColl.get(20).setNeed(24);  // 탄약통: 24개
		EquipColl.get(21).setNeed(30);  // 슈  트: 30개

		try {
			br = Files.newBufferedReader(Paths.get(fileLocation+fileName), Charset.forName("EUC-KR"));
			String line = "";
        	br.readLine();
            while((line = br.readLine()) != null){
            	String[] arr = line.split(",");
            	if(arr[3].equals("★★★★★")) {
            		switch(arr[4]) {
            			case "VFL 6-24X56": EquipColl.get(0).addCount(); break;
            			case "16Lab6-24X56": EquipColl.get(0).addCount(); break;
            			case "EOT 518": EquipColl.get(1).addCount(); break;
            			case "ITI MARS": EquipColl.get(2).addCount(); break;
            			case "16LabMARS": EquipColl.get(2).addCount(); break;
            			case "RMR T4 레드닷": EquipColl.get(3).addCount(); break;
            			case "PEQ-16A": EquipColl.get(4).addCount(); break;
            			case "16Lab 적외선지시기": EquipColl.get(4).addCount(); break;
            			case "AC4소음기": EquipColl.get(5).addCount(); break;
            			case "Mk211고폭철갑탄": EquipColl.get(6).addCount(); break;
            			case "16Lab 차구경철갑탄": EquipColl.get(6).addCount(); break;
            			case "M1022 저격탄": EquipColl.get(7).addCount(); break;
            			case "Mk1000SLAP": EquipColl.get(8).addCount(); break;
            			case "APCR고속탄": EquipColl.get(9).addCount(); break;
            			case "16Lab 고속탄": EquipColl.get(9).addCount(); break;
            			case "ILM HP탄": EquipColl.get(10).addCount(); break;
            			case "16Lab HP탄": EquipColl.get(10).addCount(); break;
            			case "신호탄": EquipColl.get(11).addCount(); break;
            			case "#000벅 샷": EquipColl.get(12).addCount(); break;
            			case "16Lab벅 샷": EquipColl.get(12).addCount(); break;
            			case "#7.5 버드샷": EquipColl.get(13).addCount(); break;
            			case "산탄총 섬광탄": EquipColl.get(14).addCount(); break;
            			case "SABOT 슬러그탄": EquipColl.get(15).addCount(); break;
            			case "#2 연산칩": EquipColl.get(16).addCount(); break;
            			case "IOP T4 외골격": EquipColl.get(17).addCount(); break;
            			case "16LabT4 외골격": EquipColl.get(17).addCount(); break;
            			case "IOP X4외골격": EquipColl.get(18).addCount(); break;
            			case "Type3 방탄판": EquipColl.get(19).addCount(); break;
            			case "16Lab 방탄판": EquipColl.get(19).addCount(); break;
            			case "IOP대용량 탄약통": EquipColl.get(20).addCount(); break;
            			case "열광학 미채 슈트": EquipColl.get(21).addCount(); break;
            			case "16lab 열광학 슈트": EquipColl.get(21).addCount(); break;
            		}
            	}
            	else continue;
            }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for(Equipment e : EquipColl) {
			e.introduce();
		}
	}
}