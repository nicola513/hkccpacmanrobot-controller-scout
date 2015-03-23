package edu.hkcc.pacmanrobot.controller.ui.swt.editor;

import org.eclipse.scout.rt.ui.swt.ISwtEnvironment;
import org.eclipse.scout.rt.ui.swt.window.desktop.editor.AbstractScoutEditorPart;

import edu.hkcc.pacmanrobot.controller.ui.swt.Activator;

public class ScoutEditorPart extends AbstractScoutEditorPart {

  @Override
  protected ISwtEnvironment getSwtEnvironment() {
    return Activator.getDefault().getEnvironment();
  }
}
