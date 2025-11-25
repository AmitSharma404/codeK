package practice;

class add{
    void add() {
        int a = 10,b = 20,c;
        c = a + b;
        System.out.println(c);
    }

    void add(int x, int y) {
        int c;
        c = x + y;
        System.out.println(c);
    }
    void add(int x,double y) {
            double c;
            c = x+y;
            System.out.println(c);
    }
    public static void main(String[] args) {
        add r = new add();
        r.add();
        r.add(20, 30);
        r.add(10, 11);
    }
}
