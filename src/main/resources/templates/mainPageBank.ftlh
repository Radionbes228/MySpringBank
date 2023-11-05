<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>RadionProfile</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="/static/home.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
          crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
            integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
            integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>

</head>
<body>
    <div>
        <h2>Профиль: Radion</h2>
    </div>


    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>


    <div>
        <ul>
        <li><a href="/mortgage"><label>Ипотека</label></a></li>
        <li><a href="/credit">Кредит - количество кредитов:</a></li>
        <li><a href="/contri">Вклады</a></li>
        </ul>
    </div>

    <#list cardsList as card>
        <div>
            <h3><a href="/card-info/${card.getId()}">Карточка 1</a></h3>
            <h5>${card.getSum()}</h5>
        </div>
    </#list>

    <div>
        <h3>Курсы волют</h3><br>
        <p>Рубль: ${exchangeRate}   Доллар: 1</p>
    </div>




</body>
</html>