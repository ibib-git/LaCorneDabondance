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

            <form:form action="/laCorneDabondance/signUp/newUser" id="signUp" method="post" modelAttribute="user">


                <div class="row">
                    <div class="col-25">
                        <form:label path="lastName">Nom</form:label>
                    </div>
                    <div class="col-75">
                        <form:input type="text" path="lastname" name="lastname" placeholder="Votre nom.." required="required" />
                    </div>
                </div>
                <form:errors path="lastName" />

                <div class="row">
                    <div class="col-25">
                        <form:label path="firstName">Prénom</form:label>
                    </div>
                    <div class="col-75">
                        <form:input type="text" path="firstName" name="firstname" placeholder="Votre prénom.." required="required"/>
                    </div>
                </div>
                <form:errors path="firstName" />


                <div class="row">
                    <div class="col-25">
                        <form:label path="mail">Mail</form:label>
                    </div>
                    <div class="col-75">
                        <form:input type="text" path="mail" name="mail" placeholder="Votre adresse mail.." required="required"/>
                    </div>
                </div>
                <form:errors path="mail" />

                <div class="row">
                    <div class="col-25">
                        <form:label path="phone">Téléphone</form:label>
                    </div>
                    <div class="col-75">
                        <form:input type="text" path="phone" name="phone" placeholder="Votre numéro de téléphone.." required="required"/>
                    </div>
                </div>
                <form:errors path="phone" />

                <div class="row">
                    <div class="col-25">
                        <form:label path="adressPrivate">Adresse</form:label>
                    </div>
                    <div class="col-75">
                        <form:input type="text" path="adressPrivate" name="adressPrivate" placeholder="Votre adresse.." required="required"/>
                    </div>
                </div>
                <form:errors path="adressPrivate" />

                <div class="row">
                    <div class="col-25">
                        <form:label path="adressDelivery">Adresse De Livraison</form:label>
                    </div>
                    <div class="col-75">
                        <form:input type="text" path="adressDelivery" name="adressDelivery" placeholder="L'adresse de livraison.." required="required"/>
                    </div>
                </div>
                <form:errors path="adressDelivery" />


        </div>

        <div>

                <div class="row">
                    <div class="col-25">
                        <form:label path="user">Identifiant</form:label>
                    </div>
                    <div class="col-75">
                        <form:input type="text" path="user" name="user" placeholder="Votre identifiant.." required="required"/>
                    </div>
                </div>
            <form:errors path="user" />


            <div class="row">
                    <div class="col-25">
                        <form:label path="password">Mot de passe</form:label>
                    </div>
                    <div class="col-75">
                        <form:input type="password" path="password" name="password" placeholder="Votre mot de passe.." required="required"/>
                    </div>
                </div>
            <form:errors path="password" />


            <div class="row">
                    <form:button >Valider inscription</form:button>
                </div>

            </form:form>

        </div>

    </div>

</div>


</body>
</html>