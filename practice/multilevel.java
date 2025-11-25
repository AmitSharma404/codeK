package practice;
class Number{
    int a = 10;
    int b = 20;

    class add extends Number{
        int c = 10;
    }

    public void sum2() {
        System.out.println("Sum of two number:"+(a+b));
    }

    class add2 extends add {
        public void sum3() {
            System.out.println("Sum of three number: "+(a+b+c));
        }
    }

    public static void main(String[] args) {
        Number obj = new Number();
        obj.sum2();

        Number.add myAdd = obj.new add();
        Number.add.add2 myAdd2 = myAdd.new add2();
        myAdd2.sum3();
    }

}