/*
*  Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*  WSO2 Inc. licenses this file to you under the Apache License,
*  Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing,
*  software distributed under the License is distributed on an
*  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
*  KIND, either express or implied.  See the License for the
*  specific language governing permissions and limitations
*  under the License.
*/
package org.wso2.deployment.monitor.core;

import org.kohsuke.args4j.Argument;
import org.wso2.deployment.monitor.core.model.DeploymentMonitorConfiguration;
import org.wso2.deployment.monitor.core.model.TaskConfig;

public class ListCommand extends Command {

    /**
     * The list of task names available to run/schedule.
     */
    @Argument(index = 0, metaVar = "<sub-command ...>", usage = "Detailed list", //todo
              required = false, multiValued = false)
    private String subList = "";

    @Override
    public void execute(DeploymentMonitorConfiguration deploymentMonitorConfiguration) {
        if (subList.isEmpty()) {
        }

        System.out.println("\nList of available tasks:");
        for (TaskConfig taskConfig : deploymentMonitorConfiguration.getTasks()) {
            System.out.println(taskConfig.getName());
        }

    }
}