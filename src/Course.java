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
        System.out.println("Student removed..");
        enrollments--;
    }

    public static void main(String[] args) {
        Courses java = new Courses("java");
        //java.enrollStudent("Rahul Wagh");
        java.enrollStudent("Aarav Sharma");
        java.enrollStudent("Vivaan Patel");
        java.enrollStudent("Aditya Singh");
        java.enrollStudent("Vihaan Gupta");
        java.enrollStudent("Arjun Mehta");
        java.enrollStudent("Sai Kumar");
        java.enrollStudent("Krishna Iyer");
        java.enrollStudent("Rohan Das");
        java.enrollStudent("Ishaan Verma");
        java.enrollStudent("Karan Malhotra");

        java.enrollStudent("Rahul Nair");
        java.enrollStudent("Ankit Jain");
        java.enrollStudent("Siddharth Roy");
        java.enrollStudent("Manav Bansal");
        java.enrollStudent("Nikhil Chatterjee");
        java.enrollStudent("Harsh Vardhan");
        java.enrollStudent("Aryan Kapoor");
        java.enrollStudent("Dev Joshi");
        java.enrollStudent("Tanmay Kulkarni");
        java.enrollStudent("Shubham Yadav");

        java.enrollStudent("Amit Tiwari");
        java.enrollStudent("Piyush Agarwal");
        java.enrollStudent("Deepak Mishra");
        java.enrollStudent("Ritesh Pandey");
        java.enrollStudent("Gaurav Saxena");
        java.enrollStudent("Lokesh Choudhary");
        java.enrollStudent("Mayank Srivastava");
        java.enrollStudent("Abhishek Dubey");
        java.enrollStudent("Prashant Tripathi");
        java.enrollStudent("Vikas Shukla");

        java.enrollStudent("Sameer Khan");
        java.enrollStudent("Faizan Ali");
        java.enrollStudent("Imran Sheikh");
        java.enrollStudent("Ayaan Siddiqui");
        java.enrollStudent("Zaid Ansari");
        java.enrollStudent("Rehan Qureshi");
        java.enrollStudent("Arman Khan");
        java.enrollStudent("Asif Pathan");
        java.enrollStudent("Noman Shaikh");
        java.enrollStudent("Sahil Mirza");

        java.enrollStudent("Rakesh Pillai");
        java.enrollStudent("Suresh Menon");
        java.enrollStudent("Anand Krishnan");
        java.enrollStudent("Vivek Reddy");
        java.enrollStudent("Pradeep Naidu");
        java.enrollStudent("Karthik Subramanian");
        java.enrollStudent("Ganesh Shetty");
        java.enrollStudent("Murali Krishna");
        java.enrollStudent("Rajesh Nambiar");
        java.enrollStudent("Sunil Varma");

        java.enrollStudent("Tushar Pawar");
        java.enrollStudent("Omkar Patil");
        java.enrollStudent("Sagar Jadhav");
        java.enrollStudent("Nilesh Shinde");
        java.enrollStudent("Amol Deshmukh");
        java.enrollStudent("Swapnil More");
        java.enrollStudent("Ravindra Chavan");
        java.enrollStudent("Dnyaneshwar Gaikwad");
        java.enrollStudent("Santosh Kale");
        java.enrollStudent("Mahesh Bhosale");

        java.enrollStudent("Jay Shah");
        java.enrollStudent("Meet Trivedi");
        java.enrollStudent("Harshil Desai");
        java.enrollStudent("Dhruv Bhatt");
        java.enrollStudent("Yash Thakkar");
        java.enrollStudent("Parth Dave");
        java.enrollStudent("Chirag Modi");
        java.enrollStudent("Kunal Vora");
        java.enrollStudent("Jignesh Soni");
        java.enrollStudent("Nirav Barot");

        java.enrollStudent("Rohit Saini");
        java.enrollStudent("Ajay Chauhan");
        java.enrollStudent("Dinesh Rawat");
        java.enrollStudent("Kuldeep Bisht");
        java.enrollStudent("Suraj Negi");
        java.enrollStudent("Pankaj Gusain");
        java.enrollStudent("Mohit Rana");
        java.enrollStudent("Hemant Nautiyal");
        java.enrollStudent("Rajiv Panwar");
        java.enrollStudent("Deepanshu Kandari");

        java.enrollStudent("Akash Bora");
        java.enrollStudent("Bikash Gogoi");
        java.enrollStudent("Rituraj Deka");
        java.enrollStudent("Parag Saikia");
        java.enrollStudent("Dipankar Das");
        java.enrollStudent("Himanshu Kalita");
        java.enrollStudent("Anupam Baruah");
        java.enrollStudent("Jitul Phukan");
        java.enrollStudent("Nabajit Nath");
        java.enrollStudent("Manash Hazarika");

        java.enrollStudent("Peter Dsouza");
        java.enrollStudent("John Fernandes");
        java.enrollStudent("Anthony Dcruz");
        java.enrollStudent("Mark Rodrigues");
        java.enrollStudent("Kevin Lobo");
        java.enrollStudent("Brian Pinto");
        java.enrollStudent("Adrian Mascarenhas");
        java.enrollStudent("Clifford Noronha");
        java.enrollStudent("Sebastian Dias");
        java.enrollStudent("Allan Pereira");
        System.out.println("List of Enrolled Students : ");
        for(int i=0;i< java.enrollments;i++)
        {
            System.out.println((i+1)+" "+java.enrolledStudents[i]);
        }
        System.out.println();
        System.out.println("Total Enrolled Students : "+java.enrollments);
        if(java.enrollments == Courses.maxCapacity){
            Courses.maxCapacity += 100;
        }
        System.out.println(maxCapacity);
    }
}
