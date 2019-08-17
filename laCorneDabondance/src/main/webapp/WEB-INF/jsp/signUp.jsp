<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="include/importTags.jsp" %>
<%@page contentType="text/html; charset=UTF-8" %>

<html lang="fr">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
</head>
<body>

<!--Container-->

<div class="container-title">
    <h2>Inscription</h2>


    <div class="flex-container">

        <div>

            <form action="/action_page.php">


                <div class="row">
                    <div class="col-25">
                        <select id="gender" name="gender">
                            <option value="male">Mr</option>
                            <option value="female">Mme</option>
                            <option value="neutral">Neutre</option>
                        </select>
                    </div>
                </div>

                <div class="row">
                    <div class="col-25">
                        <label for="lname">Nom</label>
                    </div>
                    <div class="col-75">
                        <input type="text" id="lname" name="lastname" placeholder="Votre nom.." required>
                    </div>
                </div>


                <div class="row">
                    <div class="col-25">
                        <label for="fname">Prénom</label>
                    </div>
                    <div class="col-75">
                        <input type="text" id="fname" name="firstname" placeholder="Votre prénom.." required>
                    </div>
                </div>

                <div class="row">
                    <div class="col-25">
                        <label for="mail">Mail</label>
                    </div>
                    <div class="col-75">
                        <input type="text" id="mail" name="mail" placeholder="Votre adresse mail.." required>
                    </div>
                </div>

                <div class="row">
                    <div class="col-25">
                        <label for="phone">Téléphone</label>
                    </div>
                    <div class="col-75">
                        <input type="text" id="phone" name="phone" placeholder="Votre numéro de téléphone.." required>
                    </div>
                </div>

                <div class="row">
                    <div class="col-25">
                        <label for="adPriv">Adresse</label>
                    </div>
                    <div class="col-75">
                        <input type="text" id="adPriv" name="adressPrivate" placeholder="Votre adresse.." required>
                    </div>
                </div>

                <div class="row">
                    <div class="col-25">
                        <label for="adDel">Adresse De Livraison</label>
                    </div>
                    <div class="col-75">
                        <input type="text" id="adDel" name="adressDelivery" placeholder="L'adresse de livraison.." required>
                    </div>
                </div>




        </div>

        <div>

                <div class="row">
                    <div class="col-25">
                        <label for="login">Identifiant</label>
                    </div>
                    <div class="col-75">
                        <input type="text" id="login" name="login" placeholder="Votre identifiant.." required>
                    </div>
                </div>

                <div class="row">
                    <div class="col-25">
                        <label for="password">Mot de passe</label>
                    </div>
                    <div class="col-75">
                        <input type="password" id="password" name="password" placeholder="Votre mot de passe.." required>
                    </div>
                </div>

                <div class="row">
                    <div class="col-25">
                        <label for="RePassword">Vérification du mot de passe</label>
                    </div>
                    <div class="col-75">
                        <input type="password" id="RePassword" name="RepetPassword" placeholder="Votre mot de passe.." required>
                    </div>
                </div>

                <div class="row">
                    <input type="submit" value="Valider">
                </div>

            </form>

        </div>

    </div>

</div>


</body>
</html>