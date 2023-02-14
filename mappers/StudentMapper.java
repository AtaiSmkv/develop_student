package kg.mega.student.mappers;

import kg.mega.student.models.Rates;
import kg.mega.student.models.Schoolarship;
import kg.mega.student.models.Student;
import kg.mega.student.models.Subject;
import kg.mega.student.models.dto.ExamGetDto;
import kg.mega.student.models.dto.StudentDto;
import kg.mega.student.models.dto.StudentGetDto;
import kg.mega.student.models.dto.SubjectTeacherDto;
import kg.mega.student.repositories.ExamRepo;
import kg.mega.student.repositories.RateRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentMapper {
    private final ExamRepo examRepo;
    private final RateRepo rateRepo;
    public StudentMapper(ExamRepo examRepo, RateRepo rateRepo) {
        this.examRepo = examRepo;
        this.rateRepo = rateRepo;
    }

    public Student studentDtoToStudent(StudentDto studentDto) {
        Student student = new Student();
        studentDto.setId(student.getId());
        student.setLastName(studentDto.getLatName());
        student.setName(studentDto.getName());
        student.setPatronomyic(studentDto.getPatronymic());
        student.setActive(studentDto.isActive());
        student.setAddress(studentDto.getAddress());
        Subject subject = new Subject();
        subject.setId(studentDto.getSubject().getId());
        student.setSubject(subject);
        return student;
    }

    public StudentDto studentToStudentDto(Student student) {
        StudentDto studentDto = new StudentDto();

        studentDto.setName(student.getName());
        studentDto.setLatName(student.getLastName());
        studentDto.setPatronymic(student.getPatronomyic());
        studentDto.setActive(student.isActive());
        studentDto.setAddress(student.getAddress());
        studentDto.setSubject(student.getSubject());

        return studentDto;


        /*studentGetDto.setAmount(schoolarship.getAmount());
        SubjectTeacherDto subjectTeacherDto = new SubjectTeacherDto();
        subjectTeacherDto.setName(student.getSubject().getTitle());
        subjectTeacherDto.setTeacherName(student.getSubject().getTeacher().getName());
        Rates rates = new Rates();
        List<ExamGetDto> examGetDto = new ArrayList<>();
        examGetDto.stream()
                        .map(x -> examGetDto(x))
                                .collect(Collectors.toList());
                                        examGetDto.setDate(rates.getExam().getExamDate());
        examGetDto.setRates(rates.getScore());

        subjectTeacherDto.setExamGetDtoList(examGetDto);
        studentGetDto.setSubjectTeacherDto(subjectTeacherDto);*/
    }


}