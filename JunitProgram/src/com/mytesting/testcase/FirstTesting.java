package com.mytesting.testcase;

import org.junit.Test;

import com.mytesting.logicprogram.LogicProgram;

import static org.junit.Assert.assertEquals;

public class FirstTesting {
	@Test
	public void mytesting()
	{
		assertEquals(LogicProgram.checking(new int[] {10,20,30,40,50}));// Method calling
		//assertEquals(actual result,expected result); 50,50
		System.out.println("JUnit Testing");
	}
	private void assertEquals(int checking) {
		// TODO Auto-generated method stub
		
	}
	
}
