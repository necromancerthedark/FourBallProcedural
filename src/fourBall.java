import processing.core.PApplet;

public class fourBall extends PApplet {

    public static final int WIDTH = 600;
    public static final int HEIGHT = 600;
    public static final int bgcolor = 255;
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
        getBackground();
        int radius = 10;
        getEllipse_1(radius,1,1);
        getEllipse_2(radius,2,2);
        getEllipse_3(radius,3,3);
        getEllipse_4(radius,4,4);

    }

    private void getEllipse_1(int radius, int distance, int speed) {
        ellipse(0 + x1,(HEIGHT*distance)/6, radius, radius);
        x1+=speed;
    }

    private void getEllipse_2(int radius, int distance, int speed) {
        ellipse(0 + x2,(HEIGHT*distance)/6, radius, radius);
        x2+=speed;
    }

    private void getEllipse_3(int radius, int distance, int speed) {
        ellipse(0 + x3,(HEIGHT*distance)/6, radius, radius);
        x3+=speed;
    }

    private void getEllipse_4(int radius, int distance, int speed) {
        ellipse(0 + x4,(HEIGHT*distance)/6, radius, radius);
        x4+=speed;
    }


    private void getBackground() {
        background(bgcolor);
    }
}
