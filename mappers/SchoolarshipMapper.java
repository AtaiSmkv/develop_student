package kg.mega.student.mappers;

import java.util.Date;
import kg.mega.student.models.Schoolarship;
import kg.mega.student.models.Student;
import kg.mega.student.models.dto.SchoolarshipDto;
import kg.mega.student.util.DateUtil;
import org.springframework.stereotype.Service;

@Service
public class SchoolarshipMapper {
    public SchoolarshipMapper() {
    }

    public Schoolarship schoolarshipDtoToSchoolarship(SchoolarshipDto schoolarshipDto) {
        Schoolarship schoolarship = new Schoolarship();
        Student student = new Student();
        schoolarship.setAmount(schoolarshipDto.getAmount());
        schoolarship.setStartDate(new Date());
        schoolarship.setEndDate(DateUtil.getInstance().getEndDate());
        student.setId(schoolarshipDto.getStudent().getId());
        schoolarship.setStudent(student);
        return schoolarship;
    }

    public SchoolarshipDto schoolarshipToSchoolarshipDto(Schoolarship schoolarship) {
        SchoolarshipDto schoolarshipDto = new SchoolarshipDto();
        schoolarshipDto.setId(schoolarship.getId());
        schoolarshipDto.setAmount(schoolarship.getAmount());
        schoolarshipDto.setStartDate(schoolarship.getStartDate());
        schoolarshipDto.setEndDate(schoolarship.getEndDate());
        schoolarshipDto.setStudent(schoolarship.getStudent());
        return schoolarshipDto;
    }

    public Schoolarship schoolarshipDtoToSchoolarshipUpdate(SchoolarshipDto schoolarshipDto) {
        Schoolarship schoolarship = new Schoolarship();
        Student student = new Student();
        schoolarship.setId(schoolarshipDto.getId());
        schoolarship.setAmount(schoolarshipDto.getAmount());
        schoolarship.setStartDate(new Date());
        schoolarship.setEndDate(DateUtil.getInstance().getEndDate());
        schoolarship.setStudent(student);
        student.setId(schoolarshipDto.getStudent().getId());
        return schoolarship;
    }
}