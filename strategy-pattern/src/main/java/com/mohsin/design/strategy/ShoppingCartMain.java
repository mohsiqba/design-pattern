package com.mohsin.design.strategy;

import com.mohsin.design.strategy.contract.impl.CreditCardStrategy;
import com.mohsin.design.strategy.contract.impl.PaypalStrategy;
import com.mohsin.design.strategy.entity.Item;
import com.mohsin.design.strategy.service.ShoppingCart;

public class ShoppingCartMain {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("3456", 40);
        Item item2 = new Item("9876", 50);

        cart.addItem(item1);
        cart.addItem(item2);

        //pay by paypal
        cart.pay(new PaypalStrategy("myemail@mohsin.com", "mypwd"));

        //pay by credit card
        cart.pay(new CreditCardStrategy("Mohsin Iqbal", "1234567890987654", "786", "12/21"));
    }
}