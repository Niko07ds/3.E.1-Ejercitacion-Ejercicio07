package ejercicio07;

/**
 * Contrato de renderizado que cumplen todos los componentes gráficos.
 */
public interface UiComponent {

    void render();

    // Tema visual al que pertenece el componente
    String getTheme();
}
