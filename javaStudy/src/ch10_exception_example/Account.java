package ch10_exception_example;

public class Account {
	private long balance; // 잔고

	public Account() {
	}

	public long getBalance() {
		return balance;
	}

	// 입금(money : 입금하는 돈)
	public void deposit(int money) {
		balance += money;
	}

	// 인출
	public void withdraw(int money) throws BalncedInsufficientException {
		if(balance < money) {	// 잔고 부족
			// 예외 발생
			throw new BalncedInsufficientException("잔고 부족:" + (money - balance));
		}
		// 잔고가 충분하면
		balance -= money;
	}
}
