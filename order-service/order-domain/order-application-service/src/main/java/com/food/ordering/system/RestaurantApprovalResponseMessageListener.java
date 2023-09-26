package com.food.ordering.system;

import com.food.ordering.system.order.service.domain.dto.message.RestaurantApprovalResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Slf4j
@Validated
@Service
public class RestaurantApprovalResponseMessageListener implements com.food.ordering.system.ports.input.message.listener.restaurantapproval.RestaurantApprovalResponseMessageListener {
    @Override
    public void orderApproval(RestaurantApprovalResponse restaurantApprovalResponse) {

    }

    @Override
    public void orderRejected(RestaurantApprovalResponse restaurantApprovalResponse) {

    }
}
