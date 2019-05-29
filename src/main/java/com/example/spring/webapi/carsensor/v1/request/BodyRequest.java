package com.example.spring.webapi.carsensor.v1.request;

import com.example.spring.common.rest.RequestType;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder(builderMethodName = "of")
@NoArgsConstructor
//@AllArgsConstructor
@SuppressWarnings("serial")
public class BodyRequest extends RequestType {

}
