package kg.mega.student.controllers;

import kg.mega.student.models.dto.ExamDto;
import kg.mega.student.services.ExamService;
import org.springframework.web.bind.annotation.*;

@RestController
    @RequestMapping({"/exam"})
    public class ExamController {
        private final ExamService examService;

        public ExamController(ExamService examService) {

            this.examService = examService;
        }

        @PostMapping({"/save"})
        public ExamDto save(@RequestBody ExamDto examDto) {

            return examService.save(examDto);
        }

        @GetMapping("/findById")
         public ExamDto findById(@RequestParam Long id) {
            return examService.findById(id);
        }




}
