/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.deployment.monitor.impl.callback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.wso2.deployment.monitor.api.OnResultCallback;
import org.wso2.deployment.monitor.api.RunStatus;

/**
 * Simple Logging Implementation for callback
 */
public class SimpleLoggingCallBack implements OnResultCallback {
    private static final Logger logger = LoggerFactory.getLogger(SimpleLoggingCallBack.class);

    @Override public void callback(RunStatus runStatus) {
        if (runStatus.isSuccess()) {
            logger.info(" [Task Successful] " + runStatus.getMessage());
        } else {
            String msg = " [Task Failed] " + runStatus.getMessage();
            if (!runStatus.getCustomTaskDetails().isEmpty()
                    && runStatus.getCustomTaskDetails().get("Exception") != null) {
                Exception e = (Exception) runStatus.getCustomTaskDetails().get("Exception");
                logger.error(msg, e);
            } else {
                logger.error(msg);
            }
        }
    }
}
