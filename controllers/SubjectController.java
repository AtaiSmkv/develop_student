
package kg.mega.student.controllers;

import kg.mega.student.models.Subject;
import kg.mega.student.models.dto.SubjectDto;
import kg.mega.student.services.SubjectService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/subject"})
public class SubjectController {
    public final SubjectService subjectService;

    public SubjectController(SubjectService subjectService) {
        this.subjectService = subjectService;
    }

    @PostMapping({"/save"})
    public SubjectDto save(@RequestBody SubjectDto subjectDto) {
        return this.subjectService.save(subjectDto);
    }

    @GetMapping("/findById")
    public SubjectDto findById(@RequestParam Long id) {
        return subjectService.findById(id);
    }
    @PutMapping("/update")
    public SubjectDto update(@RequestBody SubjectDto subjectDto) {
        return subjectService.update(subjectDto);
    }
}