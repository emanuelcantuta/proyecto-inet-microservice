package com.inet.dto;

public class ErrorDto {
	private String mensaje;
	private int htppCode;

	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public int getHtppCode() {
		return htppCode;
	}
	public void setHtppCode(int htppCode) {
		this.htppCode = htppCode;
	}
	
	public ErrorDto() {
		super();
	}
	
	
	public ErrorDto(String mensaje, int htppCode) {
		super();
		this.mensaje = mensaje;
		this.htppCode = htppCode;
	}
	@Override
	public String toString() {
		return "ErrorDto [mensaje=" + mensaje + ", htppCode=" + htppCode + "]";
	}
}
