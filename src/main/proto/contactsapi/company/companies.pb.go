// Code generated by protoc-gen-go. DO NOT EDIT.
// source: src/main/proto/contactsapi/company/companies.proto

package contactsapi_company

import proto "github.com/golang/protobuf/proto"
import fmt "fmt"
import math "math"
import empty "github.com/golang/protobuf/ptypes/empty"
import _ "google.golang.org/genproto/googleapis/api/annotations"
import field_mask "google.golang.org/genproto/protobuf/field_mask"

import (
	context "golang.org/x/net/context"
	grpc "google.golang.org/grpc"
)

// Reference imports to suppress errors if they are not otherwise used.
var _ = proto.Marshal
var _ = fmt.Errorf
var _ = math.Inf

// This is a compile-time assertion to ensure that this generated file
// is compatible with the proto package it is being compiled against.
// A compilation error at this line likely means your copy of the
// proto package needs to be updated.
const _ = proto.ProtoPackageIsVersion2 // please upgrade the proto package

type CreateCompanyRequest struct {
	Name string `protobuf:"bytes,1,opt,name=name" json:"name,omitempty"`
	// TODO: does create have a mask?..
	FieldMask            *field_mask.FieldMask `protobuf:"bytes,2,opt,name=field_mask,json=fieldMask" json:"field_mask,omitempty"`
	XXX_NoUnkeyedLiteral struct{}              `json:"-"`
	XXX_unrecognized     []byte                `json:"-"`
	XXX_sizecache        int32                 `json:"-"`
}

func (m *CreateCompanyRequest) Reset()         { *m = CreateCompanyRequest{} }
func (m *CreateCompanyRequest) String() string { return proto.CompactTextString(m) }
func (*CreateCompanyRequest) ProtoMessage()    {}
func (*CreateCompanyRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_companies_d8af54158e297cb9, []int{0}
}
func (m *CreateCompanyRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_CreateCompanyRequest.Unmarshal(m, b)
}
func (m *CreateCompanyRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_CreateCompanyRequest.Marshal(b, m, deterministic)
}
func (dst *CreateCompanyRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_CreateCompanyRequest.Merge(dst, src)
}
func (m *CreateCompanyRequest) XXX_Size() int {
	return xxx_messageInfo_CreateCompanyRequest.Size(m)
}
func (m *CreateCompanyRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_CreateCompanyRequest.DiscardUnknown(m)
}

var xxx_messageInfo_CreateCompanyRequest proto.InternalMessageInfo

func (m *CreateCompanyRequest) GetName() string {
	if m != nil {
		return m.Name
	}
	return ""
}

func (m *CreateCompanyRequest) GetFieldMask() *field_mask.FieldMask {
	if m != nil {
		return m.FieldMask
	}
	return nil
}

type GetCompanyRequest struct {
	Id                   string                `protobuf:"bytes,1,opt,name=id" json:"id,omitempty"`
	FieldMask            *field_mask.FieldMask `protobuf:"bytes,2,opt,name=field_mask,json=fieldMask" json:"field_mask,omitempty"`
	XXX_NoUnkeyedLiteral struct{}              `json:"-"`
	XXX_unrecognized     []byte                `json:"-"`
	XXX_sizecache        int32                 `json:"-"`
}

func (m *GetCompanyRequest) Reset()         { *m = GetCompanyRequest{} }
func (m *GetCompanyRequest) String() string { return proto.CompactTextString(m) }
func (*GetCompanyRequest) ProtoMessage()    {}
func (*GetCompanyRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_companies_d8af54158e297cb9, []int{1}
}
func (m *GetCompanyRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_GetCompanyRequest.Unmarshal(m, b)
}
func (m *GetCompanyRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_GetCompanyRequest.Marshal(b, m, deterministic)
}
func (dst *GetCompanyRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_GetCompanyRequest.Merge(dst, src)
}
func (m *GetCompanyRequest) XXX_Size() int {
	return xxx_messageInfo_GetCompanyRequest.Size(m)
}
func (m *GetCompanyRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_GetCompanyRequest.DiscardUnknown(m)
}

var xxx_messageInfo_GetCompanyRequest proto.InternalMessageInfo

func (m *GetCompanyRequest) GetId() string {
	if m != nil {
		return m.Id
	}
	return ""
}

