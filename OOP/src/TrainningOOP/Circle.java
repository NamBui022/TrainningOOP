/**
 * 
 */
package TrainningOOP;

/**
 * @author admin
 *
 */

public class Circle extends Shape {
        /**
         * define const variable PI
         */
        private final float PI = 3.14f;
        /**
         * create variable banKinh
         */
        private double banKinh;

        public Circle() {

        }

        // Constructor
        public Circle(double banKinh) {
                super();
                this.banKinh = banKinh;
        }

        public double getBanKinh() {
                return banKinh;
        }

        public void setBanKinh(double banKinh) {
                this.banKinh = banKinh;
        }

        @Override
        public void dienTich() {
                double dienTich = Math.pow(banKinh, banKinh) * PI;
                System.out.println("Dien tich hinh tron la: " + dienTich);
        }

        @Override
        public void chuVi() {
                double chuVi = 2 * banKinh * PI;
                System.out.println("Chu vi hinh tron la: " + chuVi);
        }

        @Override
        public String toString() {
                return "Circle [banKinh=" + banKinh + "]";
        }

}
