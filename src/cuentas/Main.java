package cuentas;

/**  
 * @author Pablo Garrido
 * 
 * 
 * @version 1.0
 * 
 *  @since 03/02/2021
 * 
 * */
public class Main {
/**
 * Metodo main. 
 * @param Parametro args.  Array  de tipo String.
 */
	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		CCuenta cuenta1;
        double saldoActual;
       

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        operativa_cuenta(cuenta1, 0);
        
	}
	/**
	 * Metodo que controla la cantidad de dinero a ingresar y a retirar y nos devuelve el saldo
	 * @param cuenta1 objeto de la clase CCuenta
	 * @param cantidad de tipo float 
	 * @exception Excepcion e.  Se lanza cuando es requerida 
	 */

	private static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
		double saldoActual;
		saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es "+ saldoActual );
        
      
        
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}

}
