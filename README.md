# SpringBoot- SpringJPA

Sample project which shows how to use Spring JPA

<h4>Installation and Getting Started</h4>

<ul>
<li>
1. Clone this repo and import this project in Spring Tool Suite. You can download and install Spring Tool Suite from <a href="https://spring.io/tools/sts/all" target="_blank">here</a>.
</li>
<li>
2. Download and install MySQL from <a href="https://dev.mysql.com/downloads/mysql" target="_blank">this</a> link.
</li>
<li>
3. If you are getting any error symbol in imported project, then update project using 'Maven'.
</li>
<li>
4. All entities are present in com.zishan.entity and all repositories are in com.zishan.repository package. You can create your own entity and repository in the same way.
<li>
5. Create schema in Mysql with 'SpringJPA' name and change Mysql db connection in application.propeties file present in src/main/resources.
</li>
<li>
6. Run the project by right clicking on project, Run As -> Run on Server.
</li>
<li>
7. Open RestController.java file present in com.zishan.spring package. You can see request mapping of class and methods in this file. So, now you can assess the web services like <a href="http://localhost:8080/SpringJPA/jpa/getAllBloodGroup">http://localhost:8080/SpringJPA/jpa/getAllBloodGroup</a>. You can also expose your own web service by creating new method and having @RequestMapping.
</li>
<li>
8. Also, you can create your own derived query by creating new method in repository using name of entity attribute. Check out BloodGroupRepository.java file present in com.zishan.repository package for practical example.
</li>
</ul>
