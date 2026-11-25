package trecker.v2_2;
import java.util.List;
public interface IHistoryManager {
    public void addHistory( Task task); //должен помечать задачи как просмотренные,
    List<trecker.v2_2.Task> getHistory(); // — возвращать их список
}
