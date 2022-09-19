
public class SmartPhone extends Phone {
	private String oprType;
	private String oprVer;
	private int memorySize;
	private boolean bluetooth;

	public SmartPhone(String make, int price, String type, String oprType, String oprVer, int memorySize,
			boolean bluetooth) {
		super(make, price, type);
		this.oprType = oprType;
		this.oprVer = oprVer;
		this.memorySize = memorySize;
		this.bluetooth = bluetooth;
	
	}

	public String getOprType() {
		return oprType;
	}

	public void setOprType(String oprType) {
		this.oprType = oprType;
	}

	public String getOprVer() {
		return oprVer;
	}

	public void setOprVer(String oprVer) {
		this.oprVer = oprVer;
	}

	public int getMemorySize() {
		return memorySize;
	}

	public void setMemorySize(int memorySize) {
		this.memorySize = memorySize;
	}

	public boolean isBluetooth() {
		return bluetooth;
	}

	public void setBluetooth(boolean bluetooth) {
		this.bluetooth = bluetooth;
	}
	
	public String toString() {
	return super.toString() + "운영체제: " + oprType + ", 운영버전" + oprVer + ", 메모리크기" + memorySize 
			+ ", 블루투스 지원 여부" + bluetooth;
	}
	}

