/*
52. Design a Course class.
• Instance variables: courseName, enrolledStudents.
• Static variable: maxCapacity, the maximum number of students for any course.
• Instance methods: enrollStudent(String studentName),unenrollStudent(String studentName).
• Static method: setMaxCapacity(int capacity), to set the maximum capacity for courses.
 */

class course {
    static int maxCapacity = 50;
    String courseName;
    int enrollments;

    String[] enrolledStudents ;

    course(String courseName){
        this.enrollments = 0;
        this.courseName = courseName;
        this.enrolledStudents = new String[maxCapacity];
    }

    static void setMaxCapacity(int capacity){
        course.maxCapacity = capacity;
    }

    public void enrollStudent(String studentName){
        if(enrollments <maxCapacity){
            System.out.println(studentName+" is successfully enrolled in the course");
            enrolledStudents[enrollments] = studentName ;
            enrollments++;
        }else{
            System.out.println("Course batch is already full.\n");
            System.out.println("Try with different course or may be in the next batch.");
        }
    }

    public void unenrollStudent(String studentName){
        System.out.println(studentName+" is successfully unenrolled");
        enrollments--;
        System.out.println("Please leave a reason for unenrollment ");
    }
    public void displayStudentsList(){
        for(int i=0;i<=enrollments;i++){
            System.out.println((i+1)+") "+enrolledStudents[i]);
        }
    }
    public static void main(String[] args){
        course python = new course("Python");
        System.out.println("Course Name : "+python.courseName);
        python.enrollStudent("Rahul Wagh");
        python.enrollStudent("Bhavesh Wagh");
        //System.out.println(python.enrollments);
        python.unenrollStudent("Rahul Wagh");
        //System.out.println(python.enrollments);
        python.displayStudentsList();
    }
}
