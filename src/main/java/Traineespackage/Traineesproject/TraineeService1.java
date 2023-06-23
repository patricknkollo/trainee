package Traineespackage.Traineesproject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class TraineeService1 {


	private Map<Integer, String> traineelist;

	public TraineeService1() {
		traineelist = new HashMap<Integer, String>();
	}


	public HashMap<Integer, String> haveTrainees(){
		
		HashMap<Integer, String> res = new HashMap<Integer, String>();

		return res;
	}


	public String haveTraineebyId(int traineeid){
        
		
		return "";
	}



	public List<String> haveTraineeCars(String trainee){

		return null;
	}


	public String haveTraineeCar(){

		return "";
	}


	public void addTrainee(String trainee){
		traineelist.put(traineelist.size(), trainee);

	}


}
