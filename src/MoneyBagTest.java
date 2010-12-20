import junit.framework.TestCase;


public class MoneyBagTest extends TestCase {
	IMoneyBag moneyBag;
	
	protected void setUp() throws Exception {
		moneyBag = new MoneyBag();
	}

	protected void tearDown() throws Exception {
	}

	public void testShouru() {
		moneyBag.shouru("shouru:123");
	}

	public void testXiaofei() {
		fail("Not yet implemented"); // TODO
	}

}
