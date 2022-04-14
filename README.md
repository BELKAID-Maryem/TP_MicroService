# TP_MicroService

Tout d'abort, vous avez creer un projet de type spring initializr(spring Boot):

![image](https://user-images.githubusercontent.com/102295113/163480728-77cd03fd-6ac7-4707-98a7-ff71d5b77d80.png)

 - Puis , on telecherger les dependance qu'on a besoin pour creer notre projet:
    -  pour utiliser une bd on a besoin d'utiliser spring  data JPA et H2 Database (base        de  donner memoire)
    -  pour le micro service on va creer un controlor qu'il aura un couche web pour            cella on a besoin d'utiliser Spring web 
    -  Lombok: pour genere les geters et seters
    -  Rest repositories : permet d'exposé facillement le web service 4:55
    
    ![image](https://user-images.githubusercontent.com/102295113/163482991-f3889c61-29e4-4966-9c30-3bdb8668ceec.png)
    
cette dependance qu'on a telecherger on retouve dans le fichier pom.xml

- Apres , creer une classe compte et puis on va utiliser spring data pour creer l'interface JPA repositories qui vous avez appele CompteRepository
  Rq:On a besion d'instaler un plugins qui appele lombok qui gener les seters et geters 
    pour utiliser une une base de donnee de type H2 on va vers le fichie application.properties et ajouter les information suivant:
    
![image](https://user-images.githubusercontent.com/102295113/163492051-ef87ea9b-ec34-4d31-a4d8-f4e44291cc3a.png)

- Le demarage de cette application donne:


   
