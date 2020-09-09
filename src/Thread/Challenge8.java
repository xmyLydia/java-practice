package Thread;

import java.util.concurrent.locks.ReentrantLock;

public class Challenge8 {

    public static void main(String[] args) {
        Tutor tutor = new Tutor();
        Student student = new Student(tutor);
        tutor.setStudent(student);

        Thread tutorThread = new Thread(new Runnable() {
            @Override
            public void run() {
                tutor.studyTime();
            }
        });

        Thread studentThread = new Thread(new Runnable() {
            @Override
            public void run() {
                student.handInAssignment();
            }
        });

        tutorThread.start();
        studentThread.start();
    }
}

class Tutor {
    ReentrantLock lock = new ReentrantLock();

    private Student student;

    public void setStudent(Student student) {
        this.student = student;
    }

    public void studyTime() {
        synchronized (this) {
            System.out.println("Tutor has arrived");
            lock.lock();
            try {
                student.startStudy();
                System.out.println("Tutor is studying with student");
            } finally {
                lock.unlock();
            }
        }
    }

    public void getProgressReport() {
        // get progress report
        System.out.println("Tutor gave progress report");
    }
}


class Student {
    ReentrantLock lock = new ReentrantLock();

    private Tutor tutor;

    Student(Tutor tutor) {
        this.tutor = tutor;
    }

    public void startStudy() {
        // study
        System.out.println("Student is studying");
    }

    public void handInAssignment() {
        lock.lock();
        try {
            tutor.getProgressReport();
            System.out.println("Student handed in assignment");
        } finally {
            lock.unlock();
        }

    }
}