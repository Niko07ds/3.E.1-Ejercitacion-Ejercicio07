package ejercicio07;

import java.util.function.Consumer;

/**
 * Producto concreto: campo de texto del estilo Minimalista Móvil.
 */
public class MinimalMobileTextField implements TextField {

    private final String placeholder;
    private String text = "";
    private Consumer<String> listener;

    public MinimalMobileTextField(String placeholder) {
        this.placeholder = placeholder;
    }

    @Override
    public void setOnTextChanged(Consumer<String> listener) {
        this.listener = listener;
    }

    @Override
    public void type(String text) {
        this.text = text;
        System.out.println("[Móvil Minimalista] Se escribe con teclado táctil: " + text);
        if (listener != null) {
            listener.accept(text);
        }
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public void render() {
        System.out.println("  " + placeholder + "  ________  (solo línea inferior)");
    }

    @Override
    public String getTheme() {
        return "Móvil Minimalista";
    }
}
