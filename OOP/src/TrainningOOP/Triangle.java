/**
 * 
 */
package TrainningOOP;

/**
 * @author admin
 *
 */
public class Triangle extends Shape {
        /**
        * 
        */
        private double a;
        /**
         * create variable a
         */
        private double b;
        /**
         * create variable b
         */
        /**
         * create variable c
         */
        private double c;

        // Constructor
        public Triangle() {

        }

        public Triangle(double a, double b, double c) {
                super();
                this.a = a;
                this.b = b;
                this.c = c;
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

        public double getC() {
                return c;
        }

        public void setC(double c) {
                this.c = c;
        }

        @Override
        public void dienTich() {
                // Cong thuc tinh dien tich tam giac
                double temp = (a + b + c) / 2;
                double temp2 = temp * (temp - a) * (temp - b) * (temp - c);
                double dienTich = Math.sqrt(temp2);
                System.out.println("Dien tich hinh tam giac la: " + dienTich);
        }

        @Override
        public void chuVi() {
                // tinh chu vi tam giac
                double chuVi = a + b + c;
                System.out.println("Chu vi hinh tam giac la: " + chuVi);
        }

        @Override
        public String toString() {
                return "Triangle [a=" + a + ", b=" + b + ", c=" + c + "]";
        }

}
