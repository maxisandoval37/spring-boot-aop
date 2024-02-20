package ar.dev.maxisandoval.springbootaop.controller;

import ar.dev.maxisandoval.springbootaop.model.Empleado;
import ar.dev.maxisandoval.springbootaop.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @RequestMapping(value = "/agregar/empleado", method = RequestMethod.GET)
    public Empleado agregarEmpleado (@RequestParam("nombre") String nombre, @RequestParam("id") String id) {
        return empleadoService.agregarEmpleado(nombre,id);
    }
}