package com.jose.C4_backend;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.ta21geometriaJUnit.repo.geometriaJUnit;

public class GeometriaTest {

    private geometriaJUnit geometria;

    @BeforeEach
    public void setUp() {
        geometria = new geometriaJUnit();
    }

    @Test
    public void testAreacuadrado() {
        int lado = 4;
        int areaEsperada = 16;
        int areaReal = geometria.areacuadrado(lado);
        assertEquals(areaEsperada, areaReal, "El área del cuadrado no es la esperada");
    }

    @Test
    public void testAreatriangulo() {
        int base = 6;
        int altura = 4;
        int areaEsperada = 12;
        int areaReal = geometriaJUnit.areatriangulo(base, altura);
        assertEquals(areaEsperada, areaReal, "El área del triángulo no es la esperada");
    }

    @Test
    public void testArearombo() {
        int diagonalMayor = 8;
        int diagonalMenor = 6;
        int areaEsperada = 24;
        int areaReal = geometria.arearombo(diagonalMayor, diagonalMenor);
        assertEquals(areaEsperada, areaReal, "El área del rombo no es la esperada");
    }
}