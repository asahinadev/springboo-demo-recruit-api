package com.example.spring.hotpepper.parts;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@SuppressWarnings("serial")
public class Error extends ParameterBase {

	Integer code;

	String message;
}
