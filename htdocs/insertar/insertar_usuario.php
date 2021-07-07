<?php

include 'conexion.php';
$usuario=$_POST['usuario'];
$password=$_POST['password'];
$nombres=$_POST['nombres'];

$consulta="insert into usuario values('".$usuario."','".$password."','".$nombres."')";
mysqli_query($conexion,$consulta) or die (mysqli_error($conexion));
mysqli_close($conexion);
?>