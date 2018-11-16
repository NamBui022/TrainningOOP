/**
 * 
 */
package TrainningOOP3;

/**
 * @author admin
 *
 */
public abstract class Car {
        protected int speech;
        protected double regularPrice;
        protected String color;

        public Car() {
                super();
        }

        public Car(int speech, double regularPrice, String color) {
                super();
                this.speech = speech;
                this.regularPrice = regularPrice;
                this.color = color;
        }

        protected abstract double getSalePrice();

        public int getSpeech() {
                return speech;
        }

        public void setSpeech(int speech) {
                this.speech = speech;
        }

        public double getRegularPrice() {
                return regularPrice;
        }

        public void setRegularPrice(double regularPrice) {
                this.regularPrice = regularPrice;
        }

        public String getColor() {
                return color;
        }

        public void setColor(String color) {
                this.color = color;
        }

        @Override
        public String toString() {
                return "Car [speech=" + speech + ", regularPrice=" + regularPrice + ", color=" + color + "]";
        }

}
