import fruits.FruitsThread;
import middle.MainObject;
import vegetables.VegetablesThread;


public class Main {
    public static void main(String[] args) {
        MainObject mainObject = new MainObject();
        VegetablesThread vegetablesThread = new VegetablesThread(mainObject);
        FruitsThread fruitsThread = new FruitsThread(mainObject);

        fruitsThread.start();
        vegetablesThread.start();
    }
}