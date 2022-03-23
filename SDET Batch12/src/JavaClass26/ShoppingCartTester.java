package JavaClass26;

public class ShoppingCartTester {
    public static void main(String[] args) {
        ShopingCart shopingCart=new ShopingCart();
        /*shopingCart.originalPrice=100;
        shopingCart.discount=.20;*/
        //shopingCart.setDiscount(.20);
        System.out.println(shopingCart.getDiscount());
        shopingCart.calculatePrice();

    }
}
