package com.glovoapp.backender.repository;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.glovoapp.backender.model.Order;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/**
 * Created by Sridharan Murugadass on 2018-09-26
 */

@Component
public class OrderRepository {
	private static final String ORDERS_FILE = "/orders.json";
	private static final List<Order> orders;

	static {
		try (Reader reader = new InputStreamReader(OrderRepository.class.getResourceAsStream(ORDERS_FILE))) {
			Type type = new TypeToken<List<Order>>() {
			}.getType();
			orders = new Gson().fromJson(reader, type);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Order> findAll() {
		return new ArrayList<>(orders);
	}
}
