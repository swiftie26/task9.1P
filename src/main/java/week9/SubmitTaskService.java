package week9;

public class SubmitTaskService {
    /**
     * Simulates submitting a task for a student.
     * @param studentId Student's ID
     * @param subjectCode Subject code (e.g. COMP101)
     * @param fileName File name of the submitted document
     * @return Status message
     */
    public String submitTask(String studentId, String subjectCode, String fileName) {
        if (studentId == null || subjectCode == null || fileName == null ||
            studentId.isEmpty() || subjectCode.isEmpty() || fileName.isEmpty()) {
            return "Missing information";
        }

        // In a real system, code to store the file and log submission would go here

        return "Task submitted successfully";
    }
}
