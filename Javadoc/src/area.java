
public class area {

	/*
	 * Calcula el area de circulo.
	 * @return devuelve el valor del area
	 * @see <a href="areacirculo.com"> link </a>
	 */
	protected double x,y; //centro
	protected double r;	  //radio
	
	/*
	 * @param x, coordenada x del centro del circulo
	 * @param y, coordenada y del centro del circulo
	 * @param r, el radio de un circulo. Debe ser mayor o igual a 0.
	 */
	
	
	public double area() {
		return Math.PI*r*r;
	}
	
	/*
	 * @param se declaran los valores al programa
	 */
	
	public void circulo(double x, double y, double r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}
	
	/*
	 * @param px componente x del punto
	 * @param py componente y del punto
	 * @return true si el punto está dentro del circulo
	 * o false en otro caso
	 */
	
	public boolean contiene(double px, double py) {
		double d = Math.sqrt((px-x)*(px-x)+(py-y)*(py-y));
		return d <= r;
	}
}
