package com.example.spring.util;

import java.util.Arrays;
import java.util.function.Predicate;

public class EnumUtil {

	public static <E extends Enum<E>> E fromValue(E[] values, Predicate<E> predicate, E defaultValue) {

		return Arrays.stream(values).filter(predicate).findFirst().orElse(defaultValue);
	}

}
