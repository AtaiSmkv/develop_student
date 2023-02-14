package kg.mega.student.services;

import kg.mega.student.models.Student;
import kg.mega.student.models.dto.StudentDto;
import kg.mega.student.models.dto.StudentGetDto;

import java.util.List;

public interface StudentService {

    StudentDto save(StudentDto studentDto);

    StudentDto findById(Long id);
    List<Student> findAll();
    StudentDto update(StudentDto studentDto);
}
