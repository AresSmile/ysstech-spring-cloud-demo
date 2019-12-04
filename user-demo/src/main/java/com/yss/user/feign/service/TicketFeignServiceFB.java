package com.yss.user.feign.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.yss.commons.demo.entity.Ticket;
import com.yss.commons.web.util.JsonResult;


@Component
public class TicketFeignServiceFB implements TicketFeignService {


	@Override
	public JsonResult<List<Ticket>> getTicket(Integer ticketId) {
		return JsonResult.err("无法获取票信息");
	}


}
