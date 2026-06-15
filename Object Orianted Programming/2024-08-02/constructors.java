class Student2{
    int id;
    Student2(int id){
        this.id=id;
    }
    Student2(Student2 s){
        id=s.id;
    }
    void display()
    {
        System.out.println(id);
    }
    public static void main(String args[]){
        Student2 s1 = new Student2(12);
        Student2 s2 = new Student2(s1);

        s1.display();
        s2.display();

    }
}