class Test1{
    int a;
    String name;

    Test1(){
        a=10;
        name="John";
    }

    public static void main(String args[]){
        Test1 t1=new Test1();
        System.out.println(t1.a +"\n"+ t1.name);
    }

}