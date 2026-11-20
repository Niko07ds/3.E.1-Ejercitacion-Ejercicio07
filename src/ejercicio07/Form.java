package ejercicio07;

/**
 * Formulario compuesto por un campo de texto y un botón del mismo tema.
 */
public class Form {

    private final TextField textField;
    private final Button button;

    public Form(TextField textField, Button button) {
        // Garantiza que no se mezclen estilos en pantalla
        if (!textField.getTheme().equals(button.getTheme())) {
            throw new IllegalStateException("Estilos incompatibles: "
                    + textField.getTheme() + " y " + button.getTheme());
        }
        this.textField = textField;
        this.button = button;
        this.button.setOnClick(() ->
                System.out.println("Formulario enviado con el texto: '" + textField.getText() + "'"));
        this.textField.setOnTextChanged(text ->
                System.out.println("  (evento) El texto cambió, ahora tiene " + text.length() + " caracteres"));
    }

    public TextField getTextField() {
        return textField;
    }

    public Button getButton() {
        return button;
    }

    public void render() {
        System.out.println("Renderizando formulario con el tema: " + button.getTheme());
        textField.render();
        button.render();
    }
}
