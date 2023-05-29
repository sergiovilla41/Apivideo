package apivideo.apivideo.controladores;

import apivideo.apivideo.interfaces.IAlquilerServicio;
import apivideo.apivideo.modelos.Alquiler;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alquiler")
public class AlquilerControlador {

    @Autowired
    private IAlquilerServicio servicio;

    @GetMapping("/listar")
    public List<Alquiler> listar() {
        return servicio.listar();

    }
}
