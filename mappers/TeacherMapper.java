package kg.mega.student.mappers;

import kg.mega.student.models.Teacher;
import kg.mega.student.models.dto.TeacherDto;
import org.springframework.stereotype.Service;

@Service
public class TeacherMapper {
    public TeacherMapper() {
    }

    public Teacher teacherDtoToTeacher(TeacherDto teacherDto) {
        Teacher teacher = new Teacher();
        teacher.setName(teacherDto.getName());
        teacher.setLastName(teacherDto.getLastName());
        teacher.setActive(teacherDto.isActive());
        teacher.setPatronymic(teacherDto.getPatronymic());
        return teacher;
    }

    public TeacherDto teacherToTeacherDto(Teacher teacher) {
        TeacherDto teacherDto = new TeacherDto();
        teacherDto.setId(teacher.getId());
        teacherDto.setActive(teacher.isActive());
        teacherDto.setName(teacher.getName());
        teacherDto.setLastName(teacher.getLastName());
        teacherDto.setPatronymic(teacher.getPatronymic());
        return teacherDto;
    }
}