package src.com.gov.prgms.DiningPhilosopher;

import src.com.gov.prgms.DiningPhilosopher.PhilosopherDine;

public class DiningPhilosopher {

	public static void main(String[] args) {
		int totalPhilosophers = 5;
		for (int i = 0; i < 5; i++) {
			Integer leftFork = Integer.valueOf(i);
			Integer rightFork = Integer.valueOf((i + 1) % totalPhilosophers);
			PhilosopherDine philosopher = null;
			if (i < totalPhilosophers - 1) {
				philosopher = new PhilosopherDine(leftFork, rightFork);
			} else {
				philosopher = new PhilosopherDine(rightFork, leftFork);
			}
			Thread thread = new Thread(philosopher, "Philosopher " + (i + 1));
			thread.start();
		}

	}

}
