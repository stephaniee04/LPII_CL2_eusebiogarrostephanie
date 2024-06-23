<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Menú - Principal</title>
    <style>
        body {
            background-color: #c5dec9; /* Color verde claro */
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            font-family: Arial, sans-serif;
        }
        .menu-container {
            background-color: #fff;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            text-align: center;
        }
        h2 {
            color: #4CAF50; /* Color verde */
            margin-bottom: 35px; /* Separación inferior */
        }
        a {
            text-decoration: none;
            color: #4CAF50; /* Color verde */
            font-size: 18px;
            padding: 10px 20px;
            border: 2px solid #4CAF50;
            border-radius: 5px;
            transition: background-color 0.3s, color 0.3s;
        }
        a:hover {
            background-color: #4CAF50; /* Color verde */
            color: white;
        }
    </style>
</head>
<body>
    <div class="menu-container">
        <h2>MENÚ PRINCIPAL</h2>
        <a href="RegistrarProductos.jsp">REGISTRAR PRODUCTO</a>
    </div>
</body>
</html>
