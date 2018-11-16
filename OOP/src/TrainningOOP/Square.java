/**
 * 
 */
package TrainningOOP;

/**
 * @author admin
 *
 */
public class Square extends Rectangle {

        /**
         * @param a
         * @param b
         */
        public Square(double a, double b) {
                super(a, b);
                // TODO Auto-generated constructor stub
        }

        @Override
        public void dienTich() {
                System.out.println("Dien tich HV la: " + a * a);
        }

        @Override
        public void chuVi() {
                System.out.println("Chu vi HV la: " + a * 4);
        }
}
