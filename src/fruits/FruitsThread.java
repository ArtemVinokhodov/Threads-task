package fruits;

import vegetables.VegetablesThread;

public class FruitsThread extends Thread {
    final VegetablesThread vegetablesThread;

    public FruitsThread(VegetablesThread vegetablesThread) {
        this.vegetablesThread = vegetablesThread;
    }

    public void run() {
        String[] fruits = {"Apple", "Orange", "Banana"};
        try {
            vegetablesThread.join();
            for (String fruit : fruits) {
                System.out.println(fruit);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

