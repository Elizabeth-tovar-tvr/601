package  {
	
	import flash.display.MovieClip;
	//METODO CONSTRUCTOR ES EL MÁS IMPORTANTE
	//VARIABLE DE CLKASE: VARIABLE QUE PERMITE QUE EL METODO INTERACTUE CON
	
	public class Setup extends MovieClip {
		//CLASE CONSTRUCTORA 
		
		private var FONDO_NEW:FONDOCHIDEE = new FONDOCHIDEE ();
		private var PISO_NEW:PISO = new PISO ();
		private var ANTAGONISTA_NEW:ANTAGONISTA = new ANTAGONISTA ();
		private var PROTAGONISTA_NEW:PROTAGONISTA = new PROTAGONISTA ();
		private var BALA_NEW:BALA = new BALA();
		//VARIABLE DE CLASE
		
		public function Setup() {
			// constructor code
			addChild (FONDO_NEW);
			addChild (PISO_NEW);
			addChild (PROTAGONISTA_NEW);
			addChild (ANTAGONISTA_NEW);
			
			FONDO_NEW.y=0;
			FONDO_NEW.x=0;
			
			PISO_NEW.y=350;
			PISO_NEW.x=0;
			
			PROTAGONISTA_NEW.y=50;
			PROTAGONISTA_NEW.x=200;
			
			ANTAGONISTA_NEW.y=325;
			ANTAGONISTA_NEW.x=100;
			
			 
			
			
 		}
	}
	
}
