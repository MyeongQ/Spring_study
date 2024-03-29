package com.example.spring_core_advanced2.app.v1.service;

import com.example.spring_core_advanced2.app.v1.repository.OrderRepositoryV1;
import com.example.spring_core_advanced2.trace.TraceStatus;
import com.example.spring_core_advanced2.trace.hellotrace.HelloTraceV1;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceV1 {

    private final OrderRepositoryV1 orderRepository;
    private final HelloTraceV1 trace;

    public void orderItem(String itemId) {
        TraceStatus status = null;

        try {
            status = trace.begin("OrderService.orderItem()");
            orderRepository.save(itemId);
            trace.end(status);

        } catch (Exception e) {
            trace.exception(status, e);
            throw e;
        }

    }
}
