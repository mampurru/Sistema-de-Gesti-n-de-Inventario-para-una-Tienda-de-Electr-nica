public class Usuario {
    private String nombreDeUsuario;
    private String contraseña;
    private String rol;

    public Usuario(String nombreDeUsuario, String contraseña, String rol) {
        this.nombreDeUsuario = nombreDeUsuario;
        this.contraseña = contraseña;
        this.rol = rol;
    }

    // Getters y setters
    public String getNombreDeUsuario() {
        return nombreDeUsuario;
    }

    public void setNombreDeUsuario(String nombreDeUsuario) {
        this.nombreDeUsuario = nombreDeUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public boolean verificarContraseña(String contraseña) {
        return this.contraseña.equals(contraseña);
    }
}
