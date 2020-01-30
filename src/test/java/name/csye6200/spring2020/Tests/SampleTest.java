package name.csye6200.spring2020.Tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

import static org.junit.Assert.*;

import name.csye6200.spring2020.Sample.*;
/**
 * Unit test for simple App.
 */
public class SampleTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
	SampleApp app = null;
	
    public SampleTest( String testName )
    {
        super( testName );
    }

    /*
    * 
    * */
	@Before
	public void setUp() throws Exception
	{
	 	
    	app = new SampleApp();
	}
	
	/*
	 * 
	 */
	@After
	public void tearDown() throws Exception
	{
		app = null;
	}
	
	// Testcases here.
	
	/**
	 * 
	 */
	@Test
	public void testSomething()
	{
    	int sum = app.sampleAdd(10, 20);
    	assertEquals(30, sum);

	}
	
}
