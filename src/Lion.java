public class Lion extends Carnivorous {


    @Override
    public void eat(Food uFood) {
        if (uFood instanceof AnimalProducts){
            System.out.println("Лев сытый");
        }else {
            System.out.println("Лев гододный");
        }
    }
}
