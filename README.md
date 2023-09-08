# Talend_DI_Systeme_Integration_de_donnees_commerciales
# ICOMMERCE_REPORTING

Mise en place système d'intégration de données commerciales Icommerce via Talend Data Intégration. 

Ce projet nous permettra de :

I-charger les tables ODS (Operational Data Store) à partir des fichiers plats (fichiers CSV) :



   1- Comprendre le fonctionnement du processus ETL (Extract Transform   Load) ainsi que la modélisation proposée.

   2- Création de la base de données via Postgresql pgAdmin 4 et exécution des différents scripts SQL.

   3- Création du répertoire de données.

   4- Mise en place des différents processus d'intégration de données.

   
   4.1- Création des groupes de contexte.
   
   4.2- Création des métadonnées : Connexion à la base de données.
   
   4.3- Configuration du chargement implicite des variables de contexte.
   
   4.4- Création des différents schémas génériques : Fichiers plats.
   
   4.5- Création des jobs ODS (Transformation et Chargement de la donnée).
   
   ![jOdsVente](https://github.com/massiZSM/Talend_DI_Systeme_Integration_de_donnees_commerciales/assets/16464239/5d2f8a36-799f-4f34-86d4-d87d3d6bd2a4)
   
![jOdsTypeClient](https://github.com/massiZSM/Talend_DI_Systeme_Integration_de_donnees_commerciales/assets/16464239/23ad2250-6c38-4b60-9c55-272f4de86d83)

![jOdsProduit](https://github.com/massiZSM/Talend_DI_Systeme_Integration_de_donnees_commerciales/assets/16464239/76284e7c-ae42-4038-a56e-8a6309d1555e)

![jOdsClient](https://github.com/massiZSM/Talend_DI_Systeme_Integration_de_donnees_commerciales/assets/16464239/b90c28f4-3271-4ab8-bb12-e6c2e097727f)

![JodsSousCategorie](https://github.com/massiZSM/Talend_DI_Systeme_Integration_de_donnees_commerciales/assets/16464239/65fb81d7-d028-458c-b4df-465c78b12c34)

![jOdsCategorie](https://github.com/massiZSM/Talend_DI_Systeme_Integration_de_donnees_commerciales/assets/16464239/891146e5-9b9f-46f9-9a67-b520b51dd739)


   
   4.6- Création du job d'orchestration. 
   
   ![JobOrchestration](https://github.com/massiZSM/Talend_DI_Systeme_Integration_de_donnees_commerciales/assets/16464239/88e42c1f-5f2c-4dc4-aa5f-bbec05994aa6)

 
II-charger les tables du Data WareHouse (DWH) à partir des tables ODS (Operational Data Store):


   1- Comprendre la construction des différentes tables du Data WareHouse.

   2- Connexion à la base de données via pgAdmin 4 et exécution des différents scripts SQL.

   3- Mise en place des différents processus d'intégration de données.

     
   3.1- Création du groupe de contexte DWH.
     
   3.2- Création des métadonnées : Connexion à la base de données.
     
   3.3- Création des jobs DWH.
   
   ![jDwhVente](https://github.com/massiZSM/Talend_DI_Systeme_Integration_de_donnees_commerciales/assets/16464239/273f80b1-b412-4f8d-a2b8-beaac3f00e7f)
   
![jDwhProduit](https://github.com/massiZSM/Talend_DI_Systeme_Integration_de_donnees_commerciales/assets/16464239/d0b904d7-90c3-4a31-865e-3c8e37df66ba)

![jDwhClient](https://github.com/massiZSM/Talend_DI_Systeme_Integration_de_donnees_commerciales/assets/16464239/a99ea5b5-5019-4bef-a95c-18ed3a6975a3)

     
   3.4- Création du job d'orchestration.
   
   ![jChargeDWH](https://github.com/massiZSM/Talend_DI_Systeme_Integration_de_donnees_commerciales/assets/16464239/eb61cad1-9a32-4278-96b0-0dee112c2b61)

   
III-Création du job principal.

![JOB Principal](https://github.com/massiZSM/Talend_DI_Systeme_Integration_de_donnees_commerciales/assets/16464239/e94e8113-7664-453d-9ec1-e850d91b2d8a)




Comme vous pouez construire et planifier l'exécution automatique du job principal (Job permettant d'alimenter l'Operational Data Store et le Data WareHouse) à l'aide du planificateur de tache de votre système.

Les scripts SQL et les fichiers CSV sont dans les dossier : scriptSQL DWH, scriptSQL ODS, csvFiles. 
