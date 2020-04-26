public class Wolf extends Carnivorous {

    @Override
    public void eat(Food uFood) {
        if (uFood instanceof AnimalProducts){
            System.out.println("Волк сытый");
        }else {
            System.out.println("Волк гододный");
        }
    }
}
