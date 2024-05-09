# Intégration de paiement avec l'API Flouci

Ce dépôt contient le code source pour l'intégration de la fonctionnalité de paiement en utilisant l'API Flouci. Flouci est une passerelle de paiement sécurisée et pratique qui permet aux entreprises d'accepter les paiements en ligne

## Pour commencer
Pour intégrer la fonctionnalité de paiement de Flouci dans votre application, suivez ces étapes :

1. Créer un compte Flouci et accéder à la rubrique "Compte développeur API". Cliquez sur le bouton "Passer à ce compte" pour accéder à l'espace développeur.

2. Créer une application de test. Flouci vous fournira un jeton public, un jeton privé et un identifiant d'application de test.

3. Ajouter les jetons public et privé ainsi que l'identifiant de suivi du développeur dans le fichier **application.yml** de votre application. Utilisez les clés **app_token**, **app_secret** et **developer_tracking_id** pour stocker ces valeurs respectivement.

4. - Pour tester les paiements via le portefeuille Flouci, utilisez le code 111111 pour effectuer une transaction réussie et le code 000000 pour simuler une erreur.
   - Pour tester les paiements par carte bancaire/postale, utilisez le numéro de carte 4242 4242 4242 4242 pour effectuer une transaction réussie. Utilisez n'importe quelle autre combinaison de 16 caractères pour simuler une erreur.

## Technologies utilisées :
- Java 17
- Spring Boot 3
- Thymeleaf
- OkHttpClient : OkHttpClient est une bibliothèque HTTP pour Java qui simplifie l'envoi de requêtes HTTP et la réception de réponses. Elle est utilisée ici pour envoyer des requêtes à l'API Flouci et traiter les réponses.

## Documentation API Flouci
Consultez la documentation officielle de l'API Flouci Payment pour des informations détaillées sur l'intégration et l'utilisation des API de paiement Flouci : [Flouci Payment APIs Documentation](https://flouci.stoplight.io/docs/flouci-payment-apis/6c9b5ad7358c9-fr-flouci-payment-api)
