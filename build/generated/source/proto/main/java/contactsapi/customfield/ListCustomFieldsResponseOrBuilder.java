// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: contactsapi/customfield/customfieldschema.proto

package contactsapi.customfield;

public interface ListCustomFieldsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:contactsapi.customfield.ListCustomFieldsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .contactsapi.customfield.CustomField custom_fields = 1;</code>
   */
  java.util.List<contactsapi.customfield.CustomField> 
      getCustomFieldsList();
  /**
   * <code>repeated .contactsapi.customfield.CustomField custom_fields = 1;</code>
   */
  contactsapi.customfield.CustomField getCustomFields(int index);
  /**
   * <code>repeated .contactsapi.customfield.CustomField custom_fields = 1;</code>
   */
  int getCustomFieldsCount();
  /**
   * <code>repeated .contactsapi.customfield.CustomField custom_fields = 1;</code>
   */
  java.util.List<? extends contactsapi.customfield.CustomFieldOrBuilder> 
      getCustomFieldsOrBuilderList();
  /**
   * <code>repeated .contactsapi.customfield.CustomField custom_fields = 1;</code>
   */
  contactsapi.customfield.CustomFieldOrBuilder getCustomFieldsOrBuilder(
      int index);

  /**
   * <code>int32 count = 2;</code>
   */
  int getCount();

  /**
   * <code>string next_page_token = 3;</code>
   */
  java.lang.String getNextPageToken();
  /**
   * <code>string next_page_token = 3;</code>
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
