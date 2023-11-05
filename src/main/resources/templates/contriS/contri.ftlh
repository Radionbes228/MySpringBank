<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="/static/home.css">
    <link href="/static/input.scss">

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

    <title>Document</title>
</head>
<body>
    <form action="/contri" method="POST">
        <div class="row g-3 align-items-center">
            <div class="col-auto">
                <p>Введите куда вкладываетесь</p><input type="text" class="form-control" name="name">
            </div>
        </div>
        <div class="row g-3 align-items-center">
            <div class="col-auto">
                <p>Сумма вклада</p><input  type="number" name="sum" class="form-control">
            </div>
        </div>
        <div class="row g-3 align-items-center">
            <div class="col-auto">
                <p>Процентная ставка</p><input type="text" name="interestRate" class="form-control">
            </div>
        </div>
        <input type="submit" class="btn btn-dark" value="Добавть">
    </form>


    <#list contriES as contri>
        <p><a href="/contri/info/${contri.getId()}">${contri.getName()}</a></p>
    </#list>
</body>
</html>