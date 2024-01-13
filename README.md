
Jeg er en skikkelig klokkenerd og er ukentlig innpå Chrono24 og drømmer meg bort, derfor tekte jeg å lage en 
database for en fiktiv klokkesamling hvor jeg kan se, legge til, oppdatere og fjerne klokker fra samlingen.


This is a simple Spring Boot project that provides RESTful APIs for CRUD operations with a MySQL database. 
The project has no frontend only backend for experimenting with the logic 
of RESTful APIs and Postman can be used for testing the APIs.



ENDPOINTS
The following are the basic CRUD operations provided by the RESTful APIs:

Create:
POST /watches/add

Read:
GET /watches
GET /watches/{id}

Update:
PUT /watches/update/{id}

Delete:
DELETE /watches/delete/{id}
Testing with Postman



TEST
Testing done in postman
