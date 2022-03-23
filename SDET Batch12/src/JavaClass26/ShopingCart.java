package JavaClass26;

public class ShopingCart {
    private double originalPrice;
          private double discount=.15;
          void setDiscount(double discount) {
              if(discount>0&&discount<=.15) {
                  this.discount=discount;
              } else {
                  System.out.println("Cant have that much discount");
              }
          }
public double getDiscount () {
              return discount;
}
            void calculatePrice () {
                double price=originalPrice-(originalPrice*discount);
                System.out.println(price);
            }
}
