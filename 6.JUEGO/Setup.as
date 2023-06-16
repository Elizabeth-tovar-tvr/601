package  {
	
	import flash.display.MovieClip;
	import flash.events.Event;
	
	//METODO CONSTRUCTOR ES EL MÁS IMPORTANTE
	//VARIABLE DE CLKASE: VARIABLE QUE PERMITE QUE EL METODO INTERACTUE CON
	
	public class Setup extends MovieClip {
		//CLASE CONSTRUCTORA 
		
		private var FONDO_NEW:FONDOCHIDEE = new FONDOCHIDEE ();
		private var PISO_NEW:PISO = new PISO ();
		private var ANTAGONISTA_NEW:ANTAGONISTA = new ANTAGONISTA ();
		static var PROTAGONISTA_NEW:PROTAGONISTA = new PROTAGONISTA ();
		
		static var PUNTOS:Number=0;
		static var PUNTOS_BOX_NEW:PUNTOS_BOX = new PUNTOS_BOX(); 
		
		//VARIABLE DE CLASE
		
		public function Setup() {
			// constructor code
			addChild (FONDO_NEW);
			addChild (PISO_NEW);
			addChild (PROTAGONISTA_NEW);
			addChild (ANTAGONISTA_NEW);
			
			addChild (PUNTOS_BOX_NEW);
			
			
			
			FONDO_NEW.y=0;
			FONDO_NEW.x=0;
			
			PISO_NEW.y=375;
			PISO_NEW.x=220;
			
			ANTAGONISTA_NEW.y=40;
			ANTAGONISTA_NEW.x=200;
			
			PROTAGONISTA_NEW.y=335;
			PROTAGONISTA_NEW.x=100;
			
			PUNTOS_BOX_NEW.y=135;
			PUNTOS_BOX_NEW.x=200;
			
			PUNTOS_BOX_NEW.PUNTOSTXT.text= String(PUNTOS);
			
			this.addEventListener(Event.ENTER_FRAME, actualiza_puntos);
 		}
		
		public function actualiza_puntos(e:Event){
			PUNTOS_BOX_NEW.PUNTOSTXT.text=String(PUNTOS);
			
		}
		
	}
	
}
