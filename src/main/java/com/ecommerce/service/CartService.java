package com.ecommerce.service;

import java.util.List;

import com.ecommerce.modal.Cart;

public interface CartService {
	
	Cart addCartToUser(Cart cart, long idUser);
	
	void deleteCart(long id);
	
	Cart findCartForUser(long idUser);
	
	Cart findCartById(long id);
	
	void removeFromCart(long idCart, long idUser);
	
	Cart findByCartName(String name);

}
