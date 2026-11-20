package ejercicio07;

/**
 * Producto concreto: botón del estilo Escritorio Oscuro.
 */
public class DarkDesktopButton implements Button {

    private final String label;
    private Runnable action;

    public DarkDesktopButton(String label) {
        this.label = label;
    }

    @Override
    public void setOnClick(Runnable action) {
        this.action = action;
    }

    @Override
    public void click() {
        System.out.println("[Escritorio Oscuro] Clic con el mouse en el botón '" + label + "'");
        if (action != null) {
            action.run();
        }
    }

    @Override
    public void render() {
        System.out.println("[=== " + label + " ===]  (fondo gris oscuro, borde recto)");
    }

    @Override
    public String getTheme() {
        return "Escritorio Oscuro";
    }
}
