package shapeexample;

import java.util.Objects;

public abstract class Shape {
    public Shape() {
    }

    int x;
    int y;
    String color;

    public Shape(Shape source){
        this.x=source.x;
        this.y=source.y;
        this.color=source.color;
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Shape shape2))
            return false;
        return shape2.x == x && shape2.y == y && Objects.equals(shape2.color, color);
    }
}
