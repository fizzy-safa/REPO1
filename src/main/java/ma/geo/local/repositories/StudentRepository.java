package ma.geo.local.repositories;

import ma.geo.local.entities.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("repo1")
public interface StudentRepository extends JpaRepository<StudentEntity,Long> {


    //Long save(StudentEntity s);
    //Long update(StudentEntity s);
    //Boolean delete(Long id);
    //List<StudentEntity> selectAll();

}
