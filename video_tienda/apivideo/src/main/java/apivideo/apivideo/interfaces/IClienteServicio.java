package apivideo.apivideo.interfaces;

import java.util.List;

import apivideo.apivideo.modelos.Cliente;

public interface IClienteServicio {
    public interface IClienteServcio {
        public List<Cliente> listar();

        public Cliente guardar(Cliente cliente);
    }
}
