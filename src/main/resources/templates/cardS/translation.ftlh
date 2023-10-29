<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>

    <form action="/translation/${thisCard.getId()}" method="POST">

        <label for="cardId">Выберите Id карты:</label>
        <select id="cardId" name="cardId">
            <#list cards as card>
                <option value="${card.getId()}">${card.getId()}</option>
            </#list>
        </select>

        Сумма перевода<input type="number" name="sum" >
        <input type="submit" value="Перевести">
    </form>


</body>
</html>