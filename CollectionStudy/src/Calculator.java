public class Calculator {
    private int x,y;



    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int sum(){
        return x + y;
    }
    public int avg(){
        return (sum())/2;
    }
}
