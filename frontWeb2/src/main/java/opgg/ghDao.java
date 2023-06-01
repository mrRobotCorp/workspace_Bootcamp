package opgg;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import opgg.VO.GameHistory;

public class ghDao {
   private Connection con;
   private PreparedStatement pstmt;
   private ResultSet rs;
   
   public List<GameHistory> getGameHistory(String userId) {   // 메소드명 변경
      
      List<GameHistory> userGameHistory = new ArrayList<GameHistory>(); 
      
      String sql = "SELECT * FROM game_history WHERE userid = ? ";// sql문 입력
      try {
         con = OPGG_DB.con();
         pstmt=con.prepareStatement(sql);
         
         // 로직 입력
         // 캐릭터이미지 / 스펠 / 룬 / 유저아이디 / 등수 / kda / 아이템 정보 불러오는 sql문작성(game
         pstmt.setString(1,userId);
         
         rs=pstmt.executeQuery();
         
         while(rs.next()) {
            userGameHistory.add(new GameHistory(
            		rs.getInt("gameid"),
            		rs.getString("gamecode"),
            		rs.getString("teamcolor"),
            		rs.getString("userid"),
            		rs.getString("chamid"),
            		rs.getString("pos"),
            		rs.getInt("kill"),
            		rs.getInt("death"),
            		rs.getInt("assist"),
            		rs.getString("kda"), 
            		rs.getString("isWin"), 
            		rs.getTimestamp("start_time"), 
            		rs.getTimestamp("end_time")
    		));
         }       
         
         rs.close();
         pstmt.close();
         con.close();
         
      } catch (SQLException e) {
         System.out.println("DB예외 발생 : "+e.getMessage());
         OPGG_DB.rollback(con);
      } catch (Exception e) {
         System.out.println("일반 예외 처리 : "+e.getMessage());
      } finally {
         OPGG_DB.close(rs, pstmt, con);
      }
      return userGameHistory;
   }
   public static void main(String args[]) {
      ghDao dao = new ghDao();
      dao.getGameHistory("다솜");
      
		for(GameHistory gh:dao.getGameHistory("다솜")) {
			System.out.print(gh.getGameId() + "\t");
			System.out.print(gh.getUserId() + "\t");
			System.out.print(gh.getChampId() + "\t");
			System.out.print(gh.getPos() + "\t");
			System.out.print(gh.getKill() + "\t");
			System.out.print(gh.getDeath() + "\t");
			System.out.print(gh.getAssist() + "\t");
			System.out.print(gh.getKda() + "\t");
			System.out.print(gh.getIsWin() + "\t");
			System.out.print(gh.getStart_time() + "\t");
			System.out.println(gh.getEnd_time());
		}
      
      
   }
   
}