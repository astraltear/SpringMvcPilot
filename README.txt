spec
	jdk 1.8
	tomcat 8.0.30
	spring 4.2.2.RELEASE
	
info
	������Ʈ ����
		Maven>update project
		Run>Maven build > goal: clean package
	

config
	pom.xml
		servlet api 2.5���� ���̴� artifactId�� �����.
			<dependency>
				<groupId>javax.servlet</groupId>
				<artifactId>javax.servlet-api</artifactId>
				<version>3.1.0</version>
				<scope>provided</scope>
			</dependency>