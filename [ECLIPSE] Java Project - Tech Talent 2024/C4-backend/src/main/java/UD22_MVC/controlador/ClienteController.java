package UD22_MVC.controlador;

import java.util.List;

import UD22_MVC.modelo.Cliente;

public class ClienteController {
    public void addCliente(Cliente cliente) {
        cliente.addCliente();
    }

    public List<Cliente> getAllClientes() {
        return Cliente.getAllClientes();
    }

    public Cliente getClienteById(int id) {
        return Cliente.getClienteById(id);
    }

    public static void updateCliente(Cliente cliente) {
        cliente.updateCliente();
    }

    public void deleteCliente(int id) {
        Cliente.deleteCliente(id);
    }
    
}
