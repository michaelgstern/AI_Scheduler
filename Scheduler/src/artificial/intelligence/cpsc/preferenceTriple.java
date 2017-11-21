package artificial.intelligence.cpsc;

public class preferenceTriple {
	private final TimeSlot slot;
	private final Course course;
	private final float penalty;
	
	public preferenceTriple(TimeSlot givenSlot, Course givenCourse, float pen){
		slot = givenSlot;
		course = givenCourse;
		penalty = pen;
	}
	
	public TimeSlot getTime(){return slot; }
	public Course getCourse(){return course; }
	public float getPenalty(){return penalty; }

}
