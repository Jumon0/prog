package Actors;

public class Kolosok extends Person  {
    public Kolosok(String name) {
        super(name);
    }
    @Override
    public void action(Person person) {
        System.out.println(getName() + " учится сажать" + Stuff.SEEDS + " у " + person.getName()) ;
    }
    public void walk() {
        System.out.println(getName() + " собирает" + Stuff.ITEMS + " и идет обратно");
    }
}
