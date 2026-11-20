package ejercicio07;

/**
 * Producto: botón que responde a eventos de pulsación.
 */
public interface Button extends UiComponent {

    void setOnClick(Runnable action);

    // Simula la pulsación del usuario
    void click();
}
