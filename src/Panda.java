public class Panda extends Herbivore {

    @Override
    public void eat(Food uFood) {
        if (uFood instanceof HerbProducts){
            System.out.println("Панда сытая");
        }else {
            System.out.println("Панда гододная");
        }
    }
}
