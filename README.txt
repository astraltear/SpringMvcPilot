spec
	jdk 1.8
	tomcat 8.0.30
	spring 4.2.2.RELEASE
	junit vesion 4.11
	
info
	������Ʈ ����
		Maven>update project
		Run>Maven build > goal: clean package
	

config
	pom.xml
		servlet api 2.5 -> 3.1.0   
		spring jdbc, mysql driver, dbcp 
		spring test
		
	root-context.xml
		property-placeholder(database.properties)
		dataSource
		AbstractRoutingDataSource


histroy
	1. ������ ���̽� ���� �׽�Ʈ Ŭ���� �ۼ�(MySqlConnectionTest)
	2. DataSourceTest
	3. ������ dataSource ���� ����
	

trouble shooting
	servlet api 2.5�� 3.1.0�� ���̴� artifactId�� �����.
	As of Spring Framework 4.1, this class requires JUnit 4.9 or higher.
	
		