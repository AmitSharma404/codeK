
class Array{

    public static int length(String[] arr){
        return arr.length;
    }
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Cherry"};

        fruits[2] = "orange";

        for (String fruit : fruits){
            System.out.println(fruit);
        }
}
}