package com.getzephyr.support;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class App1Test 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public App1Test( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( App1Test.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertEquals(2, 2);
    }
    
    public void testApp1() {
    	assertEquals(1, 12);
    }

    public void testApp2() {
    	assertEquals("mohan", "mohan");
    }
}
