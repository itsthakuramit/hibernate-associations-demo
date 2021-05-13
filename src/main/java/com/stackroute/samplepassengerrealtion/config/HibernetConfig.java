package com.stackroute.samplepassengerrealtion.config;

import java.io.IOException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.stackroute.samplepassengerrealtion.model.Passenger;
import com.stackroute.samplepassengerrealtion.model.Train;

 

@Configuration
@EnableTransactionManagement

@EnableWebMvc
@ComponentScan(basePackages="com.stackroute.samplepassengerrealtion")

public class HibernetConfig {
	
@Bean
public DataSource getDatasource()
{
	BasicDataSource ds=new BasicDataSource();
	
	//dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//	dataSource.setUrl("jdbc:mysql://" + System.getenv("MYSQL_HOST") + ":3306/" + System.getenv("MYSQL_DATABASE")
//			+"?verifyServerCertificate=false&useSSL=false&requireSSL=false");
//	dataSource.setUsername(System.getenv("MYSQL_USER"));
//	dataSource.setPassword(System.getenv("MYSQL_PASSWORD"));

	
	
	ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
	ds.setUrl("jdbc:mysql://localhost:3306/railwayhcl");
	ds.setUsername("root");
	ds.setPassword("password");
	return ds;
}

@Bean 
public LocalSessionFactoryBean getSessionfactory(DataSource datasource) throws IOException
{
	LocalSessionFactoryBean sessfact=new LocalSessionFactoryBean();
	sessfact.setDataSource(datasource); // ioc container injects bean
	Properties prop=new Properties();
	prop.put("hibernate.dialect","org.hibernate.dialect.MySQL5Dialect" );
	prop.put("hibernate.show_sql", "true");
	prop.put("hibernate.hbm2ddl.auto","update");
	sessfact.setHibernateProperties(prop);
	sessfact.setAnnotatedClasses(Train.class,Passenger.class);
	sessfact.afterPropertiesSet();
	return sessfact;
}

@Bean
public HibernateTransactionManager getTransac(SessionFactory sessfac)
{
	
	HibernateTransactionManager hiber=new HibernateTransactionManager();
	hiber.setSessionFactory(sessfac);
	return hiber;
}


}
