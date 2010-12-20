
public class MoneyBag implements IMoneyBag {

	private IMoneyBagDAO moneyBagDAO;
	
	public void shouru(String msg) {
		MoneyBagDTO moneyBagDTO = new MoneyBagDTO();
		String[] params = msg.split(":");
		moneyBagDTO.setInout(params[0]);
		moneyBagDTO.setMoney(Float.valueOf(params[1]));
		getMoneyBagDAO().addMoneyBag(moneyBagDTO);
	}

	public void xiaofei(String msg) {
		// TODO Auto-generated method stub

	}

	public IMoneyBagDAO getMoneyBagDAO() {
		return moneyBagDAO;
	}

	/**
	 * @param moneyBagDAO 设置 moneyBagDAO
	 */
	public void setMoneyBagDAO(IMoneyBagDAO moneyBagDAO) {
		this.moneyBagDAO = moneyBagDAO;
	}

}
