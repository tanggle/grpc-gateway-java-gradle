// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: contactsapi/company/companies.proto

package contactsapi.company;

/**
 * Protobuf type {@code contactsapi.company.GetCompanyRequest}
 */
public  final class GetCompanyRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:contactsapi.company.GetCompanyRequest)
    GetCompanyRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetCompanyRequest.newBuilder() to construct.
  private GetCompanyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetCompanyRequest() {
    id_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetCompanyRequest(
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
            java.lang.String s = input.readStringRequireUtf8();

            id_ = s;
            break;
          }
          case 18: {
            google.protobuf.FieldMaskOuterClass.FieldMask.Builder subBuilder = null;
            if (fieldMask_ != null) {
              subBuilder = fieldMask_.toBuilder();
            }
            fieldMask_ = input.readMessage(google.protobuf.FieldMaskOuterClass.FieldMask.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(fieldMask_);
              fieldMask_ = subBuilder.buildPartial();
            }

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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return contactsapi.company.Companies.internal_static_contactsapi_company_GetCompanyRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return contactsapi.company.Companies.internal_static_contactsapi_company_GetCompanyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            contactsapi.company.GetCompanyRequest.class, contactsapi.company.GetCompanyRequest.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object id_;
  /**
   * <code>string id = 1;</code>
   */
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <code>string id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FIELD_MASK_FIELD_NUMBER = 2;
  private google.protobuf.FieldMaskOuterClass.FieldMask fieldMask_;
  /**
   * <code>.google.protobuf.FieldMask field_mask = 2;</code>
   */
  public boolean hasFieldMask() {
    return fieldMask_ != null;
  }
  /**
   * <code>.google.protobuf.FieldMask field_mask = 2;</code>
   */
  public google.protobuf.FieldMaskOuterClass.FieldMask getFieldMask() {
    return fieldMask_ == null ? google.protobuf.FieldMaskOuterClass.FieldMask.getDefaultInstance() : fieldMask_;
  }
  /**
   * <code>.google.protobuf.FieldMask field_mask = 2;</code>
   */
  public google.protobuf.FieldMaskOuterClass.FieldMaskOrBuilder getFieldMaskOrBuilder() {
    return getFieldMask();
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
    if (!getIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (fieldMask_ != null) {
      output.writeMessage(2, getFieldMask());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (fieldMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getFieldMask());
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
    if (!(obj instanceof contactsapi.company.GetCompanyRequest)) {
      return super.equals(obj);
    }
    contactsapi.company.GetCompanyRequest other = (contactsapi.company.GetCompanyRequest) obj;

    boolean result = true;
    result = result && getId()
        .equals(other.getId());
    result = result && (hasFieldMask() == other.hasFieldMask());
    if (hasFieldMask()) {
      result = result && getFieldMask()
          .equals(other.getFieldMask());
    }
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    if (hasFieldMask()) {
      hash = (37 * hash) + FIELD_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getFieldMask().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static contactsapi.company.GetCompanyRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static contactsapi.company.GetCompanyRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static contactsapi.company.GetCompanyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static contactsapi.company.GetCompanyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static contactsapi.company.GetCompanyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static contactsapi.company.GetCompanyRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static contactsapi.company.GetCompanyRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static contactsapi.company.GetCompanyRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static contactsapi.company.GetCompanyRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static contactsapi.company.GetCompanyRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static contactsapi.company.GetCompanyRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static contactsapi.company.GetCompanyRequest parseFrom(
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
  public static Builder newBuilder(contactsapi.company.GetCompanyRequest prototype) {
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
   * Protobuf type {@code contactsapi.company.GetCompanyRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:contactsapi.company.GetCompanyRequest)
      contactsapi.company.GetCompanyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return contactsapi.company.Companies.internal_static_contactsapi_company_GetCompanyRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return contactsapi.company.Companies.internal_static_contactsapi_company_GetCompanyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              contactsapi.company.GetCompanyRequest.class, contactsapi.company.GetCompanyRequest.Builder.class);
    }

    // Construct using contactsapi.company.GetCompanyRequest.newBuilder()
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
      }
    }
    public Builder clear() {
      super.clear();
      id_ = "";

      if (fieldMaskBuilder_ == null) {
        fieldMask_ = null;
      } else {
        fieldMask_ = null;
        fieldMaskBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return contactsapi.company.Companies.internal_static_contactsapi_company_GetCompanyRequest_descriptor;
    }

    public contactsapi.company.GetCompanyRequest getDefaultInstanceForType() {
      return contactsapi.company.GetCompanyRequest.getDefaultInstance();
    }

    public contactsapi.company.GetCompanyRequest build() {
      contactsapi.company.GetCompanyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public contactsapi.company.GetCompanyRequest buildPartial() {
      contactsapi.company.GetCompanyRequest result = new contactsapi.company.GetCompanyRequest(this);
      result.id_ = id_;
      if (fieldMaskBuilder_ == null) {
        result.fieldMask_ = fieldMask_;
      } else {
        result.fieldMask_ = fieldMaskBuilder_.build();
      }
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
      if (other instanceof contactsapi.company.GetCompanyRequest) {
        return mergeFrom((contactsapi.company.GetCompanyRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(contactsapi.company.GetCompanyRequest other) {
      if (other == contactsapi.company.GetCompanyRequest.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (other.hasFieldMask()) {
        mergeFieldMask(other.getFieldMask());
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
      contactsapi.company.GetCompanyRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (contactsapi.company.GetCompanyRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object id_ = "";
    /**
     * <code>string id = 1;</code>
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value;
      onChanged();
      return this;
    }

    private google.protobuf.FieldMaskOuterClass.FieldMask fieldMask_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        google.protobuf.FieldMaskOuterClass.FieldMask, google.protobuf.FieldMaskOuterClass.FieldMask.Builder, google.protobuf.FieldMaskOuterClass.FieldMaskOrBuilder> fieldMaskBuilder_;
    /**
     * <code>.google.protobuf.FieldMask field_mask = 2;</code>
     */
    public boolean hasFieldMask() {
      return fieldMaskBuilder_ != null || fieldMask_ != null;
    }
    /**
     * <code>.google.protobuf.FieldMask field_mask = 2;</code>
     */
    public google.protobuf.FieldMaskOuterClass.FieldMask getFieldMask() {
      if (fieldMaskBuilder_ == null) {
        return fieldMask_ == null ? google.protobuf.FieldMaskOuterClass.FieldMask.getDefaultInstance() : fieldMask_;
      } else {
        return fieldMaskBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.FieldMask field_mask = 2;</code>
     */
    public Builder setFieldMask(google.protobuf.FieldMaskOuterClass.FieldMask value) {
      if (fieldMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        fieldMask_ = value;
        onChanged();
      } else {
        fieldMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.FieldMask field_mask = 2;</code>
     */
    public Builder setFieldMask(
        google.protobuf.FieldMaskOuterClass.FieldMask.Builder builderForValue) {
      if (fieldMaskBuilder_ == null) {
        fieldMask_ = builderForValue.build();
        onChanged();
      } else {
        fieldMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.FieldMask field_mask = 2;</code>
     */
    public Builder mergeFieldMask(google.protobuf.FieldMaskOuterClass.FieldMask value) {
      if (fieldMaskBuilder_ == null) {
        if (fieldMask_ != null) {
          fieldMask_ =
            google.protobuf.FieldMaskOuterClass.FieldMask.newBuilder(fieldMask_).mergeFrom(value).buildPartial();
        } else {
          fieldMask_ = value;
        }
        onChanged();
      } else {
        fieldMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.FieldMask field_mask = 2;</code>
     */
    public Builder clearFieldMask() {
      if (fieldMaskBuilder_ == null) {
        fieldMask_ = null;
        onChanged();
      } else {
        fieldMask_ = null;
        fieldMaskBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.FieldMask field_mask = 2;</code>
     */
    public google.protobuf.FieldMaskOuterClass.FieldMask.Builder getFieldMaskBuilder() {
      
      onChanged();
      return getFieldMaskFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.FieldMask field_mask = 2;</code>
     */
    public google.protobuf.FieldMaskOuterClass.FieldMaskOrBuilder getFieldMaskOrBuilder() {
      if (fieldMaskBuilder_ != null) {
        return fieldMaskBuilder_.getMessageOrBuilder();
      } else {
        return fieldMask_ == null ?
            google.protobuf.FieldMaskOuterClass.FieldMask.getDefaultInstance() : fieldMask_;
      }
    }
    /**
     * <code>.google.protobuf.FieldMask field_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        google.protobuf.FieldMaskOuterClass.FieldMask, google.protobuf.FieldMaskOuterClass.FieldMask.Builder, google.protobuf.FieldMaskOuterClass.FieldMaskOrBuilder> 
        getFieldMaskFieldBuilder() {
      if (fieldMaskBuilder_ == null) {
        fieldMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            google.protobuf.FieldMaskOuterClass.FieldMask, google.protobuf.FieldMaskOuterClass.FieldMask.Builder, google.protobuf.FieldMaskOuterClass.FieldMaskOrBuilder>(
                getFieldMask(),
                getParentForChildren(),
                isClean());
        fieldMask_ = null;
      }
      return fieldMaskBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:contactsapi.company.GetCompanyRequest)
  }

  // @@protoc_insertion_point(class_scope:contactsapi.company.GetCompanyRequest)
  private static final contactsapi.company.GetCompanyRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new contactsapi.company.GetCompanyRequest();
  }

  public static contactsapi.company.GetCompanyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetCompanyRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetCompanyRequest>() {
    public GetCompanyRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetCompanyRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetCompanyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetCompanyRequest> getParserForType() {
    return PARSER;
  }

  public contactsapi.company.GetCompanyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

