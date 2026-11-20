package ejercicio07;

/**
 * Creador concreto: produce componentes del estilo Escritorio Oscuro.
 */
public class DarkDesktopCreator extends ThemeComponentCreator {

    @Override
    public Button createButton(String label) {
        return new DarkDesktopButton(label);
    }

    @Override
    public TextField createTextField(String placeholder) {
        return new DarkDesktopTextField(placeholder);
    }
}
