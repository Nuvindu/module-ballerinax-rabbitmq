/*
 * Copyright (c) 2019, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package io.ballerina.stdlib.rabbitmq;

import io.ballerina.runtime.api.utils.StringUtils;
import io.ballerina.runtime.api.values.BString;
import io.ballerina.stdlib.rabbitmq.util.ModuleUtils;

/**
 * RabbitMQ Connector Constants.
 *
 * @since 0.995.0
 */
public class RabbitMQConstants {

    // RabbitMQ package name constant fields
    public static final String ORG_NAME = "ballerinax";
    static final String RABBITMQ = "rabbitmq";

    // Queue configuration constant fields
    public static final BString QUEUE_NAME = StringUtils.fromString("queueName");
    public static final BString QUEUE_DURABLE = StringUtils.fromString("durable");
    public static final BString QUEUE_EXCLUSIVE = StringUtils.fromString("exclusive");
    public static final BString QUEUE_AUTO_DELETE = StringUtils.fromString("autoDelete");
    public static final BString QUEUE_ARGUMENTS = StringUtils.fromString("arguments");

    // Exchange configuration constant fields
    public static final BString EXCHANGE_DURABLE = StringUtils.fromString("durable");
    public static final BString EXCHANGE_AUTO_DELETE = StringUtils.fromString("autoDelete");
    public static final BString EXCHANGE_ARGUMENTS = StringUtils.fromString("arguments");

    public static final BString AUTH_CONFIG = StringUtils.fromString("auth");
    public static final BString VHOST = StringUtils.fromString("virtualHost");
    public static final BString AUTH_USERNAME = StringUtils.fromString("username");
    public static final BString AUTH_PASSWORD = StringUtils.fromString("password");

    // Warning suppression
    public static final String UNCHECKED = "unchecked";

    // Error constant fields
    static final String RABBITMQ_ERROR = "Error";
    static final String PAYLOAD_BINDING_ERROR = "PayloadBindingError";
    static final String PAYLOAD_VALIDATION_ERROR = "PayloadValidationError";

    // Connection errors
    public static final String CREATE_CONNECTION_ERROR = "Error occurred while connecting to the broker: ";

    // Channel errors
    public static final String CLOSE_CHANNEL_ERROR = "An error occurred while closing the channel: ";

    // Connection configuration constant fields
    public static final BString RABBITMQ_CONNECTION_USER = StringUtils.fromString("username");
    public static final BString RABBITMQ_CONNECTION_PASS = StringUtils.fromString("password");
    public static final BString RABBITMQ_CONNECTION_TIMEOUT = StringUtils.fromString("connectionTimeout");
    public static final BString RABBITMQ_CONNECTION_HANDSHAKE_TIMEOUT = StringUtils.fromString(
            "handshakeTimeout");
    public static final BString RABBITMQ_CONNECTION_SHUTDOWN_TIMEOUT = StringUtils.fromString(
            "shutdownTimeout");
    public static final BString RABBITMQ_CONNECTION_HEARTBEAT = StringUtils.fromString("heartbeat");
    public static final BString RABBITMQ_CONNECTION_SECURE_SOCKET = StringUtils.fromString("secureSocket");

    // SSL constants
    public static final BString KEY = StringUtils.fromString("key");
    public static final BString CERT = StringUtils.fromString("cert");
    public static final BString VERIFY_HOST = StringUtils.fromString("verifyHostName");
    public static final BString PROTOCOL = StringUtils.fromString("protocol");
    public static final BString PROTOCOL_NAME = StringUtils.fromString("name");
    public static final String PKCS12 = "PKCS12";
    public static final String DEFAULT_SSL_PROTOCOL = "TLSv1.2";
    public static final BString KEY_STORE_PASS = StringUtils.fromString("password");
    public static final BString KEY_STORE_PATH = StringUtils.fromString("path");
    public static final BString CERT_FILE = StringUtils.fromString("certFile");
    public static final BString KEY_FILE = StringUtils.fromString("keyFile");
    public static final BString KEY_PASSWORD = StringUtils.fromString("keyPassword");
    public static final String NATIVE_DATA_PUBLIC_KEY_CERTIFICATE = "NATIVE_DATA_PUBLIC_KEY_CERTIFICATE";
    public static final String NATIVE_DATA_PRIVATE_KEY = "NATIVE_DATA_PRIVATE_KEY";

