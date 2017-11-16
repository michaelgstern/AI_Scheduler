package artificial.intelligence.cpsc;

import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class legalCheck {

	Map<Classes,TimeSlot> assign;
	
	
	public legalCheck(Map<Classes,TimeSlot> passed) {
		assign = passed;
	}
	
	
	public boolean maxCheck() {
		for(int i = 0; i<assign.size(); i++) {
			
		}
		return false;
		
	}
	
	public boolean courseLabCheck(Course course) {
		List<Lab> labs = course.getLabs();
		TimeSlot courseTimeSlot = assign.getValue(course);
		String courseTime = courseTimeSlot.getTime();
		for(int i =0; i<labs.size(); i++) {
			Lab lab = labs.get(i);
			TimeSlot labTimeSlot = assign.getValue(lab);
			String labTime = labTimeSlot.getTime();
			if(!timeCheck(labTime,courseTime)) {
				return false;
			}
			
		}
		return true;
	}

	public boolean compatibleCheck(Classes classOne, Classes classTwo) {
		TimeSlot classOneTimeSlot = assign.getValue(classOne);
		TimeSlot classTwoTimeSlot = assign.getValue(classTwo);
		return timeCheck(classTwoTimeSlot.getTime(),classOneTimeSlot.getTime());
	}
	
	public boolean unwantedCheck(Classes a, TimeSlot slot) {
		return slot.equals(assign.getValue(a));
	}

	private boolean timeCheck(String labTime, String courseTime) {
		// TODO Auto-generated method stub
		return false;
	}
}

