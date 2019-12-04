package com.yss.commons.demo.service;

import java.util.List;

import com.yss.commons.demo.entity.Ticket;

public interface TicketService {
	
	List<Ticket> getTicket(Integer id);

}
