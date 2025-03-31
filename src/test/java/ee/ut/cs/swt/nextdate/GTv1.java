package ee.ut.cs.swt.nextdate;

import org.junit.Test;
import static org.junit.Assert.*;

public class GTv1 {

	@Test(timeout = 4000)
	public void testCreatesNextDateAndCallsRun() throws Throwable {
	    NextDate nextDate0 = new NextDate(1257, (-72), 1498);
	    String string0 = nextDate0.run(12, 31, 1801);
	    assertEquals("12/32/1801", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate1() throws Throwable {
	    NextDate nextDate0 = new NextDate((-55), (-55), (-55));
	    String string0 = nextDate0.run(5, 1, 2021);
	    assertEquals("5/2/2021", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate0() throws Throwable {
	    NextDate nextDate0 = new NextDate(2021, 1704, 1838);
	    String string0 = nextDate0.run(9, 1, 1838);
	    assertEquals("9/2/1838", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate3() throws Throwable {
	    NextDate nextDate0 = new NextDate(1489, (-72), 1489);
	    String string0 = nextDate0.run(3, 1, 1801);
	    assertEquals("3/2/1801", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate2() throws Throwable {
	    NextDate nextDate0 = new NextDate(30, 3654, (-1));
	    String string0 = nextDate0.run(9, 30, 1803);
	    assertEquals("10/1/1803", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate5() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 2);
	    String string0 = nextDate0.run(2, 29, 1831);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate4() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 1, 1);
	    String string0 = nextDate0.run(1, 1, 1803);
	    assertEquals("1/2/1803", string0);
	}

	@Test(timeout = 4000)
	public void testRunReturningNonEmptyString() throws Throwable {
	    NextDate nextDate0 = new NextDate(1257, (-72), 1498);
	    String string0 = nextDate0.run(12, 31, 1801);
	    assertEquals("12/32/1801", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegative() throws Throwable {
	    NextDate nextDate0 = new NextDate((-1811), 2, (-1811));
	    String string0 = nextDate0.run(2, 11, (-1398));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate14() throws Throwable {
	    NextDate nextDate0 = new NextDate(10, 10, 8);
	    String string0 = nextDate0.run(10, 1, 1801);
	    assertEquals("10/2/1801", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate13() throws Throwable {
	    NextDate nextDate0 = new NextDate(1959, 1959, 1959);
	    String string0 = nextDate0.run(8, 31, 1959);
	    assertEquals("9/1/1959", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate16() throws Throwable {
	    NextDate nextDate0 = new NextDate(10, 10, 8);
	    String string0 = nextDate0.run(10, 2855, 2603);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate15() throws Throwable {
	    NextDate nextDate0 = new NextDate(28, (-1), 0);
	    String string0 = nextDate0.run(12, 1801, 1801);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndRunWithPositiveAndRunWithPositive() throws Throwable {
	    NextDate nextDate0 = new NextDate((-1811), 2, (-1811));
	    String string0 = nextDate0.run((-5349), 1801, 30);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate18() throws Throwable {
	    NextDate nextDate0 = new NextDate((-1811), 2, (-1811));
	    String string0 = nextDate0.run(2, 16, 1801);
	    assertEquals("2/17/1801", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndRunWithPositiveAndRunWithNegative() throws Throwable {
	    NextDate nextDate0 = new NextDate((-1811), 2, (-1811));
	    String string0 = nextDate0.run(16, (-1811), (-1811));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate17() throws Throwable {
	    NextDate nextDate0 = new NextDate((-1811), 2, (-1811));
	    String string0 = nextDate0.run(1801, 1801, 2412);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate7() throws Throwable {
	    NextDate nextDate0 = new NextDate((-1811), 2, (-1811));
	    String string0 = nextDate0.run(2, 30, 1801);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate6() throws Throwable {
	    NextDate nextDate0 = new NextDate(28, 28, 28);
	    String string0 = nextDate0.run(2, 28, 1845);
	    assertEquals("3/1/1845", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate9() throws Throwable {
	    NextDate nextDate0 = new NextDate((-1811), 2, (-1811));
	    String string0 = nextDate0.run(12, 30, 1845);
	    assertEquals("12/31/1845", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate8() throws Throwable {
	    NextDate nextDate0 = new NextDate(1908, 1908, 1908);
	    String string0 = nextDate0.run(7, 7, 1908);
	    assertEquals("7/7/1908", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate10() throws Throwable {
	    NextDate nextDate0 = new NextDate(1834, 1834, 1834);
	    String string0 = nextDate0.run(6, 31, 1834);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate12() throws Throwable {
	    NextDate nextDate0 = new NextDate(30, 26, 30);
	    String string0 = nextDate0.run(11, 30, 1803);
	    assertEquals("12/1/1803", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate11() throws Throwable {
	    NextDate nextDate0 = new NextDate(1862, 1862, 1862);
	    String string0 = nextDate0.run(4, 4, 1862);
	    assertEquals("4/5/1862", string0);
	}

}
