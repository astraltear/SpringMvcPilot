spec
	jdk 1.8
	tomcat 8.0.30
	spring 4.2.2.RELEASE
	junit vesion 4.11
	
info
	프로젝트 빌드
		Maven>update project
		Run>Maven build > goal: clean package
	

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
	1. 데이터 베이스 연결 테스트 클래스 작성(MySqlConnectionTest)
	2. DataSourceTest
	3. 스프링 dataSource 동적 변경
	4. log4jdbc를 적용한  database pool 설정( log4jdbc.log4j2.properties, logback.xml)
	

trouble shooting
	servlet api 2.5와 3.1.0의 차이는 artifactId가 변경됨.
	As of Spring Framework 4.1, this class requires JUnit 4.9 or higher.
	
		