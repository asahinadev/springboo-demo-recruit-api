package com.example.spring.util;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EnumUtil {

	public static <E extends Enum<E>> E fromValue(E[] values, Predicate<E> predicate, E defaultValue) {

		return Arrays.stream(values).filter(predicate).findFirst().orElse(defaultValue);
	}

	public static <E extends Enum<E>> List<E> values(E[] values, String startsWith) {

		return Arrays.stream(values).filter(i -> i.name().startsWith(startsWith)).collect(Collectors.toList());
	}

}
