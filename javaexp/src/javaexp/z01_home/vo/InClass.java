package javaexp.z01_home.vo;

public class InClass {
	private Girl[] gArry;
	private int idx;
	
	public void inStu(Girl g) {
		if(gArry != null) {
			gArry[idx] = g;
			idx++;
			System.out.println("학생 추가");			
		}
		
	}
	
	public void classPlan(int cnt) {
		gArry = new Girl[cnt];
		System.out.println("입실 학생 수 설정 : " + cnt);
	}
	
	
	public void stuList() {
		if(gArry != null) {
			System.out.println("총 학생 수 : " + gArry.length);
			System.out.println("나이\t학교\t점수");	
			for(Girl g:gArry) {
				g.totGInfo();
			}
		}
		
	}
}