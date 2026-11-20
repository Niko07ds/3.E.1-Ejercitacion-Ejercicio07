package ejercicio07;

/**
 * Creador concreto: produce componentes del estilo Minimalista Móvil.
 */
public class MinimalMobileCreator extends ThemeComponentCreator {

    @Override
    public Button createButton(String label) {
        return new MinimalMobileButton(label);
    }

    @Override
    public TextField createTextField(String placeholder) {
        return new MinimalMobileTextField(placeholder);
    }
}
