package Controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @GetMapping("/task")
    public String Tasklist(){
        return "Esto es un recurso en http";
    }
}
