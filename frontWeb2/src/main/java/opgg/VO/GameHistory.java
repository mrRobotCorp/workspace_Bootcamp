package opgg.VO;

import java.util.Date;
import java.util.Map;

public class GameHistory {
	private int gameNumber;
	private String userId;
	private String spellName;
	private String runeId;
	private String championId;
	private String position;
	private String gameId;
	private String kill;
	private String death;
	private String assist;
	private int damage;
	private int attack;
	private Date endTime;
	private Date startTime;
	private boolean isWin;
	private Map<Integer,String> item;
	private Map<Integer,String> skillBuild;
	private Map<Integer,String> benChampions;
}
