/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ibm.ibmemploymentcontrolapp.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author FabioHenriqueGoulart
 */
@Entity
@Table(name = "vaga")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vaga.findAll", query = "SELECT v FROM Vaga v")
    , @NamedQuery(name = "Vaga.findById", query = "SELECT v FROM Vaga v WHERE v.id = :id")
    , @NamedQuery(name = "Vaga.findByStatus", query = "SELECT v FROM Vaga v WHERE v.status = :status")
    , @NamedQuery(name = "Vaga.findByPmp", query = "SELECT v FROM Vaga v WHERE v.pmp = :pmp")
    , @NamedQuery(name = "Vaga.findByDataDeAbertura", query = "SELECT v FROM Vaga v WHERE v.dataDeAbertura = :dataDeAbertura")
    , @NamedQuery(name = "Vaga.findByExpectativaDeEntrada", query = "SELECT v FROM Vaga v WHERE v.expectativaDeEntrada = :expectativaDeEntrada")
    , @NamedQuery(name = "Vaga.findByExpectativaDeAbertura", query = "SELECT v FROM Vaga v WHERE v.expectativaDeAbertura = :expectativaDeAbertura")
    , @NamedQuery(name = "Vaga.findByArea", query = "SELECT v FROM Vaga v WHERE v.area = :area")
    , @NamedQuery(name = "Vaga.findByBanda", query = "SELECT v FROM Vaga v WHERE v.banda = :banda")
    , @NamedQuery(name = "Vaga.findByTipo", query = "SELECT v FROM Vaga v WHERE v.tipo = :tipo")
    , @NamedQuery(name = "Vaga.findByTecnologia", query = "SELECT v FROM Vaga v WHERE v.tecnologia = :tecnologia")
    , @NamedQuery(name = "Vaga.findByDetalhe", query = "SELECT v FROM Vaga v WHERE v.detalhe = :detalhe")
    , @NamedQuery(name = "Vaga.findByAprovacaoBoardBrasil", query = "SELECT v FROM Vaga v WHERE v.aprovacaoBoardBrasil = :aprovacaoBoardBrasil")
    , @NamedQuery(name = "Vaga.findByDesdeAberturaBrasil", query = "SELECT v FROM Vaga v WHERE v.desdeAberturaBrasil = :desdeAberturaBrasil")
    , @NamedQuery(name = "Vaga.findByAprovacaoBoardGlobal", query = "SELECT v FROM Vaga v WHERE v.aprovacaoBoardGlobal = :aprovacaoBoardGlobal")
    , @NamedQuery(name = "Vaga.findByDesdeAberturaGlobal", query = "SELECT v FROM Vaga v WHERE v.desdeAberturaGlobal = :desdeAberturaGlobal")
    , @NamedQuery(name = "Vaga.findByProfissionalSelecionado", query = "SELECT v FROM Vaga v WHERE v.profissionalSelecionado = :profissionalSelecionado")
    , @NamedQuery(name = "Vaga.findByEntrouNaOperacao", query = "SELECT v FROM Vaga v WHERE v.entrouNaOperacao = :entrouNaOperacao")
    , @NamedQuery(name = "Vaga.findByDesdeAberturaAprovacao", query = "SELECT v FROM Vaga v WHERE v.desdeAberturaAprovacao = :desdeAberturaAprovacao")
    , @NamedQuery(name = "Vaga.findByRate", query = "SELECT v FROM Vaga v WHERE v.rate = :rate")
    , @NamedQuery(name = "Vaga.findByDesdeExpectativa", query = "SELECT v FROM Vaga v WHERE v.desdeExpectativa = :desdeExpectativa")
    , @NamedQuery(name = "Vaga.findByImpactoFinanceiro", query = "SELECT v FROM Vaga v WHERE v.impactoFinanceiro = :impactoFinanceiro")
    , @NamedQuery(name = "Vaga.findByComentario", query = "SELECT v FROM Vaga v WHERE v.comentario = :comentario")
    , @NamedQuery(name = "Vaga.findByCategoria", query = "SELECT v FROM Vaga v WHERE v.categoria = :categoria")
    , @NamedQuery(name = "Vaga.findOpenOnHoldByAreaExpectativa", query = "SELECT v FROM Vaga v WHERE v.status = 'Open' OR v.status = 'On Hold' ORDER BY v.area, v.expectativaDeEntrada")
    , @NamedQuery(name = "Vaga.findOpenOnHoldByOrdemCronologica", query = "SELECT v FROM Vaga v WHERE v.status = 'Open' OR v.status = 'On Hold' ORDER BY v.expectativaDeEntrada")
})
public class Vaga implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 20)
    @Column(name = "status")
    private String status;
    @Column(name = "pmp")
    private Integer pmp;
    @Column(name = "data_de_abertura")
    @Temporal(TemporalType.DATE)
    private Date dataDeAbertura;
    @Column(name = "expectativa_de_entrada")
    @Temporal(TemporalType.DATE)
    private Date expectativaDeEntrada;
    @Column(name = "expectativa_de_abertura")
    private Integer expectativaDeAbertura;
    @Size(max = 30)
    @Column(name = "area")
    private String area;
    @Size(max = 5)
    @Column(name = "banda")
    private String banda;
    @Size(max = 50)
    @Column(name = "tipo")
    private String tipo;
    @Size(max = 50)
    @Column(name = "tecnologia")
    private String tecnologia;
    @Size(max = 150)
    @Column(name = "detalhe")
    private String detalhe;
    @Column(name = "aprovacao_board_brasil")
    @Temporal(TemporalType.DATE)
    private Date aprovacaoBoardBrasil;
    @Column(name = "desde_abertura_brasil")
    private Integer desdeAberturaBrasil;
    @Column(name = "aprovacao_board_global")
    @Temporal(TemporalType.DATE)
    private Date aprovacaoBoardGlobal;
    @Column(name = "desde_abertura_global")
    private Integer desdeAberturaGlobal;
    @Size(max = 100)
    @Column(name = "profissional_selecionado")
    private String profissionalSelecionado;
    @Column(name = "entrou_na_operacao")
    @Temporal(TemporalType.DATE)
    private Date entrouNaOperacao;
    @Column(name = "desde_abertura_aprovacao")
    private Integer desdeAberturaAprovacao;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "rate")
    private Double rate;
    @Column(name = "desde_expectativa")
    private Integer desdeExpectativa;
    @Column(name = "impacto_financeiro")
    private Double impactoFinanceiro;
    @Size(max = 150)
    @Column(name = "comentario")
    private String comentario;
    @Size(max = 7)
    @Column(name = "categoria")
    private String categoria;
    @ManyToMany(mappedBy = "vagaCollection")
    private Collection<Candidato> candidatoCollection;

    public Vaga() {
    }

    public Vaga(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getPmp() {
        return pmp;
    }

    public void setPmp(Integer pmp) {
        this.pmp = pmp;
    }

    public Date getDataDeAbertura() {
        return dataDeAbertura;
    }

    public void setDataDeAbertura(Date dataDeAbertura) {
        this.dataDeAbertura = dataDeAbertura;
    }

    public Date getExpectativaDeEntrada() {
        return expectativaDeEntrada;
    }

    public void setExpectativaDeEntrada(Date expectativaDeEntrada) {
        this.expectativaDeEntrada = expectativaDeEntrada;
    }

    public Integer getExpectativaDeAbertura() {
        return expectativaDeAbertura;
    }

    public void setExpectativaDeAbertura(Integer expectativaDeAbertura) {
        this.expectativaDeAbertura = expectativaDeAbertura;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    public String getDetalhe() {
        return detalhe;
    }

    public void setDetalhe(String detalhe) {
        this.detalhe = detalhe;
    }

    public Date getAprovacaoBoardBrasil() {
        return aprovacaoBoardBrasil;
    }

    public void setAprovacaoBoardBrasil(Date aprovacaoBoardBrasil) {
        this.aprovacaoBoardBrasil = aprovacaoBoardBrasil;
    }

    public Integer getDesdeAberturaBrasil() {
        return desdeAberturaBrasil;
    }

    public void setDesdeAberturaBrasil(Integer desdeAberturaBrasil) {
        this.desdeAberturaBrasil = desdeAberturaBrasil;
    }

    public Date getAprovacaoBoardGlobal() {
        return aprovacaoBoardGlobal;
    }

    public void setAprovacaoBoardGlobal(Date aprovacaoBoardGlobal) {
        this.aprovacaoBoardGlobal = aprovacaoBoardGlobal;
    }

    public Integer getDesdeAberturaGlobal() {
        return desdeAberturaGlobal;
    }

    public void setDesdeAberturaGlobal(Integer desdeAberturaGlobal) {
        this.desdeAberturaGlobal = desdeAberturaGlobal;
    }

    public String getProfissionalSelecionado() {
        return profissionalSelecionado;
    }

    public void setProfissionalSelecionado(String profissionalSelecionado) {
        this.profissionalSelecionado = profissionalSelecionado;
    }

    public Date getEntrouNaOperacao() {
        return entrouNaOperacao;
    }

    public void setEntrouNaOperacao(Date entrouNaOperacao) {
        this.entrouNaOperacao = entrouNaOperacao;
    }

    public Integer getDesdeAberturaAprovacao() {
        return desdeAberturaAprovacao;
    }

    public void setDesdeAberturaAprovacao(Integer desdeAberturaAprovacao) {
        this.desdeAberturaAprovacao = desdeAberturaAprovacao;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Integer getDesdeExpectativa() {
        return desdeExpectativa;
    }

    public void setDesdeExpectativa(Integer desdeExpectativa) {
        this.desdeExpectativa = desdeExpectativa;
    }

    public Double getImpactoFinanceiro() {
        return impactoFinanceiro;
    }

    public void setImpactoFinanceiro(Double impactoFinanceiro) {
        this.impactoFinanceiro = impactoFinanceiro;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @XmlTransient
    public Collection<Candidato> getCandidatoCollection() {
        return candidatoCollection;
    }

    public void setCandidatoCollection(Collection<Candidato> candidatoCollection) {
        this.candidatoCollection = candidatoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vaga)) {
            return false;
        }
        Vaga other = (Vaga) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ibm.ibmemploymentcontrolapp.model.Vaga[ id=" + id + " ]";
    }
    
}
