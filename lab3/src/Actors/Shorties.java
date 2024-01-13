package Actors;

import Impl.Searchable;

public class Shorties extends Person implements Searchable {
    public Shorties(String name) {
        super(name);
    }
    @Override
    public void action(Person person) {
        System.out.println(getName() + " принесли" + Stuff.SEEDS + " для " + person.getName() );
    }

    @Override
    public void search(Stuff stuff) {
        System.out.println(getName()+ " ищут" + stuff);
    }
}
