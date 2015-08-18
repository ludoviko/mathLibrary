package com.lam.mathematics;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.mathematics.Multifactorial;

public class MultifactorialTest extends TestCase {
	@Before
	protected void setUp() throws Exception {
		super.setUp();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testCalcMultiFact() {
		Assert.assertEquals("5", Multifactorial.calcMultiFact(5, 5));
		Assert.assertEquals("12320", Multifactorial.calcMultiFact(14, 3));
		Assert.assertEquals("5", Multifactorial.calcMultiFact(5, 4));
		Assert.assertEquals("200000000000000000",
				Multifactorial.calcMultiFact(2000000000, 1900000000));
		Assert.assertEquals("84232704000",
				Multifactorial.calcMultiFact(1000, 256));
	}

	@Test
	public void testCalcMultiFactException() {
		try {
			Multifactorial.calcMultiFact(2000000000, 1);
			fail("Expected Exception Faillure");
		} catch (StackOverflowError e) {
		}
	}
	
	@Test
	public void testCalcMultiFactSystemTest() {
		Assert.assertEquals("12320", Multifactorial.calcMultiFact(14, 3));
		Assert.assertEquals("5", Multifactorial.calcMultiFact(5, 4));
		Assert.assertEquals("200000000000000000", Multifactorial.calcMultiFact(2000000000, 1900000000));
		Assert.assertEquals("84232704000", Multifactorial.calcMultiFact(1000, 256));
		Assert.assertEquals("1", Multifactorial.calcMultiFact(1, 2000000000));
		Assert.assertEquals("100000000000000000", Multifactorial.calcMultiFact(500000000, 300000000));
		Assert.assertEquals("38815686314036006", Multifactorial.calcMultiFact(346534522, 234523499));
		Assert.assertEquals("1", Multifactorial.calcMultiFact(1, 1));
		Assert.assertEquals("500000000000000000", Multifactorial.calcMultiFact(1000000000, 500000000));
		Assert.assertEquals("999999998000000000", Multifactorial.calcMultiFact(999999998, 499999998));
		Assert.assertEquals("1000000000000000000", Multifactorial.calcMultiFact(2000000000, 1500000000));
		Assert.assertEquals("121645100408832000", Multifactorial.calcMultiFact(19, 1));
		Assert.assertEquals("132949364877520576", Multifactorial.calcMultiFact(7096, 1665));
		Assert.assertEquals("92503795940503129", Multifactorial.calcMultiFact(1403, 240));
		Assert.assertEquals("49844758346611200", Multifactorial.calcMultiFact(580, 89));
		Assert.assertEquals("2690805827660643", Multifactorial.calcMultiFact(2883, 650));
		Assert.assertEquals("133671026560500000", Multifactorial.calcMultiFact(6765, 1565));
		Assert.assertEquals("372592483175247615", Multifactorial.calcMultiFact(789, 122));
		Assert.assertEquals("756991280836614", Multifactorial.calcMultiFact(44346642, 27276775));
		Assert.assertEquals("29761497787974642", Multifactorial.calcMultiFact(514509426, 456665009));
		Assert.assertEquals("46179236836091876", Multifactorial.calcMultiFact(551970908, 468308461));
		Assert.assertEquals("1671221964775800", Multifactorial.calcMultiFact(58169460, 29439230));
		Assert.assertEquals("108366400801666176", Multifactorial.calcMultiFact(553651008, 357920486));
		Assert.assertEquals("40845146235900226", Multifactorial.calcMultiFact(470471467, 383653989));
		Assert.assertEquals("1321684950", Multifactorial.calcMultiFact(1321684950, 1610906284));
		Assert.assertEquals("962668700", Multifactorial.calcMultiFact(962668700, 1552320299));
		Assert.assertEquals("494160363644317962", Multifactorial.calcMultiFact(1855938358, 1589679319));
		Assert.assertEquals("945693672", Multifactorial.calcMultiFact(945693672, 1995299534));
		Assert.assertEquals("42849873690624000", Multifactorial.calcMultiFact(30, 2));
		Assert.assertEquals("122087424094272000", Multifactorial.calcMultiFact(111, 11));
		Assert.assertEquals("885821206052908125", Multifactorial.calcMultiFact(53, 4));
		Assert.assertEquals("151534613656153728", Multifactorial.calcMultiFact(637, 95));
		Assert.assertEquals("532998118279051425", Multifactorial.calcMultiFact(151, 16));
		Assert.assertEquals("36814996368259200", Multifactorial.calcMultiFact(338, 47));
		Assert.assertEquals("178311467764705275", Multifactorial.calcMultiFact(51, 4));
		Assert.assertEquals("278761477374027648", Multifactorial.calcMultiFact(213, 25));
		Assert.assertEquals("642203484132672000", Multifactorial.calcMultiFact(231, 27));
		Assert.assertEquals("119715577952256000", Multifactorial.calcMultiFact(78, 7));
		Assert.assertEquals("9585618768101376", Multifactorial.calcMultiFact(96, 10));
		Assert.assertEquals("60705973649857536", Multifactorial.calcMultiFact(59, 5));
		Assert.assertEquals("494437513909964625", Multifactorial.calcMultiFact(89, 8));
		Assert.assertEquals("494437513909964625", Multifactorial.calcMultiFact(89, 8));
		Assert.assertEquals("191898783962510625", Multifactorial.calcMultiFact(31, 2));
		Assert.assertEquals("333247405883392000", Multifactorial.calcMultiFact(70, 6));
		Assert.assertEquals("13865696119905399", Multifactorial.calcMultiFact(97, 10));
		Assert.assertEquals("728640635326636032", Multifactorial.calcMultiFact(62, 5));
		Assert.assertEquals("886471860680806400", Multifactorial.calcMultiFact(98, 9));
		Assert.assertEquals("119715577952256000", Multifactorial.calcMultiFact(78, 7));
		Assert.assertEquals("60705973649857536", Multifactorial.calcMultiFact(59, 5));
		Assert.assertEquals("121645100408832000", Multifactorial.calcMultiFact(19, 1));
		Assert.assertEquals("494437513909964625", Multifactorial.calcMultiFact(89, 8));
		Assert.assertEquals("42849873690624000", Multifactorial.calcMultiFact(30, 2));
		Assert.assertEquals("73569236156416000", Multifactorial.calcMultiFact(68, 6));
		Assert.assertEquals("17921371792896000", Multifactorial.calcMultiFact(74, 7));
		Assert.assertEquals("5", Multifactorial.calcMultiFact(5, 5));
		Assert.assertEquals("3", Multifactorial.calcMultiFact(3, 3));
		Assert.assertEquals("1000000000000000000", Multifactorial.calcMultiFact(2000000000, 1500000000));
		Assert.assertEquals("121645100408832000", Multifactorial.calcMultiFact(19, 1));
		Assert.assertEquals("500000001500000001", Multifactorial.calcMultiFact(1000000001, 500000000));
		Assert.assertEquals("999999999999999996", Multifactorial.calcMultiFact(1999999996, 1499999995));
		Assert.assertEquals("1", Multifactorial.calcMultiFact(1, 1));
		Assert.assertEquals("999999997500000001", Multifactorial.calcMultiFact(1999999999, 1500000000));
		Assert.assertEquals("499999997500000002", Multifactorial.calcMultiFact(999999999, 500000001));
		Assert.assertEquals("4", Multifactorial.calcMultiFact(4, 10));
		Assert.assertEquals("120", Multifactorial.calcMultiFact(5, 1));
		Assert.assertEquals("199999997900000001", Multifactorial.calcMultiFact(1999999999, 1900000000));
		Assert.assertEquals("191898783962510625", Multifactorial.calcMultiFact(31, 2));
		Assert.assertEquals("36288000000000000", Multifactorial.calcMultiFact(100, 10));
		Assert.assertEquals("1307674368000", Multifactorial.calcMultiFact(15, 1));
		Assert.assertEquals("10", Multifactorial.calcMultiFact(10, 10));
		Assert.assertEquals("6144", Multifactorial.calcMultiFact(16, 4));
		Assert.assertEquals("14", Multifactorial.calcMultiFact(14, 14));
		Assert.assertEquals("100", Multifactorial.calcMultiFact(100, 100));
		Assert.assertEquals("2", Multifactorial.calcMultiFact(2, 1));
		Assert.assertEquals("162", Multifactorial.calcMultiFact(9, 3));
		Assert.assertEquals("40320", Multifactorial.calcMultiFact(8, 1));
		Assert.assertEquals("18", Multifactorial.calcMultiFact(6, 3));
		Assert.assertEquals("3628800", Multifactorial.calcMultiFact(10, 1));
	}
}
