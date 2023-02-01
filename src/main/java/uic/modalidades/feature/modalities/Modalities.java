package uic.modalidades.feature.modalities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Modalities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
private long modalitiesId;
private String modalities; 
private Boolean state;
}
