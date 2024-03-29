insert into user values ("bibi","Fricot","Damien",0494129873,"damien.fricot@hotmail.be","Rue du moulin 220 5600 Philippeville","Avenue Fernand Golenvaux 3 5000 Namur",'fricotin',"ROLE_ADMIN",true,true,true,true);
insert into category values (1),(2);
insert into language values (1,"fr"),(2,"en");
insert into traduction values ("Fruits",1,1),("Légumes",1,2),("Fruit",2,1),("Vegetable",2,2);
insert into product values (1,
							"Pomme",
                            "Malus Domestica",
                            "Rosacée",
                            "Elstar",
                            2.29,
                            "Fruit local par excellence, la pomme est le seul fruit de nos régions que l’on peut consommer toute l’année.
                        Nous en mangeons en moyenne un peu plus de 16 kg par année.La pomme est énergisante et désaltérante.
                        Elle fait une collation parfaite car elle contient beaucoup de vitamines, de minéraux, d'oligoéléments, d'acides des fruits et de fructose.",
                        10,
                        str_to_date('8-8-2019','%e-%c-%Y'),
                        str_to_date('1-4-2019','%e-%c-%Y'),
                        str_to_date('30-11-2019','%e-%c-%Y'),
                        "pomme.png",
                        150,
                        1	),
                        (2,
							"Fraise",
                            "Fragaria virginiana",
                            "Rosacée",
                            "De Virginie",
                            4.37,
                            "Fruit rafraîchissant par excellence grâce à sa richesse en eau, la fraise présente de plus la particularité d'être fort peu énergétique : 52 calories pour une portion de 150 g, très raisonnable pour un dessert !",
                        3,
                        str_to_date('7-4-2019','%e-%c-%Y'),
                        str_to_date('1-4-2019','%e-%c-%Y'),
                        str_to_date('15-4-2019','%e-%c-%Y'),
                        "fraise.png",
                        0,
                        1	),
                        (3,
							"Poire",
                            "Pyrus communis",
                            "Rosacée",
                            "Conférence",
                            1.69,
                            "Les poires raffolent des étés très chauds et trés ensoleillés. La poire se place au deuxième rang des fruits indigènes les plus appréciés. Chaque habitant du pays en mange plus de 3 kilos par année.",
                        3,
                        str_to_date('5-10-2019','%e-%c-%Y'),
                        str_to_date('1-9-2019','%e-%c-%Y'),
                        str_to_date('30-4-2020','%e-%c-%Y'),
                        "poire.png",
                        0,
                        1	),
                         (4,
							"Mûre",
                            "Morus Nigra",
                            "Rosacée",
                            "Noire",
                            15.12,
                            "La mûre est connue pour être ramassée au bords des chemins sur les ronces à la fin de l'été. Cette petite baie juteuse, violet très sombre, est appréciée pour sa saveur typée et son parfum agréable. Elle est connue depuis très longtemps puisqu'elle est mentionnée dans la mythologie grecque. La ronce serait issue du sang versé par les titans lors de leurs affrontements avec les dieux. La mûre est aujourd'hui cultivée dans une large zone géographique. Riche en vitamines et minéraux, elle présente un apport particulièrement élevé en pigments aux propriétés antioxydantes. De nombreux remèdes ou solutions à bases de feuilles de mûres ont été transmises de génération en génération, par exemple pour renforcer les gencives ou soulager les ulcérations de la bouche.",
                        3,
                        str_to_date('10-8-2019','%e-%c-%Y'),
                        str_to_date('1-7-2019','%e-%c-%Y'),
                        str_to_date('30-10-2019','%e-%c-%Y'),
                        "mure.png",
                        50,
                        1),
                        (5,
							"Fenouille",
                            "Foeniculum vulgare",
                            "Apiacées",
                            "Commun",
                            1.99,
                            "Légume très populaire en Italie, le fenouil se reconnaît à son parfum et à son goût anisé. Référence symbolique et mythologique depuis l’Antiquité, c’est avant tout un aliment particulièrement intéressant sur le plan nutritionnel. On le retrouve avec plaisir dans des plats salés, mais aussi dans les desserts sucrés.",
                        7,
                        str_to_date('11-8-2019','%e-%c-%Y'),
                        str_to_date('1-5-2019','%e-%c-%Y'),
                        str_to_date('30-11-2019','%e-%c-%Y'),
                        "fenouil.gif",
                        2,
                        2),
                        (6,
							"Pomme de Terre",
                            "Solanum tuberosum",
                            "Solanacées",
                            "Charlotte",
                            1.2,
							"Consommée depuis le XIXe siècle, la pomme de terre est rapidement devenue le légume préféré des Français. Des centaines de variétés sont présentes sur les étals, chacune réservée à un usage spécifique. La pomme de terre se prête à tous types de cuissons et de recettes, qui facilitent son intégration dans votre alimentation quotidienne. Et ne vous en privez surtout pas : c’est un véritable concentré d’énergie et de vitamines !",
							60,
							str_to_date('4-7-2019','%e-%c-%Y'),
							str_to_date('1-9-2019','%e-%c-%Y'),
							str_to_date('30-3-2020','%e-%c-%Y'),
							"pommeDeTerre.png",
							0,
							2),
                            (7,
							"Aubergine",
                            "Solanum melongena",
                            "Solanacées",
                            "Torvum",
                            1.74,
							"Une aubergine pèse 225 g en moyenne. Sa couleur, sa taille et sa forme varient selon les variétés,. La plus fréquente sur les étals est l’aubergine violette, à la chair blanche et moelleuse. Pauvre en calories, l’aubergine contient fibres, minéraux et vitamines en quantités importantes. Ce légume colore et vitamine vos plats tout l’été ! L’aubergine est un légume facile à vivre qui se cuisine aisément. Sa chair fondante se marie à un grand nombre de préparations salées. L’aubergine est un des légumes emblématiques des beaux jours et de la cuisine méditerranéenne.",
							5,
							str_to_date('13-8-2019','%e-%c-%Y'),
							str_to_date('1-6-2019','%e-%c-%Y'),
							str_to_date('30-9-2019','%e-%c-%Y'),
							"aubergine.png",
							49,
							2);
                        