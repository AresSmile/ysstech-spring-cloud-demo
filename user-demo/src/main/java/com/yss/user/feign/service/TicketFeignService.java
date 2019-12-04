package com.yss.user.feign.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.yss.commons.demo.entity.Ticket;
import com.yss.commons.web.util.JsonResult;



@FeignClient(name="ticket-service",fallback = TicketFeignServiceFB.class)
public interface TicketFeignService {
	
	@GetMapping("/{ticketId}")
	JsonResult<List<Ticket>> getTicket(@PathVariable Integer ticketId);


}
