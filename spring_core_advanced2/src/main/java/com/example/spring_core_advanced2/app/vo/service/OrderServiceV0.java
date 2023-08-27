package com.example.spring_core_advanced2.app.vo.service;

import com.example.spring_core_advanced2.app.vo.repository.OrderRepositoryV0;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceV0 {

    private final OrderRepositoryV0 orderRepositoryV0;

    public void orderItem(String itemId) {
        orderRepositoryV0.save(itemId);
    }
}
