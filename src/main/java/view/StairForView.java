package view;

import java.util.List;
import java.util.Map;

import model.Card;

public interface StairForView {

	boolean isEmpty(int stair);

	public Map<Integer, List<Card>> getCards();
}
