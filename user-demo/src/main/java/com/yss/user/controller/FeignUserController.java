package com.yss.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.yss.commons.demo.entity.Ticket;
import com.yss.commons.web.util.JsonResult;
import com.yss.user.feign.service.TicketFeignService;

import lombok.extern.slf4j.Slf4j;


@RestController
public class FeignUserController {
	
	@Autowired
	private TicketFeignService ticketService;
	
	
	//通过微服务调用ticket-service服务
		@GetMapping("/ticket-service/{ticketId}")
		public JsonResult<List<Ticket>> getTicket(@PathVariable Integer ticketId) {
			return ticketService.getTicket(ticketId);
			
		}

}
