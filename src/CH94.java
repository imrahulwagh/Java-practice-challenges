// ///////////////////////////////////////////////////////////////////
//
//  Problem Statement : Create a PriorityQueue of a custom class
//                      Student with attributes name and grade.
//                      Use a comparator to order by grade.
//  Function name :     Collection using Priority Queue
//  Input :             PriorityQueue
//  Output :            PriorityQueue
//  Description :       Make Inner static class student and
//                      use it in the PriorityQueue as specified
//                      type and defined a custom comparator method
//                      based on student grade and arrange the queue
//                      according to it.
//  Date :              29/05/2026
//  Author :            Rahul Vilas Wagh
//
// ///////////////////////////////////////////////////////////////////

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
class StudentPriorityQueue {

    public static void main(String[] args) {
        Queue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getGrade() - o2.getGrade();
            }
        });

        queue.offer(new Student("Rahul",'C'));
        queue.offer(new Student("Yash",'B'));
        queue.offer(new Student("Aashi",'C'));
        queue.offer(new Student("Dharna",'A'));
        queue.offer(new Student("Sahil",'D'));

        System.out.println(queue);
        System.out.printf("Got %s\n",queue.poll());
        System.out.printf("Got %s\n",queue.poll());
        System.out.printf("Got %s\n",queue.poll());
        System.out.printf("Got %s\n",queue.poll());
        System.out.printf("Got %s\n",queue.poll());

    }
    public static class Student {
        private final String name;
        private final char grade;

        public Student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public char getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return name + " : " + grade;
        }
    }
}
