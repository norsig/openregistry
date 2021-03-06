package org.openregistry.core.domain.jpa.sor;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.openregistry.core.domain.jpa.JpaCountryImpl;
import org.openregistry.core.domain.jpa.JpaRegionImpl;
import org.openregistry.core.domain.jpa.JpaTypeImpl;
import java.util.Date;

@StaticMetamodel(JpaSorAddressImpl.class)
public abstract class JpaSorAddressImpl_ {

	public static volatile SingularAttribute<JpaSorAddressImpl, Long> id;
	public static volatile SingularAttribute<JpaSorAddressImpl, JpaTypeImpl> type;
	public static volatile SingularAttribute<JpaSorAddressImpl, String> line1;
	public static volatile SingularAttribute<JpaSorAddressImpl, String> line2;
	public static volatile SingularAttribute<JpaSorAddressImpl, String> line3;
    public static volatile SingularAttribute<JpaSorAddressImpl, String> bldgNo;
    public static volatile SingularAttribute<JpaSorAddressImpl, String> roomNo;
	public static volatile SingularAttribute<JpaSorAddressImpl, JpaRegionImpl> region;
	public static volatile SingularAttribute<JpaSorAddressImpl, JpaCountryImpl> country;
	public static volatile SingularAttribute<JpaSorAddressImpl, String> city;
	public static volatile SingularAttribute<JpaSorAddressImpl, String> postalCode;
    public static volatile SingularAttribute<JpaSorAddressImpl, Date> updateDate;
	public static volatile SingularAttribute<JpaSorAddressImpl, JpaSorRoleImpl> sorRole;

}

