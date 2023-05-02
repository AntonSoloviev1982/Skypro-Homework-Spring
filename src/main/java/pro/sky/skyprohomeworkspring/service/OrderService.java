package pro.sky.skyprohomeworkspring.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.skyprohomeworkspring.model.Cart;

import java.util.List;

@Service
@SessionScope
public class OrderService {

    private final List<Cart> order;

    public OrderService(List<Cart> order) {
        this.order = order;
    }

    public List<Cart> getOrder() {
        return order;
    }
}
