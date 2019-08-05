# Achitecture-Logiciel
Dans le cadre de notre cours en architecture un logiciel un projet de fin de semestre nous a ete donne dans le but de mettre en ouvre ce qu'on a vu en classe. En effet, il s'agit de mettre en place un client web (html, css, php oo), un web server rest (nodejs), un web server (soap) et un client java. Ce projet a ete realiser par Tapa Medina Dia, Ousmane Diene et cheikh Gueye Wane.

## Couche présentation
Cette couche représenta la partie viible et interactive de l'application On conçoit facilement que cette interface peut prendre de multiples facettes sans changer la finalité de l'application. Dans le cas d'un système de distributeurs de billets, l'automate peut être différent d'une banque à l'autre, mais les fonctionnalités offertes sont similaires et les services identiques (fournir des billets, donner un extrait de compte, etc.).

## Couche service

La couche Service regroupe tous les services, ou réalisation de cas d'utilisation. L'idée est d'exposer ces services pour différentes applications clientes. On peut retrouver dans cette couche les Web Services d'une architecture SOA ou les service RESTful. On peut également trouver des EJB session, si le SI est en pure Java.

## Couche DAO

La couche Métier reprend tous les objets métiers de l'application considérée. C'est ici qu'est portée la logique des règles de gestion sur ces objets. 

## Couche métier

## Couche domaine
