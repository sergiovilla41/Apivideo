package apivideo.apivideo.repositorios;

import apivideo.apivideo.modelos.Alquiler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlquilerRepositorio extends JpaRepository<Alquiler, Long> {

}
