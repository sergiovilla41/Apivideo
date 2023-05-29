package apivideo.apivideo.controladores;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import apivideo.apivideo.interfaces.IClienteServicio.IClienteServcio;
import apivideo.apivideo.modelos.Cliente;

@RestController
@RequestMapping("/cliente")
public class ClienteControlador {
    @Autowired
    private IClienteServcio servcio;

    @GetMapping("/listar")
    public List<Cliente> listar() {
        return servcio.listar();

    }
}
