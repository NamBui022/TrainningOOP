/**
 * 
 */
package TrainningOOP3;

/**
 * @author admin
 *
 */
public class Main {
        public static void main(String[] args) {
                Ford ford = new Ford(2000, 10000, "Red", 1000);
                ford.getSalePrice();
                System.out.println(ford.toString());;
                
                System.out.println("====================");
                
                Truck truck = new Truck(1500, 7000, "Yellow", 1500);
                truck.getSalePrice();
                System.out.println(truck.toString());;
                
                System.out.println("====================");
                
                Sedan sedan = new Sedan(2500, 12000, "Blue", 3000);
                sedan.getSalePrice();
                System.out.println(sedan.toString());;
        }

}
