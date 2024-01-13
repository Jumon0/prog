import Actors.Dunno;
import Actors.Kolosok;
import Actors.Shorties;
import Actors.Stuff;

public class Main {

    public static void main(String[] args) {
	Dunno dunno = new Dunno("Знайка");
	Shorties shorties = new Shorties ("Коротышки");
	Kolosok kolosok = new Kolosok("Колосок");

	dunno.action(shorties);
	shorties.search(Stuff.SEEDS);
	dunno.search(Stuff.FRIENDS);
	dunno.ask();
	shorties.action(dunno);
	kolosok.action(dunno);
	kolosok.walk();
    }
}
