package kg.mega.student.controllers;

import kg.mega.student.models.Schoolarship;
import kg.mega.student.models.dto.SchoolarshipDto;
import kg.mega.student.services.SchoolarshipService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/schoolarship"})
public class SchoolarshipController {
    private final SchoolarshipService schoolarshipService;

    public SchoolarshipController(SchoolarshipService schoolarshipService) {
        this.schoolarshipService = schoolarshipService;
    }

    @PostMapping({"/save"})
    public SchoolarshipDto save(@RequestBody SchoolarshipDto schoolarshipDto) {
        return this.schoolarshipService.save(schoolarshipDto);
    }

    @GetMapping({"/findById"})
    public SchoolarshipDto findById(@RequestParam Long id) {
        return schoolarshipService.findById(id);
    }

    @GetMapping("/findAll")
    public List<Schoolarship> findAll() {
        return schoolarshipService.findAll();
    }
}
