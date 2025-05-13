package Operations;

class Course {
    private String courseName;
    private int courseCode;

    public Course(String courseName, int courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCourseCode() {
        return courseCode;
    }
}

 class Student {
    private String name;
    private String program;
    private String semester;
    private Course[] courses;
    private int[] marks;

    public Student(String name, String program, String semester, Course[] courses, int[] marks) {
        this.name = name;
        this.program = program;
        this.semester = semester;
        this.courses = courses;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public String getProgram() {
        return program;
    }

    public String getSemester() {
        return semester;
    }

    public Course[] getCourses() {
        return courses;
    }

    public int[] getMarks() {
        return marks;
    }

    public void checkLowMarks() {
        System.out.println("Student: " + name);
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 40) {
                System.out.println("Course: " + courses[i].getCourseName() + ", Marks: " + marks[i]);
            }
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Course course1 = new Course("Mathematics", 101);
        Course course2 = new Course("Science", 102);
        Course course3 = new Course("History", 103);

        Course[] courses = {course1, course2, course3};
        int[] marks = {30, 45, 39};  

        Student student = new Student("John Doe", "Computer Science", "Semester 1", courses, marks);

        
        System.out.println("Student Name: " + student.getName());
        System.out.println("Program: " + student.getProgram());
        System.out.println("Semester: " + student.getSemester());
        for (Course course : student.getCourses()) {
            System.out.println("Course Registered: " + course.getCourseName());
        }

        student.checkLowMarks();
    }
}

    