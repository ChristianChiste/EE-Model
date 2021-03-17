package at.uibk.dps.ee.model.properties;

import at.uibk.dps.ee.model.constants.ConstantsEEModel;
import net.sf.opendse.model.Mapping;
import net.sf.opendse.model.Resource;
import net.sf.opendse.model.Task;
import net.sf.opendse.model.properties.AbstractPropertyService;

/**
 * Static method container providing access to the attributes of the mapping
 * edges.
 * 
 * @author Fedor Smirnov
 *
 */
public final class PropertyServiceMapping extends AbstractPropertyService{
  
  public static final String propNameRank = "Rank";

  /**
   * No constructor.
   */
  private PropertyServiceMapping() {}

  /**
   * Returns a mapping edge from the given src task to the given dst resource.
   * 
   * @param src the src task
   * @param dst the dst resource
   * @return a mapping edge from the given src task to the given dst resource
   */
  public static Mapping<Task, Resource> createMapping(final Task src, final Resource dst) {
    return new Mapping<Task, Resource>(getMappingId(src, dst), src, dst);
  }

  /**
   * Returns the id string of a mapping from the given src task to the given
   * destination.
   * 
   * @param src the src task
   * @param dst the dst resource
   * @return the id string of a mapping from the given src task to the given
   *         destination
   */
  protected static String getMappingId(final Task src, final Resource dst) {
    return src.getId() + ConstantsEEModel.KeywordSeparator1 + dst.getId();
  }
  
  
//  
//  /**
//   * Returns the rank of the given resource.
//   * 
//   * @param res the given resource
//   * @return the rank of the given resource
//   */
//  public static int getRank(final Resource res) {
//    return (int) getAttribute(res, propNameRank);
//  }
  
  
  // should look like this:
  /**
   * Returns the rank of the given resource.
   * 
   * @param res the given resource
   * @return the rank of the given resource
   */
  public static int getRank(final Mapping<Task, Resource> mapping) {
    return (int) getAttribute(mapping, propNameRank);
  }
  
  
  /**
   * Sets the resource rank for the provided resource.
   * 
   * @param res the provided resource
   * @param rank to set
   */
  public static void setRank(final Resource res, final int rank) {
    res.setAttribute(propNameRank, rank);
  }

}
