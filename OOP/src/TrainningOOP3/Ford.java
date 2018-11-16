/**
 * 
 */
package TrainningOOP3;

/**
 * @author admin
 *
 */
public class Ford extends Car {

        private int manufacturerDiscount;

        public Ford() {
                super();
                // TODO Auto-generated constructor stub
        }

        public Ford(int speech, double regularPrice, String color, int manufacturerDiscount) {
                super(speech, regularPrice, color);
                // TODO Auto-generated constructor stub
                this.manufacturerDiscount = manufacturerDiscount;
        }

        @Override
        protected double getSalePrice() {
                // TODO Auto-generated method stub
                regularPrice = regularPrice - manufacturerDiscount;
                System.out.println(regularPrice);
                return regularPrice;
        }

        public int getManufacturerDiscount() {
                return manufacturerDiscount;
        }

        public void setManufacturerDiscount(int manufacturerDiscount) {
                this.manufacturerDiscount = manufacturerDiscount;
        }

        @Override
        public String toString() {
                return "Ford [manufacturerDiscount=" + manufacturerDiscount + ", speech=" + speech + ", regularPrice="
                                + regularPrice + ", color=" + color + "]";
        }

}
