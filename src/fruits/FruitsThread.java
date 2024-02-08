package fruits;
import middle.MainObject;

public class FruitsThread extends Thread {
    MainObject mainObject;

    public FruitsThread(MainObject mainObject) {
        this.mainObject = mainObject;
    }

    public void run() {
        synchronized (mainObject) {
            String[] fruits = {"Apple", "Orange", "Banana"};
            try {
                mainObject.wait();
                for (String fruit : fruits) {
                    System.out.println(fruit);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
