public class third {
    int modelYear;
    String modelName;

    public third(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        third myCar = new third(1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}
