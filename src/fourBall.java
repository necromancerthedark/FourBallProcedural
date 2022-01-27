import processing.core.PApplet;

public class fourBall extends PApplet {

    public static final int WIDTH = 600;
    public static final int HEIGHT = 600;
    public static final int bgcolor = 255;
    public static final int distanceDivisor = 6;
    public static final int speed_1 = 1;
    public static final int speed_2 = 2;
    public static final int speed_3 = 3;
    public static final int speed_4 = 4;
    public static final int RADIUS1 = 10;
    int x1 =0;
    int x2 =0;
    int x3 =0;
    int x4 =0;

    public static void main(String[] args) {
        PApplet.main("fourBall",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
//        uncomment following line to remove trails left by balls
//        getBackground();
        getEllipse(1,x1);
        getEllipse(2,x2);
        getEllipse(3,x3);
        getEllipse(4,x4);
        changeDistance();
    }

    private void getEllipse(int distance, int displacementVector) {
        ellipse(displacementVector,(HEIGHT*distance)/ distanceDivisor, RADIUS1, RADIUS1);
    }

    private void changeDistance(){
        x1+= speed_1;
        x2+= speed_2;
        x3+= speed_3;
        x4+= speed_4;
    }

    private void getBackground() {
        background(bgcolor);
    }
}
