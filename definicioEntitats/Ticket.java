package definicioEntitats;
import java.util.*;

public class Ticket {
	
	private int num;
	private HashMap<Object, Integer> compra = new HashMap<Object, Integer>();
	
	public Ticket(int num, HashMap<Object, Integer> compra) {
	}
	
	public Ticket() {
		
	}

	public HashMap<Object, Integer> getCompra() {
		return compra;
	}

	public void setCompra(HashMap<Object, Integer> compra) {
		this.compra = compra;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
}