# com.lti.springboot.demo

 Spring boot demo project for LTI trainees 9 Jan 2023

# Links to Spring Official Docs and Guides 

Spring Boot: https://docs.spring.io/spring-boot/docs/3.0.1/reference/htmlsingle/ 
Spring REST Doc: https://docs.spring.io/spring-restdocs/docs/current/reference/htmlsingle/ 
Spring REST Guide: https://spring.io/guides/gs/rest-service/ 
Spring Data JPA Doc: https://docs.spring.io/spring-data/jpa/docs/current/reference/html/
Spring Data JPA guide: https://spring.io/guides/gs/accessing-data-jpa/
Spring Security Doc: https://docs.spring.io/spring-security/reference/index.html  
Spring Caching Doc: https://docs.spring.io/spring-framework/docs/current/reference/html/integration.html#cache-annotations 
Spring paging and sorting: https://docs.spring.io/spring-data/rest/docs/current/reference/html/#paging-and-sorting 


# e-Shopping Project 

Link 

https://docs.google.com/document/d/1jJwQVmsYvIcu-omW7ADntcpnWoZxYR1O_q4q6qiyRIg/edit?usp=sharing 

TABLE OF CONTENTS
BackGROUND	1
GOAL	2
USE Cases	2
Project Implementation	2
APPLICATIOn DEPLOYMENT	3
APPLICATION TESTING	3
Deliverables	3
References	3


BackGROUND
E Commerce System (ECS) is a web services application which provides a service interface to search products, buy products, add/edit products and many more. This application will be implemented as: 

Spring boot application following RESTful architecture
VueJS presentation layer to consume above 

GOAL
The objective is to develop a RESTful Web Services application that can be easily adopted by another external system i.e. a VueJS UI app to enable end users to search products, add products to cart , checkout  to order products and view their orders  with a faster, safer and maintainable environment.

The framework will be built in a way that ensures lower maintenance efforts and maximum re-usability.

USE Cases
Application is designed to provide e-commerce related functionality. There will be Registered users and guests:

Registered User
Will be able to search products based on name.
Will be able to retrieve based on category.
Will be able to add products to cart.
Will be able to update products in cart.
Will be able to checkout products in cart and create an order.
Will be able to view orders for users.
Will be able to cancel orders
Will be able to add/edit Products.
Will be able to place orders. 

Guest
Will be able to register themselves.

Other than above functionality, applications will have authorization/authentication based on JWT token.

Project Implementation
Below are the technical specifications, will to be used in application development 

S.No
Type
Technology
1
APIs
Spring Boot
2
Authentication/Authorization
JWT
3
IDE
Spring Tool Suite
4
Database
PostGRE
5
API Testing
Swagger UI / Postman
6
Java code testing
JUnit and Mockito
7
UI development 
VueJS
8
JS code testing 
JestJS
9
Code Repo
Git 
10
Others
as applicable 


All the APIs should be implemented standalone and deployed on localhost. The spring boot application should expose Swagger UI for testing REST API calls over HTTP protocol. The VueJS app should be able to run consuming the REST services.


APPLICATION DEPLOYMENT
Code for the application will be maintained at git repository. 


APPLICATION TESTING
Application development will be carried out with TDD approach. Each functionality from the service layer to be tested with unit tests written. 

Java testing to be done with JUnit with Mockito and JavaScript testing to be done with JestJS. 


Deliverables
Upon the completion of this project, the following need to be shared:

1. Code through git repository 
2. PostGRE database schema 
3. SWAGGER UI  
4. UI screenshots 



