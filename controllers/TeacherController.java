package kg.mega.student.controllers;

import kg.mega.student.models.Schoolarship;
import kg.mega.student.models.Teacher;
import kg.mega.student.models.dto.TeacherDto;
import kg.mega.student.services.TeacherService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/teacher"})
public class TeacherController {
    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @PostMapping({"/save"})
    public TeacherDto save(@RequestBody TeacherDto teacherDto) {
        return this.teacherService.save(teacherDto);
    }

    @GetMapping({"/findById"})
    public TeacherDto findById(@RequestParam Long id) {
        return teacherService.findById(id);
    }
    @PutMapping("/update")
    public TeacherDto update(@RequestBody TeacherDto teacherDto) {
        return teacherService.update(teacherDto);
    }
    @GetMapping("/findAll")
    public List<Teacher> findAll() {
        return teacherService.findAll();
    }
}
