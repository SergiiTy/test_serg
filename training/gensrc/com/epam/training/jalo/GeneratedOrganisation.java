/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 06.04.2016 23:30:45                         ---
 * ----------------------------------------------------------------
 */
package com.epam.training.jalo;

import com.epam.training.constants.TrainingConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Organisation}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedOrganisation extends GenericItem
{
	/** Qualifier of the <code>Organisation.id</code> attribute **/
	public static final String ID = "id";
	/** Qualifier of the <code>Organisation.field</code> attribute **/
	public static final String FIELD = "field";
	/** Qualifier of the <code>Organisation.phone</code> attribute **/
	public static final String PHONE = "phone";
	/** Qualifier of the <code>Organisation.email</code> attribute **/
	public static final String EMAIL = "email";
	/** Qualifier of the <code>Organisation.Customer</code> attribute **/
	public static final String CUSTOMER = "Customer";
	/** Relation ordering override parameter constants for CustomerOrganisationRelation from ((training))*/
	protected static String CUSTOMERORGANISATIONRELATION_SRC_ORDERED = "relation.CustomerOrganisationRelation.source.ordered";
	protected static String CUSTOMERORGANISATIONRELATION_TGT_ORDERED = "relation.CustomerOrganisationRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for CustomerOrganisationRelation from ((training))*/
	protected static String CUSTOMERORGANISATIONRELATION_MARKMODIFIED = "relation.CustomerOrganisationRelation.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ID, AttributeMode.INITIAL);
		tmp.put(FIELD, AttributeMode.INITIAL);
		tmp.put(PHONE, AttributeMode.INITIAL);
		tmp.put(EMAIL, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Organisation.Customer</code> attribute.
	 * @return the Customer
	 */
	public Collection<Customer> getCustomer(final SessionContext ctx)
	{
		final List<Customer> items = getLinkedItems( 
			ctx,
			false,
			TrainingConstants.Relations.CUSTOMERORGANISATIONRELATION,
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Organisation.Customer</code> attribute.
	 * @return the Customer
	 */
	public Collection<Customer> getCustomer()
	{
		return getCustomer( getSession().getSessionContext() );
	}
	
	public long getCustomerCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			TrainingConstants.Relations.CUSTOMERORGANISATIONRELATION,
			null
		);
	}
	
	public long getCustomerCount()
	{
		return getCustomerCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Organisation.Customer</code> attribute. 
	 * @param value the Customer
	 */
	public void setCustomer(final SessionContext ctx, final Collection<Customer> value)
	{
		setLinkedItems( 
			ctx,
			false,
			TrainingConstants.Relations.CUSTOMERORGANISATIONRELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(CUSTOMERORGANISATIONRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Organisation.Customer</code> attribute. 
	 * @param value the Customer
	 */
	public void setCustomer(final Collection<Customer> value)
	{
		setCustomer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to Customer. 
	 * @param value the item to add to Customer
	 */
	public void addToCustomer(final SessionContext ctx, final Customer value)
	{
		addLinkedItems( 
			ctx,
			false,
			TrainingConstants.Relations.CUSTOMERORGANISATIONRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(CUSTOMERORGANISATIONRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to Customer. 
	 * @param value the item to add to Customer
	 */
	public void addToCustomer(final Customer value)
	{
		addToCustomer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from Customer. 
	 * @param value the item to remove from Customer
	 */
	public void removeFromCustomer(final SessionContext ctx, final Customer value)
	{
		removeLinkedItems( 
			ctx,
			false,
			TrainingConstants.Relations.CUSTOMERORGANISATIONRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(CUSTOMERORGANISATIONRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from Customer. 
	 * @param value the item to remove from Customer
	 */
	public void removeFromCustomer(final Customer value)
	{
		removeFromCustomer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Organisation.email</code> attribute.
	 * @return the email
	 */
	public String getEmail(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EMAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Organisation.email</code> attribute.
	 * @return the email
	 */
	public String getEmail()
	{
		return getEmail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Organisation.email</code> attribute. 
	 * @param value the email
	 */
	public void setEmail(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EMAIL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Organisation.email</code> attribute. 
	 * @param value the email
	 */
	public void setEmail(final String value)
	{
		setEmail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Organisation.field</code> attribute.
	 * @return the field - Contains localized values
	 */
	public String getField(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FIELD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Organisation.field</code> attribute.
	 * @return the field - Contains localized values
	 */
	public String getField()
	{
		return getField( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Organisation.field</code> attribute. 
	 * @param value the field - Contains localized values
	 */
	public void setField(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FIELD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Organisation.field</code> attribute. 
	 * @param value the field - Contains localized values
	 */
	public void setField(final String value)
	{
		setField( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Organisation.id</code> attribute.
	 * @return the id - not a PK
	 */
	public Integer getId(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, ID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Organisation.id</code> attribute.
	 * @return the id - not a PK
	 */
	public Integer getId()
	{
		return getId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Organisation.id</code> attribute. 
	 * @return the id - not a PK
	 */
	public int getIdAsPrimitive(final SessionContext ctx)
	{
		Integer value = getId( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Organisation.id</code> attribute. 
	 * @return the id - not a PK
	 */
	public int getIdAsPrimitive()
	{
		return getIdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Organisation.id</code> attribute. 
	 * @param value the id - not a PK
	 */
	public void setId(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, ID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Organisation.id</code> attribute. 
	 * @param value the id - not a PK
	 */
	public void setId(final Integer value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Organisation.id</code> attribute. 
	 * @param value the id - not a PK
	 */
	public void setId(final SessionContext ctx, final int value)
	{
		setId( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Organisation.id</code> attribute. 
	 * @param value the id - not a PK
	 */
	public void setId(final int value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Organisation.phone</code> attribute.
	 * @return the phone
	 */
	public String getPhone(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PHONE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Organisation.phone</code> attribute.
	 * @return the phone
	 */
	public String getPhone()
	{
		return getPhone( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Organisation.phone</code> attribute. 
	 * @param value the phone
	 */
	public void setPhone(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PHONE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Organisation.phone</code> attribute. 
	 * @param value the phone
	 */
	public void setPhone(final String value)
	{
		setPhone( getSession().getSessionContext(), value );
	}
	
}
