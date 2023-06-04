package project.opgg;

import java.util.List;
import java.util.Scanner;

import project.opgg.VO.GameHistory;

public class GameHistoryMethod {
	Scanner sc = new Scanner(System.in);
	
	// 메소드 - @전@승@패
	public void getWinLost() {
		ghDao gh = new ghDao();
		String inputUser = sc.next();
		
		int gameCnt = gh.getUserGameHistory(inputUser).size();
		int win = 0;
		int lost = 0;
		
		for(int i =0; i< gh.getUserGameHistory(inputUser).size(); i++) {
			if(gh.getUserGameHistory(inputUser).get(i).getIsWin().equals("Win")) {
				win++;
			}
			if(gh.getUserGameHistory(inputUser).get(i).getIsWin().equals("Lose")) {
				lost++;
			}
		}
		
		System.out.println(inputUser +"의 총 게임 결과 : " + gameCnt + "전 " + win + "승 " + lost + "패");
		
	}
	
	public void getUserKA() {
		ghDao gh = new ghDao();
		
		String inputUser = sc.next();
		double kill = 0;
		double assi = 0;
		
		for(int i =0; i< gh.getUserGameHistory(inputUser).size(); i++) {
			kill =  gh.getUserGameHistory(inputUser).get(1).getKill();
			assi =  gh.getUserGameHistory(inputUser).get(1).getAssist();
		}
		
		List<GameHistory> teamAll = gh.getTeamGameHistory(gh.getUserGameHistory(inputUser).get(0).getGameCode());
		
		String teamColor1 = teamAll.get(0).getTeamColor();
		String teamColor2 = teamAll.get(5).getTeamColor();
		
		double killAll1 = 0;
		double killAll2 = 0;
		
		// 각 팀 전체 킬 수 구하기
		for(int i=0; i<5; i++) {
			killAll1 += teamAll.get(i).getKill();
		}
		for(int i=5; i<10; i++) {
			killAll2 += teamAll.get(i).getKill();
		}
		
		double userKillPer = ((kill + assi) / killAll1) * 100;
	    int userKillPerInt = (int)(Math.round(userKillPer));
		System.out.println("▶ 해당 유저의 킬 관여율 : " + userKillPerInt + "%, 해당 유저의 팀 : " + gh.getUserGameHistory(inputUser).get(0).getTeamColor());
		
		System.out.println(teamColor1 + " 팀의 전체 킬 : "+ (int)killAll1);
		
		for(int idx=0;idx<5;idx++) { // 해당 팀원 킬 관여
		    GameHistory ugh = teamAll.get(idx);
		    
		    String userid = ugh.getUserId();
			double userKill = ugh.getKill();
			double userAssi = ugh.getAssist();
		    
		    double killPercent = ((userKill + userAssi) / killAll1) * 100;
		    int killPerInt = (int)(Math.round(killPercent));
			System.out.println(teamColor1 + "팀 " + userid + "의 킬 관여율 : "+ killPerInt + "%");
		}
		
		System.out.println(teamColor2 + " 팀의 전체 킬 : "+ (int)killAll2);
		
		for(int idx=5;idx<10;idx++) { // 상대 팀원 킬 관여
			GameHistory ugh = teamAll.get(idx);
		    
			String userid = ugh.getUserId();
			double userKill = ugh.getKill();
			double userAssi = ugh.getAssist();
			
			double killPercent = ((userKill + userAssi) / killAll2) * 100;
			int killPerInt = (int)(Math.round(killPercent));
			System.out.println(teamColor2 + "팀 " + userid + "의 킬 관여율 : "+ killPerInt + "%");
		}
		
	}
	
	
	
	public static void main(String[] args) {
		GameHistoryMethod uh = new GameHistoryMethod();
		
//		System.out.print("유저의 이름을 입력(킬관여율) > ");
//		uh.getUserKA();
		System.out.print("유저의 이름을 입력(전승패) > ");
		uh.getWinLost();
		
	}

}
