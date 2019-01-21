package edu.dkx.jdbc.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.apache.commons.dbutils.QueryRunner;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.util.Properties;

public class JDBCUtil {

    public static DataSource ds = null;
    public static QueryRunner qr = null;

    static {
        try {
            Properties p = new Properties();
            FileInputStream fi = new FileInputStream("resource/db.properties");
            p.load(fi);
            ds = DruidDataSourceFactory.createDataSource(p);
        } catch (Exception e) {
            e.printStackTrace();
        }
        qr = new QueryRunner(getDs());
    }

    public static DataSource getDs() {
        return ds;
    }

    public QueryRunner queryRunner() {
        return qr;
    }

}
