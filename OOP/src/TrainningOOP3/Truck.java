/**
 * 
 */
package TrainningOOP3;

/**
 * @author admin
 *
 */
public class Truck extends Car {
        private int weight;

        public Truck() {
                super();
                // TODO Auto-generated constructor stub
        }

        public Truck(int speech, double regularPrice, String color, int weight) {
                super(speech, regularPrice, color);
                // TODO Auto-generated constructor stub
                this.weight = weight;
        }

        @Override
        protected double getSalePrice() {
                // TODO Auto-generated method stub
                if (weight > 2000) {
                        regularPrice = regularPrice * 90 / 100;
                        System.out.println("Giá của xe sau khi sale là: " + regularPrice);
                }
                return regularPrice;
        }

        @Override
        public String toString() {
                return "Truck [weight=" + weight + ", speech=" + speech + ", regularPrice=" + regularPrice + ", color="
                                + color + "]";
        }

}