func (m *GetCompanyRequest) GetFieldMask() *field_mask.FieldMask {
	if m != nil {
		return m.FieldMask
	}
	return nil
}

type ListCompaniesRequest struct {
	FieldMask            *field_mask.FieldMask `protobuf:"bytes,2,opt,name=field_mask,json=fieldMask" json:"field_mask,omitempty"`
	XXX_NoUnkeyedLiteral struct{}              `json:"-"`
	XXX_unrecognized     []byte                `json:"-"`
	XXX_sizecache        int32                 `json:"-"`
}

func (m *ListCompaniesRequest) Reset()         { *m = ListCompaniesRequest{} }
func (m *ListCompaniesRequest) String() string { return proto.CompactTextString(m) }
func (*ListCompaniesRequest) ProtoMessage()    {}
func (*ListCompaniesRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_companies_d8af54158e297cb9, []int{2}
}
func (m *ListCompaniesRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_ListCompaniesRequest.Unmarshal(m, b)
}
func (m *ListCompaniesRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_ListCompaniesRequest.Marshal(b, m, deterministic)
}
func (dst *ListCompaniesRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_ListCompaniesRequest.Merge(dst, src)
}
func (m *ListCompaniesRequest) XXX_Size() int {
	return xxx_messageInfo_ListCompaniesRequest.Size(m)
}
func (m *ListCompaniesRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_ListCompaniesRequest.DiscardUnknown(m)
}

var xxx_messageInfo_ListCompaniesRequest proto.InternalMessageInfo

func (m *ListCompaniesRequest) GetFieldMask() *field_mask.FieldMask {
	if m != nil {
		return m.FieldMask
	}
	return nil
}

type GetCompaniesRequest struct {
	PageToken            string                `protobuf:"bytes,1,opt,name=page_token,json=pageToken" json:"page_token,omitempty"`
	PageSize             int32                 `protobuf:"varint,2,opt,name=page_size,json=pageSize" json:"page_size,omitempty"`
	FieldMask            *field_mask.FieldMask `protobuf:"bytes,3,opt,name=field_mask,json=fieldMask" json:"field_mask,omitempty"`
	XXX_NoUnkeyedLiteral struct{}              `json:"-"`
	XXX_unrecognized     []byte                `json:"-"`
	XXX_sizecache        int32                 `json:"-"`
}

func (m *GetCompaniesRequest) Reset()         { *m = GetCompaniesRequest{} }
func (m *GetCompaniesRequest) String() string { return proto.CompactTextString(m) }
func (*GetCompaniesRequest) ProtoMessage()    {}
func (*GetCompaniesRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_companies_d8af54158e297cb9, []int{3}
}
func (m *GetCompaniesRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_GetCompaniesRequest.Unmarshal(m, b)
}
func (m *GetCompaniesRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_GetCompaniesRequest.Marshal(b, m, deterministic)
}
func (dst *GetCompaniesRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_GetCompaniesRequest.Merge(dst, src)
}
func (m *GetCompaniesRequest) XXX_Size() int {
	return xxx_messageInfo_GetCompaniesRequest.Size(m)
}
func (m *GetCompaniesRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_GetCompaniesRequest.DiscardUnknown(m)
}

var xxx_messageInfo_GetCompaniesRequest proto.InternalMessageInfo

func (m *GetCompaniesRequest) GetPageToken() string {
	if m != nil {
		return m.PageToken
	}
	return ""
}

func (m *GetCompaniesRequest) GetPageSize() int32 {
	if m != nil {
		return m.PageSize
	}
	return 0
}

func (m *GetCompaniesRequest) GetFieldMask() *field_mask.FieldMask {
	if m != nil {
		return m.FieldMask
	}
	return nil
}

type UpdateCompanyRequest struct {
	Id                   string                `protobuf:"bytes,1,opt,name=id" json:"id,omitempty"`
	UpdateMask           *field_mask.FieldMask `protobuf:"bytes,2,opt,name=update_mask,json=updateMask" json:"update_mask,omitempty"`
	XXX_NoUnkeyedLiteral struct{}              `json:"-"`
	XXX_unrecognized     []byte                `json:"-"`
	XXX_sizecache        int32                 `json:"-"`
}

