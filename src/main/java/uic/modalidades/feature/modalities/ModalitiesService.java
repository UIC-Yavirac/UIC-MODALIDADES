package uic.modalidades.feature.modalities;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Transactional
@Service
public class ModalitiesService {
    @Autowired
    ModalitiesRepository modalitiesRepository;

    @Transactional
    public Modalities save(Modalities entity) {
        return modalitiesRepository.save(entity);
    }

    public Modalities findById(Long id) {
        return modalitiesRepository.findById(id).orElse(new Modalities());
    }

    public void deleteById(Long id) {
        modalitiesRepository.deleteById(id);
    }

    public List<Modalities> findAll() {
        return modalitiesRepository.findAll();
    }
}
