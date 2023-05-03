package ma.geo.local.controllers;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import ma.geo.local.models.StudentDTO;
import ma.geo.local.services.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final static Logger LOGGER= LoggerFactory.getLogger(StudentController.class);

    private StudentService studentService;

    public StudentController(@Qualifier("service1") StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public Long save( @RequestBody StudentDTO dto) {
        LOGGER.debug("start method save",dto);
        return studentService.save(dto);
    }

    @PutMapping
    @RequestBody

    public Long update(StudentDTO dto) {
        LOGGER.debug("start method update",dto);
        return studentService.update(dto);
    }



    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable("ids") Long id) {
        LOGGER.debug("start method delete",id);
        return studentService.deletebyId(id);
    }

    @GetMapping
    public List<StudentDTO> selectAll() {
        LOGGER.debug("start method select All");
        return studentService.selectAll();
    }

}
