public class Main {
	public static void main(String[] args) {
		TicketSeller ticketSeller = new TicketSeller();

		Thread window1 = new Thread(ticketSeller, "窗口1");
		Thread window2 = new Thread(ticketSeller, "窗口2");
		Thread window3 = new Thread(ticketSeller, "窗口3");

		window1.start();
		window2.start();
		window3.start();
	}
}

public class TicketSeller implements Runnable {
	private static int tickets = 100; // 总票数

	@Override
	public void run() {
		while (true) {
			sellTicket();
		}
	}

	private synchronized void sellTicket() {
		if (tickets > 0) {
			tickets--;
			System.out.println(Thread.currentThread().getName() + " 售出第 " + (100 - tickets) + " 张票");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			System.exit(0);
		}
	}
}