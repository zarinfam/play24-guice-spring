package services;

import daos.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by saeed on 9/March/15 AD.
 */

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;

    @Override
    public void echo(String message) {
        testDao.echo(message);
    }
}
