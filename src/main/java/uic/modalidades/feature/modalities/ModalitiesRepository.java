package uic.modalidades.feature.modalities;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ModalitiesRepository extends CrudRepository<Modalities, Long> {

    List<Modalities> findAll();
}