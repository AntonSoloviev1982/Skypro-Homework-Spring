package pro.sky.skyprohomeworkspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyprohomeworkspring.model.Cart;
import pro.sky.skyprohomeworkspring.service.CartService;


import java.util.List;

@RestController
@RequestMapping("/order")

public class CartController {

    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/add")
    public void add(@RequestParam("id") List<Integer> listId) {
        cartService.add(listId);
    }

    @GetMapping("/get")
    public List<Cart> get() {
        List<Cart> order = cartService.get();
        return order;
    }
}