func (m *UpdateCompanyRequest) Reset()         { *m = UpdateCompanyRequest{} }
func (m *UpdateCompanyRequest) String() string { return proto.CompactTextString(m) }
func (*UpdateCompanyRequest) ProtoMessage()    {}
func (*UpdateCompanyRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_companies_d8af54158e297cb9, []int{4}
}
func (m *UpdateCompanyRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_UpdateCompanyRequest.Unmarshal(m, b)
}
func (m *UpdateCompanyRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_UpdateCompanyRequest.Marshal(b, m, deterministic)
}
func (dst *UpdateCompanyRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_UpdateCompanyRequest.Merge(dst, src)
}
func (m *UpdateCompanyRequest) XXX_Size() int {
	return xxx_messageInfo_UpdateCompanyRequest.Size(m)
}
func (m *UpdateCompanyRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_UpdateCompanyRequest.DiscardUnknown(m)
}

var xxx_messageInfo_UpdateCompanyRequest proto.InternalMessageInfo

func (m *UpdateCompanyRequest) GetId() string {
	if m != nil {
		return m.Id
	}
	return ""
}

func (m *UpdateCompanyRequest) GetUpdateMask() *field_mask.FieldMask {
	if m != nil {
		return m.UpdateMask
	}
	return nil
}

