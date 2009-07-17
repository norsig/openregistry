package org.openregistry.core.domain;

import java.io.Serializable;

/**
 * @author Scott Battaglia
 * @version $Revision$ $Date$
 * @since 1.0.0
 */
public interface Name extends Serializable {

    Long getId();

    String getPrefix();

    String getGiven();

    String getMiddle();

    String getFamily();

    String getSuffix();

    void preRemove();

    void setPrefix(String prefix);

    void setGiven(String given);

    void setMiddle(String middle);

    void setFamily(String family);

    void setSuffix(String suffix);
    
    void setOfficialName();
    
    boolean isOfficialName();

    void setPreferredName();
    
    boolean isPreferredName();
    
    String getFormattedName();
    
    String toString();
}
