package project.opgg;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import project.opgg.VO.GameHistory;

public class ghDao {
   private Connection con;
   private PreparedStatement pstmt;
   private ResultSet rs;

   public List<GameHistory> getTeamGameHistory(String gameCode) {
      List<GameHistory> teamGHlist = new ArrayList<GameHistory>();
      String sql = "SELECT * FROM game_history WHERE gamecode=?";
      try {
         con = OPGG_DB.con();
         pstmt = con.prepareStatement(sql);

         // 로직 입력
         // 캐릭터이미지 / 스펠 / 룬 / 유저아이디 / 등수 / kda / 아이템 정보 불러오는 sql문작성(game)
         pstmt.setString(1, gameCode);
         rs = pstmt.executeQuery();
         while (rs.next()) {
            teamGHlist.add(new GameHistory(rs.getInt("gameid"), rs.getString("gamecode"), rs.getString("teamcolor"),
                  rs.getString("userid"), rs.getString("chamid"), rs.getString("pos"), rs.getInt("kill"),
                  rs.getInt("death"), rs.getInt("assist"), rs.getString("kda"), rs.getString("isWin"),
                  rs.getTimestamp("start_time"), rs.getTimestamp("end_time")));
         }

         rs.close();
         pstmt.close();
         con.close();
      } catch (SQLException e) {
         System.out.println("DB예외 발생 : " + e.getMessage());
         OPGG_DB.rollback(con);
      } catch (Exception e) {
         System.out.println("일반 예외 처리 : " + e.getMessage());
      } finally {
         OPGG_DB.close(rs, pstmt, con);
      }
      return teamGHlist;
   }

   public List<GameHistory> getUserGameHistory(String userId) { // 메소드명 변경
      List<GameHistory> userGHlist = new ArrayList<GameHistory>();

      String sql = "SELECT * FROM game_history WHERE userid=?";// sql문 입력
      try {
         con = OPGG_DB.con();
         pstmt = con.prepareStatement(sql);

         // 로직 입력
         // 캐릭터이미지 / 스펠 / 룬 / 유저아이디 / 등수 / kda / 아이템 정보 불러오는 sql문작성(game)
         pstmt.setString(1, userId);
         rs = pstmt.executeQuery();
         while (rs.next()) {
            userGHlist.add(new GameHistory(rs.getInt("gameid"), rs.getString("gamecode"), rs.getString("teamcolor"),
                  rs.getString("userid"), rs.getString("chamid"), rs.getString("pos"), rs.getInt("kill"),
                  rs.getInt("death"), rs.getInt("assist"), rs.getString("kda"), rs.getString("isWin"),
                  rs.getTimestamp("start_time"), rs.getTimestamp("end_time")));
         }

         rs.close();
         pstmt.close();
         con.close();
      } catch (SQLException e) {
         System.out.println("DB예외 발생 : " + e.getMessage());
         OPGG_DB.rollback(con);
      } catch (Exception e) {
         System.out.println("일반 예외 처리 : " + e.getMessage());
      } finally {
         OPGG_DB.close(rs, pstmt, con);
      }
      return userGHlist;
   }

   public static void main(String args[]) {
      ghDao dao = new ghDao();
      Scanner sc = new Scanner(System.in);
      System.out.print("유저 아이디 입력 >> ");
      String inputUser = sc.next();
      List<GameHistory> userGameHistory = dao.getUserGameHistory(inputUser);
      System.out.println(inputUser+"의 전적 리스트");
      int jdx=0;
      for (GameHistory g : userGameHistory) {
         System.out.println("★"+(jdx+1)+"번★ 게임 정보(낮을수록 최근게임)");
         System.out.println(" ▶ 게임 유형 : "+g.getGameCode().substring(0,4));
         System.out.println(" ▶ 플레이한 챔피언 : "+g.getChampId());
         System.out.println(" ▶ 유저의 포지션: "+g.getPos());
         System.out.println(" ▶ 플레이한 팀 : "+g.getTeamColor()+" 팀");
         System.out.println(" ▶ 플레이 시작시간 : "+g.getStart_time());
         System.out.println(" ▶ 플레이 종료시간 : "+g.getEnd_time());
         System.out.println(" ▶ 유저의 kill/death/assist : "+g.getKill()+" / "+g.getDeath()+" / "+g.getAssist());
         System.out.println(" ◆◆◆ "+g.getTeamColor()+ " team "+g.getIsWin()+"s !! ◆◆◆ ");
         jdx++;
      }
      
      while(true) {
         System.out.println("게임 번호를 입력하세요 >> ");
         int inputNum=Integer.parseInt(sc.next());
         List<GameHistory> chosenUGH = dao.getTeamGameHistory(userGameHistory.get(inputNum-1).getGameCode());
         String gameCode = chosenUGH.get(0).getGameCode();
         System.out.println(gameCode.length());
         if(gameCode.length()==5) {
            gameCode=gameCode.substring(0,2);
         } else {
            gameCode=gameCode.substring(0,3);
         }
         System.out.println("게임 유형 : "+gameCode);
         String teamColor1 = chosenUGH.get(0).getTeamColor();
         String teamColor2 = chosenUGH.get(5).getTeamColor();
         System.out.println("◎"+teamColor1+"팀 유저◎");
         for(int idx=0;idx<5;idx++) {
            GameHistory gh = chosenUGH.get(idx);
            System.out.println(" ▶ "+gh.getUserId()+" : "+gh.getPos()+" : "+gh.getChampId());
         }
         
         System.out.println("◎"+teamColor2+"팀 유저◎");
         for(int idx=5;idx<10;idx++) {
            GameHistory gh = chosenUGH.get(idx);
            System.out.println(" ▶ "+gh.getUserId()+" : "+gh.getPos()+" : "+gh.getChampId());
         }
         System.out.println(teamColor1+" 팀이 "+chosenUGH.get(0).getIsWin()+"했습니다");
         break;
      }
      

   }

}