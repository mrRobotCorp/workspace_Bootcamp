package project.opgg.VO;

import java.sql.Timestamp;

public class GameHistory {
   private int gameId;
   private String gameCode;
   private String teamColor;
   private String userId;
   private String champId;
   private String pos;
   private int kill;
   private int death;
   private int assist;
   private Timestamp end_time;
   private Timestamp start_time;
   private String isWin;
   private String kda;
//   private String item01;
//   private String item02;
//   private int damage;
//   private int attack;

   public GameHistory(int gameId, String gameCode, String teamColor, String userId, String champId, String pos,
         int kill, int death, int assist, String kda, String isWin, Timestamp start_time, Timestamp end_time) {
      this.gameId = gameId;
      this.gameCode = gameCode;
      this.teamColor = teamColor;
      this.userId = userId;
      this.champId = champId;
      this.pos = pos;
      this.kill = kill;
      this.death = death;
      this.assist = assist;
      this.end_time = end_time;
      this.start_time = start_time;
      this.isWin = isWin;
      this.kda = kda;
   }

   public GameHistory() {

   }

   public String getIsWin() {
      return isWin;
   }

   public void setIsWin(String isWin) {
      this.isWin = isWin;
   }

   public String getKda() {
      return kda;
   }

   public void setKda(String kda) {
      this.kda = kda;
   }

   public int getGameId() {
      return gameId;
   }

   public void setGameId(int gameId) {
      this.gameId = gameId;
   }

   public String getGameCode() {
      return gameCode;
   }

   public void setGameCode(String gameCode) {
      this.gameCode = gameCode;
   }

   public String getTeamColor() {
      return teamColor;
   }

   public void setTeamColor(String teamColor) {
      this.teamColor = teamColor;
   }

   public String getUserId() {
      return userId;
   }

   public void setUserId(String userId) {
      this.userId = userId;
   }

   public String getChampId() {
      return champId;
   }

   public void setChampId(String champId) {
      this.champId = champId;
   }

   public String getPos() {
      return pos;
   }

   public void setPos(String pos) {
      this.pos = pos;
   }

   public int getKill() {
      return kill;
   }

   public void setKill(int kill) {
      this.kill = kill;
   }

   public int getDeath() {
      return death;
   }

   public void setDeath(int death) {
      this.death = death;
   }

   public int getAssist() {
      return assist;
   }

   public void setAssist(int assist) {
      this.assist = assist;
   }

   public Timestamp getEnd_time() {
      return end_time;
   }

   public void setEnd_time(Timestamp end_time) {
      this.end_time = end_time;
   }

   public Timestamp getStart_time() {
      return start_time;
   }

   public void setStart_time(Timestamp start_time) {
      this.start_time = start_time;
   }

   public String isWin() {
      return isWin;
   }

   public void setWin(String isWin) {
      this.isWin = isWin;
   }
}