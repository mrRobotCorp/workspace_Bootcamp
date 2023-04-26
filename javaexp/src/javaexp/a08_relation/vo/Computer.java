package javaexp.a08_relation.vo;

public class Computer {
	private String kind;
	private Cpu cpu;
	private Ram ram;

	public Computer() {
	}
	
	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public Cpu getCpu() {
		return cpu;
	}
	
	public void setCpu(Cpu cpu) {
		this.cpu = cpu;
	}
	
	// Computer com = new Computer("조립");
	public Computer(String kind) {
		this.kind = kind;
	}

	public Computer(Ram ram) {
		this.ram = ram;
	}

	public Computer(String kind, Ram ram) {
		this.kind = kind;
		this.ram = ram;
	}
	
	// com.addCpu(new Cpu("AMD", "6core"));
	public void addCpu(Cpu cpu) {
		this.cpu = cpu;
		System.out.println("장착 사양 : " + cpu.getSpe());
	}
	
	public void addRam(Ram ram) {
		this.ram = ram;
		System.out.println("장착한 ram gb : " + ram.getMemory());
	}

	public void showCom() {
		System.out.println(kind + " 컴퓨터 부품들");
		if(cpu == null) {
			System.out.println("cpu가 존재하지 않는다.");
		} else {
			cpu.showInfo();
		}
		// ram 메모리 여부 확인해서 ram 정보 출력
		if(ram == null) {
			System.out.println("ram이 존재하지 않는다.");
		} else {
			ram.showInfo();
		}
	}
}
