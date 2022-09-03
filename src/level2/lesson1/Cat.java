package level2.lesson1;

public class Cat implements Participant, Functions{
    private int run_distance = 200;
    private int jump_hight = 1;

    @Override
    public void run(Treadmill treadmill) throws Exception {
        if (run_distance >= treadmill.distance){
            System.out.println("I'm a cat and I run " + (treadmill.distance) + " meters" );
        } else {
            System.out.println("I'm a cat and I can run only " + run_distance);
            throw new Exception("I'm a cat and I can't");
        }
    }

    @Override
    public void jump(Wall wall) throws Exception {
        if (jump_hight >= wall.height) {
            System.out.println("I'm a cat and I jump " + (wall.height) + " meters");
        } else {
            System.out.println("I'm a cat and I can jump only " + jump_hight + " meters");
            throw new Exception("I'm a cat and I can't");
        }
    }

    public void choice(Target target) throws Exception{
        if(target instanceof Wall){
            jump((Wall)target);
        }else if(target instanceof Treadmill){
            run((Treadmill) target);
        }else {
            System.out.println("OBJECT is WRONG!!!");
        }
    }
}
