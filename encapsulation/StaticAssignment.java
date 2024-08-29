public class StaticAssignment {
	private static int instanceCount = 0;
	public StaticAssignment() {
		instanceCount++;
	}
	public static int getInstanceCount() {
		return instanceCount;
	}
	public static void main(String[] args) {
		StaticAssignment c1 = new StaticAssignment();
		StaticAssignment c2 = new StaticAssignment();
		StaticAssignment c3 = new StaticAssignment();
		System.out.println("Number of instances created: " + StaticAssignment.getInstanceCount());
	}
}