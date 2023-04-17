package maintenance.control.MaintenanceControl.models;

import java.time.LocalDateTime;
import java.util.Optional;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

public class Busca {

    int num_login;
    String id_empresa;
    String id_marca;
    String id_modelo;
    String marca;

    public Busca() {
    }

    public Busca(int num_login, String id_empresa, String id_marca, String id_modelo) {
        this.num_login = num_login;
        this.id_empresa = id_empresa;
        this.id_marca = id_marca;
        this.id_modelo = id_modelo;
    }

    public long getnum_login() {
        return num_login;
    }

    public void setnum_login(int num_login) {
        this.num_login = num_login;
    }

    public String getid_empresa() {
        return id_empresa;
    }

    public void setid_empresa(String id_empresa) {
        this.id_empresa = id_empresa;
    }

    public String getid_marca() {
        return id_marca;
    }

    public void setid_marca(String id_marca) {
        this.id_marca = id_marca;
    }

    public String getid_modelo() {
        return id_modelo;
    }

    public void setid_modelo(String id_modelo) {
        this.id_modelo = id_modelo;
    }

}
