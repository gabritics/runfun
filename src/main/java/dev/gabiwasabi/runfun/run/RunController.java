package dev.gabiwasabi.runfun.run;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/runs")
public class RunController {


    private final RunRepository runRepository;

    public RunController(RunRepository runRepository) {
        this.runRepository = runRepository;
    }

    @GetMapping("")
    List<Run> findAll() {
        return runRepository.findAll();
    }
//
//    @GetMapping("/{id}")
//    Run findById(@PathVariable Integer id) {
//        Optional<Run> run = runRepository.findByID(id);
//        if (run.isEmpty()) {
//            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Run not found");
//        }
//        return run.get();
//    }
//
//    //post
//    @ResponseStatus(HttpStatus.CREATED)
//    @PostMapping("")
//    void create(@Valid @RequestBody Run run) {
//        runRepository.create(run);
//    }
//    //put
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    @PutMapping("/{id}")
//    void update(@RequestBody Run run, @PathVariable Integer id) {
//        runRepository.update(run, id);
//    }
//    //delete
//   @ResponseStatus(HttpStatus.NO_CONTENT)
//   @DeleteMapping("/{id}")
//   void delete(@PathVariable Integer id) {
//        runRepository.delete(id);
//   }
}
//curl -X PUT -H "Content-Type: application/json" -d '{"id":3,"title":"Monday Morning Run","startedOn":"2025-11-14T12:50:03.9999","completedOn":"2025-11-14T13:20:03.9999","miles":3,"location":"INDOOR"}' http://localhost:8080/api/runs/3
//curl -X POST -H "Content-Type: application/json" -d '{"id":3,"title":"Monday Morning Run","startedOn":"2025-11-14T12:50:03.0","completedOn":"2025-11-14T13:20:03.0","miles":3,"location":"INDOOR"}' http://localhost:8080/api/runs
//curl -X DELETE http://localhost:8080/api/runs/3