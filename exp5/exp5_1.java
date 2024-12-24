public class Main {
	public static void main(String[] args) {
		DownloadThread downloa_thread = new DownloadThread();
		MusicThread music_thread = new MusicThread();

		downloa_thread.start();
		music_thread.start();
	}
}

public class DownloadThread extends Thread {
	@Override
	public void run() {
		while (true) {
			System.out.println("下载");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class MusicThread extends Thread {
	@Override
	public void run() {
		while (true) {
			System.out.println("听歌");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}