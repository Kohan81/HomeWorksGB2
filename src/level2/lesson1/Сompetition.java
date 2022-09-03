package level2.lesson1;

public class Сompetition {

    public static void main(String[] args) {

        Participant [] participants = {
                new Human(),
                new Cat(),
                new Robot()
        };

        Target [] targets = {
                new Treadmill(100),
                new Wall(1),
                new Treadmill(500),
                new Wall(1),
                new Treadmill(3000),
                new Wall(2),
                new Treadmill(10_000)
        };

        for (int i = 0; i < participants.length; i++) {
            for (int j = 0; j < targets.length; j++){
                try {
                    participants[i].choice(targets[j]);
                } catch (Exception e) {
                    e.getMessage();
                    System.out.println("(\"participant is dropped out\")");
                    break;
                }
            }
        }
    }
}
