/// Class to organize toys list and draw mechanics. Method for changing toy's winning rate as well

import java.util.ArrayList;
import java.util.Random;

public class ToyShop {
    /// Toys list
    private ArrayList<Toy> toys;

    public ToyShop() {
        toys = new ArrayList<>();
    }

    public void addToy(Toy toy) {
        /// Method to add toy in list
        toys.add(toy);
    }

    public void changeWinningRate(int id, int winningRate) {
        /// Change winning rate for toy by its ID
        for (Toy toy : toys) {
            if (toy.getId() == id) {
                toy.setWinningRate(winningRate);
                break;
            }
        }
    }

    public void play() {
        /// draw mechanics method
        Random random = new Random();
        int totalWinningRate = 0;  // Total chance to win toy

        for (Toy toy : toys) {
            totalWinningRate += toy.getWinningRate(); //it depends of every toy's winning rate chance
        }
        int randomNumber = random.nextInt(totalWinningRate);
        int cumulativeWinningRate = 0;
        for (Toy toy : toys) {
            /// it runs until user hasn't got any toy prize
            cumulativeWinningRate += toy.getWinningRate();
            if (randomNumber < cumulativeWinningRate) {
                System.out.println("Congratulations! You won a " + toy.getName() + "!");
                toy.setQuantity(toy.getQuantity() - 1);  // decrease toy qauntity
                break;  //user got a prize, cycle breaks
            }
        }
    }
}
