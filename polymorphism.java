

class A{
    void add(){
        int a = 10,b = 20,c;
        c = a+b;
        System.out.println(c);
    }

    void add(int x, int y){
        int c;
        c = x+y;
        System.out.println(c);
    
}
    void add(int i,double j) {
        double c;
        c = i+j;
        System.out.println(c);
}
}

public class polymorphism {
    public static void main(String[] args) {
        A r = new A();
        r.add();
        r.add(100,200);
        r.add(20,30.5);
    }
}
