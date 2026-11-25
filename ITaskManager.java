package trecker.v2_2;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
public interface ITaskManager {
    // --- Методы для обычных задач ---
    public ArrayList<Task> getAllTasks() ;
    public void deleteAllTasks();
    public Task getTaskById(int id) ;
    public void createTask(Task task) ;
    public void updateTask(Task task);
    public void deleteTaskById(int id) ;
    
    // --- Методы для эпиков ---
    public void removeAllEpics();
    public ArrayList<Epic> getAllEpics();
    
    public Epic getEpicById(int id);
     
   public void updateEpic(Epic epic);
   public void removeEpicById(int id);
   
   public void createEpic(Epic epic) ;
    
     public void deleteSubtasksInEpic(Integer epicid);
     
     ////////////
    // --- Методы для подзадач -------------------
    public ArrayList<Subtask> getAllSubtasks( );
    public void deleteAllSubtasks();
       
    public Subtask getSubtaskById(int id) ;
    public void createSubtask(Subtask subtask) ;
    public void updateSubtask(Subtask subTaskItem) ;
    public void deleteSubtaskById(Subtask subTaskItem) ;
    
    public ArrayList<Subtask> getSubtasksOfEpic(int epicId);
    
    void updateEpicStatus(int epicId);
}
