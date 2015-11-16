package triangle;


public class Triangle {

    public static int triangle(int rows) {
        if (rows < 0) {
            throw new IllegalArgumentException("rows must be 0 or greater");
        }

        if (rows == 0) {
            return 0;
        }

        return rows + triangle(rows - 1);
    }

}
