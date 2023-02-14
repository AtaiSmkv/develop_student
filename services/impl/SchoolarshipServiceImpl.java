package kg.mega.student.services.impl;

import kg.mega.student.mappers.SchoolarshipMapper;
import kg.mega.student.models.Schoolarship;
import kg.mega.student.models.dto.SchoolarshipDto;
import kg.mega.student.repositories.SchoolarshipRepo;
import kg.mega.student.services.SchoolarshipService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class SchoolarshipServiceImpl implements SchoolarshipService {
    private final SchoolarshipMapper schoolarshipMapper;
    private final SchoolarshipRepo schoolarshipRepo;

    public SchoolarshipServiceImpl(SchoolarshipMapper schoolarshipMapper, SchoolarshipRepo schoolarshipRepo) {
        this.schoolarshipMapper = schoolarshipMapper;
        this.schoolarshipRepo = schoolarshipRepo;
    }

    public SchoolarshipDto save(SchoolarshipDto schoolarshipDto) {
        Schoolarship schoolarship = schoolarshipMapper.schoolarshipDtoToSchoolarship(schoolarshipDto);
        changeEndDate(schoolarship.getStudent().getId());
        schoolarship = schoolarshipRepo.save(schoolarship);
        schoolarshipDto.setId(schoolarship.getId());
        return schoolarshipDto;
    }

    public SchoolarshipDto findById(Long id) {
        Schoolarship schoolarship = schoolarshipRepo.findById(id).orElseThrow();
        SchoolarshipDto schoolarshipDto = schoolarshipMapper.schoolarshipToSchoolarshipDto(schoolarship);
        return schoolarshipDto;
    }

    public List<Schoolarship> changeEndDate(Long id) {
    List<Schoolarship> oldSchoolarship = schoolarshipRepo.findByStudentlist(id);
        for (Schoolarship item: oldSchoolarship) {
            if(item.getEndDate().after(new Date())){
                item.setEndDate(new Date());
                save(schoolarshipMapper.schoolarshipToSchoolarshipDto(item));
            }
        }
    return null;

    }


}
