package com.variamos.dynsup.model;

import com.variamos.hlcl.Domain;
import com.variamos.semantic.types.AttributeType;

/**
 * @author Juan Carlos Mu�oz 2014 part of the PhD work at CRI - Universite Paris
 *         1
 *
 *         Definition of semantics for REFAS
 */
public class OpersAttribute extends ElemAttribute {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2582154145921483304L;

	public OpersAttribute() {
		super();
	}

	public OpersAttribute(String name, String type,
			AttributeType attributeType, boolean affectProperties,
			String displayName, Object defaultValue, int defaultGroup,
			int propTabPosition, String propTabEditionCondition,
			String propTabVisualCondition, int elementDisplayPosition,
			String elementDisplaySpacers, String elementDisplayCondition) {
		super(name, type, attributeType, affectProperties, displayName,
				defaultValue, defaultGroup, propTabPosition,
				propTabEditionCondition, propTabVisualCondition,
				elementDisplayPosition, elementDisplaySpacers,
				elementDisplayCondition);
	}

	public OpersAttribute(String name, String type,
			AttributeType attributeType, boolean affectProperties,
			String displayName, String enumType, Object defaultValue,
			int defaultGroup, int propTabPosition,
			String propTabEditionCondition, String propTabVisualCondition,
			int elementDisplayPosition, String elementDisplaySpacers,
			String elementDisplayCondition) {
		super(name, type, attributeType, affectProperties, displayName,
				enumType, defaultValue, defaultGroup, propTabPosition,
				propTabEditionCondition, propTabVisualCondition,
				elementDisplayPosition, elementDisplaySpacers,
				elementDisplayCondition);
	}

	public OpersAttribute(String name, String type,
			AttributeType attributeType, String displayName,
			Object defaultValue, boolean affectProperties, Domain domain,
			int defaultGroup, int propTabPosition,
			String propTabEditionCondition, String propTabVisualCondition,
			int elementDisplayPosition, String elementDisplaySpacers,
			String elementDisplayCondition) {
		super(name, type, attributeType, affectProperties, displayName,
				defaultValue, domain, defaultGroup, propTabPosition,
				propTabEditionCondition, propTabVisualCondition,
				elementDisplayPosition, elementDisplaySpacers,
				elementDisplayCondition);
	}

	public OpersAttribute(String name, String type,
			AttributeType attributeType, boolean affectProperties,
			String displayName, Object defaultValue, String hint,
			int defaultGroup, int propTabPosition,
			String propTabEditionCondition, String propTabVisualCondition,
			int elementDisplayPosition, String elementDisplaySpacers,
			String elementDisplayCondition) {
		super(name, type, attributeType, affectProperties, displayName,
				defaultValue, hint, defaultGroup, propTabPosition,
				propTabEditionCondition, propTabVisualCondition,
				elementDisplayPosition, elementDisplaySpacers,
				elementDisplayCondition);
	}

	public OpersAttribute(String name, String type,
			AttributeType attributeType, boolean affectProperties,
			String displayName, String enumType, Object defaultValue,
			String hint, int defaultGroup, int propTabPosition,
			String propTabEditionCondition, String propTabVisualCondition,
			int elementDisplayPosition, String elementDisplaySpacers,
			String elementDisplayCondition) {
		super(name, type, attributeType, affectProperties, displayName,
				enumType, defaultValue, hint, defaultGroup, propTabPosition,
				propTabEditionCondition, propTabVisualCondition,
				elementDisplayPosition, elementDisplaySpacers,
				elementDisplayCondition);
	}

	public OpersAttribute(String name, String type,
			AttributeType attributeType, boolean affectProperties,
			String displayName, String enumType,
			String metaConceptInstanceType, Object defaultValue, String hint,
			int defaultGroup, int propTabPosition,
			String propTabEditionCondition, String propTabVisualCondition,
			int elementDisplayPosition, String elementDisplaySpacers,
			String elementDisplayCondition) {
		super(name, type, attributeType, affectProperties, displayName,
				enumType, metaConceptInstanceType, defaultValue, hint,
				defaultGroup, propTabPosition, propTabEditionCondition,
				propTabVisualCondition, elementDisplayPosition,
				elementDisplaySpacers, elementDisplayCondition);
	}

}