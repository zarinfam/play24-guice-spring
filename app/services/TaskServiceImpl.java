package services;

import daos.TaskDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by saeed on 9/March/15 AD.
 */

@Service
public class TaskServiceImpl implements TaskService{

    @Autowired
    private TaskDao taskDao;

    @Override
    public void echo(String message) {
        taskDao.echo(message);
    }
}
