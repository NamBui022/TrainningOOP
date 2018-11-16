/**
 * 
 */
package TrainningOOP1;

/**
 * @author admin
 *
 */
public class Main {
        public static void main(String[] args) {
                Bird bird = new Bird(2, "Thóc");
                bird.run();
                bird.produce();
                bird.show();

                Buffalo buffalo = new Buffalo(4, "Cỏ");
                buffalo.run();
                buffalo.produce();
                bird.show();
        }
}
