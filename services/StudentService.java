package kg.mega.student.services;

import kg.mega.student.models.dto.StudentDto;
import kg.mega.student.models.dto.StudentGetDto;

public interface StudentService {

    StudentDto save(StudentDto studentDto);

    StudentGetDto findById(Long id);
}
