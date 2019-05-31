package com.example.spring.common.dataTables;

import lombok.Data;

@Data
public class DataTableOption {

	String ajaxUrl;

	String dataSrc;

	String subArea;

	String code;

	String codeName;

	boolean lengthChange = true;

	boolean paging = true;

	boolean ordering = true;

	boolean searching = true;

	boolean info = true;

}
