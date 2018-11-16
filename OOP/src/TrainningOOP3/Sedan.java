/**
 * 
 */
package TrainningOOP3;

/**
 * @author admin
 *
 */
public class Sedan extends Car {

        private int length;

        /**
         * 
         */
        public Sedan() {
                super();
                // TODO Auto-generated constructor stub
        }

        /**
         * @param speech
         * @param regularPrice
         * @param color
         */
        public Sedan(int speech, double regularPrice, String color, int length) {
                super(speech, regularPrice, color);
                // TODO Auto-generated constructor stub
                this.length = length;
        }

        @Override
        protected double getSalePrice() {
                // TODO Auto-generated method stub
                if (length > 20) {
                        regularPrice = regularPrice*95/100;
                        System.out.println("Giá sau khi sale là: " + regularPrice);
                }else {
                        regularPrice = regularPrice*90/100;
                        System.out.println("Giá sau khi sale là:" + regularPrice);
                }
                return regularPrice;
        }

        @Override
        public String toString() {
                return "Sedan [length=" + length + ", speech=" + speech + ", regularPrice=" + regularPrice + ", color="
                                + color + "]";
        }
        
        

}
