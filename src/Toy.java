
/// контруктор игрушек
public class Toy {
    private int id; // id игрушки
    private String name;  // название игрушки
    private int quantity; // количество экземпляров игрушки
    private int winningRate; // частота выпадения игрушки

    public Toy(int id, String name, int quantity, int winningRate) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.winningRate = winningRate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getWinningRate() {
        return winningRate;
    }

    public void setWinningRate(int winningRate) {
        this.winningRate = winningRate;
    }
}
