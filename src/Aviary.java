import java.util.ArrayList;
import java.util.List;

public class Aviary {
    private int width;
    private int height;
    private int length;
    private int animalMax;
    private int animalCount;

    private ArrayList<Animal> anim = new ArrayList<>();

    public Aviary(int width, int height, int length, int animalMax) {
        this.width = width;
        this.height = height;
        this.length = length;
        this.animalMax = animalMax;
        this.animalCount = 0;
    }
    public void addAnimal(Animal uAnimal) {
        if (animalCount < animalMax){
            anim.add(animalCount++, uAnimal);
        } else {
            System.out.println("В вальер больше нет места");
        }
    }
    public void eatFood(Food uFood) {
        for (int i = 0; i < animalCount; i++){
            anim.get(i).eat(uFood);

        }
    }
}
