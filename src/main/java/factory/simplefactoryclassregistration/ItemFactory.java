package factory.simplefactoryclassregistration;

import java.util.HashMap;
import java.util.Map;

public class ItemFactory {

	private Map<String, Class> registeredItems = new HashMap();

	public void registerItem(String id, Class itemClass) {
		registeredItems.put(id, itemClass);
	}

}
