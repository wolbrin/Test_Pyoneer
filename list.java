public class StudentCourse {

    public int courseId;
    private String courseDes;
    private String courseIns;
    private int time;


    public Course(int courseId, String courseDes, String courseIns, int time) {
        courseId = this.courseId;
        courseDes = this.courseDes;
        courseIns = this.courseIns;
        time = this.time;
    }
}




public double averageGradeStud() {
    double total = 0;

    for (int i = 0; i < numberOfGrades; i++) {

        total += grades[i];

    }

    return (total / numberOfGrades);


List<Student> students;
double total = 0;
for(Student s : students){
    total += s.averageGradeStud();
}
double averageForAll = total / students.size();