// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: contactsapi/customfield/customfieldschema.proto

package contactsapi.customfield;

/**
 * Protobuf type {@code contactsapi.customfield.ListCustomFieldsResponse}
 */
public  final class ListCustomFieldsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:contactsapi.customfield.ListCustomFieldsResponse)
    ListCustomFieldsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListCustomFieldsResponse.newBuilder() to construct.
  private ListCustomFieldsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListCustomFieldsResponse() {
    customFields_ = java.util.Collections.emptyList();
    count_ = 0;
    nextPageToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListCustomFieldsResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              customFields_ = new java.util.ArrayList<contactsapi.customfield.CustomField>();
              mutable_bitField0_ |= 0x00000001;
            }
            customFields_.add(
                input.readMessage(contactsapi.customfield.CustomField.parser(), extensionRegistry));
            break;
          }
          case 16: {

            count_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            nextPageToken_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        customFields_ = java.util.Collections.unmodifiableList(customFields_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return contactsapi.customfield.Customfieldschema.internal_static_contactsapi_customfield_ListCustomFieldsResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return contactsapi.customfield.Customfieldschema.internal_static_contactsapi_customfield_ListCustomFieldsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            contactsapi.customfield.ListCustomFieldsResponse.class, contactsapi.customfield.ListCustomFieldsResponse.Builder.class);
  }

  private int bitField0_;
  public static final int CUSTOM_FIELDS_FIELD_NUMBER = 1;
  private java.util.List<contactsapi.customfield.CustomField> customFields_;
  /**
   * <code>repeated .contactsapi.customfield.CustomField custom_fields = 1;</code>
   */
  public java.util.List<contactsapi.customfield.CustomField> getCustomFieldsList() {
    return customFields_;
  }
  /**
   * <code>repeated .contactsapi.customfield.CustomField custom_fields = 1;</code>
   */
  public java.util.List<? extends contactsapi.customfield.CustomFieldOrBuilder> 
      getCustomFieldsOrBuilderList() {
    return customFields_;
  }
  /**
   * <code>repeated .contactsapi.customfield.CustomField custom_fields = 1;</code>
   */
  public int getCustomFieldsCount() {
    return customFields_.size();
  }
  /**
   * <code>repeated .contactsapi.customfield.CustomField custom_fields = 1;</code>
   */
  public contactsapi.customfield.CustomField getCustomFields(int index) {
    return customFields_.get(index);
  }
  /**
   * <code>repeated .contactsapi.customfield.CustomField custom_fields = 1;</code>
   */
  public contactsapi.customfield.CustomFieldOrBuilder getCustomFieldsOrBuilder(
      int index) {
    return customFields_.get(index);
  }

  public static final int COUNT_FIELD_NUMBER = 2;
  private int count_;
  /**
   * <code>int32 count = 2;</code>
   */
  public int getCount() {
    return count_;
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 3;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <code>string next_page_token = 3;</code>
   */
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <code>string next_page_token = 3;</code>
   */
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < customFields_.size(); i++) {
      output.writeMessage(1, customFields_.get(i));
    }
    if (count_ != 0) {
      output.writeInt32(2, count_);
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < customFields_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, customFields_.get(i));
    }
    if (count_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, count_);
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, nextPageToken_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof contactsapi.customfield.ListCustomFieldsResponse)) {
      return super.equals(obj);
    }
    contactsapi.customfield.ListCustomFieldsResponse other = (contactsapi.customfield.ListCustomFieldsResponse) obj;

    boolean result = true;
    result = result && getCustomFieldsList()
        .equals(other.getCustomFieldsList());
    result = result && (getCount()
        == other.getCount());
    result = result && getNextPageToken()
        .equals(other.getNextPageToken());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getCustomFieldsCount() > 0) {
      hash = (37 * hash) + CUSTOM_FIELDS_FIELD_NUMBER;
      hash = (53 * hash) + getCustomFieldsList().hashCode();
    }
    hash = (37 * hash) + COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getCount();
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static contactsapi.customfield.ListCustomFieldsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static contactsapi.customfield.ListCustomFieldsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static contactsapi.customfield.ListCustomFieldsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static contactsapi.customfield.ListCustomFieldsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static contactsapi.customfield.ListCustomFieldsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static contactsapi.customfield.ListCustomFieldsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static contactsapi.customfield.ListCustomFieldsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static contactsapi.customfield.ListCustomFieldsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static contactsapi.customfield.ListCustomFieldsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static contactsapi.customfield.ListCustomFieldsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static contactsapi.customfield.ListCustomFieldsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static contactsapi.customfield.ListCustomFieldsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(contactsapi.customfield.ListCustomFieldsResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code contactsapi.customfield.ListCustomFieldsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:contactsapi.customfield.ListCustomFieldsResponse)
      contactsapi.customfield.ListCustomFieldsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return contactsapi.customfield.Customfieldschema.internal_static_contactsapi_customfield_ListCustomFieldsResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return contactsapi.customfield.Customfieldschema.internal_static_contactsapi_customfield_ListCustomFieldsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              contactsapi.customfield.ListCustomFieldsResponse.class, contactsapi.customfield.ListCustomFieldsResponse.Builder.class);
    }

    // Construct using contactsapi.customfield.ListCustomFieldsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getCustomFieldsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (customFieldsBuilder_ == null) {
        customFields_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        customFieldsBuilder_.clear();
      }
      count_ = 0;

      nextPageToken_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return contactsapi.customfield.Customfieldschema.internal_static_contactsapi_customfield_ListCustomFieldsResponse_descriptor;
    }

    public contactsapi.customfield.ListCustomFieldsResponse getDefaultInstanceForType() {
      return contactsapi.customfield.ListCustomFieldsResponse.getDefaultInstance();
    }

    public contactsapi.customfield.ListCustomFieldsResponse build() {
      contactsapi.customfield.ListCustomFieldsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public contactsapi.customfield.ListCustomFieldsResponse buildPartial() {
      contactsapi.customfield.ListCustomFieldsResponse result = new contactsapi.customfield.ListCustomFieldsResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (customFieldsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          customFields_ = java.util.Collections.unmodifiableList(customFields_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.customFields_ = customFields_;
      } else {
        result.customFields_ = customFieldsBuilder_.build();
      }
      result.count_ = count_;
      result.nextPageToken_ = nextPageToken_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof contactsapi.customfield.ListCustomFieldsResponse) {
        return mergeFrom((contactsapi.customfield.ListCustomFieldsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(contactsapi.customfield.ListCustomFieldsResponse other) {
      if (other == contactsapi.customfield.ListCustomFieldsResponse.getDefaultInstance()) return this;
      if (customFieldsBuilder_ == null) {
        if (!other.customFields_.isEmpty()) {
          if (customFields_.isEmpty()) {
            customFields_ = other.customFields_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCustomFieldsIsMutable();
            customFields_.addAll(other.customFields_);
          }
          onChanged();
        }
      } else {
        if (!other.customFields_.isEmpty()) {
          if (customFieldsBuilder_.isEmpty()) {
            customFieldsBuilder_.dispose();
            customFieldsBuilder_ = null;
            customFields_ = other.customFields_;
            bitField0_ = (bitField0_ & ~0x00000001);
            customFieldsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getCustomFieldsFieldBuilder() : null;
          } else {
            customFieldsBuilder_.addAllMessages(other.customFields_);
          }
        }
      }
      if (other.getCount() != 0) {
        setCount(other.getCount());
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      contactsapi.customfield.ListCustomFieldsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (contactsapi.customfield.ListCustomFieldsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<contactsapi.customfield.CustomField> customFields_ =
      java.util.Collections.emptyList();
    private void ensureCustomFieldsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        customFields_ = new java.util.ArrayList<contactsapi.customfield.CustomField>(customFields_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        contactsapi.customfield.CustomField, contactsapi.customfield.CustomField.Builder, contactsapi.customfield.CustomFieldOrBuilder> customFieldsBuilder_;

    /**
     * <code>repeated .contactsapi.customfield.CustomField custom_fields = 1;</code>
     */
    public java.util.List<contactsapi.customfield.CustomField> getCustomFieldsList() {
      if (customFieldsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(customFields_);
      } else {
        return customFieldsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .contactsapi.customfield.CustomField custom_fields = 1;</code>
     */
    public int getCustomFieldsCount() {
      if (customFieldsBuilder_ == null) {
        return customFields_.size();
      } else {
        return customFieldsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .contactsapi.customfield.CustomField custom_fields = 1;</code>
     */
    public contactsapi.customfield.CustomField getCustomFields(int index) {
      if (customFieldsBuilder_ == null) {
        return customFields_.get(index);
      } else {
        return customFieldsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .contactsapi.customfield.CustomField custom_fields = 1;</code>
     */
    public Builder setCustomFields(
        int index, contactsapi.customfield.CustomField value) {
      if (customFieldsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCustomFieldsIsMutable();
        customFields_.set(index, value);
        onChanged();
      } else {
        customFieldsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .contactsapi.customfield.CustomField custom_fields = 1;</code>
     */
    public Builder setCustomFields(
        int index, contactsapi.customfield.CustomField.Builder builderForValue) {
      if (customFieldsBuilder_ == null) {
        ensureCustomFieldsIsMutable();
        customFields_.set(index, builderForValue.build());
        onChanged();
      } else {
        customFieldsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .contactsapi.customfield.CustomField custom_fields = 1;</code>
     */
    public Builder addCustomFields(contactsapi.customfield.CustomField value) {
      if (customFieldsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCustomFieldsIsMutable();
        customFields_.add(value);
        onChanged();
      } else {
        customFieldsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .contactsapi.customfield.CustomField custom_fields = 1;</code>
     */
    public Builder addCustomFields(
        int index, contactsapi.customfield.CustomField value) {
      if (customFieldsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCustomFieldsIsMutable();
        customFields_.add(index, value);
        onChanged();
      } else {
        customFieldsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .contactsapi.customfield.CustomField custom_fields = 1;</code>
     */
    public Builder addCustomFields(
        contactsapi.customfield.CustomField.Builder builderForValue) {
      if (customFieldsBuilder_ == null) {
        ensureCustomFieldsIsMutable();
        customFields_.add(builderForValue.build());
        onChanged();
      } else {
        customFieldsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .contactsapi.customfield.CustomField custom_fields = 1;</code>
     */
    public Builder addCustomFields(
        int index, contactsapi.customfield.CustomField.Builder builderForValue) {
      if (customFieldsBuilder_ == null) {
        ensureCustomFieldsIsMutable();
        customFields_.add(index, builderForValue.build());
        onChanged();
      } else {
        customFieldsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .contactsapi.customfield.CustomField custom_fields = 1;</code>
     */
    public Builder addAllCustomFields(
        java.lang.Iterable<? extends contactsapi.customfield.CustomField> values) {
      if (customFieldsBuilder_ == null) {
        ensureCustomFieldsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, customFields_);
        onChanged();
      } else {
        customFieldsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .contactsapi.customfield.CustomField custom_fields = 1;</code>
     */
    public Builder clearCustomFields() {
      if (customFieldsBuilder_ == null) {
        customFields_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        customFieldsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .contactsapi.customfield.CustomField custom_fields = 1;</code>
     */
    public Builder removeCustomFields(int index) {
      if (customFieldsBuilder_ == null) {
        ensureCustomFieldsIsMutable();
        customFields_.remove(index);
        onChanged();
      } else {
        customFieldsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .contactsapi.customfield.CustomField custom_fields = 1;</code>
     */
    public contactsapi.customfield.CustomField.Builder getCustomFieldsBuilder(
        int index) {
      return getCustomFieldsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .contactsapi.customfield.CustomField custom_fields = 1;</code>
     */
    public contactsapi.customfield.CustomFieldOrBuilder getCustomFieldsOrBuilder(
        int index) {
      if (customFieldsBuilder_ == null) {
        return customFields_.get(index);  } else {
        return customFieldsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .contactsapi.customfield.CustomField custom_fields = 1;</code>
     */
    public java.util.List<? extends contactsapi.customfield.CustomFieldOrBuilder> 
         getCustomFieldsOrBuilderList() {
      if (customFieldsBuilder_ != null) {
        return customFieldsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(customFields_);
      }
    }
    /**
     * <code>repeated .contactsapi.customfield.CustomField custom_fields = 1;</code>
     */
    public contactsapi.customfield.CustomField.Builder addCustomFieldsBuilder() {
      return getCustomFieldsFieldBuilder().addBuilder(
          contactsapi.customfield.CustomField.getDefaultInstance());
    }
    /**
     * <code>repeated .contactsapi.customfield.CustomField custom_fields = 1;</code>
     */
    public contactsapi.customfield.CustomField.Builder addCustomFieldsBuilder(
        int index) {
      return getCustomFieldsFieldBuilder().addBuilder(
          index, contactsapi.customfield.CustomField.getDefaultInstance());
    }
    /**
     * <code>repeated .contactsapi.customfield.CustomField custom_fields = 1;</code>
     */
    public java.util.List<contactsapi.customfield.CustomField.Builder> 
         getCustomFieldsBuilderList() {
      return getCustomFieldsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        contactsapi.customfield.CustomField, contactsapi.customfield.CustomField.Builder, contactsapi.customfield.CustomFieldOrBuilder> 
        getCustomFieldsFieldBuilder() {
      if (customFieldsBuilder_ == null) {
        customFieldsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            contactsapi.customfield.CustomField, contactsapi.customfield.CustomField.Builder, contactsapi.customfield.CustomFieldOrBuilder>(
                customFields_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        customFields_ = null;
      }
      return customFieldsBuilder_;
    }

    private int count_ ;
    /**
     * <code>int32 count = 2;</code>
     */
    public int getCount() {
      return count_;
    }
    /**
     * <code>int32 count = 2;</code>
     */
    public Builder setCount(int value) {
      
      count_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 count = 2;</code>
     */
    public Builder clearCount() {
      
      count_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <code>string next_page_token = 3;</code>
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string next_page_token = 3;</code>
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string next_page_token = 3;</code>
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string next_page_token = 3;</code>
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <code>string next_page_token = 3;</code>
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:contactsapi.customfield.ListCustomFieldsResponse)
  }

  // @@protoc_insertion_point(class_scope:contactsapi.customfield.ListCustomFieldsResponse)
  private static final contactsapi.customfield.ListCustomFieldsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new contactsapi.customfield.ListCustomFieldsResponse();
  }

  public static contactsapi.customfield.ListCustomFieldsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListCustomFieldsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListCustomFieldsResponse>() {
    public ListCustomFieldsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListCustomFieldsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListCustomFieldsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListCustomFieldsResponse> getParserForType() {
    return PARSER;
  }

  public contactsapi.customfield.ListCustomFieldsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
