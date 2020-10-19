package com.proyecto.workstation.backend.proyectoworkstationbackend.entity;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estactrae")
public class EstacTrae {
	@Id
	private String fcWS;
//	@Column(name = "fcEmpNo", nullable = true)
	private Integer fc_emp_no; //*
	private String fcWSDesc;
	private Short fiWSStatus;
//	@Column(name = "fiNoCambio", nullable = true)
	private Integer fi_no_cambio;
//	@Column(name = "fdFecInstall", nullable = true)
	private String fd_fec_install;
//	@Column(name = "fdFecInstall", nullable = true)
	private String fd_fec_sesion;
//	@Column(name = "fcSerieDisco", nullable = true)
	private String fc_serie_disco; //*
//	@Column(name = "fiNoTransac", nullable = true)
	private Integer fi_no_transac;
	private String fcIP;
//	@Column(name = "fiNoParcial", nullable = true)
	private Integer fi_no_parcial;
//	@Column(name = "fcTermBco", nullable = true)
	private String fc_term_bco; //*
//	@Column(name = "fiTipo", nullable = true)
	private String fi_tipo;
//	@Column(name = "fiNoCambioC3", nullable = true)
	private String fi_no_cambioc3;
//	@Column(name = "fiNoParcialC3", nullable = true)
	private String fi_no_parcialc3;
	

	public EstacTrae(String fcWS, int fcEmpNo, String fcWSDesc, short fiWSStatus, int fiNoCambio, String fdFecInstall,
			String fdFecSesion, String fcSerieDisco, int fiNoTransac, String fcIP, int fiNoParcial, String fcTermBco,
			String fiTipo, String fiNoCambioC3, String fiNoParcialC3) {
		super();
		this.fcWS = fcWS;
		this.fc_emp_no = fcEmpNo;
		this.fcWSDesc = fcWSDesc;
		this.fiWSStatus = fiWSStatus;
		this.fi_no_cambio = fiNoCambio;
		this.fd_fec_install = fdFecInstall;
		this.fd_fec_sesion = fdFecSesion;
		this.fc_serie_disco = fcSerieDisco;
		this.fi_no_transac = fiNoTransac;
		this.fcIP = fcIP;
		this.fi_no_parcial = fiNoParcial;
		this.fc_term_bco = fcTermBco;
		this.fi_tipo = fiTipo;
		this.fi_no_cambioc3 = fiNoCambioC3;
		this.fi_no_parcialc3 = fiNoParcialC3;
	}

	public EstacTrae() {
		super();
	}
	
	public String getFcWS() {
		return fcWS;
	}

	public void setFcWS(String fcWS) {
		this.fcWS = fcWS;
	}

	public Integer getFc_emp_no() {
		return fc_emp_no;
	}

	public void setFc_emp_no(Integer fc_emp_no) {
		this.fc_emp_no = fc_emp_no;
	}

	public String getFcWSDesc() {
		return fcWSDesc;
	}

	public void setFcWSDesc(String fcWSDesc) {
		this.fcWSDesc = fcWSDesc;
	}

	public Short getFiWSStatus() {
		return fiWSStatus;
	}

	public void setFiWSStatus(Short fiWSStatus) {
		this.fiWSStatus = fiWSStatus;
	}

	public Integer getFi_no_cambio() {
		return fi_no_cambio;
	}

	public void setFi_no_cambio(Integer fi_no_cambio) {
		this.fi_no_cambio = fi_no_cambio;
	}

	public String getFd_fec_install() {
		return fd_fec_install;
	}

	public void setFd_fec_install(String fd_fec_install) {
		this.fd_fec_install = fd_fec_install;
	}

	public String getFd_fec_sesion() {
		return fd_fec_sesion;
	}

	public void setFd_fec_sesion(String fd_fec_sesion) {
		this.fd_fec_sesion = fd_fec_sesion;
	}

	public String getFc_serie_disco() {
		return fc_serie_disco;
	}

	public void setFc_serie_disco(String fc_serie_disco) {
		this.fc_serie_disco = fc_serie_disco;
	}

	public Integer getFi_no_transac() {
		return fi_no_transac;
	}

	public void setFi_no_transac(Integer fi_no_transac) {
		this.fi_no_transac = fi_no_transac;
	}

	public String getFcIP() {
		return fcIP;
	}

	public void setFcIP(String fcIP) {
		this.fcIP = fcIP;
	}

	public Integer getFi_no_parcial() {
		return fi_no_parcial;
	}

	public void setFi_no_parcial(Integer fi_no_parcial) {
		this.fi_no_parcial = fi_no_parcial;
	}

	public String getFc_term_bco() {
		return fc_term_bco;
	}

	public void setFc_term_bco(String fc_term_bco) {
		this.fc_term_bco = fc_term_bco;
	}

	public String getFi_tipo() {
		return fi_tipo;
	}

	public void setFi_tipo(String fi_tipo) {
		this.fi_tipo = fi_tipo;
	}

	public String getFi_no_cambioc3() {
		return fi_no_cambioc3;
	}

	public void setFi_no_cambioc3(String fi_no_cambioc3) {
		this.fi_no_cambioc3 = fi_no_cambioc3;
	}

	public String getFi_no_parcialc3() {
		return fi_no_parcialc3;
	}

	public void setFi_no_parcialc3(String fi_no_parcialc3) {
		this.fi_no_parcialc3 = fi_no_parcialc3;
	}

	@Override
	public String toString() {
		return "estac_trae [fcWS=" + fcWS + ", fcEmpNo=" + fc_emp_no + ", fcWSDesc=" + fcWSDesc + ", fiWSStatus="
				+ fiWSStatus + ", fiNoCambio=" + fi_no_cambio + ", fdFecInstall=" + fd_fec_install + ", fdFecSesion="
				+ fd_fec_sesion + ", fcSerieDisco=" + fc_serie_disco + ", fiNoTransac=" + fi_no_transac + ", fcIP=" + fcIP
				+ ", fiNoParcial=" + fi_no_parcial + ", fcTermBco=" + fc_term_bco + ", fiTipo=" + fi_tipo + ", fiNoCambioC3="
				+ fi_no_cambioc3 + ", fiNoParcialC3=" + fi_no_parcialc3 + "]";
	}
}
