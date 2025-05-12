package week9;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubmitTaskServiceTest {

    @Test
    public void testSubmitTaskSuccess() {
        SubmitTaskService service = new SubmitTaskService();
        String result = service.submitTask("12345", "COMP101", "assignment1.docx");
        assertEquals("Task submitted successfully", result);
    }

    @Test
    public void testSubmitTaskMissingStudentId() {
        SubmitTaskService service = new SubmitTaskService();
        String result = service.submitTask("", "COMP101", "assignment1.docx");
        assertEquals("Missing information", result);
    }

    @Test
    public void testSubmitTaskMissingSubjectCode() {
        SubmitTaskService service = new SubmitTaskService();
        String result = service.submitTask("12345", "", "assignment1.docx");
        assertEquals("Missing information", result);
    }

    @Test
    public void testSubmitTaskMissingFileName() {
        SubmitTaskService service = new SubmitTaskService();
        String result = service.submitTask("12345", "COMP101", "");
        assertEquals("Missing information", result);
    }

    @Test
    public void testSubmitTaskAllFieldsEmpty() {
        SubmitTaskService service = new SubmitTaskService();
        String result = service.submitTask("", "", "");
        assertEquals("Missing information", result);
    }
}
