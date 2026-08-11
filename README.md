# 35_PSW_LuisSanchez

## Laboratorio: Sistema de Calificaciones

## Casos de prueba

### calcularPromedio()

| Caso | Notas         | Esperado |
|------|---------------|----------|
| 1    | 15, 14, 16    | 15.0     |
| 2    | 10, 12, 14    | 12.0     |
| 3    | 20, 18, 16    | 18.0     |

### estaAprobado()

| Caso | Promedio | Esperado |
|------|----------|----------|
| 4    | 15       | true     |
| 5    | 13       | true (límite exacto) |
| 6    | 12       | false    |
| 7    | 5        | false    |

---

## Reto — Octavo caso de prueba

**Caso:** `estaAprobado(12.9)` → Esperado: `false`

### ¿Por qué elegí este caso?

Elegí este caso porque es una situación que puede pasar en la realidad un estudiante obtiene una nota de 12.9 y el sistema lo marca como aprobado cuando en realidad no lo está. Eso es un error grave en cualquier sistema de calificaciones.

Al implementar este caso de prueba me aseguré de que el método `estaAprobado()` no apruebe a nadie que no llegue exactamente al mínimo de 13, sin importar qué tan cerca esté. Si el sistema falla en este caso, un alumno que no aprobó podría pasar sin merecerlo.

## Estructura del proyecto

```
pruebas-intro/
├── src/
│   ├── main/java/pe/edu/vallegrande/
│   │   └── Calificacion.java
│   └── test/java/
│       └── CalificacionTest.java
└── pom.xml
```
