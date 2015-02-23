package com.variamos.gui.perspeditor.actions;

import java.awt.event.ActionEvent;

import com.mxgraph.swing.mxGraphComponent;
import com.variamos.gui.maineditor.AbstractEditorAction;
import com.variamos.gui.maineditor.AbstractGraph;

@SuppressWarnings("serial")
public class TogglePLVisibilityAction extends AbstractEditorAction {
	
	boolean visibility = true;
	
	public TogglePLVisibilityAction(){
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof mxGraphComponent){
			mxGraphComponent graphComponent = (mxGraphComponent) e
					.getSource();
			AbstractGraph graph = (AbstractGraph)graphComponent.getGraph();
			
			visibility = !visibility;
			graph.setPLElementsVisibility(visibility);
		}
		
	}

}