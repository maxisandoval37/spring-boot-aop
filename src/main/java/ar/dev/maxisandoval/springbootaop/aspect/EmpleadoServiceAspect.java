package ar.dev.maxisandoval.springbootaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmpleadoServiceAspect {

    @Before(value = "execution(* ar.dev.maxisandoval.springbootaop.service.EmpleadoService.*(..)) && args(nombre, id)")
    public void antesDeAgregarEmpleado (JoinPoint joinPoint, String nombre, String id) {
        System.out.println("Metodo Before: " + joinPoint.getSignature());
        System.out.println("Creando empleado...: ".concat(nombre));
    }

    @After(value = "execution(* ar.dev.maxisandoval.springbootaop.service.EmpleadoService.*(..)) && args(nombre, id)")
    public void despuesDeAgregarEmpleado (JoinPoint joinPoint, String nombre, String id) {
        System.out.println("Metodo After: " + joinPoint.getSignature());
        System.out.println("Empleado creado correctamente: ".concat(nombre));
    }
}