// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/java/cn/edu/sdu/JT808Server/protobuf/JT808ServerShortLocationData.proto

package cn.edu.sdu.JT808Server.protobuf;

public final class LocationData {
  private LocationData() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TerminalLocationMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:protobuf.TerminalLocationMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional double latitude = 1;</code>
     */
    boolean hasLatitude();
    /**
     * <code>optional double latitude = 1;</code>
     */
    double getLatitude();

    /**
     * <code>optional double longitude = 2;</code>
     */
    boolean hasLongitude();
    /**
     * <code>optional double longitude = 2;</code>
     */
    double getLongitude();

    /**
     * <code>optional string time = 3;</code>
     */
    boolean hasTime();
    /**
     * <code>optional string time = 3;</code>
     */
    java.lang.String getTime();
    /**
     * <code>optional string time = 3;</code>
     */
    com.google.protobuf.ByteString
        getTimeBytes();
  }
  /**
   * Protobuf type {@code protobuf.TerminalLocationMsg}
   */
  public  static final class TerminalLocationMsg extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:protobuf.TerminalLocationMsg)
      TerminalLocationMsgOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TerminalLocationMsg.newBuilder() to construct.
    private TerminalLocationMsg(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TerminalLocationMsg() {
      time_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TerminalLocationMsg(
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
            case 9: {
              bitField0_ |= 0x00000001;
              latitude_ = input.readDouble();
              break;
            }
            case 17: {
              bitField0_ |= 0x00000002;
              longitude_ = input.readDouble();
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              time_ = bs;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
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
      return LocationData.internal_static_protobuf_TerminalLocationMsg_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return LocationData.internal_static_protobuf_TerminalLocationMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              LocationData.TerminalLocationMsg.class, LocationData.TerminalLocationMsg.Builder.class);
    }

    private int bitField0_;
    public static final int LATITUDE_FIELD_NUMBER = 1;
    private double latitude_;
    /**
     * <code>optional double latitude = 1;</code>
     */
    public boolean hasLatitude() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional double latitude = 1;</code>
     */
    public double getLatitude() {
      return latitude_;
    }

    public static final int LONGITUDE_FIELD_NUMBER = 2;
    private double longitude_;
    /**
     * <code>optional double longitude = 2;</code>
     */
    public boolean hasLongitude() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional double longitude = 2;</code>
     */
    public double getLongitude() {
      return longitude_;
    }

    public static final int TIME_FIELD_NUMBER = 3;
    private volatile java.lang.Object time_;
    /**
     * <code>optional string time = 3;</code>
     */
    public boolean hasTime() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional string time = 3;</code>
     */
    public java.lang.String getTime() {
      java.lang.Object ref = time_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          time_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string time = 3;</code>
     */
    public com.google.protobuf.ByteString
        getTimeBytes() {
      java.lang.Object ref = time_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        time_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeDouble(1, latitude_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeDouble(2, longitude_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, time_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(1, latitude_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(2, longitude_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, time_);
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
      if (!(obj instanceof LocationData.TerminalLocationMsg)) {
        return super.equals(obj);
      }
      LocationData.TerminalLocationMsg other = (LocationData.TerminalLocationMsg) obj;

      if (hasLatitude() != other.hasLatitude()) return false;
      if (hasLatitude()) {
        if (java.lang.Double.doubleToLongBits(getLatitude())
            != java.lang.Double.doubleToLongBits(
                other.getLatitude())) return false;
      }
      if (hasLongitude() != other.hasLongitude()) return false;
      if (hasLongitude()) {
        if (java.lang.Double.doubleToLongBits(getLongitude())
            != java.lang.Double.doubleToLongBits(
                other.getLongitude())) return false;
      }
      if (hasTime() != other.hasTime()) return false;
      if (hasTime()) {
        if (!getTime()
            .equals(other.getTime())) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasLatitude()) {
        hash = (37 * hash) + LATITUDE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            java.lang.Double.doubleToLongBits(getLatitude()));
      }
      if (hasLongitude()) {
        hash = (37 * hash) + LONGITUDE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            java.lang.Double.doubleToLongBits(getLongitude()));
      }
      if (hasTime()) {
        hash = (37 * hash) + TIME_FIELD_NUMBER;
        hash = (53 * hash) + getTime().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static LocationData.TerminalLocationMsg parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static LocationData.TerminalLocationMsg parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static LocationData.TerminalLocationMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static LocationData.TerminalLocationMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static LocationData.TerminalLocationMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static LocationData.TerminalLocationMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static LocationData.TerminalLocationMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static LocationData.TerminalLocationMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static LocationData.TerminalLocationMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static LocationData.TerminalLocationMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static LocationData.TerminalLocationMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static LocationData.TerminalLocationMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(LocationData.TerminalLocationMsg prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
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
     * Protobuf type {@code protobuf.TerminalLocationMsg}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:protobuf.TerminalLocationMsg)
        LocationData.TerminalLocationMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return LocationData.internal_static_protobuf_TerminalLocationMsg_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return LocationData.internal_static_protobuf_TerminalLocationMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                LocationData.TerminalLocationMsg.class, LocationData.TerminalLocationMsg.Builder.class);
      }

      // Construct using cn.edu.sdu.JT808Server.protobuf.LocationData.TerminalLocationMsg.newBuilder()
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
      @java.lang.Override
      public Builder clear() {
        super.clear();
        latitude_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000001);
        longitude_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000002);
        time_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return LocationData.internal_static_protobuf_TerminalLocationMsg_descriptor;
      }

      @java.lang.Override
      public LocationData.TerminalLocationMsg getDefaultInstanceForType() {
        return LocationData.TerminalLocationMsg.getDefaultInstance();
      }

      @java.lang.Override
      public LocationData.TerminalLocationMsg build() {
        LocationData.TerminalLocationMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public LocationData.TerminalLocationMsg buildPartial() {
        LocationData.TerminalLocationMsg result = new LocationData.TerminalLocationMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.latitude_ = latitude_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.longitude_ = longitude_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          to_bitField0_ |= 0x00000004;
        }
        result.time_ = time_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof LocationData.TerminalLocationMsg) {
          return mergeFrom((LocationData.TerminalLocationMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(LocationData.TerminalLocationMsg other) {
        if (other == LocationData.TerminalLocationMsg.getDefaultInstance()) return this;
        if (other.hasLatitude()) {
          setLatitude(other.getLatitude());
        }
        if (other.hasLongitude()) {
          setLongitude(other.getLongitude());
        }
        if (other.hasTime()) {
          bitField0_ |= 0x00000004;
          time_ = other.time_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        LocationData.TerminalLocationMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (LocationData.TerminalLocationMsg) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private double latitude_ ;
      /**
       * <code>optional double latitude = 1;</code>
       */
      public boolean hasLatitude() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional double latitude = 1;</code>
       */
      public double getLatitude() {
        return latitude_;
      }
      /**
       * <code>optional double latitude = 1;</code>
       */
      public Builder setLatitude(double value) {
        bitField0_ |= 0x00000001;
        latitude_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional double latitude = 1;</code>
       */
      public Builder clearLatitude() {
        bitField0_ = (bitField0_ & ~0x00000001);
        latitude_ = 0D;
        onChanged();
        return this;
      }

      private double longitude_ ;
      /**
       * <code>optional double longitude = 2;</code>
       */
      public boolean hasLongitude() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional double longitude = 2;</code>
       */
      public double getLongitude() {
        return longitude_;
      }
      /**
       * <code>optional double longitude = 2;</code>
       */
      public Builder setLongitude(double value) {
        bitField0_ |= 0x00000002;
        longitude_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional double longitude = 2;</code>
       */
      public Builder clearLongitude() {
        bitField0_ = (bitField0_ & ~0x00000002);
        longitude_ = 0D;
        onChanged();
        return this;
      }

      private java.lang.Object time_ = "";
      /**
       * <code>optional string time = 3;</code>
       */
      public boolean hasTime() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>optional string time = 3;</code>
       */
      public java.lang.String getTime() {
        java.lang.Object ref = time_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            time_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string time = 3;</code>
       */
      public com.google.protobuf.ByteString
          getTimeBytes() {
        java.lang.Object ref = time_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          time_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string time = 3;</code>
       */
      public Builder setTime(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        time_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string time = 3;</code>
       */
      public Builder clearTime() {
        bitField0_ = (bitField0_ & ~0x00000004);
        time_ = getDefaultInstance().getTime();
        onChanged();
        return this;
      }
      /**
       * <code>optional string time = 3;</code>
       */
      public Builder setTimeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        time_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:protobuf.TerminalLocationMsg)
    }

    // @@protoc_insertion_point(class_scope:protobuf.TerminalLocationMsg)
    private static final LocationData.TerminalLocationMsg DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new LocationData.TerminalLocationMsg();
    }

    public static LocationData.TerminalLocationMsg getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<TerminalLocationMsg>
        PARSER = new com.google.protobuf.AbstractParser<TerminalLocationMsg>() {
      @java.lang.Override
      public TerminalLocationMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TerminalLocationMsg(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TerminalLocationMsg> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TerminalLocationMsg> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public LocationData.TerminalLocationMsg getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protobuf_TerminalLocationMsg_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protobuf_TerminalLocationMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nPsrc/main/java/cn/edu/sdu/JT808Server/p" +
      "rotobuf/JT808ServerShortLocationData.pro" +
      "to\022\010protobuf\"H\n\023TerminalLocationMsg\022\020\n\010l" +
      "atitude\030\001 \001(\001\022\021\n\tlongitude\030\002 \001(\001\022\014\n\004time" +
      "\030\003 \001(\tB\020B\014LocationDataH\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_protobuf_TerminalLocationMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protobuf_TerminalLocationMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protobuf_TerminalLocationMsg_descriptor,
        new java.lang.String[] { "Latitude", "Longitude", "Time", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
