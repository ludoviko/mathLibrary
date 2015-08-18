package com.lam.mathematics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Histogram {

	public static Map<Long, Long> findHistogram(long[] array) {
		List<Long> list = new ArrayList<Long>(); 
		
		for (int i = 0; i < array.length; i++) {
			list.add(array[i]);
		}
		return findHistogram(list);
	}

	public static Map<Long, Long> findHistogram(List<Long> list) {
		Map<Long, Long> map = new HashMap<Long, Long>();
		long value = 0;

		for (int i = 0; i < list.size(); i++) {
			if (map.containsKey(list.get(i))) {
				value = map.get(list.get(i));
				map.put(list.get(i), ++value);
			} else {
				map.put(list.get(i), 1L);
			}
		}
		return map;
	}
	
	public static Entry<Long, Long> findModa(Map<Long, Long> map) {
		long max = 0;
		Set<Entry<Long, Long>> set = map.entrySet();
		Iterator<Entry<Long, Long>> itera = set.iterator();
		Long value;
		Entry<Long, Long> entry;
		Entry<Long, Long> entryMax = null;

		while (itera.hasNext()) {
			entry = itera.next();
			value = entry.getValue();
			if (value >= max) {
				max = value;
				entryMax = entry;
			}
		}
		return entryMax;
	}
}