    // Channel listener constant fields
    public static final String CONSUMER_SERVICES = "consumer_services";
    public static final String STARTED_SERVICES = "started_services";
    public static final String CONSTRAINT_VALIDATION = "validation";
    public static final String SERVICE_CONFIG = "ServiceConfig";
    public static final BString ALIAS_QUEUE_NAME = StringUtils.fromString("queueName");
    public static final BString AUTO_ACK = StringUtils.fromString("autoAck");
    public static final String MULTIPLE_ACK_ERROR = "Trying to acknowledge the same message multiple times";
    public static final String ACK_MODE_ERROR = "Trying to acknowledge messages in auto-ack mode";
    public static final String ACK_ERROR = "Error occurred while positively acknowledging the message: ";
    public static final String NACK_ERROR = "Error occurred while negatively acknowledging the message: ";
    static final String FUNC_ON_MESSAGE = "onMessage";
    static final String FUNC_ON_REQUEST = "onRequest";
    static final String FUNC_ON_ERROR = "onError";

    // Channel constant fields
    public static final String CHANNEL_NATIVE_OBJECT = "rabbitmq_channel_object";

    // Message constant fields
    public static final String MESSAGE_RECORD = "Message";
    public static final String MESSAGE_CONTENT_FIELD = "content";
    public static final String MESSAGE_ROUTINE_KEY_FIELD = "routingKey";
    public static final String MESSAGE_EXCHANGE_FIELD = "exchange";
    public static final String MESSAGE_DELIVERY_TAG_FIELD = "deliveryTag";
    public static final String MESSAGE_PROPERTIES_FIELD = "properties";
    public static final String CALLER_OBJECT = "Caller";
    public static final String ACK_STATUS = "ackStatus";
    public static final String ACK_MODE = "ackMode";
    public static final BString MESSAGE_CONTENT = StringUtils.fromString("content");
    public static final BString DELIVERY_TAG = StringUtils.fromString("deliveryTag");
    public static final BString MESSAGE_EXCHANGE = StringUtils.fromString("exchange");
    public static final BString MESSAGE_ROUTING_KEY = StringUtils.fromString("routingKey");
    public static final BString BASIC_PROPERTIES = StringUtils.fromString("properties");

    // Transaction constant fields
    public static final String RABBITMQ_TRANSACTION_CONTEXT = "rabbitmq_transactional_context";
    public static final BString CONNECTOR_ID = StringUtils.fromString("connectorId");
    static final String COMMIT_FAILED = "Transaction commit failed: ";
    static final String ROLLBACK_FAILED = "Transaction rollback failed: ";

    // Payload related constants
    public static final String PARAM_ANNOTATION_PREFIX = "$param$.";
    public static final BString PARAM_PAYLOAD_ANNOTATION_NAME = StringUtils.fromString(
            ModuleUtils.getModule().toString() + ":Payload");
    public static final String TYPE_CHECKER_OBJECT_NAME = "TypeChecker";
    public static final String IS_ANYDATA_MESSAGE = "isAnydataMessage";

    // Basic Properties constant fields
    public static final String RECORD_BASIC_PROPERTIES = "BasicProperties";
    public static final BString ALIAS_REPLY_TO = StringUtils.fromString("replyTo");
    public static final BString ALIAS_CONTENT_TYPE = StringUtils.fromString("contentType");
    public static final BString ALIAS_CONTENT_ENCODING = StringUtils.fromString("contentEncoding");
    public static final BString ALIAS_CORRELATION_ID = StringUtils.fromString("correlationId");

    private RabbitMQConstants() {
    }
}
