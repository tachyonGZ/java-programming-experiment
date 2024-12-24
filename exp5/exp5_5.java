public class TortoiseHareRace {
    public static void main(String[] args) {
        Race race = new Race();
        Thread tortoise = new Thread(new Tortoise(race));
        Thread hare = new Thread(new Hare(race));
		Thread race_t = new Thread(race);
        tortoise.start();
        hare.start();
		race_t.start();
    }
}

class Race implements Runnable{
    private int tortoisePosition = 0;
    private int harePosition = 0;

    public synchronized void updatePositions(int tortoiseMove, int hareMove) {
        tortoisePosition += tortoiseMove;
        harePosition += hareMove;
    }

	@Override
    public void run() {
		while (true) {
			System.out.println("乌龟位置: " + tortoisePosition + "m, 兔子位置: " + harePosition + "m");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
    }
}

class Tortoise implements Runnable {
    private final Race race;

    public Tortoise(Race race) {
        this.race = race;
    }

    @Override
    public void run() {
		while (true) {
			race.updatePositions(1, 0);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
    }
}

class Hare implements Runnable {
    private final Race race;

    public Hare(Race race) {
        this.race = race;
    }

    @Override
    public void run() {
		while (true) {
			race.updatePositions(0, 3);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
    }
}