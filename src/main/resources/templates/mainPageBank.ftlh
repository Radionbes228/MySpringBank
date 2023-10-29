<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>RadionProfile</title>
</head>
<body>
    <div>
        <h2>Профиль: Radion</h2>
    </div>

    <div>
        <ul>
        <li><a href="/mortgage">Ипотека</a></li>
        <li><a href="/credit">Кредит - количество кредитов:</a></li>
        <li><a href="/">Вклады</a></li>
        </ul>
    </div>

    <#list cardsList as card>
        <div>
            <h3><a href="/card-info/${card.getId()}">Карточка 1</a></h3>
            <h5>${card.getSum()}</h5>
        </div>
    </#list>

    <div style="display: flex">
        <h3>Курсы волют</h3><br>
        <h5>Рубль: 70            Доллар: 1</h5>
    </div>

</body>
</html>