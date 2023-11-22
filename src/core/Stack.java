package core;
import static org.junit.Assert.assertFalse;
import java.util.ArrayList;


public class Stack implements IStack {
	private ArrayList<Object> elements;
	private Stack aStack;
	public Stack() {
		elements = new ArrayList<Object>();
	}
	
	public boolean isEmpty() {
		if(elements != null) {
			if(elements.size()==0)
				return true;
			else return false;
		}
		else return true;
	}
	public int getSize() {
		if(elements != null)
			return elements.size();
		else return 0;
	
	}
	public void push(Object elm) {
		elements.add(elm);

	}
	public boolean isFull() {
		return false;
	}
	public Object getTop() {
		return elements.get(getSize()-1);
	}
	public Object pop() {
		if(!isEmpty()) {
			return elements.remove(getSize()-1);
		}
		else
			return null;
	}


}
