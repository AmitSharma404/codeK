public class constructor {
    int modelyear;
    String modelname;

    public constructor(int year,String name){
        this.modelyear = year;
        this.modelname = name;
    }

    public static void main(String[] args) {
        constructor myCar = new constructor(2023, "Mustang");
        System.out.println(myCar.modelyear+" "+myCar.modelname);
    }
}
