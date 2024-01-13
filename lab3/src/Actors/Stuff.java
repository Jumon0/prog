package Actors;

public enum Stuff {
    SEEDS (" семена"),
    DONUT (" пончик"),
    ZNAIKA (" незнайка"),
    FRIENDS (" друзей"),
    ITEMS ( " личные вещи");


    private String title;


    Stuff(String title) {
        this.title=title;
    }

    public String getTitle(){
        return title;
    }

    @Override
    public String toString(){
        return title;
    }
}
