package springjpa.cof;

import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.EclipseLinkJpaVendorAdapter;

import springjpa.util.DbContanst;

@Configuration
@EnableJpaRepositories(basePackages = {"springjpa.dao"})
public class DbCof {
	@Bean
	public DataSource dataSource() {
		
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName(DbContanst.DBDRIVER);
		ds.setUrl(DbContanst.DBURL);
		ds.setUsername(DbContanst.USERNAME);
		ds.setPassword(DbContanst.PWD);
		return ds;
	}
	
	
	 @Bean
	  public EclipseLinkJpaVendorAdapter jpaVendorAdapter() {
		 EclipseLinkJpaVendorAdapter adapter = new EclipseLinkJpaVendorAdapter();
	    adapter.setDatabase(Database.MYSQL);
	    adapter.setShowSql(true);
	    adapter.setGenerateDdl(false);
//	    adapter.setDatabasePlatform("org.hibernate.dialect.H2Dialect");
	    return adapter;
	  }
	 
	 @Bean
		public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean(DataSource datasource,
				EclipseLinkJpaVendorAdapter va) {
			LocalContainerEntityManagerFactoryBean embf = new LocalContainerEntityManagerFactoryBean();
			System.out.println("ccccccccccccccc");
			embf.setPersistenceUnitName("odyz");
			embf.setJpaVendorAdapter(va);
			embf.setDataSource(datasource);
			embf.setPackagesToScan("springjpa.model");
			return embf;
		}
	  
	
}
