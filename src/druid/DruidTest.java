package druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.jupiter.api.Test;

import javax.sql.DataSource;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;

/**
 * @author 高志浩
 * @version 1.0
 */
public class DruidTest {


    @Test
    public void testDruid() throws Exception {
        Properties properties = new Properties();
        properties.load(new FileReader("src/druid/druid.properties"));

        //德鲁伊连接池
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        Connection connection = dataSource.getConnection();
        System.out.println("链接成功");
        connection.close();
    }

}
