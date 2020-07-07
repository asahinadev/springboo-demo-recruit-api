package com.example.spring.hotpepper.dto;

import java.util.List;

@SuppressWarnings("preview")
public record Special(String code, String name, List<SpecialCategory> special_category) {

}
