package kg.mega.student.controllers;

import kg.mega.student.models.dto.ExamDto;
import kg.mega.student.services.ExamService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}