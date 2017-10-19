package Frutas;

public class Refrigerador 
{
	private int temperatura;
	private cajaFrutas caja;
	private cajaVerduras cajaVer;
	public Refrigerador()
	{
		
	}
	public void setTemperatura(int temp)
	{
		this.temperatura = temp;
	}
	public int getTemperatura()
	{
		return temperatura;
	}
	//Adaptacion al codigo
	public void setCaja(cajaFrutas caja)
	{
		this.caja = caja;
	}
	public cajaFrutas getCaja() {
		return this.caja;
	}
	public void setCajaVer(cajaVerduras cajaVer) {
		this.cajaVer = cajaVer;
	}
	public cajaVerduras getCajaVer() {
		return this.cajaVer;
	}
}
