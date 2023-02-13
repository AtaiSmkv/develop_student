package kg.mega.student.mappers;

import kg.mega.student.models.Exam;
import kg.mega.student.models.Subject;
import kg.mega.student.models.dto.ExamDto;
import org.springframework.stereotype.Service;

@Service
public class ExamMapper {
    public ExamMapper() {
    }

    public Exam examDtoToExam(ExamDto examDto) {
        Exam exam = new Exam();
        exam.setExamDate(examDto.getExamDate());
        exam.setDuration(examDto.getDuration());
        exam.setScore(examDto.getScore());
        Subject subject = new Subject();
        subject.setId(examDto.getSubject().getId());
        exam.setSubject(subject);
        exam.setExamDate(examDto.getExamDate());
        return exam;
    }
}