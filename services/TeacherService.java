package kg.mega.student.services;

import kg.mega.student.models.Teacher;
import kg.mega.student.models.dto.TeacherDto;

import java.util.List;

public interface TeacherService {
    TeacherDto save(TeacherDto teacherDto);

    TeacherDto findById(Long id);
    TeacherDto update(TeacherDto teacherDto);
    List<Teacher> findAll();

}
