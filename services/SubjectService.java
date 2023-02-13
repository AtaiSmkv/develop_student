package kg.mega.student.services;

import kg.mega.student.models.dto.SubjectDto;

public interface SubjectService {
    SubjectDto save(SubjectDto subjectDto);

    SubjectDto findById(Long id);
}
