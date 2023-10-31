package com.mytesting.logicprogram;

public class LogicProgram {
	
	public static int checking(int arr[])	// [10,20,30,40,50]
	{
		int max = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}

}
