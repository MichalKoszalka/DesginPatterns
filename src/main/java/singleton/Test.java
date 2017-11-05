package singleton;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		getMultipleTimesInDifferentThreadsInstancesOfSingletonAndPrintResult(1000);
		getMultipleTimesInDifferentThreadsInstancesOfSynchronizedBlockSingletonAndPrintResult(1000);
		getMultipleTimesInstancesInDifferentThreadsOfClassLoadSingletonAndPrintResult(1000);
		getMultipleTimesInstancesInDifferentThreadsOfSynchronizedMethodSingletonAndPrintResult(1000);
		System.out.println("");
		System.out.println("");
		getMultipleTimesInstancesOfClassLoadSingletonAndPrintResult(1000);
		getMultipleTimesInstancesOfSingletonAndPrintResult(1000);
		getMultipleTimesInstancesOfSynchronizedBlockSingletonAndPrintResult(1000);
		getMultipleTimesInstancesOfSynchronizedMethodSingletonAndPrintResult(1000);

	}

	private static void getMultipleTimesInDifferentThreadsInstancesOfSynchronizedBlockSingletonAndPrintResult(int times) throws InterruptedException {
		Set<SynchronizedBlockSingleton> instances = Collections.newSetFromMap(new ConcurrentHashMap<>());
        ExecutorService executorService = Executors.newCachedThreadPool();
        long start = System.currentTimeMillis();
        for(int i = 0;i<times;i++) {
            executorService.execute( () -> {
                SynchronizedBlockSingleton instance = SynchronizedBlockSingleton.getInstance();
                instances.add(instance);
            });
        }
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.MINUTES);
        long end = System.currentTimeMillis();

		System.out.println("getting " + times + " times instance of " + SynchronizedBlockSingleton.class + ": " + instances + " in " + (end - start) + " milliseconds");
	}

	private static void getMultipleTimesInDifferentThreadsInstancesOfSingletonAndPrintResult(int times) throws InterruptedException {
        Set<Singleton> instances = Collections.newSetFromMap(new ConcurrentHashMap<>());
        ExecutorService executorService = Executors.newCachedThreadPool();
        long start = System.currentTimeMillis();
        for(int i = 0;i<times;i++) {
            executorService.execute( () -> {
                Singleton instance = Singleton.getInstance();
                instances.add(instance);
            });
        }
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.MINUTES);
        long end = System.currentTimeMillis();

		System.out.println("getting " + times + " times instance of " + Singleton.class + ": " + instances + " in " + (end - start) + " milliseconds");
	}

	private static void getMultipleTimesInstancesInDifferentThreadsOfSynchronizedMethodSingletonAndPrintResult(int times) throws InterruptedException {
        Set<SynchronizedMethodSingleton> instances = Collections.newSetFromMap(new ConcurrentHashMap<>());
        ExecutorService executorService = Executors.newCachedThreadPool();
        long start = System.currentTimeMillis();
		for(int i = 0;i<times;i++) {
            executorService.execute( () -> {
                SynchronizedMethodSingleton instance = SynchronizedMethodSingleton.getInstance();
                instances.add(instance);
            });
        }
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.MINUTES);
        long end = System.currentTimeMillis();

		System.out.println("getting " + times + " times instance of " + SynchronizedMethodSingleton.class + ": " + instances + " in " + (end - start) + " milliseconds");
	}

    private static void getMultipleTimesInstancesInDifferentThreadsOfClassLoadSingletonAndPrintResult(int times) throws InterruptedException {
        Set<ClassLoadSingleton> instances = Collections.newSetFromMap(new ConcurrentHashMap<>());
        ExecutorService executorService = Executors.newCachedThreadPool();
        long start = System.currentTimeMillis();
        for(int i = 0;i<times;i++) {
           executorService.execute( () -> {
               ClassLoadSingleton instance = ClassLoadSingleton.getInstance();
                instances.add(instance);
            });
        }
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.MINUTES);
        long end = System.currentTimeMillis();

        System.out.println("getting " + times + " times instance of " + ClassLoadSingleton.class + ": " + instances + " in " + (end - start) + " milliseconds");
    }

	private static void getMultipleTimesInstancesOfSynchronizedBlockSingletonAndPrintResult(int times) throws InterruptedException {
		long start = System.currentTimeMillis();
		for(int i = 0;i<times;i++) {
				SynchronizedBlockSingleton instance = SynchronizedBlockSingleton.getInstance();
		}
		long end = System.currentTimeMillis();

		System.out.println("getting " + times + " times instance of " + SynchronizedBlockSingleton.class  + " in " + (end - start) + " milliseconds");
	}

	private static void getMultipleTimesInstancesOfSingletonAndPrintResult(int times) throws InterruptedException {
		long start = System.currentTimeMillis();
		for(int i = 0;i<times;i++) {
				Singleton instance = Singleton.getInstance();
		}
		long end = System.currentTimeMillis();

		System.out.println("getting " + times + " times instance of " + Singleton.class + " in " + (end - start) + " milliseconds");
	}

	private static void getMultipleTimesInstancesOfSynchronizedMethodSingletonAndPrintResult(int times) throws InterruptedException {
		long start = System.currentTimeMillis();
		for(int i = 0;i<times;i++) {
				SynchronizedMethodSingleton instance = SynchronizedMethodSingleton.getInstance();
		}
		long end = System.currentTimeMillis();

		System.out.println("getting " + times + " times instance of " + SynchronizedMethodSingleton.class + " in " + (end - start) + " milliseconds");
	}

	private static void getMultipleTimesInstancesOfClassLoadSingletonAndPrintResult(int times) throws InterruptedException {
		long start = System.currentTimeMillis();
		for(int i = 0;i<times;i++) {
				ClassLoadSingleton instance = ClassLoadSingleton.getInstance();
		}
		long end = System.currentTimeMillis();

		System.out.println("getting " + times + " times instance of " + ClassLoadSingleton.class + " in " + (end - start) + " milliseconds");
	}


}
