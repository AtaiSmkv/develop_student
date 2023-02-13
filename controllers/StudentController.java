
package kg.mega.student.controllers;

import kg.mega.student.models.Student;
import kg.mega.student.models.dto.StudentDto;
import kg.mega.student.models.dto.StudentGetDto;
import kg.mega.student.services.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/student"})
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/save")
    public StudentDto save(@RequestBody StudentDto studentDto) {
        return this.studentService.save(studentDto);
    }

    @GetMapping("/findById")
    public StudentDto findById(@RequestParam Long id) {

        return studentService.findById(id);
    }

    @GetMapping("/findAll")
    public List<Student> findAll(){
        return studentService.findAll();
    }
}