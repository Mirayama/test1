
public class Empleado {

	private int numeroEmpleado;
	private String departamento;
	private String puesto;
	
	/*
	 * Metodo constructor por defecto
	 */
	public Empleado(){
		
	}
	
	/**
	 * Metodo constructor parametrizado
	 * @param nombre Nombre del empleado
	 * @param edad Edad del empleado
	 * @param sexo Sexo del empleado en formato H o M
	 * @param numeroEmpleado Numero del empleado
	 * @param departamento Departamento donde trabaja el empleado
	 * @param puesto Puesto que ocupará el empleado dentro de la empresa
	 * @return
	 */
	
	public Empleado(String nombre, int edad, char sexo, int numeroEmpleado, 
			String departamento, String puesto){
				this.numeroEmpleado = numeroEmpleado;
				this.departamento = departamento;
				this.puesto = puesto;
	}

	
	/**
	 * Metodo que devuelve el numero del empleado
	 * @return devuelve el numero del empleado
	 */
	public int getNumeroEmpleado() {
		return numeroEmpleado;
	}

	/**
	 * Metodo que establece el numero del empleado
	 * @param numeroEmpleado, establece el numero del empleado
	 */
	
	public void setNumeroEmpleado(int numeroEmpleado) {
		this.numeroEmpleado = numeroEmpleado;
	}
	
	/**
	 * Metodo que devuelve el departamente del empleado
	 * @return devuelve el departamente del empleado
	 */
	public String getDepartamento() {
		return departamento;
	}

	/**
	 * Metodo que establece el departamento del empleado
	 * @param departamento, establece el departamento del empleado
	 */
	
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	/**
	 * Metodo que regresa el puesto del empleado
	 * @return devuleve el numero del empleado
	 */
	
	public String getPuesto() {
		return puesto;
	}

	/**
	 * Metodo que establece el puesto del empleado
	 * @param numeroEmpleado, establece el puesto del empleado
	 */
	
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	
	
}
