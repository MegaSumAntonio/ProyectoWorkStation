package com.proyecto.workstation.backend.proyectoworkstationbackend.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Empleado {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int fcEmpNo;
	private int fiDepId;
	private short fiCiaId;
	private short fiDeptoId;
	private short fiPuestoId;
	private String fcEmpNom;
	private String fcEmpApp;
	private String fcEmpApm;
	private short fiFrecNomina;
	private char fcTipoUsuario;
	private String fcNombreCorto;
	private short fiNoSesiones;
	private String fdFecUltPwd;
	private String fiEmpStatus;
	private String fcEmpRFC;
	private String fiInvestigador;
	private String fiEsqColor;
	private int fiPuestoRol;
	private String fiTiempoSS;
	private String fiScreenSld;
	private String fiPtoNominal;
	private String fiStatuslog;
	private String fiNoTransac;
	private String fcjefeInmediato;
	
	public Empleado(int fcEmpNo, int fiDepId, short fiCiaId, short fiDeptoId, short fiPuestoId, String fcEmpNom,
			String fcEmpApp, String fcEmpApm, short fiFrecNomina, char fcTipoUsuario, String fcNombreCorto,
			short fiNoSesiones, String fdFecUltPwd, String fiEmpStatus, String fcEmpRFC, String fiInvestigador,
			String fiEsqColor, int fiPuestoRol, String fiTiempoSS, String fiScreenSld, String fiPtoNominal,
			String fiStatuslog, String fiNoTransac, String fcjefeInmediato) {
		super();
		this.fcEmpNo = fcEmpNo;
		this.fiDepId = fiDepId;
		this.fiCiaId = fiCiaId;
		this.fiDeptoId = fiDeptoId;
		this.fiPuestoId = fiPuestoId;
		this.fcEmpNom = fcEmpNom;
		this.fcEmpApp = fcEmpApp;
		this.fcEmpApm = fcEmpApm;
		this.fiFrecNomina = fiFrecNomina;
		this.fcTipoUsuario = fcTipoUsuario;
		this.fcNombreCorto = fcNombreCorto;
		this.fiNoSesiones = fiNoSesiones;
		this.fdFecUltPwd = fdFecUltPwd;
		this.fiEmpStatus = fiEmpStatus;
		this.fcEmpRFC = fcEmpRFC;
		this.fiInvestigador = fiInvestigador;
		this.fiEsqColor = fiEsqColor;
		this.fiPuestoRol = fiPuestoRol;
		this.fiTiempoSS = fiTiempoSS;
		this.fiScreenSld = fiScreenSld;
		this.fiPtoNominal = fiPtoNominal;
		this.fiStatuslog = fiStatuslog;
		this.fiNoTransac = fiNoTransac;
		this.fcjefeInmediato = fcjefeInmediato;
	}

	public Empleado() {
		super();
	}

	public int getFcEmpNo() {
		return fcEmpNo;
	}

	public void setFcEmpNo(int fcEmpNo) {
		this.fcEmpNo = fcEmpNo;
	}

	public int getFiDepId() {
		return fiDepId;
	}

	public void setFiDepId(int fiDepId) {
		this.fiDepId = fiDepId;
	}

	public short getFiCiaId() {
		return fiCiaId;
	}

	public void setFiCiaId(short fiCiaId) {
		this.fiCiaId = fiCiaId;
	}

	public short getFiDeptoId() {
		return fiDeptoId;
	}

	public void setFiDeptoId(short fiDeptoId) {
		this.fiDeptoId = fiDeptoId;
	}

	public short getFiPuestoId() {
		return fiPuestoId;
	}

	public void setFiPuestoId(short fiPuestoId) {
		this.fiPuestoId = fiPuestoId;
	}

	public String getFcEmpNom() {
		return fcEmpNom;
	}

	public void setFcEmpNom(String fcEmpNom) {
		this.fcEmpNom = fcEmpNom;
	}

	public String getFcEmpApp() {
		return fcEmpApp;
	}

	public void setFcEmpApp(String fcEmpApp) {
		this.fcEmpApp = fcEmpApp;
	}

	public String getFcEmpApm() {
		return fcEmpApm;
	}

	public void setFcEmpApm(String fcEmpApm) {
		this.fcEmpApm = fcEmpApm;
	}

	public short getFiFrecNomina() {
		return fiFrecNomina;
	}

	public void setFiFrecNomina(short fiFrecNomina) {
		this.fiFrecNomina = fiFrecNomina;
	}

	public char getFcTipoUsuario() {
		return fcTipoUsuario;
	}

	public void setFcTipoUsuario(char fcTipoUsuario) {
		this.fcTipoUsuario = fcTipoUsuario;
	}

	public String getFcNombreCorto() {
		return fcNombreCorto;
	}

	public void setFcNombreCorto(String fcNombreCorto) {
		this.fcNombreCorto = fcNombreCorto;
	}

	public short getFiNoSesiones() {
		return fiNoSesiones;
	}

	public void setFiNoSesiones(short fiNoSesiones) {
		this.fiNoSesiones = fiNoSesiones;
	}

	public String getFdFecUltPwd() {
		return fdFecUltPwd;
	}

	public void setFdFecUltPwd(String fdFecUltPwd) {
		this.fdFecUltPwd = fdFecUltPwd;
	}

	public String getFiEmpStatus() {
		return fiEmpStatus;
	}

	public void setFiEmpStatus(String fiEmpStatus) {
		this.fiEmpStatus = fiEmpStatus;
	}

	public String getFcEmpRFC() {
		return fcEmpRFC;
	}

	public void setFcEmpRFC(String fcEmpRFC) {
		this.fcEmpRFC = fcEmpRFC;
	}

	public String getFiInvestigador() {
		return fiInvestigador;
	}

	public void setFiInvestigador(String fiInvestigador) {
		this.fiInvestigador = fiInvestigador;
	}

	public String getFiEsqColor() {
		return fiEsqColor;
	}

	public void setFiEsqColor(String fiEsqColor) {
		this.fiEsqColor = fiEsqColor;
	}

	public int getFiPuestoRol() {
		return fiPuestoRol;
	}

	public void setFiPuestoRol(int fiPuestoRol) {
		this.fiPuestoRol = fiPuestoRol;
	}

	public String getFiTiempoSS() {
		return fiTiempoSS;
	}

	public void setFiTiempoSS(String fiTiempoSS) {
		this.fiTiempoSS = fiTiempoSS;
	}

	public String getFiScreenSld() {
		return fiScreenSld;
	}

	public void setFiScreenSld(String fiScreenSld) {
		this.fiScreenSld = fiScreenSld;
	}

	public String getFiPtoNominal() {
		return fiPtoNominal;
	}

	public void setFiPtoNominal(String fiPtoNominal) {
		this.fiPtoNominal = fiPtoNominal;
	}

	public String getFiStatuslog() {
		return fiStatuslog;
	}

	public void setFiStatuslog(String fiStatuslog) {
		this.fiStatuslog = fiStatuslog;
	}

	public String getFiNoTransac() {
		return fiNoTransac;
	}

	public void setFiNoTransac(String fiNoTransac) {
		this.fiNoTransac = fiNoTransac;
	}

	public String getFcjefeInmediato() {
		return fcjefeInmediato;
	}

	public void setFcjefeInmediato(String fcjefeInmediato) {
		this.fcjefeInmediato = fcjefeInmediato;
	}

	@Override
	public String toString() {
		return "empleado [fcEmpNo=" + fcEmpNo + ", fiDepId=" + fiDepId + ", fiCiaId=" + fiCiaId + ", fiDeptoId="
				+ fiDeptoId + ", fiPuestoId=" + fiPuestoId + ", fcEmpNom=" + fcEmpNom + ", fcEmpApp=" + fcEmpApp
				+ ", fcEmpApm=" + fcEmpApm + ", fiFrecNomina=" + fiFrecNomina + ", fcTipoUsuario=" + fcTipoUsuario
				+ ", fcNombreCorto=" + fcNombreCorto + ", fiNoSesiones=" + fiNoSesiones + ", fdFecUltPwd=" + fdFecUltPwd
				+ ", fiEmpStatus=" + fiEmpStatus + ", fcEmpRFC=" + fcEmpRFC + ", fiInvestigador=" + fiInvestigador
				+ ", fiEsqColor=" + fiEsqColor + ", fiPuestoRol=" + fiPuestoRol + ", fiTiempoSS=" + fiTiempoSS
				+ ", fiScreenSld=" + fiScreenSld + ", fiPtoNominal=" + fiPtoNominal + ", fiStatuslog=" + fiStatuslog
				+ ", fiNoTransac=" + fiNoTransac + ", fcjefeInmediato=" + fcjefeInmediato + "]";
	}
}
