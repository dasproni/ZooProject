public class Cow extends Herbivore {


    @Override
    public void eat(Food uFood) {
        if (uFood instanceof HerbProducts){
            System.out.println("Корова сытая");
        }else {
            System.out.println("Корова гододная");
        }
    }
}