type DeleteCompanyRequest struct {
	Id                   string   `protobuf:"bytes,1,opt,name=id" json:"id,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *DeleteCompanyRequest) Reset()         { *m = DeleteCompanyRequest{} }
func (m *DeleteCompanyRequest) String() string { return proto.CompactTextString(m) }
func (*DeleteCompanyRequest) ProtoMessage()    {}
func (*DeleteCompanyRequest) Descriptor() ([]byte, []int) {
	return fileDescriptor_companies_d8af54158e297cb9, []int{5}
}
func (m *DeleteCompanyRequest) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_DeleteCompanyRequest.Unmarshal(m, b)
}
func (m *DeleteCompanyRequest) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_DeleteCompanyRequest.Marshal(b, m, deterministic)
}
func (dst *DeleteCompanyRequest) XXX_Merge(src proto.Message) {
	xxx_messageInfo_DeleteCompanyRequest.Merge(dst, src)
}
func (m *DeleteCompanyRequest) XXX_Size() int {
	return xxx_messageInfo_DeleteCompanyRequest.Size(m)
}
func (m *DeleteCompanyRequest) XXX_DiscardUnknown() {
	xxx_messageInfo_DeleteCompanyRequest.DiscardUnknown(m)
}

var xxx_messageInfo_DeleteCompanyRequest proto.InternalMessageInfo

func (m *DeleteCompanyRequest) GetId() string {
	if m != nil {
		return m.Id
	}
	return ""
}

type CompanyResponse struct {
	Id                   string   `protobuf:"bytes,1,opt,name=id" json:"id,omitempty"`
	Name                 string   `protobuf:"bytes,2,opt,name=name" json:"name,omitempty"`
	Version              int32    `protobuf:"varint,3,opt,name=version" json:"version,omitempty"`
	XXX_NoUnkeyedLiteral struct{} `json:"-"`
	XXX_unrecognized     []byte   `json:"-"`
	XXX_sizecache        int32    `json:"-"`
}

func (m *CompanyResponse) Reset()         { *m = CompanyResponse{} }
func (m *CompanyResponse) String() string { return proto.CompactTextString(m) }
func (*CompanyResponse) ProtoMessage()    {}
func (*CompanyResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_companies_d8af54158e297cb9, []int{6}
}
func (m *CompanyResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_CompanyResponse.Unmarshal(m, b)
}
func (m *CompanyResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_CompanyResponse.Marshal(b, m, deterministic)
}
func (dst *CompanyResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_CompanyResponse.Merge(dst, src)
}
func (m *CompanyResponse) XXX_Size() int {
	return xxx_messageInfo_CompanyResponse.Size(m)
}
func (m *CompanyResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_CompanyResponse.DiscardUnknown(m)
}

var xxx_messageInfo_CompanyResponse proto.InternalMessageInfo

func (m *CompanyResponse) GetId() string {
	if m != nil {
		return m.Id
	}
	return ""
}

func (m *CompanyResponse) GetName() string {
	if m != nil {
		return m.Name
	}
	return ""
}

func (m *CompanyResponse) GetVersion() int32 {
	if m != nil {
		return m.Version
	}
	return 0
}

type ListCompaniesResponse struct {
	Companies            []*CompanyResponse `protobuf:"bytes,1,rep,name=companies" json:"companies,omitempty"`
	NextPageToken        string             `protobuf:"bytes,2,opt,name=next_page_token,json=nextPageToken" json:"next_page_token,omitempty"`
	Count                string             `protobuf:"bytes,3,opt,name=count" json:"count,omitempty"`
	XXX_NoUnkeyedLiteral struct{}           `json:"-"`
	XXX_unrecognized     []byte             `json:"-"`
	XXX_sizecache        int32              `json:"-"`
}

func (m *ListCompaniesResponse) Reset()         { *m = ListCompaniesResponse{} }
func (m *ListCompaniesResponse) String() string { return proto.CompactTextString(m) }
func (*ListCompaniesResponse) ProtoMessage()    {}
func (*ListCompaniesResponse) Descriptor() ([]byte, []int) {
	return fileDescriptor_companies_d8af54158e297cb9, []int{7}
}
func (m *ListCompaniesResponse) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_ListCompaniesResponse.Unmarshal(m, b)
}
func (m *ListCompaniesResponse) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_ListCompaniesResponse.Marshal(b, m, deterministic)
}
func (dst *ListCompaniesResponse) XXX_Merge(src proto.Message) {
	xxx_messageInfo_ListCompaniesResponse.Merge(dst, src)
}
func (m *ListCompaniesResponse) XXX_Size() int {
	return xxx_messageInfo_ListCompaniesResponse.Size(m)
}
func (m *ListCompaniesResponse) XXX_DiscardUnknown() {
	xxx_messageInfo_ListCompaniesResponse.DiscardUnknown(m)
}

var xxx_messageInfo_ListCompaniesResponse proto.InternalMessageInfo

func (m *ListCompaniesResponse) GetCompanies() []*CompanyResponse {
	if m != nil {
		return m.Companies
	}
	return nil
}

func (m *ListCompaniesResponse) GetNextPageToken() string {
	if m != nil {
		return m.NextPageToken
	}
	return ""
}

func (m *ListCompaniesResponse) GetCount() string {
	if m != nil {
		return m.Count
	}
	return ""
}

func init() {
	proto.RegisterType((*CreateCompanyRequest)(nil), "contactsapi.company.CreateCompanyRequest")
	proto.RegisterType((*GetCompanyRequest)(nil), "contactsapi.company.GetCompanyRequest")
	proto.RegisterType((*ListCompaniesRequest)(nil), "contactsapi.company.ListCompaniesRequest")
	proto.RegisterType((*GetCompaniesRequest)(nil), "contactsapi.company.GetCompaniesRequest")
	proto.RegisterType((*UpdateCompanyRequest)(nil), "contactsapi.company.UpdateCompanyRequest")
	proto.RegisterType((*DeleteCompanyRequest)(nil), "contactsapi.company.DeleteCompanyRequest")
	proto.RegisterType((*CompanyResponse)(nil), "contactsapi.company.CompanyResponse")
	proto.RegisterType((*ListCompaniesResponse)(nil), "contactsapi.company.ListCompaniesResponse")
}

// Reference imports to suppress errors if they are not otherwise used.
var _ context.Context
var _ grpc.ClientConn

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion4

// CompanyServiceClient is the client API for CompanyService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://godoc.org/google.golang.org/grpc#ClientConn.NewStream.
type CompanyServiceClient interface {
	CreateCompany(ctx context.Context, in *CreateCompanyRequest, opts ...grpc.CallOption) (*CompanyResponse, error)
	GetCompany(ctx context.Context, in *GetCompanyRequest, opts ...grpc.CallOption) (*CompanyResponse, error)
	ListCompanies(ctx context.Context, in *ListCompaniesRequest, opts ...grpc.CallOption) (*ListCompaniesResponse, error)
	UpdateCompany(ctx context.Context, in *UpdateCompanyRequest, opts ...grpc.CallOption) (*CompanyResponse, error)
	DeleteCompany(ctx context.Context, in *DeleteCompanyRequest, opts ...grpc.CallOption) (*empty.Empty, error)
}

type companyServiceClient struct {
	cc *grpc.ClientConn
}

func NewCompanyServiceClient(cc *grpc.ClientConn) CompanyServiceClient {
	return &companyServiceClient{cc}
}

func (c *companyServiceClient) CreateCompany(ctx context.Context, in *CreateCompanyRequest, opts ...grpc.CallOption) (*CompanyResponse, error) {
	out := new(CompanyResponse)
	err := c.cc.Invoke(ctx, "/contactsapi.company.CompanyService/CreateCompany", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *companyServiceClient) GetCompany(ctx context.Context, in *GetCompanyRequest, opts ...grpc.CallOption) (*CompanyResponse, error) {
	out := new(CompanyResponse)
	err := c.cc.Invoke(ctx, "/contactsapi.company.CompanyService/GetCompany", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *companyServiceClient) ListCompanies(ctx context.Context, in *ListCompaniesRequest, opts ...grpc.CallOption) (*ListCompaniesResponse, error) {
	out := new(ListCompaniesResponse)
	err := c.cc.Invoke(ctx, "/contactsapi.company.CompanyService/ListCompanies", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *companyServiceClient) UpdateCompany(ctx context.Context, in *UpdateCompanyRequest, opts ...grpc.CallOption) (*CompanyResponse, error) {
	out := new(CompanyResponse)
	err := c.cc.Invoke(ctx, "/contactsapi.company.CompanyService/UpdateCompany", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *companyServiceClient) DeleteCompany(ctx context.Context, in *DeleteCompanyRequest, opts ...grpc.CallOption) (*empty.Empty, error) {
	out := new(empty.Empty)
	err := c.cc.Invoke(ctx, "/contactsapi.company.CompanyService/DeleteCompany", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// CompanyServiceServer is the server API for CompanyService service.
type CompanyServiceServer interface {
	CreateCompany(context.Context, *CreateCompanyRequest) (*CompanyResponse, error)
	GetCompany(context.Context, *GetCompanyRequest) (*CompanyResponse, error)
	ListCompanies(context.Context, *ListCompaniesRequest) (*ListCompaniesResponse, error)
	UpdateCompany(context.Context, *UpdateCompanyRequest) (*CompanyResponse, error)
	DeleteCompany(context.Context, *DeleteCompanyRequest) (*empty.Empty, error)
}

func RegisterCompanyServiceServer(s *grpc.Server, srv CompanyServiceServer) {
	s.RegisterService(&_CompanyService_serviceDesc, srv)
}

func _CompanyService_CreateCompany_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(CreateCompanyRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(CompanyServiceServer).CreateCompany(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/contactsapi.company.CompanyService/CreateCompany",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(CompanyServiceServer).CreateCompany(ctx, req.(*CreateCompanyRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _CompanyService_GetCompany_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetCompanyRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(CompanyServiceServer).GetCompany(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/contactsapi.company.CompanyService/GetCompany",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(CompanyServiceServer).GetCompany(ctx, req.(*GetCompanyRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _CompanyService_ListCompanies_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(ListCompaniesRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(CompanyServiceServer).ListCompanies(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/contactsapi.company.CompanyService/ListCompanies",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(CompanyServiceServer).ListCompanies(ctx, req.(*ListCompaniesRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _CompanyService_UpdateCompany_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(UpdateCompanyRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(CompanyServiceServer).UpdateCompany(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/contactsapi.company.CompanyService/UpdateCompany",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(CompanyServiceServer).UpdateCompany(ctx, req.(*UpdateCompanyRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _CompanyService_DeleteCompany_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(DeleteCompanyRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(CompanyServiceServer).DeleteCompany(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/contactsapi.company.CompanyService/DeleteCompany",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(CompanyServiceServer).DeleteCompany(ctx, req.(*DeleteCompanyRequest))
	}
	return interceptor(ctx, in, info, handler)
}

var _CompanyService_serviceDesc = grpc.ServiceDesc{
	ServiceName: "contactsapi.company.CompanyService",
	HandlerType: (*CompanyServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "CreateCompany",
			Handler:    _CompanyService_CreateCompany_Handler,
		},
		{
			MethodName: "GetCompany",
			Handler:    _CompanyService_GetCompany_Handler,
		},
		{
			MethodName: "ListCompanies",
			Handler:    _CompanyService_ListCompanies_Handler,
		},
		{
			MethodName: "UpdateCompany",
			Handler:    _CompanyService_UpdateCompany_Handler,
		},
		{
			MethodName: "DeleteCompany",
			Handler:    _CompanyService_DeleteCompany_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "src/main/proto/contactsapi/company/companies.proto",
}

func init() {
	proto.RegisterFile("src/main/proto/contactsapi/company/companies.proto", fileDescriptor_companies_d8af54158e297cb9)
}

var fileDescriptor_companies_d8af54158e297cb9 = []byte{
	// 553 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0xac, 0x94, 0x4f, 0x6f, 0xd3, 0x30,
	0x18, 0xc6, 0x95, 0x6c, 0x05, 0xfa, 0x56, 0x59, 0x85, 0x97, 0xa1, 0x2a, 0x03, 0xa9, 0x8a, 0x50,
	0x55, 0x7a, 0x48, 0x44, 0x39, 0x01, 0xb7, 0x8d, 0x3f, 0x17, 0x10, 0x23, 0x83, 0x2b, 0x55, 0x96,
	0xbe, 0xad, 0xac, 0xb6, 0x76, 0xa8, 0xdd, 0x8a, 0x15, 0x76, 0xe1, 0xcc, 0x8d, 0x13, 0x9f, 0x8b,
	0xaf, 0xc0, 0x17, 0xe0, 0x1b, 0xa0, 0x38, 0x4e, 0xdb, 0xa4, 0xa9, 0x28, 0x1a, 0xa7, 0xc4, 0xf6,
	0xe3, 0xf7, 0xf7, 0x38, 0xaf, 0x9f, 0x40, 0x57, 0x4c, 0x23, 0x7f, 0x12, 0x52, 0xe6, 0xc7, 0x53,
	0x2e, 0xb9, 0x1f, 0x71, 0x26, 0xc3, 0x48, 0x8a, 0x30, 0xa6, 0x7e, 0xc4, 0x27, 0x71, 0xc8, 0x2e,
	0xf5, 0x93, 0xa2, 0xf0, 0x94, 0x86, 0x1c, 0xae, 0x89, 0x3c, 0x2d, 0x72, 0xee, 0x0e, 0x39, 0x1f,
	0x8e, 0xd1, 0x4f, 0x36, 0x86, 0x8c, 0x71, 0x19, 0x4a, 0xca, 0x99, 0xde, 0xe2, 0x1c, 0xeb, 0x55,
	0x35, 0xba, 0x98, 0x0d, 0x7c, 0x9c, 0xc4, 0xf2, 0x52, 0x2f, 0x36, 0x8b, 0x8b, 0x03, 0x8a, 0xe3,
	0x7e, 0x6f, 0x12, 0x8a, 0x51, 0xaa, 0x70, 0x11, 0xec, 0xd3, 0x29, 0x86, 0x12, 0x4f, 0x53, 0x5a,
	0x80, 0x1f, 0x67, 0x28, 0x24, 0x21, 0xb0, 0xcf, 0xc2, 0x09, 0x36, 0x8c, 0xa6, 0xd1, 0xae, 0x06,
	0xea, 0x9d, 0x3c, 0x06, 0x58, 0xed, 0x6f, 0x98, 0x4d, 0xa3, 0x5d, 0xeb, 0x3a, 0x5e, 0x8a, 0xf0,
	0x32, 0x84, 0xf7, 0x22, 0x91, 0xbc, 0x0e, 0xc5, 0x28, 0xa8, 0x0e, 0xb2, 0x57, 0xf7, 0x03, 0xdc,
	0x7e, 0x89, 0xb2, 0xc0, 0x38, 0x00, 0x93, 0xf6, 0x35, 0xc1, 0xa4, 0xfd, 0xeb, 0xd4, 0x7f, 0x0b,
	0xf6, 0x2b, 0x2a, 0x34, 0x80, 0xa2, 0xc8, 0x10, 0xd7, 0x28, 0xf9, 0xcd, 0x80, 0xc3, 0xa5, 0xe7,
	0xb5, 0x92, 0xf7, 0x00, 0xe2, 0x70, 0x88, 0x3d, 0xc9, 0x47, 0xc8, 0xb4, 0xfb, 0x6a, 0x32, 0xf3,
	0x2e, 0x99, 0x20, 0xc7, 0xa0, 0x06, 0x3d, 0x41, 0x17, 0xa8, 0x80, 0x95, 0xe0, 0x56, 0x32, 0x71,
	0x4e, 0x17, 0xc5, 0x2f, 0xb8, 0xf7, 0x2f, 0x76, 0x22, 0xb0, 0xdf, 0xc7, 0xfd, 0xcd, 0x46, 0x15,
	0x3f, 0xe2, 0x53, 0xa8, 0xcd, 0x94, 0x6e, 0xd7, 0x23, 0x43, 0x2a, 0x57, 0x90, 0x16, 0xd8, 0xcf,
	0x70, 0x8c, 0x7f, 0x83, 0xb8, 0x6f, 0xa0, 0xbe, 0x54, 0x88, 0x98, 0x33, 0x81, 0x1b, 0x3e, 0xb2,
	0x0b, 0x64, 0xae, 0x5d, 0xa0, 0x06, 0xdc, 0x9c, 0xe3, 0x54, 0x50, 0xce, 0xd4, 0xd9, 0x2b, 0x41,
	0x36, 0x74, 0x7f, 0x18, 0x70, 0x54, 0x68, 0xa0, 0xae, 0x7b, 0x02, 0xd5, 0x65, 0x4a, 0x1a, 0x46,
	0x73, 0xaf, 0x5d, 0xeb, 0xde, 0xf7, 0x4a, 0x62, 0xe2, 0x15, 0x0c, 0x05, 0xab, 0x6d, 0xa4, 0x05,
	0x75, 0x86, 0x9f, 0x64, 0x6f, 0xad, 0x6f, 0xa9, 0x2d, 0x2b, 0x99, 0x3e, 0x5b, 0xf6, 0xce, 0x86,
	0x4a, 0xc4, 0x67, 0x4c, 0x2a, 0x77, 0xd5, 0x20, 0x1d, 0x74, 0x7f, 0xef, 0xc3, 0x81, 0x2e, 0x7e,
	0x8e, 0xd3, 0x39, 0x8d, 0x90, 0x2c, 0xc0, 0xca, 0xa5, 0x86, 0x3c, 0x28, 0xb7, 0x54, 0x92, 0x2c,
	0x67, 0x27, 0xf7, 0x6e, 0xe3, 0xeb, 0xcf, 0x5f, 0xdf, 0x4d, 0xe2, 0x5a, 0xfe, 0xfc, 0xe1, 0xea,
	0x37, 0xf1, 0xc4, 0xe8, 0x90, 0x39, 0xc0, 0x2a, 0x4a, 0xa4, 0x55, 0x5a, 0x6d, 0x23, 0x6b, 0x3b,
	0x52, 0x1d, 0x45, 0xb5, 0x09, 0xc9, 0x51, 0xfd, 0xcf, 0xb4, 0x7f, 0x45, 0xae, 0xc0, 0xca, 0x75,
	0x68, 0xcb, 0x99, 0xcb, 0x62, 0xe8, 0x74, 0x76, 0x91, 0x6a, 0x0f, 0x47, 0xca, 0x43, 0x9d, 0xe4,
	0x4f, 0x4e, 0xbe, 0x80, 0x95, 0xbb, 0xff, 0x5b, 0xf0, 0x65, 0x19, 0xf9, 0x0f, 0x87, 0x67, 0x60,
	0xe5, 0x82, 0xb1, 0x85, 0x5e, 0x16, 0x1e, 0xe7, 0xce, 0x46, 0xf8, 0x9e, 0x27, 0xbf, 0xe8, 0x8c,
	0xd7, 0x29, 0xe1, 0x9d, 0x98, 0x67, 0xc6, 0xc5, 0x0d, 0xa5, 0x7f, 0xf4, 0x27, 0x00, 0x00, 0xff,
	0xff, 0xe7, 0x11, 0x07, 0xa5, 0x49, 0x06, 0x00, 0x00,
}