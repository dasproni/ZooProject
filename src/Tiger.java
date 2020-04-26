public class Tiger extends Carnivorous {

    @Override
    public void eat(Food uFood) {
        if (uFood instanceof AnimalProducts){
            System.out.println("Тигр сытый");
        }else {
            System.out.println("Тигр гододный");
        }
    }
}
