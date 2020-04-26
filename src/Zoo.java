public class Zoo {

    public static void main(String[] args) {

        Animal wolf = new Wolf();
        Animal lion = new Lion();
        Animal tiger = new Tiger();

        Animal deer = new Deer();
        Animal cow = new Cow();
        Animal panda = new Panda();

        Meat meat = new Meat();
        Carrot carrot = new Carrot();

        Aviary avCarn = new Aviary(10,10,10,3);
        Aviary avHerb = new Aviary(20,20,20,3);
        Aviary avCarn1 = new Aviary(10,40,10,3);
        Aviary avHerb1 = new Aviary(20,30,20,3);

        avCarn.addAnimal(tiger);
        avCarn.addAnimal(lion);
        avCarn1.addAnimal(wolf);

        avHerb.addAnimal(deer);
        avHerb1.addAnimal(cow);
        avHerb1.addAnimal(panda);

        //deer.eat(carrot);
        //tiger.eat(carrot);

        avCarn.eatFood(meat);
        avCarn.eatFood(carrot);

        avHerb.eatFood(meat);
        avHerb.eatFood(carrot);



    }
}
