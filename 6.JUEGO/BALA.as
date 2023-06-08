package  {
	import flash.events.Event;
	import flash.display.MovieClip;
	
	public class BALA extends MovieClip{
		
		private var vel:Number=7;

		public function BALA(pos_x,pos_y) {
			// constructor code
			x=pos_x;
			y=pos_y+30;
			
			this.addEventListener(Event.ENTER_FRAME, mover);
		}
		
		
		public function mover(e:Event){
			y+=vel;
		    if (y >= 380){
				vel= 0;
				stage.removeChild(this);
				this.removeEventListener(Event.ENTER_FRAME, mover);
				}
			
			}

	}
	
}
