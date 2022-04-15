# TP_MicroService

Tout d'abort, vous avez creer un projet de type spring initializr(spring Boot):

![image](https://user-images.githubusercontent.com/102295113/163480728-77cd03fd-6ac7-4707-98a7-ff71d5b77d80.png)

 - Puis , on telecherger les dependance qu'on a besoin pour creer notre projet:
    -  pour utiliser une bd on a besoin d'utiliser spring  data JPA et H2 Database (base        de  donner memoire)
    -  pour le micro service on va creer un controlor qu'il aura un couche web pour            cella on a besoin d'utiliser Spring web 
    -  Lombok: pour genere les geters et seters
    -  Rest repositories : permet d'exposer facillement le web service restful 
    
    ![image](https://user-images.githubusercontent.com/102295113/163482991-f3889c61-29e4-4966-9c30-3bdb8668ceec.png)
    
cette dependance qu'on a telecherger on retouve dans le fichier pom.xml

- Apres , creer une classe compte et puis on va utiliser spring data pour creer l'interface JPA repositories qui vous avez appele CompteRepository
  Rq:On a besion d'instaler un plugins qui appele lombok qui gener les seters et geters 
    pour utiliser une une base de donnee de type H2 on va vers le fichie application.properties et ajouter les information suivant:
    
![image](https://user-images.githubusercontent.com/102295113/163492051-ef87ea9b-ec34-4d31-a4d8-f4e44291cc3a.png)

- Le demarage de cette application donne:

![image](https://user-images.githubusercontent.com/102295113/163580895-c7937c15-a688-47ed-91a3-0b581bf01dc4.png)


- Base de donnees: localhost:8080/h2-console compte_db 

![image](https://user-images.githubusercontent.com/102295113/163581636-45b87505-949c-494b-95e2-b472ce9d3614.png)



- On va creer la classe CompteRestController qui permet de retourner tous les comptes et on a utiliser l'annotation '@GetMapping' qui contient une expression d’URL qui permet d'afficher tous les comptes :

![image](https://user-images.githubusercontent.com/102295113/163501473-513951d3-37da-403e-80e2-0b43b0c1a87c.png)

- Avans l'execution de ce code on a besion de changer le port car on a creer plusieur micro service dans la meme machine et pour changer le port il suffit d'ajouter server.port = 8082 par exemple dans le fichier application.properties et apers l'execution on a :

![image](https://user-images.githubusercontent.com/102295113/163582098-2e437547-9479-4984-9a19-55e4c6cd5897.png)


- Et pour consulter un solde il suffit d'ajouter la methode suivant dans la classe CompteRestController en utilisant l'annotation "GetMapping" :

![image](https://user-images.githubusercontent.com/102295113/163502585-c08cd3d4-aa04-44bb-b143-eee14417ed92.png)

- Et pour tester il suffit de specifier le code de compte dans url :

![image](https://user-images.githubusercontent.com/102295113/163582641-13915628-52cb-431c-b01a-f4b8a37910b8.png)


- Pour ajouter un compte il suffit d'ajouter la methode suivant dans la classe CompteRestController, en utilisant l'annotation "PostMapping" :

![image](https://user-images.githubusercontent.com/102295113/163504031-a76a0847-6f7c-4672-8dea-0841d052ab34.png)

- L'execution de  micro service avec postman donne:

![image](https://user-images.githubusercontent.com/102295113/163583495-65bea738-ddd4-46df-9da9-52500254a610.png)

-Le compte est ajouté :

![image](https://user-images.githubusercontent.com/102295113/163584861-c194f645-8a4a-4dfa-a882-f66957302db4.png)


- Pour modifier un compte il suffit d'ajouter la methode suivant dans la classe CompteRestController , en utilisant l'annotation "PutMapping":

![image](https://user-images.githubusercontent.com/102295113/163504106-3267603b-8396-47ac-9bb7-2386a0c09fb2.png)

- L'execution de  micro service avec postman donne:

![image](https://user-images.githubusercontent.com/102295113/163583784-53993c62-cfa2-4f0b-acb7-566c20458171.png)

- Apres la modification on a :

![image](https://user-images.githubusercontent.com/102295113/163584528-71efbaf6-c995-401a-98b7-59ab8e7dd099.png)


- Pour supprimer un compte il suffit d'ajouter la methode suivant dans la classe CompteRestController en utilisant l'annotation "DeleteMapping":

![image](https://user-images.githubusercontent.com/102295113/163504213-1218e318-1478-467e-a1cb-34771158cf5e.png)

- L'execution de  micro service avec postman donne:

![image](https://user-images.githubusercontent.com/102295113/163584183-d19a7123-2229-4632-821d-100d0d8f47e4.png)

- Apres supprision on a :

![image](https://user-images.githubusercontent.com/102295113/163585129-e617e1b8-1b3c-4502-86db-a4252321b8d8.png)

- Puis on a vu la DOCUMENTATION API qui donne des informations sur le micro service et apres importer la documentation API dans postman:

![image](https://user-images.githubusercontent.com/102295113/163585565-26f2e8cb-84a1-4a0c-a633-35c4178fac1b.png)

- Pour afficher les comptes :
![image](https://user-images.githubusercontent.com/102295113/163586300-4f67c862-e836-4f90-b25d-4d6943cb2222.png)

-Et pour afficher un seul compte il suffit il suffit de specifier leur code :

![image](https://user-images.githubusercontent.com/102295113/163586652-def71dcf-6ef8-447a-90bb-8df7bb28b4bd.png)

- Pour ajouter un compte :

![image](https://user-images.githubusercontent.com/102295113/163586774-0b4b3b45-590d-4b3c-8644-df0025cea9af.png)

- Pour modifier un compte :

![image](https://user-images.githubusercontent.com/102295113/163587012-147eb33d-b70a-44b1-9809-d7963cce9700.png)

- Pour supprimer un compte il suffit il suffit de specifier leur code :

![image](https://user-images.githubusercontent.com/102295113/163587163-7877065b-2dea-41e2-a6c5-8b2272c63106.png)

- maintenant on va tester le micro service en utilisant swagger:
  
- Pour afficher la liste des comptes :

![image](https://user-images.githubusercontent.com/102295113/163588323-256ea27a-5551-4df6-9ed2-3d3116fc6734.png)


- Pour afficher un seul compte il suffit il suffit de specifier leur code(leur id):

![image](https://user-images.githubusercontent.com/102295113/163587991-900939f0-5bcf-44ab-9017-4fcc9c96cd87.png)

- Pour ajouter un compte :

![image](https://user-images.githubusercontent.com/102295113/163588061-4dc59070-3a22-4ed1-8527-6a9253cae512.png)

- Pour supprimer un compte il suffit il suffit de specifier leur code:

![image](https://user-images.githubusercontent.com/102295113/163588260-554b73f5-2741-422b-921e-f6ecf53fe3c7.png)

- Puis on va  creer une interface pour faire une projection qui s'appelle p1 et qui permet d'afficher le code et le solde  et l'execution de ce projection p1 donne :

![image](https://user-images.githubusercontent.com/102295113/163588995-4393ca0c-00db-47a4-9d3d-1fb24942203e.png)

-Apres on va creer une projection 2 qui permet d'afficher le solde et le type , l'execution de ce projection p2 donne :

![image](https://user-images.githubusercontent.com/102295113/163589121-b951a507-a268-46cb-a958-58804ff46271.png)

- Puis on a ajouter dans la classe principal un rest configuration pour exposer le id :

![image](https://user-images.githubusercontent.com/102295113/163589349-1897688f-7371-417c-a432-d901e342ab69.png)

- Le teste donne:

![image](https://user-images.githubusercontent.com/102295113/163589546-fe3efb52-44b0-481b-bbc6-4b638048548c.png)

- Et pour acceder a un compte par le type il suffit d'ajouter une methode findByType dans l'interface CompteRepository :

![image](https://user-images.githubusercontent.com/102295113/163589840-7d647174-fed6-4a8c-8c57-f4111f5e9639.png)

- Pour definir une methode virement on va creer l'interface CompteService , puis on va creer un autre rest controller pour tester la methode virement:

![image](https://user-images.githubusercontent.com/102295113/163591562-26d00482-4eec-413b-913a-8351e214ddac.png)


- L'execution de micro service donne : 

![image](https://user-images.githubusercontent.com/102295113/163590672-3f99df30-df0f-4cba-a250-537d6dca95f2.png)

- Avant le virement on a : 
![image](https://user-images.githubusercontent.com/102295113/163590530-413a0fac-1561-4eaf-a3e7-fb867f8e54ea.png)

- Et apres le virement on a :

![image](https://user-images.githubusercontent.com/102295113/163591320-7239bbac-421f-4d21-acc9-74435d02ec2f.png)












                                  
                                   
 




   
