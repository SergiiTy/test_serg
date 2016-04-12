/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 06.04.2016 23:30:45                         ---
 * ----------------------------------------------------------------
 */
package com.epam.training.jalo;

import com.epam.training.constants.TrainingConstants;
import com.epam.training.jalo.Organisation;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.link.Link;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.jalo.user.User;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type <code>TrainingManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTrainingManager extends Extension
{
	/** Relation ordering override parameter constants for CustomerOrganisationRelation from ((training))*/
	protected static String CUSTOMERORGANISATIONRELATION_SRC_ORDERED = "relation.CustomerOrganisationRelation.source.ordered";
	protected static String CUSTOMERORGANISATIONRELATION_TGT_ORDERED = "relation.CustomerOrganisationRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for CustomerOrganisationRelation from ((training))*/
	protected static String CUSTOMERORGANISATIONRELATION_MARKMODIFIED = "relation.CustomerOrganisationRelation.markmodified";
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("status", AttributeMode.INITIAL);
		tmp.put("attemptCount", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.Customer", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.attemptCount</code> attribute.
	 * @return the attemptCount - Indicates how many times user entered incorrect password
	 */
	public Integer getAttemptCount(final SessionContext ctx, final Customer item)
	{
		return (Integer)item.getProperty( ctx, TrainingConstants.Attributes.Customer.ATTEMPTCOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.attemptCount</code> attribute.
	 * @return the attemptCount - Indicates how many times user entered incorrect password
	 */
	public Integer getAttemptCount(final Customer item)
	{
		return getAttemptCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.attemptCount</code> attribute. 
	 * @return the attemptCount - Indicates how many times user entered incorrect password
	 */
	public int getAttemptCountAsPrimitive(final SessionContext ctx, final Customer item)
	{
		Integer value = getAttemptCount( ctx,item );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.attemptCount</code> attribute. 
	 * @return the attemptCount - Indicates how many times user entered incorrect password
	 */
	public int getAttemptCountAsPrimitive(final Customer item)
	{
		return getAttemptCountAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.attemptCount</code> attribute. 
	 * @param value the attemptCount - Indicates how many times user entered incorrect password
	 */
	public void setAttemptCount(final SessionContext ctx, final Customer item, final Integer value)
	{
		item.setProperty(ctx, TrainingConstants.Attributes.Customer.ATTEMPTCOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.attemptCount</code> attribute. 
	 * @param value the attemptCount - Indicates how many times user entered incorrect password
	 */
	public void setAttemptCount(final Customer item, final Integer value)
	{
		setAttemptCount( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.attemptCount</code> attribute. 
	 * @param value the attemptCount - Indicates how many times user entered incorrect password
	 */
	public void setAttemptCount(final SessionContext ctx, final Customer item, final int value)
	{
		setAttemptCount( ctx, item, Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.attemptCount</code> attribute. 
	 * @param value the attemptCount - Indicates how many times user entered incorrect password
	 */
	public void setAttemptCount(final Customer item, final int value)
	{
		setAttemptCount( getSession().getSessionContext(), item, value );
	}
	
	public Organisation createOrganisation(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingConstants.TC.ORGANISATION );
			return (Organisation)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Organisation : "+e.getMessage(), 0 );
		}
	}
	
	public Organisation createOrganisation(final Map attributeValues)
	{
		return createOrganisation( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return TrainingConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.Organisation</code> attribute.
	 * @return the Organisation
	 */
	public Collection<Organisation> getOrganisation(final SessionContext ctx, final Customer item)
	{
		final List<Organisation> items = item.getLinkedItems( 
			ctx,
			true,
			TrainingConstants.Relations.CUSTOMERORGANISATIONRELATION,
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.Organisation</code> attribute.
	 * @return the Organisation
	 */
	public Collection<Organisation> getOrganisation(final Customer item)
	{
		return getOrganisation( getSession().getSessionContext(), item );
	}
	
	public long getOrganisationCount(final SessionContext ctx, final Customer item)
	{
		return item.getLinkedItemsCount(
			ctx,
			true,
			TrainingConstants.Relations.CUSTOMERORGANISATIONRELATION,
			null
		);
	}
	
	public long getOrganisationCount(final Customer item)
	{
		return getOrganisationCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.Organisation</code> attribute. 
	 * @param value the Organisation
	 */
	public void setOrganisation(final SessionContext ctx, final Customer item, final Collection<Organisation> value)
	{
		item.setLinkedItems( 
			ctx,
			true,
			TrainingConstants.Relations.CUSTOMERORGANISATIONRELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(CUSTOMERORGANISATIONRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.Organisation</code> attribute. 
	 * @param value the Organisation
	 */
	public void setOrganisation(final Customer item, final Collection<Organisation> value)
	{
		setOrganisation( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to Organisation. 
	 * @param value the item to add to Organisation
	 */
	public void addToOrganisation(final SessionContext ctx, final Customer item, final Organisation value)
	{
		item.addLinkedItems( 
			ctx,
			true,
			TrainingConstants.Relations.CUSTOMERORGANISATIONRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(CUSTOMERORGANISATIONRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to Organisation. 
	 * @param value the item to add to Organisation
	 */
	public void addToOrganisation(final Customer item, final Organisation value)
	{
		addToOrganisation( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from Organisation. 
	 * @param value the item to remove from Organisation
	 */
	public void removeFromOrganisation(final SessionContext ctx, final Customer item, final Organisation value)
	{
		item.removeLinkedItems( 
			ctx,
			true,
			TrainingConstants.Relations.CUSTOMERORGANISATIONRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(CUSTOMERORGANISATIONRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from Organisation. 
	 * @param value the item to remove from Organisation
	 */
	public void removeFromOrganisation(final Customer item, final Organisation value)
	{
		removeFromOrganisation( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.status</code> attribute.
	 * @return the status - Indicates if account is locked or not
	 */
	public Boolean isStatus(final SessionContext ctx, final Customer item)
	{
		return (Boolean)item.getProperty( ctx, TrainingConstants.Attributes.Customer.STATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.status</code> attribute.
	 * @return the status - Indicates if account is locked or not
	 */
	public Boolean isStatus(final Customer item)
	{
		return isStatus( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.status</code> attribute. 
	 * @return the status - Indicates if account is locked or not
	 */
	public boolean isStatusAsPrimitive(final SessionContext ctx, final Customer item)
	{
		Boolean value = isStatus( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.status</code> attribute. 
	 * @return the status - Indicates if account is locked or not
	 */
	public boolean isStatusAsPrimitive(final Customer item)
	{
		return isStatusAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.status</code> attribute. 
	 * @param value the status - Indicates if account is locked or not
	 */
	public void setStatus(final SessionContext ctx, final Customer item, final Boolean value)
	{
		item.setProperty(ctx, TrainingConstants.Attributes.Customer.STATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.status</code> attribute. 
	 * @param value the status - Indicates if account is locked or not
	 */
	public void setStatus(final Customer item, final Boolean value)
	{
		setStatus( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.status</code> attribute. 
	 * @param value the status - Indicates if account is locked or not
	 */
	public void setStatus(final SessionContext ctx, final Customer item, final boolean value)
	{
		setStatus( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.status</code> attribute. 
	 * @param value the status - Indicates if account is locked or not
	 */
	public void setStatus(final Customer item, final boolean value)
	{
		setStatus( getSession().getSessionContext(), item, value );
	}
	
}
