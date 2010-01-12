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
 * 
 *
 * @author Scott Battaglia
 * @version $Revision$ $Date$
 * @since 1.0.0
 */
public interface Identifier extends Serializable {

    IdentifierType getType();

    String getValue();

    /**
     * Defaults to true.
     *
     * @return whether its the primary version of this identifier, or one that exists for historical reasons.
     */
    boolean isPrimary();

    /**
     * Defaults to false.
     *
     * @return whether the identifier is valid or not.
     */
    boolean isDeleted();
   
    void setPrimary(boolean value);
    
    void setDeleted(boolean value);

}
