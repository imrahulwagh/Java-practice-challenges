// 70. Define a Student class with fields like name and age, and use
//toString to print student details.
class Student {
    String name;
    int age;

    @Override
    public String toString() {
        return "Class : Student\n"+"Name : " + this.name + "\nAge : "+this.age;
    }

    Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) {
        Student std = new Student("Rahul",23);
        System.out.println(std);
    }
}
