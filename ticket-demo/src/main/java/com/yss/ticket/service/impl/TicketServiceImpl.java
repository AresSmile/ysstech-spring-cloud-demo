package com.yss.ticket.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.yss.commons.demo.entity.Ticket;
import com.yss.commons.demo.service.TicketService;


@Component
public class TicketServiceImpl implements TicketService{

	@Override
	public List<Ticket> getTicket(Integer id) {
		//模拟数据库的数据
		ArrayList<Ticket> list = new ArrayList<Ticket>();
		list.add(new Ticket(1, "深圳", "北京","成人票",1L));
		list.add(new Ticket(1, "深圳", "北京","成人票",1L));
		list.add(new Ticket(1, "深圳", "北京","成人票",1L));
		list.add(new Ticket(1, "深圳", "北京","成人票",1L));
		list.add(new Ticket(1, "深圳", "北京","成人票",1L));
		list.add(new Ticket(1, "深圳", "北京","成人票",1L));
		return list;
	}

}
