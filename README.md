# EnocaSpringBoot
 
This application implements a banking app simply.
There are two entity and this entities related with each other by OneToMany relationship.

for documentation you can use swagger-ui. You can send request and get response with swagger-ui.

![spring](https://user-images.githubusercontent.com/44947489/168144214-bb3aeb1a-a165-410c-ac71-811a91531ebd.png)
-- http://localhost:8080/banking/api/v1/swagger-ui/index.html

for Postman http request : 
Customer api:

 Get Mapping  : http://localhost:8080/banking/api/v1/customer/getall
 
                 http://localhost:8080/banking/api/v1/customer/getbyId/{id}
 
 Post Mapping : http://localhost:8080/banking/api/v1/customer + request body
 
 Put Mapping  :http://localhost:8080/banking/api/v1/customer/{identity} + request body
 
 Delete Mapping : http://localhost:8080/banking/api/v1/customer/{identity}
 
 Account api:
 
 Get Mapping  : http://localhost:8080/banking/api/v1/account/getall
 
                 http://localhost:8080/banking/api/v1/account/getbyId/{id}
 
 Post Mapping : http://localhost:8080/banking/api/v1/account + request body
 
 Put Mapping  :http://localhost:8080/banking/api/v1/account/{identity} + request body
 
 Delete Mapping : http://localhost:8080/banking/api/v1/account/{identity}
 

