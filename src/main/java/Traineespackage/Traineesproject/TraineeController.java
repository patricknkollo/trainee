package Traineespackage.Traineesproject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


// create trainees @PostMapping quand tu crees qqc de nouveau tu utilise post
//updates trainees  @ PutMapping  /trainees/<id>
// remove trainees   @DeleteMapping  /trainees/<id>
//show list of all trainees  @GetMapping /trainees
//show details of a single trainee @GetMapping /trainees/<id>  <-- is a placeholder, you can put everything inside
//show all car of a trainee @GetMapping  /trainees/<id>/cars
//show on car of a trainee @GetMapping  /trainees/<id>/cars/<carid>
//show list of all trainees of age x  @GetMapping      /trainees?age=<age>&sortby=desc
//                                                       PATH     REQUESTPARAMETERS

//<path>?<requst params>


@RestController
public class TraineeController {
	
	@Autowired
	TraineeService1 traineeserv ;

	public TraineeController() {
		// TODO Auto-generated constructor stub
	}
	// Dispatcher servlet --> takes all web requests
	
//Exple  https://www.unPath.com/trainee
	@GetMapping("/trainee")
	public List<String> readTrainees(@RequestParam("age") Integer age, @RequestParam("sortby") String sortby) {
		// TODO Auto-generated method stub
    return null;
	}

	
	@GetMapping("/trainee")
	public List<String> readTrainees1(@RequestParam(name ="age", required = false) Integer age, @RequestParam("sortby") String sortby) {
		// TODO Auto-generated method stub
    return null;
	}
	
	
//Exple  https://www.unPath.com/trainee/8
	@GetMapping("/trainee/{traineeid}")
	public String readTrainee(@PathVariable("traineeid") Integer id) {
		// TODO Auto-generated method stub
    return traineeserv.haveTraineebyId(id);
	}

//Exple    https://www.unPath.com/trainee/8/cars/4
	@GetMapping("/trainee/{traineeid}/cars/{carid}")
	public String readTraineePlusCar(@PathVariable("traineeid") Integer t_id, @PathVariable("carid") Integer c_id) {
		// TODO Auto-generated method stub
    return null;
	}
}
