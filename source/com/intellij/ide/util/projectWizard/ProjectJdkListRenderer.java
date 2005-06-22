/*
 * Copyright (c) 2000-2004 by JetBrains s.r.o. All Rights Reserved.
 * Use is subject to license terms.
 */
package com.intellij.ide.util.projectWizard;

import com.intellij.ui.ColoredListCellRenderer;
import com.intellij.ui.SimpleTextAttributes;
import com.intellij.openapi.projectRoots.ProjectJdk;
import com.intellij.openapi.roots.ui.util.CellAppearanceUtils;

import javax.swing.*;

/**
 * @author Eugene Zhuravlev
 *         Date: May 18, 2005
 */
public class ProjectJdkListRenderer extends ColoredListCellRenderer {
  protected void customizeCellRenderer(JList list, Object value, int index, boolean selected, boolean hasFocus) {
    if (value == null || value instanceof ProjectJdk) {
      CellAppearanceUtils.forJdk((ProjectJdk)value, false).customize(this);
    }
    else {
      final String str = value.toString();
      if (str != null) {
        append(str, selected ? SimpleTextAttributes.SELECTED_SIMPLE_CELL_ATTRIBUTES : SimpleTextAttributes.SIMPLE_CELL_ATTRIBUTES);
      }
    }
  }
}
