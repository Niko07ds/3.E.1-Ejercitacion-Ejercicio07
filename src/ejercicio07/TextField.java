package ejercicio07;

import java.util.function.Consumer;

/**
 * Producto: campo de texto que responde a eventos de escritura.
 */
public interface TextField extends UiComponent {

    void setOnTextChanged(Consumer<String> listener);

    // Simula que el usuario escribe texto
    void type(String text);

    String getText();
}
