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

- Base de donnees: localhost:8080/h2-console compte_db 

- Creer un Rest controller :

![image](https://user-images.githubusercontent.com/102295113/163501473-513951d3-37da-403e-80e2-0b43b0c1a87c.png)

- Avans l'execution de ce code on a besion de changer le port car on a creer plusieur micro service dans la meme machine et pour changer le port il suffit d'ajouter server.port = 8082 par exemple dans le fichier application.properties et apers l'execution on a :

- Et pour consulter un solde il suffit d'ajouter la methode suivant dans la classe CompteRestController :

![image](https://user-images.githubusercontent.com/102295113/163502585-c08cd3d4-aa04-44bb-b143-eee14417ed92.png)

- Et pour tester il suffit de specifier le code de compte dans url :

- Pour ajouter un compte il suffit d'ajouter la methode suivant dans la classe CompteRestController :

![image](https://user-images.githubusercontent.com/102295113/163504031-a76a0847-6f7c-4672-8dea-0841d052ab34.png)

- L'execution de ce code donne:

- Pour modifier un compte il suffit d'ajouter la methode suivant dans la classe CompteRestController :

![image](https://user-images.githubusercontent.com/102295113/163504106-3267603b-8396-47ac-9bb7-2386a0c09fb2.png)

- L'execution de ce code donne:

- Pour supprimer un compte il suffit d'ajouter la methode suivant dans la classe CompteRestController :

![image](https://user-images.githubusercontent.com/102295113/163504213-1218e318-1478-467e-a1cb-34771158cf5e.png)


                                   سنعود بعد قليل -_- 
                                   
 




   
