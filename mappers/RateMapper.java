package kg.mega.student.mappers;

import kg.mega.student.models.Exam;
import kg.mega.student.models.Rates;
import kg.mega.student.models.Student;
import kg.mega.student.models.Subject;
import kg.mega.student.models.dto.RatesDto;
import kg.mega.student.repositories.ExamRepo;
import kg.mega.student.repositories.StudentRepo;
import kg.mega.student.repositories.SubjectRepo;
import org.springframework.stereotype.Service;

@Service
public class RateMapper {
    private final SubjectRepo subjectRepo;
    private final ExamRepo examRepo;
    private final StudentRepo studentRepo;
    public RateMapper(SubjectRepo subjectRepo, ExamRepo examRepo, StudentRepo studentRepo) {
        this.subjectRepo = subjectRepo;
        this.examRepo = examRepo;
        this.studentRepo = studentRepo;
    }

    public Rates ratesDtoToRates(RatesDto ratesDto) {
        Rates rates = new Rates();
        rates.setId(ratesDto.getId());
        rates.setScore(rates.getScore());
        Student student = new Student();
        student.setId(ratesDto.getStudent().getId());
        rates.setStudent(student);
        Exam exam = new Exam();
        exam.setId(ratesDto.getExam().getId());
        rates.setExam(exam);
        return rates;
    }

    public RatesDto ratesToRateDto(Rates rates) {
        RatesDto ratesDto = new RatesDto();
        Exam exam = examRepo.findById(rates.getExam().getId()).get();
        Subject subject = subjectRepo.findById(rates.getExam().getSubject().getId()).get();
        Student student = studentRepo.findById(rates.getStudent().getId()).get();
        ratesDto.setId(rates.getId());
        exam.setSubject(subject);
        ratesDto.setExam(exam);
        ratesDto.setStudent(student);
        ratesDto.setScore(rates.getScore());
        return ratesDto;



    }
}