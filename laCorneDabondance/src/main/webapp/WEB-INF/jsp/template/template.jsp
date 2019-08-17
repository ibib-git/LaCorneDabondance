<%@include file="../include/importTags.jsp"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html lang="fr">

<head>
    <title>${title}</title>
    <link rel="icon" href="<spring:url value='/images/corn-in-fruta.ico'/>"/>
    <link type="text/css" rel="stylesheet" href="<spring:url value='/css/styles.css'/>"/>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
</head>

<body>
<!-- Header -->
<div class="header" style="background-image: url('<spring:url value="/images/Corne-dAbondance.jpg"/>')";>
    <h1>La Corne d'abondance</h1>
    <p>Vente de fruits et légumes belges</p>
</div>

<!-- Navigation Bar -->
<ul class="navbar">
    <li><a href="<spring:url value='/home'/>">Accueil</a></li>
    <li class="dropdown">
        <a href="#category">Catégorie</a>
        <div class="dropdown-content">
            <a href="<spring:url value='/products/fruits'/>">Fruits</a>
            <a href="<spring:url value='/products/legumes'/>">Légumes</a>
        </div></li>
    <li><a href="<spring:url value='/products/calendar'/>">Calendrier</a></li>
    <li><a href="<spring:url value='/home/contact'/>">Contact</a></li>
    <li class="right"><a href="#frenchFlag"><img class="icon" src="<spring:url value='/images/french-flag.png'/>" alt="frenchFlag"/></a></li>
    <li class="right"><a href="#englishFlag"><img class="icon" src='<spring:url value="/images/english-flag.jpg"/>' alt="englishFlag"/></a></li>
    <li class="right"><a onclick="document.getElementById('panier').style.display='block'" style="width:auto;"><img class="icon" src='<spring:url value="/images/panier.png"/>' alt="shopIcon"></a></li>
    <li class="right"><a><button onclick="document.getElementById('log').style.display='block'" style="width:auto;"  class="buttonNavBar">Inscription/Connexion</button></a></li>

    <li class="search-container">
        <a>
            <form autocomplete="off">
                <div class="autocomplete" style="width:300px;">
                    <input id="mySearch" type="text" placeholder="Rechercher.." name="search">
                </div>
            </form>
        </a>
    </li>

</ul>

<div id="log" class="modal">

    <form class="modal-content animate">
        <div class="img-login">
            <span onclick="document.getElementById('log').style.display='none'" class="close" title="Close Modal">&times;</span>
            <img src='<spring:url value="/images/corn-in-fruta.png"/>' alt="logPicture" class="avatar">
        </div>

        <div class="container-login">
            <label><b>Identifiant</b></label>
            <input type="text" class="login" placeholder="Entrer votre Identifiant" name="uname" required>

            <label><b>Mot de passe</b></label>
            <input type="password" class="login" placeholder="Entrer votre mot de passe" name="psw" required>

            <button class="button-login" type="submit">Valider</button>
            <a href="<spring:url value='/signUp'/>"><button class="button-register" type="button">Nouvelle inscription</button></a>

        </div>



        <div class="container" style="background-color:#f1f1f1">
            <button type="button" onclick="document.getElementById('log').style.display='none'" class="cancelbtn">Annuler</button>
            <span class="psw"><a href="#">Mot de passe oublié ?</a></span>
        </div>
    </form>
</div>



<div id="panier" class="modal">

    <form class="modal-content animate">
        <div class="img-login">
            <span onclick="document.getElementById('panier').style.display='none'" class="close" title="Close Modal">&times;</span>
            <img src='<spring:url value="/images/images-ico.ico"/>' alt="logPicture" class="avatar">
            <h3>Panier de la commande</h3>
        </div>
    <table>

        <tr>
            <th>Nom du produit</th>
            <th>Prix unitaire</th>
            <th>Quantité</th>
            <th>Total</th>
        </tr>

        <div class="container-login">
            <c:forEach items="${session.getMarketModel().getMarketLineModel()}" var="market">
                <tr>
                    <td>${market.getProductsModel().getName()} </td>
                    <td>${market.getProductsModel().getCatalogPrice()} </td>
                    <td>${market.getQuantity()} </td>
                    <td><fmt:formatNumber type="number" maxFractionDigits="2" value=" ${market.getProductsModel().getCatalogPrice() * market.getQuantity()}"/></td>
                    <td><a href="<spring:url value='/products/updateProduct/${market.getIdLine()}'/>"><button class="buttonNavBar" type="button" style="background-color: cornflowerblue">Modifier</button></a></td>
                    <td><a href="<spring:url value='/products/deleteProduct/${market.getIdLine()}'/>"><button class="buttonNavBar" type="button" style="background-color: red">Supprimer</button></a></td>


                </tr>
            </c:forEach>

        </div>


    </table>



        <div class="container" style="background-color:#f1f1f1">
            <button type="button" onclick="document.getElementById('panier').style.display='none'" class="button-login">Valider et payer</button>
            <button type="button" onclick="document.getElementById('panier').style.display='none'" class="cancelbtn">Annuler</button>
        </div>
    </form>
</div>



