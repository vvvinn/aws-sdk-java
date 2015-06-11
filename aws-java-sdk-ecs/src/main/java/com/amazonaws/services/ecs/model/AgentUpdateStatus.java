/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ecs.model;

/**
 * Agent Update Status
 */
public enum AgentUpdateStatus {
    
    PENDING("PENDING"),
    STAGING("STAGING"),
    STAGED("STAGED"),
    UPDATING("UPDATING"),
    UPDATED("UPDATED"),
    FAILED("FAILED");

    private String value;

    private AgentUpdateStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *            real value
     * @return AgentUpdateStatus corresponding to the value
     */
    public static AgentUpdateStatus fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("PENDING".equals(value)) {
            return AgentUpdateStatus.PENDING;
        } else if ("STAGING".equals(value)) {
            return AgentUpdateStatus.STAGING;
        } else if ("STAGED".equals(value)) {
            return AgentUpdateStatus.STAGED;
        } else if ("UPDATING".equals(value)) {
            return AgentUpdateStatus.UPDATING;
        } else if ("UPDATED".equals(value)) {
            return AgentUpdateStatus.UPDATED;
        } else if ("FAILED".equals(value)) {
            return AgentUpdateStatus.FAILED;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    