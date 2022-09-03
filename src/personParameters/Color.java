package personParameters;

import java.util.*;

public enum Color {
    GREEN,
    RED,
    BROWN;

    private static final List<Color> colors =
            Collections.unmodifiableList(Arrays.asList(values()));
    private static final int size = colors.size();
    private static final Random RANDOM = new Random();

    public static Color randomColor(){
        Color color = colors.get(RANDOM.nextInt(size));
        return color;
    }
}
