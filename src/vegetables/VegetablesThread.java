package vegetables;
import middle.MainObject;


public class VegetablesThread extends Thread {
    MainObject mainObject;

    public VegetablesThread(MainObject mainObject) {
        this.mainObject = mainObject;
    }

    public void run() {
        synchronized (mainObject) {
            String[] vegetables = {"Potato", "Carrot", "Cucumber"};
            for (String vegetable : vegetables) {
                System.out.println(vegetable);
            }
            mainObject.notify();
        }

    }
}


