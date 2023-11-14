<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>RadionProfile</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
          crossorigin="anonymous">

</head>
<body>
    <ul class="nav justify-content-center">
        <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="#">Профиль: Radion</a>
        </li>
        <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="/home">Home</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="/credit">Кредит</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="/mortgage">Ипотека</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="/contri" tabindex="-1">Вклады</a>
        </li>
    </ul>

    <#list cardsList as card>
        <div>
            <h3><a href="/card-info/${card.getId()}">Карточка 1</a></h3>
            <h5>${card.getSum()}</h5>
        </div>
    </#list>

    <div style="width: 200px">
        <h3>Курсы волют</h3><br>
<#--        <p>Рубль: ${exchangeRate}   Доллар: 1</p>-->
    </div>

</body>
</html>