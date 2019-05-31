package com.example.spring.controller.explorer;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.spring.common.dataTables.DataTableOption;

@Controller
@RequestMapping("/explorer/hotpepper")
public class Hotpepper {

	@GetMapping
	public String index() {

		return "hotpepper/index";
	}

	@GetMapping({
			"large-service-area/{code}",
			"large-service-area"
	})
	public String largeServiceArea(Model model, @PathVariable(required = false) String code) {

		model.addAttribute("title", "ホットペッパー | マスター | 大サービスエリア");
		model.addAttribute("title2", "大サービスエリア");
		model.addAttribute("title3", "ホットペッパー");
		model.addAttribute("active", "hotpepper");

		DataTableOption option = new DataTableOption();
		option.setAjaxUrl("/api/hotpepper/large-service-area");
		option.setDataSrc("large_service_area");
		option.setLengthChange(false);
		option.setPaging(false);
		option.setOrdering(false);
		option.setSearching(false);
		option.setInfo(false);
		// 下層の検索に付与はない
		// option.setSubArea("service-area");
		model.addAttribute("DataTableOption", option);

		if (StringUtils.isNotEmpty(code)) {
			model.addAttribute("message", "コードの指定は無視されました。");
		}

		return "hotpepper/master";
	}

	@GetMapping({
			"service-area/{code}",
			"service-area"
	})
	public String serviceArea(Model model, @PathVariable(required = false) String code) {

		model.addAttribute("title", "ホットペッパー | マスター | サービスエリア");
		model.addAttribute("title2", "サービスエリア");
		model.addAttribute("title3", "ホットペッパー");
		model.addAttribute("active", "hotpepper");

		DataTableOption option = new DataTableOption();
		option.setAjaxUrl("/api/hotpepper/service-area");
		option.setDataSrc("service_area");
		option.setLengthChange(false);
		option.setPaging(false);
		option.setOrdering(false);
		option.setSearching(false);
		option.setInfo(false);
		// 下層の検索に付与はない
		// option.setSubArea("lage-area");

		model.addAttribute("DataTableOption", option);

		if (StringUtils.isNotEmpty(code)) {
			model.addAttribute("message", "コードの指定は無視されました。");
		}

		return "hotpepper/master";
	}
}
