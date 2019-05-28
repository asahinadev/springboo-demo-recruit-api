package com.example.spring.webapi.hotpepper.v1.request;

import com.example.spring.common.RequestType;

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
public class LargeServiceAreaRequest extends RequestType {

}
