package singleton;

import singleton.ClassLoadSingleton;
import singleton.Singleton;
import singleton.SynchronizedBlockSingleton;
import singleton.SynchronizedMethodSingleton;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        getMultipleTimesInstancesOfSingletonAndPrintResult(100);
        getMultipleTimesInstancesOfSingletonAndPrintResult(10000);
        getMultipleTimesInstancesOfSynchronizedBlockSingletonAndPrintResult(10000);
        getMultipleTimesInstancesOfSynchronizedMethodSingletonAndPrintResult(10000);
        getMultipleTimesInstancesOfClassLoadSingletonAndPrintResult(10000);

	}

	private static void getMultipleTimesInstancesOfSynchronizedBlockSingletonAndPrintResult(int times) throws InterruptedException {
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

	private static void getMultipleTimesInstancesOfSingletonAndPrintResult(int times) throws InterruptedException {
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

	private static void getMultipleTimesInstancesOfSynchronizedMethodSingletonAndPrintResult(int times) throws InterruptedException {
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

    private static void getMultipleTimesInstancesOfClassLoadSingletonAndPrintResult(int times) throws InterruptedException {
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

}
