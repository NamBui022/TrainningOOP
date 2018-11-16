/**
 * 
 */
package TrainningOOP;

/**
 * @author admin
 *
 */
public class Rectangle extends Shape {
        /**
         * create variable a
         */
        protected double a;
        /**
         * create variable b
         */
        protected double b;

        // Constructor
        public Rectangle(double a, double b) {
                super();
                this.a = a;
                this.b = b;
        }

        public double getA() {
                return a;
        }

        public void setA(double a) {
                this.a = a;
        }

        public double getB() {
                return b;
        }

        public void setB(double b) {
                this.b = b;
        }

        @Override
        public void dienTich() {
                System.out.println("Dien tic HCN la:" + (a * b));
        }

        @Override
        public void chuVi() {
                System.out.println("Chu vi HCN la: " + (a + b) * 2);
        }

        @Override
        public String toString() {
                return "Rectangle [a=" + a + ", b=" + b + "]";
        }

}
