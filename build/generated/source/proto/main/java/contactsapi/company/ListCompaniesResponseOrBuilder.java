// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: contactsapi/company/companies.proto

package contactsapi.company;

public interface ListCompaniesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:contactsapi.company.ListCompaniesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .contactsapi.company.CompanyResponse companies = 1;</code>
   */
  java.util.List<contactsapi.company.CompanyResponse> 
      getCompaniesList();
  /**
   * <code>repeated .contactsapi.company.CompanyResponse companies = 1;</code>
   */
  contactsapi.company.CompanyResponse getCompanies(int index);
  /**
   * <code>repeated .contactsapi.company.CompanyResponse companies = 1;</code>
   */
  int getCompaniesCount();
  /**
   * <code>repeated .contactsapi.company.CompanyResponse companies = 1;</code>
   */
  java.util.List<? extends contactsapi.company.CompanyResponseOrBuilder> 
      getCompaniesOrBuilderList();
  /**
   * <code>repeated .contactsapi.company.CompanyResponse companies = 1;</code>
   */
  contactsapi.company.CompanyResponseOrBuilder getCompaniesOrBuilder(
      int index);

  /**
   * <code>string next_page_token = 2;</code>
   */
  java.lang.String getNextPageToken();
  /**
   * <code>string next_page_token = 2;</code>
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();

  /**
   * <code>int32 count = 3;</code>
   */
  int getCount();
}
