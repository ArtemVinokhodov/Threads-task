package vegetables;

public class VegetablesThread extends Thread {

    public void run() {
        String[] vegetables = {"Potato", "Carrot", "Cucumber"};
        for (String vegetable : vegetables) {
            System.out.println(vegetable);
        }
    }
}


