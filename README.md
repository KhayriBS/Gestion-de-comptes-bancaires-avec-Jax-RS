# 💳 Gestion de Comptes Bancaires avec JAX-RS

Ce projet Java propose une API RESTful pour gérer des comptes bancaires. Il inclut :

- Un serveur REST développé avec **JAX-RS (Jersey)** et **Grizzly**  
- Une sécurité par **JWT (JSON Web Token)**  
- Un **client Java REST**  
- Des endpoints CRUD sécurisés pour manipuler les comptes

---

## 📌 Fonctionnalités

- 🔐 Authentification avec génération de token JWT
- 📥 Ajout / 📤 mise à jour / 🔍 lecture / ❌ suppression de comptes bancaires
- 📦 Client Java REST
- 🧪 Tests via Postman

---

## 🧱 Structure du projet

TP_REST/
│
├── tpRest-Serveur/ → Backend REST sécurisé avec JWT
│ ├── entities/ → Classe Compte
│ ├── service/ → Simule la base (CompteService)
│ ├── resource/ → REST endpoints (CompteResource, AuthResource)
│ └── filters/ → JWTFilter + @Secured annotation
│
├── tpRest-Client/ → Java REST Client
│ └── Main.java → Exécute des appels HTTP vers l'API
│
└── README.md → Fichier de documentation


## 🚀 Lancer le serveur

Depuis le dossier `tpRest-Serveur` :

```bash
mvn clean install
java -cp target/tpRest-Serveur-1.0-SNAPSHOT.jar com.soa.Main
Le serveur sera accessible à l’URL :
📍 http://localhost:8080/api/

🔐 Sécurisation JWT
Certaines opérations requièrent une authentification.
Utiliser cet endpoint pour obtenir un token :

http
POST /api/authentication
Content-Type: application/x-www-form-urlencoded

username=admin
password=admin123
Réponse :

json
{
  "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6..."
}

🔐 Pour accéder aux routes protégées, ajouter dans le header :

Authorization: Bearer <token>
📊 Endpoints REST
Méthode	URL	Description	Authentification
GET	/api/comptes	Obtenir la liste des comptes	❌
GET	/api/comptes/{id}	Obtenir un compte spécifique	❌
POST	/api/comptes	Créer un compte	✅
PUT	/api/comptes/{id}	Modifier un compte existant	✅
DELETE	/api/comptes/{id}	Supprimer un compte	✅

🧪 Tester avec Postman
Authentification :

Méthode : POST

URL : http://localhost:8080/api/authentication

Body (x-www-form-urlencoded) :

username=admin
password=admin123
Ajouter un compte (JWT requis) :

Méthode : POST

URL : http://localhost:8080/api/comptes

Headers :

Authorization: Bearer <votre_token>
Content-Type: application/json
Body (raw JSON) :

{
  "id": 1,
  "type": "courant",
  "solde": 2000
}

📟 Tester via Client Java
Depuis tpRest-Client :

mvn clean install
java -cp target/tpRest-Client-1.0-SNAPSHOT.jar tn.esprit.Main
Code Java typique :

Client client = ClientBuilder.newClient();
Compte compte = client
    .target("http://localhost:8080/api/comptes/1")
    .request(MediaType.APPLICATION_JSON)
    .get(Compte.class);
System.out.println(compte);

📚 Ressources utilisées
Jersey
jjwt
Grizzly HTTP Server

👨‍💻 Auteur
Projet réalisé par Khiareddine BEN SALAH
🎓 Université / Module : Architecture Orientée Services - SOA
📂 GitHub : KhayriBS
