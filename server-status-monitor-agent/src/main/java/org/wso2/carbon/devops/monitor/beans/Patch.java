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
package org.wso2.carbon.devops.monitor.beans;

import java.util.Arrays;

/**
 * Patch details
 */
public class Patch {
    private String patchId;
    private Bundle[] bundles = new Bundle[0];

    public String getPatchId() {
        return patchId;
    }

    public void setPatchId(String patchId) {
        this.patchId = patchId;
    }

    public Bundle[] getBundles() {
        return Arrays.copyOf(bundles, bundles.length);
    }

    public void setBundles(Bundle[] bundles) {
        this.bundles = Arrays.copyOf(bundles, bundles.length);
    }
}
