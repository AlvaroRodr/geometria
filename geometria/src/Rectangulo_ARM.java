/**
 * 
 * @author Alvaro Rodriguez
 * @version 1.2
 */
public class Rectangulo_ARM extends FiguraGeometrica_ARM {
	private double l1;
	private double l2;
	/**
	 * 
	 * @param tipoFigura Parametro que recibe un String
	 * @param lG Parametro que indica el tamaño de los lados grandes
	 * @param lP Parametro que indica el tamaño de los lados pequeños
	 */
	public Rectangulo_ARM(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
	/**
	 * @return Devuelve el resultado de la operación
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	/**
	 * @return Devuelve el resultado de la operación
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
