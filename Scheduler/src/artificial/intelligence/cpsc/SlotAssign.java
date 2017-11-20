package artificial.intelligence.cpsc;

import java.util.ArrayList;

public class SlotAssign {

	private int eval;
	private Classes aClass;
	private TimeSlot time;
	
	// Extra info
	//private Boolean finished;					// tells program whether all possible courses were assigned
	//private ArrayList<SlotAssign> potBranch;	// list of possible next assignments. remove elements to indicate cutting branches
	
	public SlotAssign(Classes aClass, TimeSlot time)
	{
		this.aClass = aClass;
		this.time = time;
	}
	
	// getters
	public Classes retClass(){return aClass;}
	public TimeSlot retTime(){return time;}
	public int getEval(){return eval;}
	
	// setters
	public void setEval(int eval)
	{
		this.eval = eval;
	}
	
	// Compares evals. returns 1 if this eval is greater than other, and -1 if the reverse is true. returns 0 if equal
	public int compareEval(SlotAssign other)
	{
		if(eval > other.getEval())
			return 1;
		else if(eval < other.getEval())
			return -1;
		else
			return 0;
	}
	
	// TODO
	
	// public void setFinished()
	
	// public Boolean getFinished()
	
	// public void addBranch(SlotAssign branch)
	
	// public void removeBranch(int index)
	
	// public ArrayList<SlotAssign> retPotBranch()
}
