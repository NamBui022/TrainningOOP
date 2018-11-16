/**
 * 
 */
package TrainningOOP1;

/**
 * @author admin
 *
 */
public class Bird extends Animals {

        private int soChan;

        private String thucAn;

        
        public Bird() {
                super();
        }

        public Bird(int soChan, String thucAn) {
                // TODO Auto-generated constructor stub
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
                // TODO Auto-generated method stub
                System.out.println("Con chim chay bằng: " + soChan + "chân" + " "+ "Ăn" + thucAn);
        }

        @Override
        public void produce() {
                // TODO Auto-generated method stub
                System.out.println("Con chim đẻ trứng");

        }
        
        public void show() {
                System.out.println("Con chim có 2 chân và biết bay"); 
        }
        
        

}
