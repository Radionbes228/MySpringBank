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
        <li><a href="/contribution">Ипотека</a></li>
        <li><a href="/credit">Кредит - количество кредитов:</a></li>
        <li><a>Вклады</a></li>
        <li><a>Перевод</a></li>
        </ul>
    </div>

    <#list cardsList as card>
        <div>
            <h3><a href="/info-card/${card.getId()}">Карточка 1</a></h3>
            <h5>${card.getSum()}</h5>
        </div>
    </#list>

</body>
</html>