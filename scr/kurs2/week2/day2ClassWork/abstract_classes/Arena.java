package scr.kurs2.week2.day2ClassWork.abstract_classes;

/**
 * Created by miha on 31.05.2016.
 */
public class Arena {
    private Fighter first;
    private Fighter second;

    public Arena(Fighter first, Fighter second) {
        this.first = first;
        this.second = second;
    }

    public void startFight() {

        while (first.health > 0
                && second.health > 0){

            System.out.printf("Fighter - %s hit, %s health - ", first.asString(), second.asString());
            first.hit(second);
            if(second.health <= 0) {
                System.out.println(first.asString() + " win!");

                break;
            }
            System.out.printf("Fighter - %s hit, - %s health - ", second.asString(), first.asString());
            second.hit(first);

            if(first.health <= 0){
                System.out.println(second.asString() + " win!");
            }

        }
    }
}
