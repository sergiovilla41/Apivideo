package apivideo.apivideo.interfaces;

import apivideo.apivideo.modelos.Alquiler;
import java.util.List;

public interface IAlquilerServicio {

    public List<Alquiler> listar();

    public Alquiler guardar(Alquiler alquiler);

}
