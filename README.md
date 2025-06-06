# 💳 Gestion de Comptes Bancaires avec JAX-RS

API RESTful sécurisée pour la gestion de comptes bancaires développée avec Java/JAX-RS et protégée par JWT.

## 📌 Fonctionnalités
- 🔐 Authentification JWT (JSON Web Token)
- 📅 CRUD complet des comptes bancaires
- 📦 Client Java REST intégré
- 🧪 Tests via Postman inclus

## 🧱 Structure du projet
```bash
.
TP_REST/
│
├── tpRest-Serveur/ # Backend REST avec sécurité JWT
│ ├── entities/ # Classe Compte
│ ├── service/ # Simulation BDD (CompteService)
│ ├── resource/ # Endpoints REST (CompteResource, AuthResource)
│ └── filters/ # Sécurité (JWTFilter + @Secured)
│
├── tpRest-Client/ # Client Java REST
│ └── Main.java # Appels HTTP vers l'API
│
└── README.md # Documentation
````


## 🚀 Démarrage du serveur
```bash
cd tpRest-Serveur
mvn clean install
java -cp target/tpRest-Serveur-1.0-SNAPSHOT.jar com.soa.Main
````

Accès à l'API : 📍 http://localhost:8080/api/

## 🔐 Authentification JWT
Endpoint d'authentification :

```bash
POST /api/authentication
Headers : Content-Type: application/x-www-form-urlencoded
Body :
username=admin
password=admin123

Réponse :
json
{
  "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6..."
}
Utilisation du token :
Authorization: Bearer <votre_token>
````

## 📊 Endpoints REST
Méthode	URL	Description	Sécurité
| Méthode | URL                  | Description                | Sécurité |
|---------|----------------------|----------------------------|----------|
| GET     | /api/comptes          | Obtenir tous les comptes   | ❌       |
| GET     | /api/comptes/{id}     | Obtenir un compte par ID   | ❌       |
| POST    | /api/comptes          | Créer un nouveau compte    | ✅       |
| PUT     | /api/comptes/{id}     | Mettre à jour un compte    | ✅       |
| DELETE  | /api/comptes/{id}     | Supprimer un compte        | ✅       |

## 🧪 Exemple avec Postman
```bash
Création de compte (protégé) :
http
POST http://localhost:8080/api/comptes
Authorization: Bearer <token>
Content-Type: application/json
{
  "id": 1,
  "type": "courant",
  "solde": 2000
}
````
## 📿 Client Java
Exemple de code :
```bash
Client client = ClientBuilder.newClient();
Compte compte = client
    .target("http://localhost:8080/api/comptes/1")
    .request(MediaType.APPLICATION_JSON)
    .get(Compte.class);
System.out.println(compte);
````

## 📚 Technologies
* Jersey - Implémentation JAX-RS
* JJWT - Gestion des tokens JWT
* Grizzly - Serveur HTTP

## 👨‍💻 Auteur
```bash
Khiareddine BEN SALAH
🎓 Université / Module : Architecture Orientée Services - SOA
📂 GitHub : KhayriBS
````


