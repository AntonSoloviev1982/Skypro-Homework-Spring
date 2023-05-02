package pro.sky.skyprohomeworkspring.service;

import org.springframework.stereotype.Service;
import pro.sky.skyprohomeworkspring.model.Cart;

import java.util.List;

@Service
public class CartServiceImpl implements CartService{

    private final OrderService orderService;

    public CartServiceImpl(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public void add(List<Integer> listId) {
        for (Integer id : listId) {
            Cart cart = new Cart(id);
            orderService.getOrder().add(cart);
        }
    }

    @Override
    public List<Cart> get() {
        return orderService.getOrder();
    }
}
