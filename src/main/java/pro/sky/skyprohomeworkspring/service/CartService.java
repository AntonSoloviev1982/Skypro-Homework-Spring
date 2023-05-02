package pro.sky.skyprohomeworkspring.service;



import pro.sky.skyprohomeworkspring.model.Cart;

import java.util.List;

public interface CartService {

    public void add(List<Integer> listId);

    public List<Cart> get();
}
