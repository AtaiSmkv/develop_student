package kg.mega.student.controllers;

import kg.mega.student.models.dto.TeacherDto;
import kg.mega.student.services.TeacherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
}
