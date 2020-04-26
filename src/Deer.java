public class Deer extends  Herbivore {


    @Override
    public void eat(Food uFood) {
        if (uFood instanceof HerbProducts){
            System.out.println("Олень сытый");
        } else {
            System.out.println("Олень гододный");
        }
    }
}