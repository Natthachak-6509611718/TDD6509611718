package core;

import junit.framework.TestCase;

public class JUNITStack extends TestCase {
	
	
	public void testCreateNewEmptyStack() {
		
		Stack s1 = new Stack() ;
		int size = s1.getSize() ;
		
		assertEquals(0, size); //zero is pass
		assertTrue(s1.isEmpty());
		
	}
	
	public void testPushElmToTop() {
		
		Stack s1 = new Stack();
		assertFalse(s1.isFull());
		s1.push(new Integer(1));
		int top=(Integer)s1.getTop();
		assertEquals(1, top);
	}
	
	public void testLastInFirstOut() {
		Stack s1 = new Stack();
		s1.push(new Integer(1));
		Object top = s1.getTop();
		int size = s1.getSize();
		
		assertEquals(1, s1.pop());
		assertEquals(size-1, s1.getSize());
	}

}
