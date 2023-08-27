package com.example.spring_core_advanced2.app.v2.service;

import com.example.spring_core_advanced2.app.v2.repository.OrderRepositoryV2;
import com.example.spring_core_advanced2.trace.TraceId;
import com.example.spring_core_advanced2.trace.TraceStatus;
import com.example.spring_core_advanced2.trace.hellotrace.HelloTraceV2;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceV2 {

    private final OrderRepositoryV2 orderRepository;
    private final HelloTraceV2 trace;

    public void orderItem(TraceId traceId, String itemId) {
        TraceStatus status = null;

        try {
            status = trace.beginSync(traceId, "OrderService.orderItem()");
            orderRepository.save(status.getTraceId(), itemId);
            trace.end(status);

        } catch (Exception e) {
            trace.exception(status, e);
            throw e;
        }

    }
}
