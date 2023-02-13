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
        Subject subject = new Subject();
        subject.setId(examDto.getSubject().getId());
        exam.setSubject(subject);
        exam.setExamDate(examDto.getExamDate());
        return exam;
    }

    public ExamDto examToExamDto(Exam exam) {
        ExamDto examDto = new ExamDto();
        examDto.setId(exam.getId());
        examDto.setExamDate(exam.getExamDate());
        examDto.setSubject(exam.getSubject());
        examDto.setDuration(exam.getDuration());

        return examDto;

    }
}