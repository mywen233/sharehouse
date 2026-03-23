package util;

import java.sql.Types;

import org.hibernate.dialect.MySQLDialect;

public class CustomMySQLDialect extends MySQLDialect {
    public CustomMySQLDialect() {
        super();
        registerHibernateType(Types.LONGVARCHAR, "text");
        registerHibernateType(Types.LONGVARBINARY, "blob");
    }
}
