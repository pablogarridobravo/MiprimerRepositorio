package cuentas;

/** Con esta clase construimos  los clientes y sus datos  
 * @author Pablo Garrido 
 * 
 * 
 * @version 1.0
 * 
 *  @since 03/02/2021
 * 
 * */
public class CCuenta {//clase 
	//Atributos de clase
	private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInter�s;
   
      
    /**
     * @deprecated M�todo contructor por defeto, no es necesario.
     */
    
    // metodo construtor.
    
    public CCuenta()
    {
    }
    /** 
     * Contructor que inicializa los parametros de la clase CCuenta. 
     * @param  String nom Define el nombre del cliente.
     * @param  Strinf cue Define el numero de cuenta.
     * @param  double sal Define el dinero que hay cuenta.
     * @param  double tipo Define el tipo de interes aplicado.
     *  */
    
    //Metodo constructor que recibe por pareametros los datos del cliente nombre, numero de cuenta, el saldo y el tipo de interes aplicado.
    
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }//cierre del contructor
    
    /** M�todo que devuelve el saldo actual de la cuenta. 
     * @return El saldo 
     *  */

    //M�todo para obtener el saldo.
    
    public double estado()
    {
        return getSaldo();
    }//cierre del metodo.
    
    /**
     * M�todo que verifica la cantidad ingresada.
     *@param double cantidad- Saldo a ingresar.
     *@throws Excepci�n lanza una excepci�n llama al metodo que lo gestiona.
     * */

    /*M�todo que verifica si la cantidad a ingresar es menor que cero
     *en el caso de ser cierto lanzara una excepecion*/ 
    
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }//Cierre del m�todo.
    
    /** 
     * M�todo que verifica si la cantidad a retirar es correcta.
     * @param double cantidad- Saldo a retirar.
     * @throws Excepci�n- Lanza una excepci�n llama al metodo que lo gestiona.
     * @exception 
     *  */
    
    /*metodo que verifica si la cantidad a retirar
     *en el caso de la cantidad menor que cero o superior a la de la cuenta lanzara una excepecion*/ 
    
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
    /**
     * Metodo que devuelve el nombre
     * @return  nombre.
     */
	@SuppressWarnings("unused")
	private String getNombre() {
		return nombre;
	}
	/**
	 * M�todo 
	 * @param nombre
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * M�todo  que devuelve el n�mero de cuenta.
	 * @return  cuenta.
	 */
	@SuppressWarnings("unused")
	private String getCuenta() {
		return cuenta;
	}
	/**
	 * M�todo 
	 * @param cuenta
	 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	/**
	 * M�todo  que devuelve el dinero en la cuenta
	 * @return saldo.
	 */
	private double getSaldo() {
		return saldo;
	}
	/**
	 * M�todo  
	 * @param saldo
	 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	/**
	 * M�todo  que devuelve el tipo de interes aplicado.
	 * @return el tipo de inter�s
	 */
	@SuppressWarnings("unused")
	private double getTipoInter�s() {
		return tipoInter�s;
	}
	/**
	 *  M�todo 
	 * @param tipoInter�s
	 */

	@SuppressWarnings("unused")
	private void setTipoInter�s(double tipoInter�s) {
		this.tipoInter�s = tipoInter�s;
	}

}//Cierre de la clase.

