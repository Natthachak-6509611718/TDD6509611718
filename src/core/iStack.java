package core;

public interface iStack {
	boolean isEmpty() ;
	int getSize() ;
	
	void push(Object elm) ;
	boolean isFull();
	Object getTop() ;
	Object pop();
	

}
