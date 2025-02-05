-- Initialisation des tables
INSERT INTO PERSONNE(nom,prenom,poste) VALUES
    ('Rémi', 'Bastide','prof'),
    ('Elyes', 'Lamine','directeur'),
    ('Jean-Marie', 'Pécatte','prof');


INSERT INTO PROJET(nom,debut) VALUES
                                           ('MCDSSI', '2025-02-05'),
                                           ('SKateBoarding', '2001-10-08'),
                                           ('FEFD12565', '2001-07-28');

INSERT INTO PARTICIPATION(role,pourcentage,personne_matricule,projet_code) VALUES
                                  ('Président', 25,2,2),
                                  ('Vice-Président', 43,3,2),
                                  ('Professeur', 2,1,1);
