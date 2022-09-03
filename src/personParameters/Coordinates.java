package personParameters;

public class Coordinates {
    private long x; //Максимальное значение поля: 407
    private Long y; //Максимальное значение поля: 228, Поле не может быть null

    public Coordinates(long x, Long y) {
        this.x = x;
        this.y = y;
    }

    public long getX() {
        return x;
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public Long getY() {
        return y;
    }

}
