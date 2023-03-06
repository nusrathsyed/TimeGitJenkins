package time;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeTest {

	//Total Seconds
	@Test
	public void testGetTotalSecondsGood() 
	{
		int seconds = 
		Time.getTotalSeconds("05:05:05");
		assertTrue("Total seconds are not correct", seconds==18305);
	}
	
	@Test
	public void testGetTotalSecondsBad() 
	{
		assertThrows(
		StringIndexOutOfBoundsException.class,
		()-> {Time.getTotalSeconds("10:00");});
	}
	@Test
	public void testGetTotalSecondsBoundary() 
	{		
		int seconds = 
		Time.getTotalSeconds("00:00:00");
		assertTrue("The seconds is not calculated properly", seconds==0);
	}


	//Get Seconds
	@Test
	public void testGetSecondsGood() 
	{
		int seconds = 
		Time.getTotalSeconds("05:05:05");
		assertTrue("Seconds were not calculated properly", seconds==18305);
	}
	
	@Test
	public void testGetSecondsBad() 
	{
		assertThrows(
		StringIndexOutOfBoundsException.class,
		()-> {Time.getSeconds("10:00");});
	}
	
	@Test
	public void testGetSecondsBoundary() 
	{
		int seconds = 
		Time.getSeconds("01:01:01");
		assertTrue("Seconds were not calculated properly", seconds==18305);
	}
	
	//Total Minutes
	@Test
	public void testGetTotalMinutesGood() 
	{
		int minutes = 
		Time.getTotalMinutes("00:05:00");
		assertTrue("Minutes were not calculated properly", minutes==5);
	}

	@Test
	public void testGetTotalMinutesBad() 
	{
		assertThrows(
		StringIndexOutOfBoundsException.class,
		()-> {Time.getTotalMinutes("00:00:05");});
	}
	
	@Test
	public void testGetTotalMinutesBoundary() 
	{
		int minutes = 
		Time.getTotalMinutes("00:60:00");
		assertTrue("Minutes are not calculated properly", minutes==305);
	}
	
	//Total Hours
	@Test
	public void testGetTotalHoursGood() 
	{
		int hours = 
		Time.getTotalHours("10:00:00");
		assertTrue("Hours are not calculated properly", hours==10);
	}
	
	@Test
	public void testGetTotalHoursBad() 
	{
		assertThrows(
		StringIndexOutOfBoundsException.class,
		()-> {Time.getTotalHours("0");});
	}
	
	@Test
	public void testGetTotalHoursBoundary() 
	{
		int hours = 
		Time.getTotalHours("09:00:00");
		assertTrue("Hours are not calculated properly", hours==9);
	}
	
	
	
	//Get Milliseconds
	@Test
	void testGetMillisecondsBad() 
	{	
		assertThrows(
		StringIndexOutOfBoundsException.class,
		()-> {Time.getMilliseconds("00:00:00:000");});
	}
	
	@Test
	public void testGetMillisecondsGood() 
	{
		int milliseconds = 
		Time.getMilliseconds("12:05:05:005");
		assertTrue("Milliseconds were not calculated correctly", milliseconds==5);
	}
	
	//Get Total Milliseconds
	@Test
	public void testGetTotalMillisecondsBad() 
	{
		assertThrows(
		StringIndexOutOfBoundsException.class,
		()-> {Time.getTotalMilliseconds("00:00:00");});
	}
	
	@Test
	public void testGetTotalMillisecondsGood() 
	{
		int milliseconds = 
		Time.getTotalMilliseconds("05:05:05:005");
		assertTrue("Total Milliseconds were not calculated correctly", milliseconds==18035005);
	}
	

}
