package org.openregistry.core.domain.jpa.sor;

import java.util.Date;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import org.openregistry.core.domain.*;
import org.openregistry.core.domain.jpa.JpaRoleInfoImpl;
import org.openregistry.core.domain.jpa.JpaTypeImpl;

@StaticMetamodel(JpaSorRoleImpl.class)
public abstract class JpaSorRoleImpl_ {

	public static volatile SingularAttribute<JpaSorRoleImpl, Long> recordId;
	public static volatile SingularAttribute<JpaSorRoleImpl, String> sorId;
	public static volatile ListAttribute<JpaSorRoleImpl, Url> urls;
	public static volatile ListAttribute<JpaSorRoleImpl, EmailAddress> emailAddresses;
	public static volatile ListAttribute<JpaSorRoleImpl, Phone> phones;
	public static volatile ListAttribute<JpaSorRoleImpl, Address> addresses;
	public static volatile SingularAttribute<JpaSorRoleImpl, String> sourceSorIdentifier;
	public static volatile SingularAttribute<JpaSorRoleImpl, JpaSorPersonImpl> person;
	public static volatile SingularAttribute<JpaSorRoleImpl, Integer> percentage;
	public static volatile SingularAttribute<JpaSorRoleImpl, JpaTypeImpl> personStatus;
	public static volatile ListAttribute<JpaSorRoleImpl, Leave> leaves;
	public static volatile SingularAttribute<JpaSorRoleImpl, JpaRoleInfoImpl> roleInfo;
	public static volatile SingularAttribute<JpaSorRoleImpl, Long> sponsorId;
	// put this back public static volatile SingularAttribute<JpaSorRoleImpl, JpaTypeImpl> sponsorType;
    public static volatile SingularAttribute<JpaSorRoleImpl, Date> start;
	public static volatile SingularAttribute<JpaSorRoleImpl, Date> end;
	public static volatile SingularAttribute<JpaSorRoleImpl, JpaTypeImpl> terminationReason;

}

