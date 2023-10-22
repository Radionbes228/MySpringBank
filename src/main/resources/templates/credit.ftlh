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
    <form method="POST" action="/credit">

        Credit name <input type="text"  name="creditName"><br><br>
        Loan owner <input type="text" name="loanOwner"><br><br>
        <input type="submit" value="Создать">
    </form>

    <#list credits as credit>
        <h4><a href="/credit/${credit.id}">${credit.getCreditName()}</a></h4>
    </#list>

</body>
</html>