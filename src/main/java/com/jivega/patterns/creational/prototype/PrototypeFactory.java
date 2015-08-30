package com.jivega.patterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {

	public static class ModelEmployee {
		public static final String MANAGER = "Manager";
		public static final String MARKETINGSTAFF = "MarketingStaff";
	}
	private static Map<String, PrototypeEmployee> prototypes = new HashMap<String, PrototypeEmployee>();
	static {
        prototypes.put(ModelEmployee.MANAGER, new Manager());
        prototypes.put(ModelEmployee.MARKETINGSTAFF, new MarketingStaff());
    }

    public static PrototypeEmployee getInstance(final String s) throws CloneNotSupportedException {
        return ((PrototypeEmployee) prototypes.get(s)).clone();
    }
	
}
