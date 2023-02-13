package kg.mega.student.services;

import kg.mega.student.models.dto.TeacherDto;

public interface TeacherService {
    TeacherDto save(TeacherDto teacherDto);

    TeacherDto findById(Long id);
    TeacherDto update(TeacherDto teacherDto);
}
