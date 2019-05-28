package com.example.spring.manabi.v2.request;

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
public class AreaRequest extends RequestType {

}