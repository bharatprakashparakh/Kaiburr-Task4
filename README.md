
# Web-UI
Task4 : Kaiburr Task4

# Project Title

The project is about creating Web Interface(UI) in Java using Spring MVC and Thymeleaf Template Engine.The web interface is provided to end-user for searching,creating ,deleting and updating “server” objects. The variety of Software Platforms are available as a resource on the server side.The frontend is created for a REST API and a client can request for a persistent resource by interacting with the layout.

## Getting Started

1.git clone https://github.com/bharatprakashparakh/Kaiburr-Task4.git

### Prerequisites

* Downlaod Java version 1.8
* Downlaod SpringToolSuite version 4.6.0
* Downlaod Apache Tomcat Server 8.5 
* Add Thymeleaf Dependency in SpringToolSutite
* Downlaod Mongo Database 4.2.5
* A Web Browser


## Running the tests

* Run the mongod server at port 27017 using "mongod command"
* Run the thymeleaf-testing-upload/src/main/java/io/bucket/thymeleaftesting/ThymeleafTestingApplication.java as JavaApplication.
* Open Web Browser and Hit URL localhost:8080

### Break down into end to end tests

* **The first page dispalyed is index.html which is a HOME PAGE and provides options for CREATE and READ Platforms.  **

![](https://github.com/bharatprakashparakh/Kaiburr-Task4/blob/master/Images/1.Home%20Page.PNG)

* **Create a platform by mentioning platform object details.[POST Reuest]**

  Input
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task1/blob/master/Images/Kaiburr%20Tasks/POST%20ip.PNG)

  Output
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task1/blob/master/Images/Kaiburr%20Tasks/POST%20op.PNG)

* **Find a Platform by mentioning Id in URL[GET Request]**

  Input
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task1/blob/master/Images/Kaiburr%20Tasks/GET%20by%20id%20ip.PNG)
 
  Output
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task1/blob/master/Images/Kaiburr%20Tasks/GET%20by%20id%20op.PNG)
  
 * **Returns an error as response if platform with given id is not present in list.**
 
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task1/blob/master/Images/Kaiburr%20Tasks/Get%20by%20id%20error.PNG)
  
* **Find a platform by mentioning name in URL[GET Request]**

   Get a single platform as output . 
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task1/blob/master/Images/Kaiburr%20Tasks/GET%20by%20%20name.PNG)
  
  Get a list of Platform with mentioned name
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task1/blob/master/Images/Kaiburr%20Tasks/GET%20by%20%20name%20list.PNG)

* **Returns an error as response if platform with given name is not present in list[GET Request]**

  ![](https://github.com/bharatprakashparakh/Kaiburr-Task1/blob/master/Images/Kaiburr%20Tasks/GET%20by%20%20name%20error.PNG)
 
* **Update a platform with given details [PUT]**
  
  Input
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task1/blob/master/Images/Kaiburr%20Tasks/update.PNG)
  
  Output
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task1/blob/master/Images/Kaiburr%20Tasks/after%20update.PNG)
  
* **Delete a platform with given Id. [DELETE]**
  
  Input
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task1/blob/master/Images/Kaiburr%20Tasks/delete.PNG)
  
  Output
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task1/blob/master/Images/Kaiburr%20Tasks/after%20delete.PNG)
  
  * **Collection in a Mongo Database**
   
     ![](https://github.com/bharatprakashparakh/Kaiburr-Task1/blob/master/Images/Kaiburr%20Tasks/mongod.PNG)
  

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management


## Contributing

Contributions are welcome.

 ## Author

* **Bharat Prakash Parakh** 



