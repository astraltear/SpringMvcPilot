spec
	jdk 1.8
	tomcat 8.0.30
	spring 4.2.2.RELEASE
	junit vesion 4.11
	commons-dbcp
	log4jdbc-log4j2
	mybatis
	
info
	������Ʈ ����
		Maven>update project
		Run>Maven build > goal: clean package
		
	���̺� �ڹ� �����Ϸ� ���� ����
		pom.xml
			org.apache.maven.plugins
				<source>1.8</source>
				<target>1.8</target>
				
	http://brad2014.tistory.com/322
		<annotation-driven /> : HandlerMapping ��  HandlerAdapte�� ���
		<context:component-scan />�� ������ ��� Annotation �ν��� ���� ����  (@Component,@Repository,@Service,@Controller)
		<context:annotation-config/> �� ������ �߰����� �ʾƵ� �ȴ�.
		

config
	pom.xml
		servlet api 2.5 -> 3.1.0   
		spring jdbc, mysql driver, dbcp 
		spring test
		log4jdbc-log4j2
		
	root-context.xml
		property-placeholder(database.properties)
		dataSource
		AbstractRoutingDataSource


histroy
	1. ������ ���̽� ���� �׽�Ʈ Ŭ���� �ۼ�(MySqlConnectionTest)
	2. DataSourceTest
	3. ������ dataSource ���� ����
	4. log4jdbc�� ������  database pool ����( log4jdbc.log4j2.properties, logback.xml)
	5. mybatis ���� (sqlSessionFactory , mybatis-config.xml, *Mapper.xml)
	6. sqlSession
	

trouble shooting
	servlet api 2.5�� 3.1.0�� ���̴� artifactId�� �����.
	As of Spring Framework 4.1, this class requires JUnit 4.9 or higher.
	

<context:annotation-config/>  <annotation-driven />  ����