class Person {
String name;
int age;
String gender;
static Student[] students = new Student[3];
static Teacher[] teachers = new Teacher[3];
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    static void displayInfo() {
        System.out.println("\n--- Basic Information ---\n");
        for (int s = 0; s < students.length; s++) {

            System.out.println("\nName: " + students[s].name);
            System.out.println("Age: " + students[s].age);
            System.out.println("Gender: " + students[s].gender);
        }
        for (int t = 0; t < teachers.length; t++) {
            System.out.println("\nName: " + teachers[t].name);
            System.out.println("Age: " + teachers[t].age);
            System.out.println("Gender: " + teachers[t].gender);
        }
    }
}
class Student extends Person {

int studentId;
static Student[] students = new Student[3];

    public Student(String name, int age, String gender, int studentId) {
        super(name, age, gender);
        this.studentId = studentId;
    }

    static void displayStudent() {
        System.out.println("\n--- Students Information ---\n");
        for (int s = 0; s < students.length; s++) {
            System.out.println("\nName: " + students[s].name);
            System.out.println("Age: " + students[s].age);
            System.out.println("Gender: " + students[s].gender);
            System.out.println("Student ID: " + students[s].studentId);
        }
    }
}
class Teacher extends Person {

String department;
static Teacher[] teachers = new Teacher[3];
Course[] courses;

    public Teacher(String name, int age, String gender, String department, Course[] courses) {
        super(name, age, gender);
        this.department = department;
        this.courses = courses;

    }

    static void displayTeacher() {
        System.out.println("\n--- Teachers Information ---\n");
        for (int t = 0; t < teachers.length; t++) {
            System.out.println("\nName: " + teachers[t].name);
            System.out.println("Age: " + teachers[t].age);
            System.out.println("Gender: " + teachers[t].gender);
            System.out.println("Department: " + teachers[t].department);
            System.out.println("Courses Handled: ");
            for (int c = 0; c < teachers[t].courses.length; c++) {
                System.out.println("\t" + teachers[t].courses[c].courseCode + " - " + teachers[t].courses[c].courseName);
            }
        }
    }
}
class Course {

String courseCode;
String courseName;

    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
    }

    static void displayCourse(Course[] courses) {
        System.out.println("\n--- Courses ---");
        for (int c = 0; c < courses.length; c++) {
            System.out.println((c+1)+".) " + courses[c].courseCode + " - " + courses[c].courseName);
        }
    }
}
class TeacherStudentAssignment1 {
    public static void main(String[] args) {
        Student.students[0] = new Student("Charles Andrew Leyson", 22, "Male", 202411474);
        Student.students[1] = new Student("Juvylyn Puliran ", 21, "Female", 202444489);
        Student.students[2] = new Student("Christopher Kurt Datu", 30, "Male", 202411527);

        Course course1 = new Course("CS100", "Discrete Structures");
        Course course2 = new Course("CS60", "Data Structures");
        Course course3 = new Course("CS24", "Fundamentals in Programming");
        Course course4 = new Course("CS40", "Object Oriented Programming");
        Course course5 = new Course("CS120", "Digital Logic Design");
        Course course6 = new Course("GNED04", "Babasahin Hingil sa Kasaysayan ng Pilipinas");
        Course[] t1Courses = {course2, course3, course4};
        Course[] t2Courses = {course3, course4, course1, course5};
        Course[] t3Courses = {course6};
        Course[] allCourses = {course1, course2, course3, course4, course5, course6};

        Teacher.teachers[0] = new Teacher("Pol Orio", 45, "Male", "Computer Science", t1Courses);
        Teacher.teachers[1] = new Teacher("Johnroe Cañamaque", 20, "Male", "Computer Science", t2Courses);
        Teacher.teachers[2] = new Teacher("Patricio Sabido", 26, "Female", "Filipino", t3Courses);

        Person.students = Student.students;
        Person.teachers = Teacher.teachers;

        Person.displayInfo();
        Student.displayStudent();
        Teacher.displayTeacher();
        Course.displayCourse(allCourses);
    }
}