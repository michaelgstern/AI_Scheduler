package artificial.intelligence.cpsc;

import java.io.*;
import java.util.ArrayList;

public class Parser {
	
	String line = null;
	
	private ArrayList<CourseSlot> courseSlots;
	private ArrayList<LabSlot> labSlots;
	
	private ArrayList<Course> courses;
	private ArrayList<Lab> labs;
	
	public Parser(String inputFileName){
		try{
			//Read Text File
			FileReader fileReader = new FileReader(inputFileName);
			
			//Wrap FileReader in BufferedReader
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			//Name
			while(!(line = bufferedReader.readLine()).isEmpty()){
				System.out.println(line);
			}
			
			//Course Slots
			courseSlots = new ArrayList<CourseSlot>();
			while((line = bufferedReader.readLine()).isEmpty()){
				System.out.println("EMPTY");
			}
			System.out.println("\n" + line);
			while(!(line = bufferedReader.readLine()).isEmpty()){
				String[] info = new String[4];
				info = line.split(",");
				CourseSlot cs = new CourseSlot(info[0].replaceAll("\\s+", ""), 
												info[1].replaceAll("\\s+", ""), 
												Integer.parseInt(info[2].replaceAll("\\s+", "")), 
												Integer.parseInt(info[3].replaceAll("\\s+", "")));
				courseSlots.add(cs);
				//System.out.println(cs.toString());
			}
			
			//Lab Slots
			labSlots = new ArrayList<LabSlot>();
			while((line = bufferedReader.readLine()).isEmpty()){
				System.out.println("EMPTY");
			}
			System.out.println("\n" + line);
			while(!(line = bufferedReader.readLine()).isEmpty()){
				String[] info = new String[4];
				info = line.split(",");
				LabSlot ls = new LabSlot(info[0].replaceAll("\\s+", ""), 
												info[1].replaceAll("\\s+", ""), 
												Integer.parseInt(info[2].replaceAll("\\s+", "")), 
												Integer.parseInt(info[3].replaceAll("\\s+", "")));
				labSlots.add(ls);
				//System.out.println(ls.toString());
			}
			
			//Courses
			courses = new ArrayList<Course>();
			while((line = bufferedReader.readLine()).isEmpty()) {
				System.out.println("EMPTY");
			}
			System.out.println("\n" + line);
			while(!(line = bufferedReader.readLine()).isEmpty()) {
				String[] info = new String[4];
				info = line.split(" ");
				Course c = new Course(info[0].replaceAll("\\s+", ""), 
										info[1].replaceAll("\\s+", ""), 
										info[3].replaceAll("\\s+", ""));
				courses.add(c);
				//System.out.println(c.toString());
			}
			
			//Labs
			labs = new ArrayList<Lab>();
			while((line = bufferedReader.readLine()).isEmpty()) {
				System.out.println("EMPTY");
			}
			while(!(line = bufferedReader.readLine()).isEmpty()) {
				String[] info;
				Lab l;
				int numTerms = line.split(" ").length;
				info = line.split(" ");
				l = new Lab(info[0].replaceAll("\\s+", ""),
						info[1].replaceAll("\\s+", ""),
						info[info.length - 1].replaceAll("\\s+", ""));
				if(numTerms == 4) {
					l.setBelongsTo(null);
				} else {
					for(Course c : courses) {
						if(c.getDepartment().equals(info[0].replaceAll("\\s+", "")) && 
								c.getClassNumber().equals(info[1].replaceAll("\\s+", "")) && 
								c.getSection().equals(info[3].replaceAll("\\s+", ""))) {
							l.setBelongsTo(c);
							c.addLab(l);
						} else {
							l.setBelongsTo(null);
						}
					}
				}
				labs.add(l);
			}
			
			//Not Compatible
			
			//Unwanted
			
			//Preference
			
			//Pair
			
			//Partial Assignments
			
			//Close file
			bufferedReader.close();
			
		} catch (FileNotFoundException e){
			System.out.println("Unable to open file '" + inputFileName + "'");
		} catch (IOException e){
			System.out.println("Error reading file '" + inputFileName + "'");
		}
	}
	
	public ArrayList<CourseSlot> getCourseSlots() {
		return this.courseSlots;
	}
	
	public ArrayList<LabSlot> getLabSlots() {
		return this.labSlots;
	}
	
	public ArrayList<Course> getCourses() {
		return this.courses;
	}
	
	public ArrayList<Lab> getLabs() {
		return this.labs;
	}
}
