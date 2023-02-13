package kg.mega.student.mappers;

import kg.mega.student.models.Schoolarship;
import kg.mega.student.models.Student;
import kg.mega.student.models.Subject;
import kg.mega.student.models.dto.StudentDto;
import kg.mega.student.models.dto.StudentGetDto;
import kg.mega.student.models.dto.SubjectTeacherDto;
import org.springframework.stereotype.Service;

@Service
public class StudentMapper {
    public StudentMapper() {
    }

    public Student studentDtoToStudent(StudentDto studentDto) {
        Student student = new Student();
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

    public StudentGetDto studentToStudentDto(Student student, Schoolarship schoolarship) {
        StudentGetDto studentGetDto = new StudentGetDto();
        studentGetDto.setName(student.getName());
        studentGetDto.setLastName(student.getLastName());
        studentGetDto.setPatronymic(student.getPatronomyic());
        studentGetDto.setAmount(schoolarship.getAmount());
        SubjectTeacherDto subjectTeacherDto = new SubjectTeacherDto();
        subjectTeacherDto.setName(student.getSubject().getTitle());
        subjectTeacherDto.setTeacherName(student.getSubject().getTeacher().getName());
        studentGetDto.setSubjectTeacherDto(subjectTeacherDto);
        return studentGetDto;
    }
}