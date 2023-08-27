package com.example.spring_core_advanced2.app.v1.service;

import com.example.spring_core_advanced2.app.v1.repository.OrderRepositoryV1;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceV1 {

    private final OrderRepositoryV1 orderRepository;

    public void orderItem(String itemId) {
        orderRepository.save(itemId);
    }
}
