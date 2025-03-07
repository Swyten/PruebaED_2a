package com.iescomercio.entornos;

public class Hora {
	private int horas;
	private int minutos;
	private int segundos;

	public Hora(int horas, int minutos, int segundos) {
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
	}

	public void mostrarHora() {
		System.out.println(this.horas + ":" + this.minutos + ":" + this.segundos);
	}

	public void incrementarSegundos(int incremento) {
		this.segundos = this.segundos + incremento;
		this.ajustarHora();
	}

	public void incrementarMinutos(int incremento) {
		this.minutos = this.minutos + incremento;
		this.ajustarHora();
	}

	private void ajustarHora() {
		if (this.segundos >= 60) {
			int resto = this.segundos % 60;
			int inc = this.segundos / 60;

			this.minutos = this.minutos + inc;
			this.segundos = resto;
		}

		if (this.minutos >= 60) {
			int resto = this.minutos % 60;
			int inc = this.minutos / 60;

			this.horas = this.horas + inc;
			this.minutos = resto;
		}
	}

	public boolean esAnterior(Hora hora) {
		if (this.horas < hora.horas) {
			return true;
		} else if (this.horas > hora.horas) {
			return false;
		} else if (this.minutos < hora.minutos) {
			return true;
		} else if (this.minutos > hora.minutos) {
			return false;
		} else if (this.segundos < hora.segundos) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + horas;
		result = prime * result + minutos;
		result = prime * result + segundos;
		return result;
	}


	/**
	 * La siguiente funci�n indicar� si dos horas son iguales. Para ello recibir�
	 * tres par�metros. El primer par�metro ser� la hora con la que se va a
	 * comparar, el segundo par�metro ser� si queremos considerar una comparativa
	 * exacta o aproximada. El tercer par�metro ser�n los segundos en los que se
	 * podr� diferenciar la hora pasada por par�metro. Esta hora nunca podr�
	 * sobrepasar la hora indicada en la instancia que ejecuta el m�todo. 
	 * 
	 * 
	 */
	public boolean mismaHora(Hora h2, boolean isExacta, int secondsSesgo) {
		boolean areEquals = false;
		if (isExacta) {
			if (h2.horas == this.horas && h2.minutos == this.minutos && h2.segundos == this.segundos) {
				areEquals = true;
			}
		} else {
			int sSesgo = secondsSesgo % 60;
			int mSesgo = secondsSesgo / 60;
			int hSesgo = 0;
			if (mSesgo / 60 > 0) {
				hSesgo = mSesgo / 60;
			}

			if (h2.horas <= this.horas + hSesgo 
					&& h2.minutos == this.minutos + mSesgo
					&& h2.segundos == this.segundos + hSesgo) {
				areEquals = true;
			}
		}
		return areEquals;
	}

}
