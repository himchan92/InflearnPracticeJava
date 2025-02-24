package middle1.lang.object.test;

import java.util.Objects;

public class Rectangle {
    private int width;
    private int weight;

    public Rectangle(int width, int weight) {
        this.width = width;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
            "width=" + width +
            ", weight=" + weight +
            '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        // 최상위 Object 가 하위 Rectangle 맞추기위해 다운캐스팅
        if (!(object instanceof Rectangle rectangle)) {
            return false;
        }
        return width == rectangle.width && weight == rectangle.weight;
    }
}
