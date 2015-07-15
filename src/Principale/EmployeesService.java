package Principale;

public class EmployeesService {
	
	private InterfazRecuperable obj;

	public void setObj(InterfazRecuperable obj) {
		this.obj = obj;
	}

	public Object leerEmpleado(int id) {
		
		obj.leerEmpleado(id);
		return obj;
	}

}
