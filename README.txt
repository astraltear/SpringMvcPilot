spec
	jdk 1.8
	tomcat 8.0.30
	spring 4.2.2.RELEASE
	junit vesion 4.11
	commons-dbcp
	log4jdbc-log4j2
	mybatis
	lombok ( https://projectlombok.org/index.html, http://lancerme.tistory.com/15)
	jackson
	
info
	프로젝트 빌드
		Maven>update project
		Run>Maven build > goal: clean package
		
	메이븐 자바 컴파일러 버전 변경
		pom.xml
			org.apache.maven.plugins
				<source>1.8</source>
				<target>1.8</target>
				
	http://brad2014.tistory.com/322
		<annotation-driven /> : HandlerMapping 와  HandlerAdapte을 등록
		<context:component-scan />을 정의한 경우 Annotation 인식을 위한 설정  (@Component,@Repository,@Service,@Controller)
		<context:annotation-config/> 을 별도로 추가하지 않아도 된다.
		

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
	5. mybatis 연동 (sqlSessionFactory , mybatis-config.xml, *Mapper.xml)
	6. sqlSession
	7. mybatis typeAliases
	8. jackson dependencies
	

trouble shooting
	servlet api 2.5와 3.1.0의 차이는 artifactId가 변경됨.
	As of Spring Framework 4.1, this class requires JUnit 4.9 or higher.
	

<context:annotation-config/>  <annotation-driven />  차이