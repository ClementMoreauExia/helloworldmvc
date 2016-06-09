package org.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

public class DAOHelloWorldTest {
   private DAOHelloWorld DAOHelloWorldTest;
   
   @Before
   public void setUp() throws Exception {
     this.DAOHelloWorldTest = new DAOHelloWorld();
   }
   
   @Test
   public void testDAOHelloWorldTest() throws SQLException {
	
	final boolean DAOHelloWorldOpen = true;
	 assertEquals(DAOHelloWorldOpen, this.DAOHelloWorldTest.open()); 
	}
   
   @Test
   public void answerTest() {
		this.DAOHelloWorldTest.open();
		String expect;
		try {
			expect = this.DAOHelloWorldTest.executeQuery(this.DAOHelloWorldTest.getQuerySelectFirstHelloWorld()).getString("helloWorld");
			assertEquals("Hello World", expect);
		} catch (final SQLException e) {
			fail("pas reussi");
			e.printStackTrace();
		}
	}
}