package frontWeb.project_opgg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InsertDB {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> cham = new ArrayList<String>();
		cham.add("가렌"); cham.add("애니"); cham.add("탈론");
		cham.add("밀리오"); cham.add("카이사"); cham.add("제드");
		cham.add("이즈리얼"); cham.add("워윅"); cham.add("세트");
		cham.add("카직스"); cham.add("소나"); cham.add("소라카");
		cham.add("코그모"); cham.add("오공"); cham.add("사이온");
		List<String> user = new ArrayList<String>();
		user.add("다솜"); user.add("준규"); user.add("현우");
		user.add("석민"); user.add("지우"); user.add("준혁");
		user.add("상우"); user.add("영재"); user.add("학수");
		user.add("동현"); user.add("경웅"); user.add("윤아");
		user.add("은서"); user.add("혜원"); user.add("선영");
		List<String> isWin = new ArrayList<String>();
		isWin.add("Win");  isWin.add("Lose");
		
		String []position = {"TOP","JUG","MID","BOT","SUP","TOP","JUG","MID","BOT","SUP"};
		String []gameMode = {"솔로랭크","자유랭크","일반게임","칼바람"};

		String team = "";
		String teamIsWin = "";
		String chamId = "";
		String userId = "";
		int gHisNum = 1;
		int gIdNum = 0;
		String sTime = "";
		String eTime = "";
		while(true) {
			Collections.shuffle(cham);
			Collections.shuffle(user);
			Collections.shuffle(isWin);
			
			gIdNum++;

			sTime = "sysdate"+"+"+gIdNum+"/24";
			eTime = "sysdate"+"+"+(gIdNum+1)+"/24";
			
			int gId = (int)(Math.random()*4);
			String gameId = gameMode[gId]+"-"+gIdNum;
			
			int i = 0;
			while(true) {
				team = "BLUE";
				teamIsWin = isWin.get(0);
				for(i=0; i<=4; i++) {
					int kill = (int)(Math.random()*20);
					int death = (int)(Math.random()*20);
					int assist = (int)(Math.random()*20);
					System.out.println("INTO GAME_HISTORY VALUES ("+gHisNum+",\'"+gameId+"\',\'"+team+"\',\'"+user.get(i)+
							"\',\'"+cham.get(i)+"\',\'"+position[i]+"\',"+kill+","+death+","+assist+",\'"+teamIsWin+
							"\',"+sTime+","+eTime+")");
					
					gHisNum++;
				}
				break;
			}
			while(true) {
				team = "RED";
				teamIsWin = isWin.get(1);
				for(i=5; i<=9; i++) {
					int kill = (int)(Math.random()*20);
					int death = (int)(Math.random()*20);
					int assist = (int)(Math.random()*20);
					System.out.println("INTO GAME_HISTORY VALUES ("+gHisNum+",\'"+gameId+"\',\'"+team+"\',\'"+user.get(i)+
							"\',\'"+cham.get(i)+"\',\'"+position[i]+"\',"+kill+","+death+","+assist+",\'"+teamIsWin+
							"\',"+sTime+","+eTime+")");
					gHisNum++;
				}
				break;
			}
			if(gIdNum==5) {
				break;
			}
		}
	}
}
