package com.example.spring.hotpepper.values;

import java.util.Arrays;
import java.util.function.Predicate;

class EnumUtil {

	public static <E extends Enum<E>> E fromValue(E[] values, Predicate<E> predicate, E defaultValue) {
		return Arrays.stream(values).filter(predicate).findFirst().orElse(defaultValue);
	}

}
