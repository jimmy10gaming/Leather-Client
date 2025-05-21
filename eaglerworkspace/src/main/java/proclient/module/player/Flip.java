 package proclient.module.player;

    import proclient.module.Module;
    import Proclient.module.Category
    
    public class Flip extends Module {
        public Flip() {
            super("Flip", KeyboardConstants.KEY_NONE, Category.PLAYER)
        }
        
        public void toggle() {
		mc.thePlayer.rotationYaw += 180;
	}
