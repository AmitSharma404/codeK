public class constructor {
    int modelyear;
    Trial modelname;

    public constructor(int year,Trial name){
        this.modelyear = year;
        this.modelname = name;
    }

    public static void main(Trial[] args) {
        constructor myCar = new constructor(2023, "Mustang");
        System.out.println(myCar.modelyear+" "+myCar.modelname);
    }
}
