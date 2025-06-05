# 💳 Gestion de Comptes Bancaires avec JAX-RS

API RESTful sécurisée pour la gestion de comptes bancaires développée avec Java/JAX-RS et protégée par JWT.

## 📌 Fonctionnalités
- 🔐 Authentification JWT (JSON Web Token)
- 📅 CRUD complet des comptes bancaires
- 📦 Client Java REST intégré
- 🧪 Tests via Postman inclus

## 🧱 Structure du projet
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


## 🚀 Démarrage du serveur
Accès à l'API : 📍 http://localhost:8080/api/

🔐 Authentification JWT
Endpoint d'authentification :
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

📊 Endpoints REST
Méthode	URL	Description	Sécurité
GET	/api/comptes	Obtenir tous les comptes	❌
GET	/api/comptes/{id}	Obtenir un compte par ID	❌
POST	/api/comptes	Créer un nouveau compte	✅
PUT	/api/comptes/{id}	Mettre à jour un compte	✅
DELETE	/api/comptes/{id}	Supprimer un compte	✅

🧪 Exemple avec Postman
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

📿 Client Java
Exemple de code :

Client client = ClientBuilder.newClient();
Compte compte = client
    .target("http://localhost:8080/api/comptes/1")
    .request(MediaType.APPLICATION_JSON)
    .get(Compte.class);
System.out.println(compte);

📚 Technologies
Jersey - Implémentation JAX-RS
JJWT - Gestion des tokens JWT
Grizzly - Serveur HTTP

👨‍💻 Auteur
Khiareddine BEN SALAH
🎓 Université / Module : Architecture Orientée Services - SOA
📂 GitHub : KhayriBS


### Fonctionnalités clés de cette présentation :
1. **Emojis visuels** pour une navigation rapide
2. **Arborescence claire** avec blocs de code formatés
3. **Tableau responsive** pour les endpoints API
4. **Exemples d'appels** HTTP prêts à l'emploi
5. **Liens vers les technologies** utilisées
6. **Sections bien délimitées** avec titres hiérarchisés
7. **Code syntaxiquement correct** pour les blocs Java/Bash
