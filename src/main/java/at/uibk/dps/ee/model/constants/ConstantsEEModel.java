package at.uibk.dps.ee.model.constants;

/**
 * Container class for the constants used by the classes building and
 * maintaining the enactment model.
 * 
 * @author Fedor Smirnov
 *
 */
public final class ConstantsEEModel {

	public static final String KeywordSeparator1 = "--";
	public static final String KeyWordSeparator2 = "__";
	public static final String NegationPrefix = "!(";
	public static final String NegationSuffix = ")";
	public static final String EarliestArrivalFuncAffix = "|or|";

	public static final String DecisionVariableSuffix = "--decisionVariable";
	public static final String DecisionVariableJsonKey = "decisionVariable";
	public static final String EarliestArrivalJsonKey = "earliestArrival";

	// Element index properties
	public static final String EIdxSeparatorInternal = ":";
	public static final String EIdxSeparatorExternal = ",";
	public static final String BlockSeparator = ",";

	/**
	 * No constructor
	 */
	private ConstantsEEModel() {
	}
}
