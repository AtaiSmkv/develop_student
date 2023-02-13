package kg.mega.student.services;

import kg.mega.student.models.dto.ExamDto;

public interface ExamService {
    ExamDto save(ExamDto examDto);
    ExamDto findById(Long id);
}
