import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Singleton> instances = new HashSet<>();
		for(int i = 0;i<10000;i++) {
			Runnable runner = new Runnable() {
				
				@Override
				public void run() {
					instances.add(Singleton.getInstance());
					
				}
			};
			new Thread(runner, "TestThread"+i).start();

		}
		
		System.out.println(instances);
		
	}

}
