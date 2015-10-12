package view;

import java.util.List;
import java.util.Map;

import model.Card;
import model.Type;

public interface SuitForView {

	boolean isEmpty(Type type);

	Map<Integer, List<Card>> getCards();

}
