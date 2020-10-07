import java.util.Scanner;


public class lab1 {
    public static void main(String[] args) {

        /*Далее Ввод координат трех точек, находящихся в трехмерном пространстве. Создание трех объектов типа Point3d на основании полученных данных.
         */
        System.out.println("Введите поочередно значение первой точки через запятую x,y,z");
        Scanner sc = new Scanner(System.in);
        Double onepointX = sc.nextDouble();
        Double onepointY = sc.nextDouble();
        Double onepointZ = sc.nextDouble();
        System.out.println("Введите поочередно значение второй точки через запятую x,y,z");
        Double twopointX = sc.nextDouble();
        Double twopointY = sc.nextDouble();
        Double twopointZ = sc.nextDouble();
        System.out.println("Введите поочередно значение третьей точки через запятую x,y,z");
        Double thrpointX = sc.nextDouble();
        Double thrpointY = sc.nextDouble();
        Double thrpointZ = sc.nextDouble();
        Point3d onePoint = new Point3d(onepointX, onepointY, onepointZ);
        Point3d twoPoint = new Point3d(twopointX, twopointY, twopointZ);
        Point3d thrPoint = new Point3d(thrpointX, thrpointY, thrpointZ);

        //На основе полученных данных и с использованием реализованного алгоритма посчитать площадь и вывести полученное значение пользователю. Перед вызовом метода computeArea проверка на равенство значений всех трех объектов Point3d. Если одна из точек равна другой, то вывод соответствующего сообщения пользователю и отмена вычисления площади.
        boolean pointequality = ((onePoint.equalsP(twoPoint)) || (twoPoint.equalsP(thrPoint)) || (onePoint.equalsP(thrPoint)));
        if (pointequality == true) {
            System.out.println("Одна из точек равна другой, площадь не вычисляется");
        }
        else {
            System.out.println("S = " +computeArea(onePoint, twoPoint, thrPoint));
        }

        }

//Создание второго статического метода computeArea, который принимает три объекта типа Point3d и вычисляет площадь треугольника, образованного этими точками
    public static double computeArea(Point3d onePoint, Point3d twoPoint, Point3d thrPoint) {
        boolean pointequality = ((onePoint.equalsP(twoPoint)) || (twoPoint.equalsP(thrPoint)) || (onePoint.equalsP(thrPoint)));
        double a = onePoint.distanceTo(twoPoint);
        double b = twoPoint.distanceTo(thrPoint);
        double c = thrPoint.distanceTo(onePoint);
        double p = (a + b + c) / 2;
        double res = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return res;

    }
}

