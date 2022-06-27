package maxByComp;

public class Pagos {
	
	private String empleado;
	private Integer ingreso;

	public Pagos(String empleado, Integer ingreso)
	{
		this.empleado = empleado;
		this.ingreso = ingreso;
	}

	public Integer getIngreso() {
		return ingreso;
	}

	// other getters and setters

	@Override
	public String toString() {
		return "[" + empleado + ", " + String.valueOf(ingreso) + "]";
	}

	public static Pagos max(Pagos x, Pagos y) {
		return x.getIngreso() > y.getIngreso() ? x : y;
	}

}
