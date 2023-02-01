package uic.modalidades.feature.modalities;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/modalities")
@CrossOrigin({ "*" })

public class ModalitiesController {

    @Autowired
    ModalitiesService modalitiesService;

    @GetMapping("/{id}/")
    public Modalities findById(@PathVariable Long id) {
        return modalitiesService.findById(id);
    }

    @GetMapping("/")
    public List<Modalities> findAll() {
        return modalitiesService.findAll();
    }

    @PostMapping("/")
    public Modalities save(@RequestBody Modalities entity) {
        return modalitiesService.save(entity);
    }

    @PutMapping("/{id}/")
    public Modalities update(@RequestBody Modalities entity) {
        return modalitiesService.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable Long id) {
        modalitiesService.deleteById(id);
    }

}
