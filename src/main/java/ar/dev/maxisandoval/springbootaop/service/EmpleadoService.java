package ar.dev.maxisandoval.springbootaop.service;

import ar.dev.maxisandoval.springbootaop.model.Empleado;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoService {

    public Empleado agregarEmpleado (String nombre, String id) {
        System.out.println("Ingresó a [agregarEmpleado]");

        Empleado emp = new Empleado();
        emp.setNombre(nombre);
        emp.setId(id);

        return emp;
    }

    public String eliminarEmpleado (String id) {
        return "empleado eliminado: ".concat(id);
    }
}