/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.netbeans.modules.apisupport.project.ui.platform;

import java.awt.Component;
import org.netbeans.modules.apisupport.project.api.BasicWizardPanel;
import org.openide.WizardDescriptor;
import org.openide.util.HelpCtx;

/**
 * Second panel from <em>Adding New Platform</em> wizard panels. Allows user to
 * add additional info about a selected platform.
 *
 * @author Martin Krauskopf
 */
final class PlatformInfoWizardPanel extends BasicWizardPanel {

    /** Representing visual component for this step. */
    private PlatformInfoVisualPanel visualPanel;
    
    public PlatformInfoWizardPanel(WizardDescriptor settings) {
        super(settings);
    }

    public @Override void readSettings(WizardDescriptor settings) {
        ((PlatformInfoVisualPanel) getComponent()).refreshData();
    }
    
    public @Override void storeSettings(WizardDescriptor settings) {
        ((PlatformInfoVisualPanel) getComponent()).storeData();
    }
    
    public Component getComponent() {
        if (visualPanel == null) {
            visualPanel = new PlatformInfoVisualPanel(getSettings());
            visualPanel.addPropertyChangeListener(this);
            visualPanel.setName(NbPlatformCustomizer.INFO_STEP);
        }
        return visualPanel;
    }
    
    public HelpCtx getHelp() {
        return new HelpCtx("org.netbeans.modules.apisupport.project.ui.platform.PlatformInfoWizardPanel");
    }
    
}
