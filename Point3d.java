//класс, определяющий объект 3-ёх мерной точки
public class Point3d {
    private double xCoord;
    private double yCoord;
    private double zCoord;


    public Point3d(double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }
//•	метод для сравнения значений двух объектов Point3d.
    public boolean equalsP(Point3d point3d) {
        return (this.xCoord == point3d.xCoord) && (this.yCoord == point3d.yCoord) && (this.zCoord == point3d.zCoord);

    }

    public Point3d() {
        this(0, 0, 0);
    }

    public double getX() {
        return xCoord;
    }

    public double getY() {
        return yCoord;
    }

    public double getZ() {
        return zCoord;
    }

    public void setX(double val) {
        xCoord = val;
    }

    public void setY(double val) {
        yCoord = val;
    }

    public void setZ(double val) {
        zCoord = val;
    }
    //Добавление нового метода distanceTo, который в качестве параметра принимает другой объект Point3d, вычисляет расстояние между двумя точками с точность двух знаков после запятой и возвращает полученное значение.
    public double distanceTo (Point3d point3d){
            double distance = Math.sqrt((this.xCoord-point3d.xCoord)*(this.xCoord-point3d.xCoord) +(this.yCoord-point3d.yCoord)*(this.yCoord-point3d.yCoord)+(this.zCoord-point3d.zCoord)*(this.zCoord-point3d.zCoord));
            return Math.round(distance * 100.0) / 100.0;
    }
}

