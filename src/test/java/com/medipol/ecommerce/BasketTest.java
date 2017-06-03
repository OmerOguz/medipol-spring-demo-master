package com.medipol.ecommerce;

import com.medipol.ecommerce.model.Basket;
import com.medipol.ecommerce.model.BasketItem;
import com.medipol.ecommerce.model.Product;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BasketTest {

    @Test
    public void shouldAddProductWithOneQuantity() throws Exception {

        final Basket basket = new Basket();
        final Product product = new Product(1, "nike air", 200);

        basket.addItem(new BasketItem(1, product));

        assertTrue(basket.getItems().size() == 1);
        assertTrue(basket.getItems().get(0).getProduct().equals(product));

    }

    @Test
    public void shouldAddProductWithTwoQuantity() throws Exception {
        final Basket basket = new Basket();
        final Product product = new Product(1, "nike air", 200);

        basket.addItem(new BasketItem(2, product));

        assertTrue(basket.getItems().size() == 1);
        assertTrue(basket.getItems().get(0).getProduct().equals(product));



        //TODO

    }

    @Test
    public void shouldAddTwoDifferentProduct() throws Exception {
      //TODO
        final Product product = new Product(1, "nike air", 200);
        final Product products = new Product(2, "nike eair", 210);
    }

    @Test
    public void shouldCalculateBasketPriceWithOneProductOneQuantity() throws Exception {

        //TODO

        final Product product = new Product(1, "jhk", 5);
        final BasketItem basketItem = new BasketItem(1, product);

        //action
        final Integer result = basketItem.price();

    }

    @Test
    public void shouldCalculateBasketPriceWithOneProductTwoQuantity() throws Exception {

        //TODO
        final Product product = new Product(1, "jhk", 5);
        final BasketItem basketItem = new BasketItem(2, product);

        //action
        final Integer result = basketItem.price();


    }

    @Test
    public void shouldCalculateBasketPriceWithMultipleProduct() throws Exception {
        final Product product = new Product(1, "jhk", 5);
        final Product products = new Product(2, "asd", 3);
        final BasketItem basketItem = new BasketItem(1, product);
        final BasketItem basketItem2 = new BasketItem(1, products);
        final Integer result1 = basketItem.price();
        final Integer result2 = basketItem2.price();
        
        //TODO
    }

    @Test
    public void shouldUpdateBasketItemQuantity() throws Exception {
        //TODO
    }

}