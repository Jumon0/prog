package Actors;

import Impl.Searchable;

public class Dunno extends Person implements Searchable {
    public Dunno(String name) {
        super(name);
    }
    @Override
    public void action(Person person) {
        System.out.println(getName() + " велит " + person.getName() + " собрать" + Stuff.SEEDS);
    }
    public void ask() {
        System.out.println(getName() + " спрашивает о местонахождении друзей: " + Stuff.DONUT + " и " + Stuff.ZNAIKA );
    }

    @Override
    public void search(Stuff stuff) {
        System.out.println(getName() + " ищет" + stuff);
    }
}
