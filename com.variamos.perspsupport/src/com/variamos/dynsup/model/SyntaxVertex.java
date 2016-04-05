package com.variamos.dynsup.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.variamos.dynsup.instance.InstElement;

/**
 * @author Juan Carlos Mu�oz 2014 part of the PhD work at CRI - Universite Paris
 *         1
 *
 *         Definition of syntax for VariaMos
 */
public abstract class SyntaxVertex extends SyntaxElement {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3348811616807875183L;
	private boolean topConcept;
	private String backgroundColor;
	private boolean resizable;

	public SyntaxVertex() {
		super();
	}

	public SyntaxVertex(String identifier, boolean visible, boolean editable,
			String name, String style, String description, int width,
			int height, String image, int borderStroke,
			InstElement instSemanticElement, boolean topConcept,
			String backgroundColor, boolean resizable) {
		this(identifier, visible, editable, name, style, description, width,
				height, image, borderStroke, instSemanticElement, topConcept,
				backgroundColor, resizable, new ArrayList<String>(),
				new ArrayList<String>(), new ArrayList<String>(),
				new ArrayList<String>(),
				new HashMap<String, ElemAttribute>(),
				new ArrayList<SyntaxPairwiseRel>(),
				new ArrayList<SyntaxPairwiseRel>());
	}

	public SyntaxVertex(String identifier, boolean visible, boolean editable,
			String name, String style, String description, int width,
			int height, String image, int borderStroke,
			InstElement instSemanticElement, boolean topConcept,
			String backgroundColor, boolean resizable,
			List<String> disPropVisibleAttributes,
			List<String> disPropEditableAttributes,
			List<String> disPanelVisibleAttributes,
			List<String> disPanelSpacersAttributes,
			Map<String, ElemAttribute> modelingAttributes) {
		this(identifier, visible, editable, name, style, description, width,
				height, image, borderStroke, instSemanticElement, topConcept,
				backgroundColor, resizable, disPropVisibleAttributes,
				disPropEditableAttributes, disPanelVisibleAttributes,
				disPanelSpacersAttributes, modelingAttributes,
				new ArrayList<SyntaxPairwiseRel>(),
				new ArrayList<SyntaxPairwiseRel>());
	}

	public SyntaxVertex(String identifier, boolean visible, boolean editable,
			String name, String style, String description, int width,
			int height, String image, int borderStroke,
			InstElement instSemanticElement, boolean topConcept,
			String backgroundColor, boolean resizable,
			List<String> disPropVisibleAttributes,
			List<String> disPropEditableAttributes,
			List<String> disPanelVisibleAttributes,
			List<String> disPanelSpacersAttributes,
			Map<String, ElemAttribute> modelingAttributes,
			List<SyntaxPairwiseRel> asOriginRelations,
			List<SyntaxPairwiseRel> asDestinationRelations) {
		super(identifier, visible, editable, name, style, description, width,
				height, image, borderStroke, instSemanticElement,
				disPropVisibleAttributes, disPropEditableAttributes,
				disPanelVisibleAttributes, disPanelSpacersAttributes,
				modelingAttributes);

		this.backgroundColor = backgroundColor;
		this.topConcept = topConcept;
		this.resizable = resizable;
	}

	public void setTopConcept(boolean topConcept) {
		this.topConcept = topConcept;
	}

	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	public void setResizable(boolean resizable) {
		this.resizable = resizable;
	}

	public boolean isTopConcept() {
		return topConcept;
	}

	public String getBackgroundColor() {
		return backgroundColor;
	}

	public boolean isResizable() {
		return resizable;
	}

}