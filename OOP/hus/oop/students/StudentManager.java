package hus.oop.students;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    // Singleton pattern
    private static StudentManager instance;

    private List<Student> studentList;

    private StudentManager() {
        /* TODO */
        this.studentList = new ArrayList<>();
    }

    public static StudentManager getInstance() {
        /* TODO */
        if (instance == null) {
            instance = new StudentManager();
        }
        return instance;
    }

    /**
     * Thêm sinh viên vào cuối danh sách.
     * @param student
     */
    public void append(Student student) {
        /* TODO */
        this.studentList.add(student);
    }

    /**
     * Thêm sinh viên vào danh sách ở vị trí index.
     * @param student
     * @param index
     */
    public void add(Student student, int index) {
        /* TODO */
        this.studentList.add(index, student);
    }

    /**
     * Xóa sinh viên ở vị trí index.
     * @param index
     */
    public void remove(int index) {
        /* TODO */
        this.studentList.remove(index);
    }

    /**
     * Lấy ra sinh viên ở vị trí index.
     * @param index
     * @return
     */
    public Student studentAt(int index) {
        /* TODO */
        return this.studentList.get(index);
    }

    /**
     * Trả về số student trong danh sách.
     * @return
     */
    public int numberOfStudents() {
        /* TODO */
        return this.studentList.size();
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự tăng dần theo tên,
     * nếu tên như nhau thì sắp xếp theo họ.
     * Sử dụng giao diện StudentComparable để sắp xếp.
     * @return
     */
    public List<Student> sortStudentsByName() {
        /* TODO */
        studentList.sort(Student::compareTo);
        return studentList;
    }

    /**
     * Trả về danh sách sinh viên sắp xếp theo thứ tự điểm trung bình tăng dần.
     * Sử dụng giao diện StudentComparator để sắp xếp.
     * Không làm thay đổi thứ tự sinh viên trong danh sách ban đầu.
     * @return
     */
    public List<Student> sortAverageGradeIncreasing() {
        /* TODO */
        studentList.sort((s1, s2) -> Double.compare(s1.getAverageGrade(), s2.getAverageGrade()));
        return studentList;
    }

    /**
     * Trả về danh sách sinh viên sắp xếp theo thứ tự điểm trung bình giảm dần.
     * Sử dụng giao diện StudentComparator để sắp xếp.
     * Không làm thay đổi thứ tự sinh viên trong danh sách ban đầu.
     * @return
     */
    public List<Student> sortAverageGradeDecreasing() {
        /* TODO */
        studentList.sort((s1, s2) -> Double.compare(s2.getAverageGrade(), s1.getAverageGrade()));
        return studentList;
    }

    /**
     * Lọc ra danh sách sinh viên có tất cả các điểm trên 4.0 và điểm trung bình trên 5.0.
     * @return
     */
    public List<Student> filterPassStudents() {
        /* TODO */
        List<Student> passList = new ArrayList<>();
        for (Student student : studentList) {
            if (student.getMathsGrade() >= 4 && student.getPhysicsGrade() >= 4 && student.getChemistryGrade() >= 4
                    && student.getAverageGrade() >= 5) {
                passList.add(student);
            }
        }
        return passList;
    }

    /**
     * Lọc ra danh sách sinh viên có ít nhất 1 môn dưới 4.0 hoặc điểm trung bình dưới 5.0.
     * @param howMany
     * @return
     */
    public List<Student> filterFailureStudents(int howMany) {
        /* TODO */
        List<Student> failureList = new ArrayList<>();
        for (Student student : studentList) {
            if (student.getMathsGrade() < 4 || student.getPhysicsGrade() < 4 || student.getChemistryGrade() < 4
                    || student.getAverageGrade() < 5) {
                failureList.add(student);
            }
        }
        return failureList;
    }

    public static String idOfStudentsToString(List<Student> studentList) {
        StringBuilder idOfStudents = new StringBuilder();
        idOfStudents.append("[");
        for (Student country : studentList) {
            idOfStudents.append(country.getId()).append(" ");
        }
        return idOfStudents.toString().trim() + "]";
    }

    public static void print(List<Student> studentList) {
        StringBuilder studentsString = new StringBuilder();
        studentsString.append("[\n");
        for (Student student : studentList) {
            studentsString.append(student.toString()).append("\n");
        }
        System.out.print(studentsString.toString().trim() + "\n]");
    }
}
