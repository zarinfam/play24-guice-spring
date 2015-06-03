package daos;

import org.springframework.stereotype.Repository;



/**
 * Created by saeed on 1/March/15 AD.
 */

@Repository
public class TaskDaoImpl implements TaskDao {

    @Override
    public void echo(String message) {
        System.out.println("-----dao-"+message);
    }
}