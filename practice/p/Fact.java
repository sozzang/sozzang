package practice.p;

public class Fact  {
	private int inter = -1;
	private int mul = -1;
	private int result = -1;
	
	public Fact( int inter, int mul ) {
		this.inter = inter;
		this.mul = mul;
		this.result = mul * inter;
	}
	public void calcu() {
		this.result = mul * inter;
	}
	public int getInter() {
		return inter;
	}
	public void setInter(int inter) {
		this.inter = inter;
	}
	public int getMul() {
		return mul;
	}
	public void setMul(int mul) {
		this.mul = mul;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	
	@Override public String toString() {
		return inter + " * " + mul + " = "  + mul;
	}
	
}
