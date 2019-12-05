class Patient {
	private String name;
	private double height;
	private double weight;
	public Patient(String name, double height, double weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	public double BMI () {
		return ( weight / ( height * height ) ) * 703;
	}
}
public class P3 {
	public static void main(String[] args) {
		Patient patient = new Patient("Arpan Das", 177/2.54, 59*2.2);
		System.out.println(patient.BMI());
	}
}