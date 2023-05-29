package apivideo.apivideo.servicios;

import apivideo.apivideo.interfaces.IAlquilerServicio;
import apivideo.apivideo.modelos.Alquiler;
import apivideo.apivideo.repositorios.AlquilerRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlquilerServicio implements IAlquilerServicio {

    @Autowired
    AlquilerRepositorio repositorio;

    @Override
    public List<Alquiler> listar() {
        return repositorio.findAll();

    }

    @Override
    public Alquiler guardar(Alquiler alquiler) {
        return repositorio.save(alquiler);

    }

}
