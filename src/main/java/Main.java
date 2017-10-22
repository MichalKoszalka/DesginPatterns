import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getMultipleTimesInstancesOfSingletonAndPrintResult(100);
		getMultipleTimesInstancesOfSynchronizedBlockSingletonAndPrintResult(1000);
		getMultipleTimesInstancesOfSynchronizedMethodSingletonAndPrintResult(1000);

	}

	private static void getMultipleTimesInstancesOfSynchronizedBlockSingletonAndPrintResult(int times) {
		Set<SynchronizedBlockSingleton> instances = new HashSet<>();
		long start = System.currentTimeMillis();
		for(int i = 0;i<times;i++) {
			Runnable runner = () -> instances.add(SynchronizedBlockSingleton.getInstance());
			new Thread(runner, "TestThread"+i).start();
		}
		long end = System.currentTimeMillis();

		System.out.println("getting " + times + " times instance of " + SynchronizedBlockSingleton.class + ": " + instances + " in " + (end - start) + " milliseconds");
	}

	private static void getMultipleTimesInstancesOfSingletonAndPrintResult(int times) {
		Set<Singleton> instances = new HashSet<>();
		long start = System.currentTimeMillis();
		for(int i = 0;i<times;i++) {
			Runnable runner = () -> instances.add(Singleton.getInstance());
			new Thread(runner, "TestThread"+i).start();
		}
		long end = System.currentTimeMillis();

		System.out.println("getting " + times + " times instance of " + Singleton.class + ": " + instances + " in " + (end - start) + " milliseconds");
	}

	private static void getMultipleTimesInstancesOfSynchronizedMethodSingletonAndPrintResult(int times) {
		Set<SynchronizedMethodSingleton> instances = new HashSet<>();
		long start = System.currentTimeMillis();
		for(int i = 0;i<times;i++) {
			Runnable runner = () -> instances.add(SynchronizedMethodSingleton.getInstance());
			new Thread(runner, "TestThread"+i).start();
		}
		long end = System.currentTimeMillis();

		System.out.println("getting " + times + " times instance of " + SynchronizedMethodSingleton.class + ": " + instances + " in " + (end - start) + " milliseconds");
	}

}
