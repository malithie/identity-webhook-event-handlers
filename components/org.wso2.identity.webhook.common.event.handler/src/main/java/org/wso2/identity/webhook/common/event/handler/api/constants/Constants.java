/*
 * Copyright (c) 2025, WSO2 LLC. (http://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.identity.webhook.common.event.handler.api.constants;

/**
 * Constants class.
 */
public class Constants {

    /**
     * This enum represents the event schema types.
     */
    public enum EventSchema {
        WSO2,
        CAEP,
        RISC;

        EventSchema() {

        }
    }

    /**
     * This class represents the event channels.
     */
    public static class Channel {

        public static final String LOGIN_CHANNEL = "Logins";
        public static final String CREDENTIAL_CHANGE_CHANNEL = "Credential updates";
        public static final String REGISTRATION_CHANNEL = "Registrations";
        public static final String USER_OPERATION_CHANNEL = "User management operations";
        public static final String VERIFICATION_CHANNEL = "Verification Channel";
        public static final String SESSION_CHANNEL = "Sessions";
    }

    /**
     * This class represents the identity event types.
     */
    public static class Event {

        public static final String LOGIN_SUCCESS_EVENT = "Login success";
        public static final String LOGIN_FAILURE_EVENT = "Login failed";
        public static final String POST_UPDATE_USER_CREDENTIAL = "Credential updated";
        public static final String POST_REGISTRATION_SUCCESS_EVENT = "Registration success";
        public static final String POST_REGISTRATION_FAILED_EVENT = "Registration failed";
        public static final String POST_USER_CREATED_EVENT = "User created";
        public static final String POST_UPDATE_USER_LIST_OF_ROLE_EVENT = "Post Update User List of Role Event";
        public static final String POST_DELETE_USER_EVENT = "User account deleted";
        public static final String POST_UNLOCK_ACCOUNT_EVENT = "User account unlocked";
        public static final String POST_LOCK_ACCOUNT_EVENT = "User account locked";
        public static final String POST_USER_PROFILE_UPDATED_EVENT = "User profile updated";
        public static final String POST_ACCOUNT_ENABLE_EVENT = "User account enabled";
        public static final String POST_ACCOUNT_DISABLE_EVENT = "User account disabled";
        public static final String SESSION_CREATED_EVENT = "Session established";
        public static final String SESSION_REVOKED_EVENT = "Session(s) revoked";
        public static final String SESSION_EXPIRED_EVENT = "Session Expired Event";
        public static final String SESSION_UPDATED_EVENT = "Session Updated Event";
        public static final String SESSION_EXTENDED_EVENT = "Session Extended Event";
        public static final String SESSION_ESTABLISHED_EVENT = "Session Established Event";
        public static final String SESSION_PRESENTED_EVENT = "Session Presented Event";
        public static final String VERIFICATION_EVENT = "Verification Event";
    }
}
