package ejercicio07;

/**
 * Producto concreto: botón del estilo Minimalista Móvil.
 */
public class MinimalMobileButton implements Button {

    private final String label;
    private Runnable action;

    public MinimalMobileButton(String label) {
        this.label = label;
    }

    @Override
    public void setOnClick(Runnable action) {
        this.action = action;
    }

    @Override
    public void click() {
        System.out.println("[Móvil Minimalista] Toque con el dedo en el botón '" + label + "'");
        if (action != null) {
            action.run();
        }
    }

    @Override
    public void render() {
        System.out.println("( " + label + " )  (fondo blanco, bordes redondeados)");
    }

    @Override
    public String getTheme() {
        return "Móvil Minimalista";
    }
}
