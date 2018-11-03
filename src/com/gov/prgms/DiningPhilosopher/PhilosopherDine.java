package src.com.gov.prgms.DiningPhilosopher;

public class PhilosopherDine implements Runnable {

	Integer leftFork;
	Integer rightFork;

	public PhilosopherDine() {
	}

	public PhilosopherDine(Integer leftFork, Integer rightFork) {
		this.leftFork = leftFork;
		this.rightFork = rightFork;
	}

	@Override
	public void run() {

		try {
			while (true) {
				System.out.println(Thread.currentThread().getName() + " : Thinking..");
				Thread.sleep(2000);

				synchronized (leftFork) {
					System.out.println(Thread.currentThread().getName() + " : Picking LeftFork");
					Thread.sleep(2000);

					synchronized (rightFork) {
						System.out.println(Thread.currentThread().getName() + " : Picking RightFork");
						Thread.sleep(2000);

						System.out.println(Thread.currentThread().getName() + " : Eating..");
					}
				}
				System.out.println(Thread.currentThread().getName() + " : Finished");
				break;
			}
		} catch (Exception e) {
			System.out.println("Error..");
		}

	}

}
