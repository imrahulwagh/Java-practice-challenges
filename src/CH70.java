import utils.ArrayUtility;

//70. Define a Student class with fields like name and age, and use
//toString to print student det
class Student {
    String name;
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student name : " + name + "\n" +
                "Student age : " + age;
    }

    static void main(String[] args) {
        Student[] s = new Student[3];
        System.out.println("Enter details of students ");
        for(int i=0;i<s.length;i++){
            System.out.print("Enter name of student No."+(i+1)+" : ");
            String name = ArrayUtility.sc.nextLine();
            System.out.print("Enter age : ");
            int age = ArrayUtility.sc.nextInt();
            ArrayUtility.sc.nextLine();
            s[i] = new Student(name,age);
        }
        display(s);
    }
    public static void display(Student[] s){
        System.out.println("Student details : ");
        for (Student student : s) {
            System.out.println(student);
        }
    }
}
