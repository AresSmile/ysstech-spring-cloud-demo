package com.yss.commons.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
	private Integer id;
	private String startAddr;
	private String endAddr;
	private String type;
	private Long number;

}