<script>
    // Get the modal
    var modal = document.getElementById('log');
    var modalPanier = document.getElementById('panier');


    // When the user clicks anywhere outside of the modal, close it
    window.onclick = function(event) {
        if (event.target == modal) {
            modal.style.display = "none";
        }

        if (event.target == modalPanier) {
            modalPanier.style.display = "none";
        }
    }




    function autocomplete(inp, arr) {
        /*the autocomplete function takes two arguments,
        the text field element and an array of possible autocompleted values:*/
        var currentFocus;
        /*execute a function when someone writes in the text field:*/
        inp.addEventListener("input", function(e) {
            var a, b, i, val = this.value;
            /*close any already open lists of autocompleted values*/
            closeAllLists();
            if (!val) { return false;}
            currentFocus = -1;
            /*create a DIV element that will contain the items (values):*/
            a = document.createElement("DIV");
            a.setAttribute("id", this.id + "autocomplete-list");
            a.setAttribute("class", "autocomplete-items");
            /*append the DIV element as a child of the autocomplete container:*/
            this.parentNode.appendChild(a);
            /*for each item in the array...*/
            for (i = 0; i < arr.length; i++) {
                /*check if the item starts with the same letters as the text field value:*/
                if (arr[i].substr(0, val.length).toUpperCase() == val.toUpperCase()) {
                    /*create a DIV element for each matching element:*/
                    b = document.createElement("DIV");
                    /*make the matching letters bold:*/
                    b.innerHTML = "<strong>" + arr[i].substr(0, val.length) + "</strong>";
                    b.innerHTML += arr[i].substr(val.length);
                    /*insert a input field that will hold the current array item's value:*/
                    b.innerHTML += "<input type='hidden' value='" + arr[i] + "'>";
                    /*execute a function when someone clicks on the item value (DIV element):*/
                    b.addEventListener("click", function(e) {
                        /*insert the value for the autocomplete text field:*/
                        inp.value = this.getElementsByTagName("input")[0].value;
                        /*close the list of autocompleted values,
                        (or any other open lists of autocompleted values:*/
                        closeAllLists();
                    });
                    a.appendChild(b);
                }
            }
        });
        /*execute a function presses a key on the keyboard:*/
        inp.addEventListener("keydown", function(e) {
            var x = document.getElementById(this.id + "autocomplete-list");
            if (x) x = x.getElementsByTagName("div");
            if (e.keyCode == 40) {
                /*If the arrow DOWN key is pressed,
                increase the currentFocus variable:*/
                currentFocus++;
                /*and and make the current item more visible:*/
                addActive(x);
            } else if (e.keyCode == 38) { //up
                /*If the arrow UP key is pressed,
                decrease the currentFocus variable:*/
                currentFocus--;
                /*and and make the current item more visible:*/
                addActive(x);
            } else if (e.keyCode == 13) {
                /*If the ENTER key is pressed, prevent the form from being submitted,*/
                e.preventDefault();
                if (currentFocus > -1) {
                    /*and simulate a click on the "active" item:*/
                    if (x) x[currentFocus].click();
                }
            }
        });
        function addActive(x) {
            /*a function to classify an item as "active":*/
            if (!x) return false;
            /*start by removing the "active" class on all items:*/
            removeActive(x);
            if (currentFocus >= x.length) currentFocus = 0;
            if (currentFocus < 0) currentFocus = (x.length - 1);
            /*add class "autocomplete-active":*/
            x[currentFocus].classList.add("autocomplete-active");
        }
        function removeActive(x) {
            /*a function to remove the "active" class from all autocomplete items:*/
            for (var i = 0; i < x.length; i++) {
                x[i].classList.remove("autocomplete-active");
            }
        }
        function closeAllLists(elmnt) {
            /*close all autocomplete lists in the document,
            except the one passed as an argument:*/
            var x = document.getElementsByClassName("autocomplete-items");
            for (var i = 0; i < x.length; i++) {
                if (elmnt != x[i] && elmnt != inp) {
                    x[i].parentNode.removeChild(x[i]);
                }
            }
        }
        /*execute a function when someone clicks in the document:*/
        document.addEventListener("click", function (e) {
            closeAllLists(e.target);
        });
    }

    /*An array containing all the country names in the world:*/
    var countries = [];
    <c:forEach items="${productsAllList}" var="product">
    var newElement = countries.push("${product.getName()}");
    </c:forEach>

    /*initiate the autocomplete function on the "myInput" element, and pass along the countries array as possible autocomplete values:*/
    autocomplete(document.getElementById("mySearch"),countries );

</script>




<!-- Main content -->

<div>
    <div>
        <tiles:insertAttribute name="main-content"/>
    </div>
</div>



<!-- Footer -->
<div class="footer">
    <h3>Qui sommes nous ?</h3>
    <p>Projet étudiant créé en 2019,la corne d'abondance a pour vocation de faciliter la vente de produits issuent de l'agriculture belge. <br>
        Cette platforme en ligne est l'idée de la mise en relation de producteurs locaux. <br>
    </p>

    <P>© Fricot Damien </P>
</div>

</body>


</html>