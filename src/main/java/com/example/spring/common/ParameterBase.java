package com.example.spring.common;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

@SuppressWarnings("serial")
public abstract class ParameterBase implements Serializable {

	@Override
	public final String toString() {
		ReflectionToStringBuilder builder = new ReflectionToStringBuilder(this);
		builder.setExcludeNullValues(true);
		return builder.toString();
	}

	@Override
	public final boolean equals(Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj);
	}

	@Override
	public final int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

	public static boolean empty(List<String> list) {
		if (list == null) {
			return true;
		}
		return list.stream().filter(item -> StringUtils.isNotEmpty(item)).count() == 0L;
	}

}
