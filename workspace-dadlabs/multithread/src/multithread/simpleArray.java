package multithread;

import java.security.SecureRandom;

public class simpleArray 
{
	private int sharedData[];
	private int currentIndex;
	
	private SecureRandom generator = new SecureRandom();
	
	public int SimpleArray(int size)
	{
		for(int i = 0; i < size ; i++)
		{
			sharedData[i] = generator.nextInt();
		}
		return 0;
	}
	
	public void add(int value)
	{
		
	}
	
	public String toString()
	{
		return null;
	}
}
