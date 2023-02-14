package kg.mega.student.mappers;

import kg.mega.student.models.Subject;
import kg.mega.student.models.Teacher;
import kg.mega.student.models.dto.SubjectDto;
import kg.mega.student.models.dto.TeacherDto;
import org.springframework.stereotype.Service;

@Service
public class SubjectMapper {
    public SubjectMapper() {
    }

    public Subject subjectDtoToSubject(SubjectDto subjectDto) {
        Subject subject = new Subject();
        subject.setTitle(subjectDto.getTitle());
        subject.setActive(subjectDto.isActive());
        Teacher teacher = new Teacher();
        teacher.setId(subjectDto.getTeacher().getId());
        subject.setTeacher(teacher);
        return subject;
    }

    public SubjectDto subjectToSubjectDto(Subject subject) {
        SubjectDto subjectDto = new SubjectDto();
        subjectDto.setId(subject.getId());
        subjectDto.setTitle(subject.getTitle());
        subjectDto.setActive(subject.isActive());
        subjectDto.setTeacher(subject.getTeacher());
        return subjectDto;
    }
    public Subject subjectDtoToSubjectUpdate(SubjectDto subjectDto) {
        Subject subject = new Subject();
        subject.setId(subjectDto.getId());
        subject.setTitle(subjectDto.getTitle());
        subject.setActive(subjectDto.isActive());
        Teacher teacher = new Teacher();
        teacher.setId(subjectDto.getTeacher().getId());
        subject.setTeacher(teacher);
        return subject;
    }
}