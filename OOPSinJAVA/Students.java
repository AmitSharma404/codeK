package OOPSinJAVA;
class Students{
    String name;
    int rollno;
    double SGPA;
    String email;
    private String password;

    Students(String n,String e ) {
        this.name = n;
        this.email = e;
    }

    public void printInfo() {
        System.out.println(this.name +"\n"+ this.email+"\n"+ this.password);
    }

    public static void main(String args[]) {
        Students s1 = new Students("Jarvis","sandy133@gmail.com");
        s1.SGPA = 8.2;
        s1.password  = "Amit@123";
        s1.rollno = 110;
        s1.printInfo();
    }
}

