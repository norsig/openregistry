/**
 * Copyright (C) 2009 Jasig, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.openregistry.core.domain;

import java.io.Serializable;

/**
 * @author Scott Battaglia
 * @version $Revision$ $Date$
 * @since 1.0.0
 */
public interface Name extends Serializable {

    Long getId();
    
    Type getType();

    String getPrefix();

    String getGiven();

    String getMiddle();

    String getFamily();

    String getSuffix();
    
    void setType(Type type);

    void setPrefix(String prefix);

    void setGiven(String given);

    void setMiddle(String middle);

    void setFamily(String family);

    void setSuffix(String suffix);
    
    void setOfficialName(boolean officialName);
    
    boolean isOfficialName();

    void setPreferredName(boolean preferredName);
    
    boolean isPreferredName();
    
    String getFormattedName();

    String getLongFormattedName();
    
    String toString();

    boolean sameAs(Name name);
}