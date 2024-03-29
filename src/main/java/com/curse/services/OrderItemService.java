package com.curse.services;


import java.util.List;

import com.curse.domain.OrderItem;
import com.curse.repositories.OrderItemRepository;
import com.curse.services.exceptions.ObjectNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderItemService {
	
	@Autowired
	private OrderItemRepository orderItemRepository;
	
	public OrderItem findbyId(Integer id) {
		OrderItem order = orderItemRepository.findById(id).orElse(null);

		if (order == null) {
			throw new ObjectNotFoundException("Item do Pedido não encontrado!");
		}

		return order;
	}
	
	public List<OrderItem> findAll() {
		return this.orderItemRepository.findAll();
	}
}
