package kg.mega.student.mappers;

import kg.mega.student.models.Exam;
import kg.mega.student.models.Rates;
import kg.mega.student.models.Student;
import kg.mega.student.models.dto.RatesDto;
import org.springframework.stereotype.Service;

@Service
public class RateMapper {
    public RateMapper() {
    }

    public Rates ratesDtoToRates(RatesDto ratesDto) {
        Rates rates = new Rates();
        rates.setScore(rates.getScore());
        Student student = new Student();
        student.setId(ratesDto.getStudent().getId());
        rates.setStudent(student);
        Exam exam = new Exam();
        exam.setId(ratesDto.getExam().getId());
        rates.setExam(exam);
        return rates;
    }
}