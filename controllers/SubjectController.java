
package kg.mega.student.controllers;

import kg.mega.student.models.dto.SubjectDto;
import kg.mega.student.services.SubjectService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping({"/findById"})
    public SubjectDto findById(@RequestParam Long id) {
        return subjectService.findById(id);
    }
}