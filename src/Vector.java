class Vector {
    private int x;
    private int y;
    private int z;

    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    // Визначення колінеарності
    public static boolean areCollinear(Vector v1, Vector v2) {
        // Вектори колінеарні, якщо їх векторний добуток = (0, 0, 0)
        int crossX = v1.y * v2.z - v1.z * v2.y;
        int crossY = v1.z * v2.x - v1.x * v2.z;
        int crossZ = v1.x * v2.y - v1.y * v2.x;
        return crossX == 0 && crossY == 0 && crossZ == 0;
    }

    // Метод для визначення ортогональності
    public static boolean areOrthogonal(Vector v1, Vector v2) {
        // Вектори ортогональні, якщо їх скалярний добуток = 0
        return v1.x * v2.x + v1.y * v2.y + v1.z * v2.z == 0;
    }
}