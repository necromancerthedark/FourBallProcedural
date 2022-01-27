import processing.core.PApplet;

public class fourBall extends PApplet {

    public static final int WIDTH = 600;
    public static final int HEIGHT = 600;
    public static final int bgcolor = 255;
    public static final int distanceDivisor = 6;
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
    public void setup() {

    }

    @Override
    public void draw() {
//        getBackground();
        int radius = 10;
        getEllipse(radius,1,x1);
        getEllipse(radius,2,x2);
        getEllipse(radius,3,x3);
        getEllipse(radius,4,x4);
        changeDistance();
    }

    private void getEllipse(int radius, int distance, int displacementVector) {
        ellipse(0 + displacementVector,(HEIGHT*distance)/ distanceDivisor, radius, radius);
    }

    private void changeDistance(){
        x1+=1;
        x2+=2;
        x3+=3;
        x4+=4;
    }

    private void getBackground() {
        background(bgcolor);
    }
}
