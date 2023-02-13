package kg.mega.student.repositories;

import kg.mega.student.models.Exam;
import kg.mega.student.models.Schoolarship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamRepo extends JpaRepository<Exam, Long> {

}
