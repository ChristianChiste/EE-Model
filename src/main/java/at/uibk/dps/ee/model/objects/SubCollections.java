package at.uibk.dps.ee.model.objects;

import java.util.ArrayList;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;

import at.uibk.dps.ee.model.constants.ConstantsEEModel;

/**
 * Models the class which is annotated onto the function nodes modeling the
 * element index operation. Just an array list with an overwritten toString.
 * 
 * @author Fedor Smirnov
 */
public class SubCollections extends ArrayList<SubCollection> {

	private static final long serialVersionUID = 1L;

	/**
	 * Processes the provided json array following the defined subcollections.
	 * Returns the resulting JsonElement
	 * 
	 * @param input the input json array
	 * @return
	 */
	public JsonElement processJsonArray(JsonArray input) {
		if (size() == 1) {
			SubCollection subCol = this.get(0);
			return subCol.getSubCollection(input);
		} else {
			JsonArray result = new JsonArray();
			for (SubCollection subCollection : this) {
				JsonElement subResult = subCollection.getSubCollection(input);
				if (subResult.isJsonArray()) {
					for (JsonElement jsonElement : subResult.getAsJsonArray()) {
						result.add(jsonElement);
					}
				} else {
					result.add(subResult);
				}
			}
			return result;
		}
	}

	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < this.size(); i++) {
			if (i != 0) {
				result.append(ConstantsEEModel.ElementIndexValueSeparatorExternal);
			}
			result.append(this.get(i).toString());
		}
		return result.toString();
	}
}