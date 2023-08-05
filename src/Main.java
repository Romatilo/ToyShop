public class Main {
    public static void main(String[] args) {
        ToyShop shop = new ToyShop();

        Toy car = new Toy(1, "Car", 5, 20);
        Toy doll = new Toy(2, "Doll", 3, 15);
        Toy ball = new Toy(3, "Ball", 7, 28);
        Toy yoyo = new Toy(4, "Yo-yo", 4, 15);
        Toy bear = new Toy(5, "Bear", 2, 7);
        Toy sword = new Toy(6, "Sword", 3, 15);

        shop.addToy(car);
        shop.addToy(doll);
        shop.addToy(ball);
        shop.addToy(yoyo);
        shop.addToy(bear);
        shop.addToy(sword);

        shop.changeWinningRate(3, 22);
        shop.changeWinningRate(1, 26);

        shop.play();
        shop.play();
        shop.play();
        shop.play();
    }
}
