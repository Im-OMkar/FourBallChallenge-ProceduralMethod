import processing.core.PApplet;

public class ProceduralMethod extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    int x1=0;
    int x2=0;
    int x3=0;
    int x4=0;

    public static void main(String[] args) {
        PApplet.main("ProceduralMethod");
    }

    public void settings(){
        size(WIDTH, HEIGHT);
    }

    public void setup(){

    }

    public void draw(){

        //getBackground();
        drawCircle1();
        drawCircle2();
        drawCircle3();
        drawCircle4();

    }

//    //private void getBackground() {
//        background(255);
//    }

    private void drawCircle1() {
        ellipse(x1,(float) HEIGHT/5 , DIAMETER, DIAMETER);
        x1++;
    }

    private void drawCircle2() {
        ellipse(x2,(float) 2*(HEIGHT/5) , DIAMETER, DIAMETER);
        x2+=2;
    }

    private void drawCircle3() {
        ellipse(x3,(float) 3*HEIGHT/5 , DIAMETER, DIAMETER);
        x3+=3;
    }

    private void drawCircle4() {
        ellipse(x4,(float) 4*HEIGHT/5 , DIAMETER, DIAMETER);
        x4+=4;
    }


}

