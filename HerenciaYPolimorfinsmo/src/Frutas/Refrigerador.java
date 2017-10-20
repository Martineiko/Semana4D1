package Frutas;

public class Refrigerador implements Clavija //se implementa la interface clavija
{
	private int temperatura;
	private cajaFrutas caja;
	private cajaVerduras cajaVer;
	int voltaje;
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
	@Override //Sobreescribe el metodo de la interface clavija
	public void conectarse() {
		// TODO Auto-generated method stub
		 voltaje = 220;
	}
	/*@Override
	public String loQueSea(String algo) {
		// TODO Auto-generated method stub
		return null;
	}*/
}
