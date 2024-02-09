import fruits.FruitsThread;
import vegetables.VegetablesThread;

public class Main {
    public static void main(String[] args) {

        VegetablesThread vegetablesThread = new VegetablesThread();
        FruitsThread fruitsThread = new FruitsThread(vegetablesThread);

        fruitsThread.start();
        vegetablesThread.start();
    }
}