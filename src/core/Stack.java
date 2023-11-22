package core;

import java.util.ArrayList;

public class Stack implements iStack {
	
	private ArrayList<Object> elms;
	public Stack() {
		elms = new ArrayList<Object>();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(elms!=null) {
			if(elms.size()==0)
				return true;
			else
				return false;
	}
		else
		 return true;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		if(elms!=null)
			return elms.size();
		else
			
		return 0;
	}
	
	@Override
	public void push(Object elm) {
		elms.add(elm);
	}

	@Override
	public boolean isFull() {
		return false;
	}
	
	public Object getTop() {
		for(int i =0; i <elms.size(); i++) {
			if(i == elms.size()-1) {
				return elms.get(i);
				
			}
			else {
				continue;
			}
		}
		return 0;
		
	}
	
	public Object pop() {
		 Object temp = null;
		 for(int i =0; i <elms.size(); i++) {
				if(i == elms.size()-1) {
					temp = elms.get(i);
					elms.remove(i);
					return temp;
					
				}
				else {
					continue;
				}
			}
		return null;
	}
}
