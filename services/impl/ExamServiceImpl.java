package kg.mega.student.services.impl;

import kg.mega.student.mappers.ExamMapper;
import kg.mega.student.models.Exam;
import kg.mega.student.models.dto.ExamDto;
import kg.mega.student.repositories.ExamRepo;
import kg.mega.student.services.ExamService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamServiceImpl implements ExamService {
    private final ExamRepo examRepo;
    private final ExamMapper examMapper;

    public ExamServiceImpl(ExamRepo examRepo, ExamMapper examMapper) {
        this.examRepo = examRepo;
        this.examMapper = examMapper;
    }

    public ExamDto save(ExamDto examDto) {
        Exam exam = this.examMapper.examDtoToExam(examDto);
        exam = (Exam)this.examRepo.save(exam);
        examDto.setId(examDto.getId());
        return examDto;
    }

    @Override
    public ExamDto findById(Long id) {
        Exam exam = examRepo.findById(id).get();
        ExamDto examDto = examMapper.examToExamDto(exam);
        return examDto;
    }
    @Override
    public List<Exam> findAll() {
        return examRepo.findAll();
    }
}
