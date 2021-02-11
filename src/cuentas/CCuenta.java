package cuentas;

/** Con esta clase construimos  los clientes y sus dsatos  
 * @author Pablo Garrido 
 * 
 * 
 * @version 1.0
 * 
 *  @since 03/02/2021
 * 
 * */
public class CCuenta {//clase 
	//variable 
	private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    
    /**
     * @deprecated metodo contructor por defeto no es necesario.
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
    
    /** Metodo que devuelve el saldo actual de la cuenta. 
     * @return El saldo  */

    // metodo para obtener el saldo.
    
    public double estado()
    {
        return getSaldo();
    }//cierre del metodo.
    
    /**
     * Método que verifica la cantidad ingresada.
     *@param double cantidad saldo a ingresar.
     *@throws Excepción lanza una excepción llama al metodo que lo gestiona.
     * */

    /*metodo que verifica si la cantidad a ingresar es menor que cero
     *en el caso de ser cierto lanzara una excepecion*/ 
    
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }//Cierre del método.
    
    /** 
     * Método que verifica si la cantidad a retirar es correcta.
     * @param double cantidad saldo a retirar.
     * @throws Excepción lanza una excepción llama al metodo que lo gestiona.
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
     * @return El nombre.
     */
	private String getNombre() {
		return nombre;
	}
	/**
	 * Metodo
	 * @param nombre
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * 
	 * @return
	 */
	private String getCuenta() {
		return cuenta;
	}
	/**
	 * 
	 * @param cuenta
	 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	/**
	 * 
	 * @return
	 */
	private double getSaldo() {
		return saldo;
	}
	/**
	 * 
	 * @param saldo
	 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	/**
	 * 
	 * @return
	 */
	private double getTipoInterés() {
		return tipoInterés;
	}
	/**
	 * 
	 * @param tipoInterés
	 */
	private void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

}//Cierre de la clase.

