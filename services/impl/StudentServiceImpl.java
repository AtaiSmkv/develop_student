package kg.mega.student.services.impl;

import kg.mega.student.mappers.StudentMapper;
import kg.mega.student.models.Schoolarship;
import kg.mega.student.models.Student;
import kg.mega.student.models.dto.StudentDto;
import kg.mega.student.models.dto.StudentGetDto;
import kg.mega.student.repositories.SchoolarshipRepo;
import kg.mega.student.repositories.StudentRepo;
import kg.mega.student.services.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepo studentRepo;
    private final StudentMapper studentMapper;
    private final SchoolarshipRepo schoolarshipRepo;

    public StudentServiceImpl(StudentRepo studentRepo, StudentMapper studentMapper, SchoolarshipRepo schoolarshipRepo) {
        this.studentRepo = studentRepo;
        this.studentMapper = studentMapper;
        this.schoolarshipRepo = schoolarshipRepo;
    }

    public StudentDto save(StudentDto studentDto) {
        Student student = this.studentMapper.studentDtoToStudent(studentDto);
        student = (Student)this.studentRepo.save(student);
        studentDto.setId(studentDto.getId());
        return studentDto;
    }

    public StudentGetDto findById(Long id) {
        Student student = (Student)this.studentRepo.findById(id).orElseThrow();
        Schoolarship schoolarship = this.schoolarshipRepo.findByStudentId(id);
        StudentGetDto studentGetDto = this.studentMapper.studentToStudentDto(student, schoolarship);
        return studentGetDto;
    }
}
