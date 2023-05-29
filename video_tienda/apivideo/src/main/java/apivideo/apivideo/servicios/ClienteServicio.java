package apivideo.apivideo.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import apivideo.apivideo.interfaces.IClienteServicio.IClienteServcio;
import apivideo.apivideo.modelos.Cliente;
import apivideo.apivideo.repositorios.ClienteRepositorio;

@Service
public class ClienteServicio implements IClienteServcio {
    @Autowired
    ClienteRepositorio repositorio;

    @Override
    public List<Cliente> listar() {
        return repositorio.findAll();

    }

    @Override
    public Cliente guardar(Cliente cliente) {
        return repositorio.save(cliente);

    }
}
