# CarsApi_Java
  <div align='center'>
    <img height="240px" src="https://em-content.zobj.net/source/skype/289/automobile_1f697.png">
  </div>
  
<p align = "center">
   <img src="https://img.shields.io/badge/author-NinaS23-4dae71?style=flat-square" />
</p>
  
<div align="center">
  <h3>Build With</h3>
  <img src="https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white" height="30px"/>
  <img src="https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white" height="30px"/>
</div>

#  features developed 
- [x] post car properties 
- [X] create a dto file for car properties


# Getting Started
To clone the project, run the following command:

```git
git clone https://github.com/NinaS23/CarsApi_Java.git
```
Then navigate to the project folder in ApiApplication.java and:

```git
run the project
```
Go to thunderClient and make a Post with the route
```git
 http://localhost:8080/api/cars
```
Then, put in the body of thunderClient as below
```json
{
  "modelo": "Fiat Argo 1.3",
  "fabricante": "Fiat",
  "dataFabricacao": "10/02/2006",
  "valor": 10.000,
  "anoModelo": 2023
}
```
Finally , open the terminal to see the printed data
