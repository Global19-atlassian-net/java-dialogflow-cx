/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3/entity_type.proto

package com.google.cloud.dialogflow.cx.v3;

public interface CreateEntityTypeRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3.CreateEntityTypeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The agent to create a entity type for.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The agent to create a entity type for.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The entity type to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3.EntityType entity_type = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the entityType field is set.
   */
  boolean hasEntityType();
  /**
   *
   *
   * <pre>
   * Required. The entity type to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3.EntityType entity_type = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The entityType.
   */
  com.google.cloud.dialogflow.cx.v3.EntityType getEntityType();
  /**
   *
   *
   * <pre>
   * Required. The entity type to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3.EntityType entity_type = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3.EntityTypeOrBuilder getEntityTypeOrBuilder();

  /**
   *
   *
   * <pre>
   * The language of the following fields in `entity_type`:
   * *   `EntityType.entities.value`
   * *   `EntityType.entities.synonyms`
   * *   `EntityType.excluded_phrases.value`
   * If not specified, the agent's default language is used.
   * [Many
   * languages](https://cloud.google.com/dialogflow/docs/reference/language)
   * are supported.
   * Note: languages must be enabled in the agent before they can be used.
   * </pre>
   *
   * <code>string language_code = 3;</code>
   *
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * The language of the following fields in `entity_type`:
   * *   `EntityType.entities.value`
   * *   `EntityType.entities.synonyms`
   * *   `EntityType.excluded_phrases.value`
   * If not specified, the agent's default language is used.
   * [Many
   * languages](https://cloud.google.com/dialogflow/docs/reference/language)
   * are supported.
   * Note: languages must be enabled in the agent before they can be used.
   * </pre>
   *
   * <code>string language_code = 3;</code>
   *
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();
}
