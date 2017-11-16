package artificial.intelligence.cpsc;

public class Lab extends Classes {
	private Course belongsTo;
	
	public Lab(String department_, String classNumber_, String section_) {
		this.department = department_;
		this.classNumber = classNumber_;
		this.section = section_;
	}
	
	public void setBelongsTo(Course course_) {
		this.belongsTo = course_;
	}
	
	public Course getBelongsTo() {
		return this.belongsTo;
	}
	
	public String toString() {
		if(this.belongsTo != null) {
			return ("Department: " + department + "\t\tClass Number: " + this.classNumber + "\t\tSection: " + this.section + "\t\tBelongs To: " + this.belongsTo.toString());	
		} else {
			return ("Department: " + department + "\t\tClass Number: " + this.classNumber + "\t\tSection: " + this.section + "\t\tBelongs To: null");	
		}
	}
}
