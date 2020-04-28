<h2>This is a coding test project for Momenton.</h2>

This project is a Springboot project built with gradle. Please make sure to do "Add gradle nature to project" before running it

Simply start the Springboot application using the boot button on STS after running the gradle build.

If you are using Eclipse or IDEA, simply run the EmployeeApplication as a Java Application to start the server.

Next, open your browser to http://localhost:8081/momenton/employees where you will see a json representation of the company hierarchy:

<code>{
	"ceo": {
		"name": "Jamie",
		"employees": [{
			"name": "Alan",
			"employees": [{
				"name": "Martin"
			}, {
				"name": "Alex"
			}]
		}, {
			"name": "Steve",
			"employees": [{
				"name": "David"
			}]
		}]
	}
}</code>

The project uses an embedded H2 in memory db to store the tables. You can access it via http://localhost:8081/h2-console/
The credentials and other configuration for the H2 db are in application.properties:

<pre><code>server.port=8081</br>
spring.datasource.url=jdbc:h2:mem:testdb</br>
spring.datasource.driverClassName=org.h2.Driver</br>
spring.datasource.username=sa</br>
spring.datasource.password=admin</br>
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect</br>
spring.h2.console.enabled=true</br></code></pre>


