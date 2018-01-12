package com.issc.wyy;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit QueryResultInfo for simple Send139.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the QueryResultInfo case
     *
     * @param testName name of the QueryResultInfo case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
