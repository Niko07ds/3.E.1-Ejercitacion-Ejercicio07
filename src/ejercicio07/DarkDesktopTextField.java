package ejercicio07;

import java.util.function.Consumer;

/**
 * Producto concreto: campo de texto del estilo Escritorio Oscuro.
 */
public class DarkDesktopTextField implements TextField {

    private final String placeholder;
    private String text = "";
    private Consumer<String> listener;

    public DarkDesktopTextField(String placeholder) {
        this.placeholder = placeholder;
    }

    @Override
    public void setOnTextChanged(Consumer<String> listener) {
        this.listener = listener;
    }

    @Override
    public void type(String text) {
        this.text = text;
        System.out.println("[Escritorio Oscuro] Se escribe con teclado físico: " + text);
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
        System.out.println("[ " + placeholder + " ______ ]  (texto claro sobre fondo oscuro)");
    }

    @Override
    public String getTheme() {
        return "Escritorio Oscuro";
    }
}
