package kg.mega.student.services.impl;

import kg.mega.student.mappers.StudentMapper;
import kg.mega.student.models.Rates;
import kg.mega.student.models.Schoolarship;
import kg.mega.student.models.Student;
import kg.mega.student.models.dto.StudentDto;
import kg.mega.student.models.dto.StudentGetDto;
import kg.mega.student.repositories.ExamRepo;
import kg.mega.student.repositories.RateRepo;
import kg.mega.student.repositories.SchoolarshipRepo;
import kg.mega.student.repositories.StudentRepo;
import kg.mega.student.services.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepo studentRepo;
    private final StudentMapper studentMapper;
    private final SchoolarshipRepo schoolarshipRepo;
    private final ExamRepo examRepo;
    private final RateRepo rateRepo;

    public StudentServiceImpl(StudentRepo studentRepo, StudentMapper studentMapper, SchoolarshipRepo schoolarshipRepo, ExamRepo examRepo, RateRepo rateRepo) {
        this.studentRepo = studentRepo;
        this.studentMapper = studentMapper;
        this.schoolarshipRepo = schoolarshipRepo;
        this.examRepo = examRepo;
        this.rateRepo = rateRepo;
    }

    public StudentDto save(StudentDto studentDto) {
        Student student = this.studentMapper.studentDtoToStudent(studentDto);
        student = (Student)this.studentRepo.save(student);
        studentDto.setId(studentDto.getId());
        return studentDto;
    }
@Override
    public StudentDto findById(Long id) {
        Student student = studentRepo.findById(id).get();
        StudentDto studentDto = studentMapper.studentToStudentDto(student);
        return studentDto;
    }

    @Override
    public List<Student> findAll() {
        return studentRepo.findAll();
    }
}
