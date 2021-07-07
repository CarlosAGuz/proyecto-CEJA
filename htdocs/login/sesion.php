<?PHP
$hostname="localhost";
$database="ceja";
$username="root";
$password="";
$json=array();
	if(isset($_GET["usuario"]) && isset($_GET["contraseña"])){
		$user=$_GET['usuario'];
		$pwd=$_GET['contraseña'];
		
		$conexion=mysqli_connect($hostname,$username,$password,$database);
		
		$consulta="SELECT usuario, contraseña, nombres FROM usuarios WHERE usuario= '{$usuario}' AND contraseña = '{$contraseña}'";
		$resultado=mysqli_query($conexion,$consulta);

		if($consulta){
		
			if($reg=mysqli_fetch_array($resultado)){
				$json['datos'][]=$reg;
			}
			mysqli_close($conexion);
			echo json_encode($json);
		}



		else{
			$results["usuario"]='';
			$results["contraseña"]='';
			$results["nombres"]='';
			$json['datos'][]=$results;
			echo json_encode($json);
		}
		
	}
	else{
		   	$results["usuario"]='';
			$results["contraseña]='';
			$results["nombres"]='';
			$json['datos'][]=$results;
			echo json_encode($json);
		}
?>