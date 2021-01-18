package me.eminem.analyticsRSO;

import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Stream;

@RestController
public class StorageController {

    TaskService taskService;

    ModelMapper modelMapper;

    public StorageController(TaskService taskService) {
        modelMapper = new ModelMapper();
        this.taskService = taskService;
    }



    @CrossOrigin(origins = "*")
    @GetMapping(path="/emptyCall")
    public void emptyCall(){
        taskService.emptyCall();
    }

    @CrossOrigin(origins = "*")
    @GetMapping(path="/returnNumber")
    public String returnNumber(){
        return taskService.returnNumber();
    }

    @GetMapping(path="/sleep")
    public String sleep() throws InterruptedException{
        return taskService.sleep();
    }
}