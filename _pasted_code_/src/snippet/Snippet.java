package snippet;

public class Snippet {
	server:
	  port: 8082
	spring:
	  datasource:
	    password: admin
	    url: jdbc:oracle:thin:@localhost:1521/XE
	    username: system
	  jpa:
	    properties:
	      hibernate:
	        format_sql: true
	        show_sql: true
}

