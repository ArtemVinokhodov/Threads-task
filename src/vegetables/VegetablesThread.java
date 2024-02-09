package vegetables;

import fruits.FruitsThread;

public class VegetablesThread extends Thread {
    FruitsThread fruitsThread;

    public void run() {
        synchronized (this) {
            String[] vegetables = {"Potato", "Carrot", "Cucumber"};
            for (String vegetable : vegetables) {
                System.out.println(vegetable);
            }
        }
       fruitsThread.notify();
    }
}


