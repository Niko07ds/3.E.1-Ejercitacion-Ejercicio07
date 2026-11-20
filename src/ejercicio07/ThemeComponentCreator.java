package ejercicio07;

/**
 * Creador abstracto: declara los métodos de fábrica de los componentes
 * y arma formularios coherentes con el tema.
 */
public abstract class ThemeComponentCreator {

    // Métodos de fábrica
    public abstract Button createButton(String label);

    public abstract TextField createTextField(String placeholder);

    // Operación común: construye un formulario con componentes del mismo tema
    public Form buildForm(String placeholder, String buttonLabel) {
        return new Form(createTextField(placeholder), createButton(buttonLabel));
    }
}
