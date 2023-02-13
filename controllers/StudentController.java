
package kg.mega.student.controllers;

import kg.mega.student.models.dto.StudentDto;
import kg.mega.student.models.dto.StudentGetDto;
import kg.mega.student.services.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/student"})
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping({"/save"})
    public StudentDto save(@RequestBody StudentDto studentDto) {
        return this.studentService.save(studentDto);
    }

    @GetMapping({"/findById"})
    public StudentGetDto findById(@RequestParam Long id) {
        return studentService.findById(id);
    }
}