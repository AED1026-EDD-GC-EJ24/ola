package miTest;

import miPrincipal.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;

class AppTest {
    static Delimitadores objDel;

    @BeforeAll public static void setUp() {
        objDel = new Delimitadores();
    }

    @Test public void testEvaluacionExitosa(){
        
        String expr= "while (m<(n[8]+o)) { "+
                     "int p=7; "+
                     "/*comentarios*/"+
                     "               }";
        boolean resultado=objDel.evaluacionDelimitadores(expr);
        System.out.println(resultado);
        assertTrue(resultado,"Debe ser verdadero");

    }

    @Test public void testEvaluacionFallida(){
        String expr = "(a+b)*2/5(";
        boolean resultado=objDel.evaluacionDelimitadores(expr);
        System.out.println(resultado);
        assertFalse(resultado,"Debe ser verdadero");

    }
    
    

    
}