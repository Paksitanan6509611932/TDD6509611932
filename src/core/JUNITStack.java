package core;

import junit.framework.TestCase;

public class JUNITStack extends TestCase {
	
	public void testCreateNewEmptyStack() {
		
		Stack s1 = new Stack();
		int size = s1.getSize();
		
		assertEquals(0,size);
		assertTrue(s1.isEmpty());
	}

	public void testPushToTop() {
		Stack s1 = new Stack();
		s1.push(1);
		
		assertEquals(1,s1.getTop());
	}
	
	public void testLastInFirstOut() {
		Stack stack = new Stack();
		assertTrue(stack.isEmpty());
		stack.push(1);
		stack.push(2);
		stack.push(3);
		assertEquals(3,stack.getTop());
		
		assertEquals(3,stack.getTop());
		assertEquals(3,stack.pop());
		assertEquals(2,stack.getTop());
		assertEquals(2,stack.pop());
		assertEquals(1,stack.getTop());
		assertEquals(1,stack.pop());
		
		assertTrue(stack.isEmpty());
	}
}
