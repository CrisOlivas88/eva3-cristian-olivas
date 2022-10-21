/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author coliv
 */
@Entity
@Table(name = "Familia")
@NamedQueries({
    @NamedQuery(name = "Familia.findAll", query = "SELECT f FROM Familia f"),
    @NamedQuery(name = "Familia.findByNombreIntegrante", query = "SELECT f FROM Familia f WHERE f.nombreIntegrante = :nombreIntegrante"),
    @NamedQuery(name = "Familia.findByParentezcoIntegrante", query = "SELECT f FROM Familia f WHERE f.parentezcoIntegrante = :parentezcoIntegrante"),
    @NamedQuery(name = "Familia.findByNumeroIntegrante", query = "SELECT f FROM Familia f WHERE f.numeroIntegrante = :numeroIntegrante")})
public class Familia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 2147483647)
    @Column(name = "nombreIntegrante")
    private String nombreIntegrante;
    @Size(max = 2147483647)
    @Column(name = "parentezcoIntegrante")
    private String parentezcoIntegrante;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "numeroIntegrante")
    private Integer numeroIntegrante;

    public Familia() {
    }

    public Familia(Integer numeroIntegrante) {
        this.numeroIntegrante = numeroIntegrante;
    }

    public String getNombreIntegrante() {
        return nombreIntegrante;
    }

    public void setNombreIntegrante(String nombreIntegrante) {
        this.nombreIntegrante = nombreIntegrante;
    }

    public String getParentezcoIntegrante() {
        return parentezcoIntegrante;
    }

    public void setParentezcoIntegrante(String parentezcoIntegrante) {
        this.parentezcoIntegrante = parentezcoIntegrante;
    }

    public Integer getNumeroIntegrante() {
        return numeroIntegrante;
    }

    public void setNumeroIntegrante(Integer numeroIntegrante) {
        this.numeroIntegrante = numeroIntegrante;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numeroIntegrante != null ? numeroIntegrante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Familia)) {
            return false;
        }
        Familia other = (Familia) object;
        if ((this.numeroIntegrante == null && other.numeroIntegrante != null) || (this.numeroIntegrante != null && !this.numeroIntegrante.equals(other.numeroIntegrante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Familia[ numeroIntegrante=" + numeroIntegrante + " ]";
    }
    
}
