package fruits;

import vegetables.VegetablesThread;

public class FruitsThread extends Thread {
    VegetablesThread vegetablesThread;

    public FruitsThread(VegetablesThread vegetablesThread) {
        this.vegetablesThread = vegetablesThread;
    }

    public void run() {
        synchronized (vegetablesThread) {
            String[] fruits = {"Apple", "Orange", "Banana"};
            try {
                vegetablesThread.wait();
                for (String fruit : fruits) {
                    System.out.println(fruit);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
