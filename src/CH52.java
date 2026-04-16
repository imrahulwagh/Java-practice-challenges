class Courses {
    static int maxCapacity = 100;
    String courseName;
    int enrollments ;
    String[] enrolledStudents;

    Courses(String courseName){
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrolledStudents = new String[maxCapacity];
    }

    static void setMaxCapacity(int maxCapacity){
        Courses.maxCapacity = maxCapacity;
    }

    void enrollStudent(String studentName){
        enrolledStudents[enrollments] = studentName;
        enrollments++;
    }
    void unenrollStudent(String studentName){
        System.out.println("Student named \""+studentName+"\" is removed..");
        enrollments--;
    }

    void displayList(){
        System.out.println("List of Enrolled Students : ");
        for(int i=0;i< this.enrollments;i++)
        {
            System.out.println((i+1)+" "+this.enrolledStudents[i]);
        }
    }
    public static void main(String[] args) {
        Courses java_lang = new Courses("java");
        java_lang.enrollStudent("Rahul Wagh");
        java_lang.enrollStudent("Pratik Mahale");
        java_lang.displayList();
        System.out.println();
        System.out.println("Total Enrolled Students : "+java_lang.enrollments);
        if(java_lang.enrollments == Courses.maxCapacity){
            Courses.maxCapacity += 100;
        }
        System.out.println(maxCapacity);
        java_lang.unenrollStudent("Rahul Wagh");
    }

}
