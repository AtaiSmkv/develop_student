package kg.mega.student.repositories;

import kg.mega.student.models.Exam;
import kg.mega.student.models.Schoolarship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SchoolarshipRepo extends JpaRepository<Schoolarship, Long> {
    Schoolarship findByStudentId(Long id);

    @Query(value = "select * from schoolarships where student_id = :id", nativeQuery = true )
    List<Schoolarship> findByStudentlist (Long id);
}
