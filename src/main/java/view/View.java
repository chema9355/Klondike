package view;

import controller.ExitController;
import controller.FromDeckToDiscardController;
import controller.FromDiscardToDeckController;
import controller.FromDiscardToStairController;
import controller.FromDiscardToSuitController;
import controller.FromStairToStairController;
import controller.FromStairToSuitController;
import controller.FromSuitToStairController;
import controller.TurnOverController;

public interface View {
	
	void render();

	void atender(FromDeckToDiscardController fromDeckToDiscardController);

	void atender(FromDiscardToDeckController FromDiscardToDeckController);
	
	void atender(FromDiscardToStairController FromDiscardToStairController);

	void atender(FromDiscardToSuitController FromDiscardToSuitController);
	
	void atender(FromStairToStairController FromStairToStairController);

	void atender(FromStairToSuitController FromStairToSuitController);
	
	void atender(FromSuitToStairController FromSuitToStairController);

	void atender(TurnOverController TurnOverController);
	
	void atender(ExitController ExitController);

}
