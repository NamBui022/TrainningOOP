/**
 * 
 */
package TrainningOOP1;

/**
 * @author admin
 *
 */
public class Buffalo extends Animals {
        private int soChan;

        private String thucAn;
       
        public Buffalo() {
                super();
        }

        public Buffalo(int soChan, String thucAn) {
                super();
                this.soChan = soChan;
                this.thucAn = thucAn;
        }

        public int getSoChan() {
                return soChan;
        }

        public void setSoChan(int soChan) {
                this.soChan = soChan;
        }

        public String getThucAn() {
                return thucAn;
        }

        public void setThucAn(String thucAn) {
                this.thucAn = thucAn;
        }

        @Override
        public void run() {
                System.out.println("Con bò chạy bằng: " + soChan + "chân" + " " + "Ăn" + thucAn);
        }

        @Override
        public void produce() {
                System.out.println("Con bò đẻ con");
        }

        public void show() {
                System.out.println("Con bò có 4 chân và biết đẻ con"); 
        }

}
