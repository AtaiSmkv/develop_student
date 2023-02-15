package kg.mega.student.services;

import kg.mega.student.models.Exam;
import kg.mega.student.models.dto.ExamDto;

import java.util.List;

public interface ExamService {
    ExamDto save(ExamDto examDto);
    ExamDto findById(Long id);
    List<Exam> findAll();
}
