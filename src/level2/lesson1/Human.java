package level2.lesson1;

public class Human implements Participant, Functions{

    private int run_distance = 3000;
    private int jump_hight = 1;


    @Override
    public void run(Treadmill treadmill) throws Exception {
        if (run_distance >= treadmill.distance){
            System.out.println("I'm a human and I run " + (treadmill.distance) + " meters" );
        } else {
            System.out.println("I'm a human and I can run only " + run_distance + " meters");
            throw new Exception("I'm a human and I can't");
        }
    }

    @Override
    public void jump(Wall wall) throws Exception {

        if (jump_hight >= wall.height){
            System.out.println("I'm a human and I jump " + (wall.height) + " meters" );
        } else {
            System.out.println("I'm a human and I can jump only " + jump_hight);
            throw new Exception("I'm a human and I can't");
        }
    }

    @Override
    public void choice(Target target) throws Exception {
        if(target instanceof Wall){
            jump((Wall)target);
        }else if(target instanceof Treadmill){
            run((Treadmill) target);
        }else {
            System.out.println("OBJECT is WRONG!!!");
        }
    }
}
