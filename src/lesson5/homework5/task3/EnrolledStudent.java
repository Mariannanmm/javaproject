package lesson5.homework5.task3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnrolledStudent {
    private int studentId;
    private String studentName;
    private int courseId;
    private String courseName;

    public String toFileString() {
        return "Student: " + studentName + " (ID: " + studentId + ") study on course: " + courseName + " (ID: " + courseId + ")";
    }
}
