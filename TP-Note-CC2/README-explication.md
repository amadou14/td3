**Nom**: keita

**Prenom**: Amadou

**N. matricule**: 41015918

# Objectif

Ce devoir vise à déployer une application web sur trois VM :

- une VM contenant la base de données (data),
- une VM contenant le serveur d'application (back end),
- une VM contenant un client React (front end)

et de faire interargir les composants entre ces trois couches via un réseau local.


# Steps

le fichier VagrantFile contient 3 parties pour créer chacune une vm et y executer des playbook ansible:

- **la base de donnée**:
    - adresse ip: 172.16.0.3
    - un script shell (bootstrap) qui permet d'installer mysql 
    - un playbook ansible pour initialiser les tables avec le fichier conferences.sql
    - les ports:
        - 2233 sur le host est mappé sur 22 de la machine pour l'accès ssh
        - 3306 sur le host est mappé sur 3306 pour le server mysql


- **le front end**:
    - adresse ip: 172.16.0.4
    - un script shell depuis le file VagrantFile pour installer nodejs v14 et npm
    - un playbook ansible qui permet:
        - de copier le projet client dans un reportoir nommé client dans la vm
        - de lancer npm install pour installer les depences du front
        - de lander le front sur le port 3000
    - les ports:
        - 2244 sur le host est mappé sur 22 de la machine pour l'accès ssh
        - 3000 sur le host est mappé sur 3000 pour l'application client front end react

- **le back end**:
    - adresse ip: 172.16.0.2
    - un playbook ansible pour:
        - installer java chargeant le jdk dans provisionning/back
        - installer tomcat et le run sur le port 8080
        - deployer le war du back dans tomcat en le copiant dans /webapps de tomcat
    - les ports:
        - 2244 sur le host est mappé sur 22 de la machine pour l'accès ssh
        - 3000 sur le host est mappé sur 3000 pour l'application client front end react

**start command**: vagrant up -provision

**NB**: J'ai eu du mal à deployer le backend car j'ai pas réussi à configurer une instance tomcat dans eclipse, histoire de tester le projet dans un premier temps et ensuite builder le war depuis eclispe (j'avais une erreur de timeout sur le démarrage de tomcat sur ma machine). N'ayant pas reussi à le faire sur eclipse, j'ai du builder le war depuis le command line avec jar -cvf que j'ai ensuite copier dans tomcat avec vagrant ansible.


