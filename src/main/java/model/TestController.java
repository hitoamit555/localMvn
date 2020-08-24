package model;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@RestController
//@Controller
//@RequestMapping("/api/v1")
public class TestController {



    @RequestMapping("/")
    public String home(Map<String, Object> model) {
        model.put("message", "HowToDoInJava Reader !!");
        return "index";
    }

    @RequestMapping("/next")
    public ModelAndView next(Map<String, Object> model) {
        model.put("message", "You are in new page !!");
        ModelAndView mav = new ModelAndView("next");
        return mav;
    }

    @RequestMapping("/next1")
    public String next() {
        //model.put("message", "You are in new page !!");
        return "hello from controller next";
    }

   /* // inject via application.properties
    @Value("${welcome.message:test}")
    private String message = "Hello World";

    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {
        model.put("message", this.message);
        return "welcome";
    }*/



    //String path = "/api/vi";

  /*  @Autowired
    Employee e;*/
    @RequestMapping(value = "/process",
            method = RequestMethod.POST,
            produces = "applications/json")
    //Get model from postman/Service
    public ResponseEntity<Employee1> process(@RequestBody Employee1 emp) {

        Employee1 e=new Employee1();
        return new ResponseEntity<Employee1>(e, HttpStatus.OK);
    }
   /* @RequestMapping("/abc")
    String getdk() {
        //mapped to hostname:port/home/
        return "Hello from get";
    }*/

    @RequestMapping("/abc")
   public  ResponseEntity getd() {
        //mapped to hostname:port/home/
        return new ResponseEntity(HttpStatus.OK);
    }
    @RequestMapping(value="/abc1", method= RequestMethod.GET)
    public  ResponseEntity getd1() {
        //mapped to hostname:port/home/
        return new ResponseEntity(HttpStatus.OK);
    }

    //Get model from jsp page
    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity get(@ModelAttribute Employee1 e) {
        return new ResponseEntity(HttpStatus.OK);
    }


    @RequestMapping(value = "/test", method = RequestMethod.GET, produces = "application/json")
    public String get() {
        System.out.println("Done");
        return "gell";
    }

    /*@GetMapping("/hello")
    public String hello() {
        return "hello azure!";
    }*/

}
