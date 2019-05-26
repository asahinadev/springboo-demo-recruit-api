package com.example.spring.hotpepper.api.sub;

import static java.util.Collections.emptyList;

import java.util.List;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter(value = AccessLevel.PROTECTED)
public class Parameter {

	public List<String> c1;
	public List<String> c2;
	public List<String> c3;
	public List<String> c4;
	public List<String> c5;
	public String k;
	public String key;
	public Object value;

	public Parameter(int i, List<String> c1) {
		this();
		switch (i) {
		case 1:
			setC1(c1);
			break;

		case 2:
			setC2(c1);
			break;

		case 3:
			setC3(c1);
			break;

		case 4:
			setC4(c1);
			break;

		case 5:
			setC5(c1);
			break;

		default:
			throw new IllegalArgumentException("index");
		}
	}

	public Parameter(List<String> c1, List<String> c2, List<String> c3, List<String> c4, List<String> c5, String k1) {
		this.setC1(c1);
		this.setC2(c2);
		this.setC3(c3);
		this.setC4(c4);
		this.setC5(c5);
		this.setK(k1);
	}

	public Parameter(List<String> c1, List<String> c2, List<String> c3, List<String> c4, List<String> c5) {
		this(c1, c2, c3, c4, c5, "");
	}

	public Parameter(List<String> c1, List<String> c2, List<String> c3, List<String> c4, String k1) {
		this(c1, c2, c3, c4, emptyList(), k1);
	}

	public Parameter(List<String> c1, List<String> c2, List<String> c3, List<String> c4) {
		this(c1, c2, c3, c4, "");
	}

	public Parameter(List<String> c1, List<String> c2, List<String> c3, String k1) {
		this(c1, c2, c3, emptyList(), k1);
	}

	public Parameter(List<String> c1, List<String> c2, List<String> c3) {
		this(c1, c2, c3, "");
	}

	public Parameter(List<String> c1, List<String> c2, String k1) {
		this(c1, c2, emptyList(), k1);
	}

	public Parameter(List<String> c1, List<String> c2) {
		this(c1, c2, emptyList());
	}

	public Parameter(List<String> c1, String k1) {
		this(c1, emptyList(), k1);
	}

	public Parameter(List<String> c1) {
		this(c1, emptyList());
	}

	public Parameter(String k1) {
		this(emptyList(), k1);
	}

	public Parameter() {
		this("");
	}

	public Parameter(String key, Object value) {
		this(key, value, "");
	}

	public Parameter(String key, Object value, String keyword) {
		this(keyword);
		this.key = key;
		this.value = value;
	}
}
