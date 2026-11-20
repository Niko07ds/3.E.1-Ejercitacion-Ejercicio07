package ejercicio07;

public class Main {

    public static void main(String[] args) {
        System.out.println(" Interfaz gráfica adaptativa ");

        // El framework elige el creador según el sistema operativo
        ThemeComponentCreator desktopCreator = new DarkDesktopCreator();
        ThemeComponentCreator mobileCreator = new MinimalMobileCreator();

        System.out.println("\n- Entorno de escritorio -");
        Form desktopForm = desktopCreator.buildForm("Usuario", "Ingresar");
        desktopForm.render();
        desktopForm.getTextField().type("ana_dev");
        desktopForm.getButton().click();

        System.out.println("\n- Entorno móvil -");
        Form mobileForm = mobileCreator.buildForm("Usuario", "Ingresar");
        mobileForm.render();
        mobileForm.getTextField().type("ana_dev");
        mobileForm.getButton().click();

        System.out.println("\n- Intento de mezclar estilos -");
        try {
            new Form(desktopCreator.createTextField("Correo"), mobileCreator.createButton("Enviar"));
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
