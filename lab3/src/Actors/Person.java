package Actors;

import Impl.Moveable;

public abstract class Person implements Moveable {
    public String getName() {
        return name;
    }

    public String getDescription(Stuff stuff){
        description = " ,Используемые предметы: " + stuff;
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasName() {
        return hasName;
    }

    public void setHasName(boolean hasName) {
        this.hasName = hasName;
    }

    String name;
    public String description;

    public boolean hasName;
    public Person (){

    }
    public Person (String name){
        this.name=name;
        System.out.println("Приветствуем персонажа с именем " + getName());
    }

    @Override
    public String toString(){
        return name;
    }
}


