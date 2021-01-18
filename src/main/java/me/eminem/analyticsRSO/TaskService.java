package me.eminem.analyticsRSO;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class TaskService {
    TaskRepository taskRepository;

    private int stKlicev = 0;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    List<Task> getAllTasks(){
        return taskRepository.findAll();
    }

    void emptyCall(){
        this.stKlicev++;
    }
    String returnNumber(){
        return ""+this.stKlicev;
    }

    String sleep() throws InterruptedException{
        Thread.sleep(5000);
        return "Končal sem z obsežno operacijo";
    }
}
