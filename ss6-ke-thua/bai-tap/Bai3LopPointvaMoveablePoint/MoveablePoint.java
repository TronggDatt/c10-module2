package Bai3LopPointvaMoveablePoint;

public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint() {
        super();
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float x) {
        this.xSpeed = x;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setySpeed(float y) {
        this.ySpeed = y;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void getSpeed(float[] speed) {
        speed[0] = xSpeed;
        speed[1] = ySpeed;
    }

    @Override
    public String toString() {
        return "MoveablePoint [x=" + getX() + ", y=" + getY() + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + "]";
    }

    public MoveablePoint move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }
}
