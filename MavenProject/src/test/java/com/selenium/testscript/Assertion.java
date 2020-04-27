package com.selenium.testscript;


import org.junit.Assert;
import org.junit.Test;

public class Assertion {
	
	@Test
	public void test1() {
	String s="Hello";
	Assert.assertEquals("Hello", s);
	}
	@Test
	public void test2() {
		String s="Hello";
		Assert.assertTrue(s.equals("Hello"));
	}
	@Test
	public void test3() {
		String s="Hello";
		Assert.assertTrue(s.equals("Hell"));
	}
	@Test
	public void test4() {
		String s="Hello";
		Assert.assertEquals("Hell", s);
		}
	@Test
	public void test5() {
		String s= null;
		Assert.assertNull(s);
	}
	@Test
	public void test6() {
		String s= null;
		Assert.assertNotNull(s);
	}
	@Test
	public void test7() {
		String s= "Hello";
		Assert.assertNotEquals("Hello", s);
	}
	@Test
	public void test8() {
		String s= "Hello";
		Assert.assertFalse(s.equals("Hello"));
	}
	@Test
	public void test9() {
		String s="Hello";
		Assert.fail(s);
	}
	

}
