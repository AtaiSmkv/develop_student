package kg.mega.student.services.impl;

import kg.mega.student.mappers.TeacherMapper;
import kg.mega.student.models.Teacher;
import kg.mega.student.models.dto.TeacherDto;
import kg.mega.student.repositories.TeacherRepo;
import kg.mega.student.services.TeacherService;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {
    private final TeacherMapper teacherMapper;
    private final TeacherRepo teacherRepo;

    public TeacherServiceImpl(TeacherMapper teacherMapper, TeacherRepo teacherRepo) {
        this.teacherMapper = teacherMapper;
        this.teacherRepo = teacherRepo;
    }

    public TeacherDto save(TeacherDto teacherDto) {
        Teacher teacher = this.teacherMapper.teacherDtoToTeacher(teacherDto);
        teacher = (Teacher)this.teacherRepo.save(teacher);
        teacherDto.setId(teacher.getId());
        return teacherDto;
    }

    public TeacherDto findById(Long id) {
        Teacher teacher = (Teacher)this.teacherRepo.findById(id).orElseThrow(() -> {
            return new RuntimeException("Преподаватель не найден");
        });
        TeacherDto teacherDto = this.teacherMapper.teacherToTeacherDto(teacher);
        return teacherDto;
    }
}