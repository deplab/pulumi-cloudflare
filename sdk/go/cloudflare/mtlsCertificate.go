// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Cloudflare mTLS certificate resource. These certificates may be used with mTLS enabled Cloudflare services.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-cloudflare/sdk/v4/go/cloudflare"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cloudflare.NewMtlsCertificate(ctx, "example", &cloudflare.MtlsCertificateArgs{
//				AccountId:    pulumi.String("f037e56e89293a057740de681ac9abbe"),
//				Ca:           pulumi.Bool(true),
//				Certificates: pulumi.String("-----BEGIN CERTIFICATE-----\nMIIDmDCCAoCgAwIBAgIUKTOAZNj...i4JhqeoTewsxndhDDE\n-----END CERTIFICATE-----\n"),
//				Name:         pulumi.String("example"),
//				PrivateKey:   pulumi.String("-----BEGIN PRIVATE KEY-----\nMIIEvQIBADANBgkqhkiG9w0BAQE...1IS3EnQRrz6WMYA=\n-----END PRIVATE KEY-----\n"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// ```sh
//
//	$ pulumi import cloudflare:index/mtlsCertificate:MtlsCertificate example <account_id>/<mtls_certificate_id>
//
// ```
type MtlsCertificate struct {
	pulumi.CustomResourceState

	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// Whether this is a CA or leaf certificate. **Modifying this attribute will force creation of a new resource.**
	Ca pulumi.BoolOutput `pulumi:"ca"`
	// Certificate you intend to use with mTLS-enabled services. **Modifying this attribute will force creation of a new resource.**
	Certificates pulumi.StringOutput `pulumi:"certificates"`
	// **Modifying this attribute will force creation of a new resource.**
	ExpiresOn pulumi.StringOutput `pulumi:"expiresOn"`
	// **Modifying this attribute will force creation of a new resource.**
	Issuer pulumi.StringOutput `pulumi:"issuer"`
	// Optional unique name for the certificate. **Modifying this attribute will force creation of a new resource.**
	Name pulumi.StringPtrOutput `pulumi:"name"`
	// The certificate's private key. **Modifying this attribute will force creation of a new resource.**
	PrivateKey pulumi.StringPtrOutput `pulumi:"privateKey"`
	// **Modifying this attribute will force creation of a new resource.**
	SerialNumber pulumi.StringOutput `pulumi:"serialNumber"`
	// **Modifying this attribute will force creation of a new resource.**
	Signature pulumi.StringOutput `pulumi:"signature"`
	// **Modifying this attribute will force creation of a new resource.**
	UploadedOn pulumi.StringOutput `pulumi:"uploadedOn"`
}

// NewMtlsCertificate registers a new resource with the given unique name, arguments, and options.
func NewMtlsCertificate(ctx *pulumi.Context,
	name string, args *MtlsCertificateArgs, opts ...pulumi.ResourceOption) (*MtlsCertificate, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.Ca == nil {
		return nil, errors.New("invalid value for required argument 'Ca'")
	}
	if args.Certificates == nil {
		return nil, errors.New("invalid value for required argument 'Certificates'")
	}
	var resource MtlsCertificate
	err := ctx.RegisterResource("cloudflare:index/mtlsCertificate:MtlsCertificate", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMtlsCertificate gets an existing MtlsCertificate resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMtlsCertificate(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MtlsCertificateState, opts ...pulumi.ResourceOption) (*MtlsCertificate, error) {
	var resource MtlsCertificate
	err := ctx.ReadResource("cloudflare:index/mtlsCertificate:MtlsCertificate", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MtlsCertificate resources.
type mtlsCertificateState struct {
	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId *string `pulumi:"accountId"`
	// Whether this is a CA or leaf certificate. **Modifying this attribute will force creation of a new resource.**
	Ca *bool `pulumi:"ca"`
	// Certificate you intend to use with mTLS-enabled services. **Modifying this attribute will force creation of a new resource.**
	Certificates *string `pulumi:"certificates"`
	// **Modifying this attribute will force creation of a new resource.**
	ExpiresOn *string `pulumi:"expiresOn"`
	// **Modifying this attribute will force creation of a new resource.**
	Issuer *string `pulumi:"issuer"`
	// Optional unique name for the certificate. **Modifying this attribute will force creation of a new resource.**
	Name *string `pulumi:"name"`
	// The certificate's private key. **Modifying this attribute will force creation of a new resource.**
	PrivateKey *string `pulumi:"privateKey"`
	// **Modifying this attribute will force creation of a new resource.**
	SerialNumber *string `pulumi:"serialNumber"`
	// **Modifying this attribute will force creation of a new resource.**
	Signature *string `pulumi:"signature"`
	// **Modifying this attribute will force creation of a new resource.**
	UploadedOn *string `pulumi:"uploadedOn"`
}

type MtlsCertificateState struct {
	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId pulumi.StringPtrInput
	// Whether this is a CA or leaf certificate. **Modifying this attribute will force creation of a new resource.**
	Ca pulumi.BoolPtrInput
	// Certificate you intend to use with mTLS-enabled services. **Modifying this attribute will force creation of a new resource.**
	Certificates pulumi.StringPtrInput
	// **Modifying this attribute will force creation of a new resource.**
	ExpiresOn pulumi.StringPtrInput
	// **Modifying this attribute will force creation of a new resource.**
	Issuer pulumi.StringPtrInput
	// Optional unique name for the certificate. **Modifying this attribute will force creation of a new resource.**
	Name pulumi.StringPtrInput
	// The certificate's private key. **Modifying this attribute will force creation of a new resource.**
	PrivateKey pulumi.StringPtrInput
	// **Modifying this attribute will force creation of a new resource.**
	SerialNumber pulumi.StringPtrInput
	// **Modifying this attribute will force creation of a new resource.**
	Signature pulumi.StringPtrInput
	// **Modifying this attribute will force creation of a new resource.**
	UploadedOn pulumi.StringPtrInput
}

func (MtlsCertificateState) ElementType() reflect.Type {
	return reflect.TypeOf((*mtlsCertificateState)(nil)).Elem()
}

type mtlsCertificateArgs struct {
	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId string `pulumi:"accountId"`
	// Whether this is a CA or leaf certificate. **Modifying this attribute will force creation of a new resource.**
	Ca bool `pulumi:"ca"`
	// Certificate you intend to use with mTLS-enabled services. **Modifying this attribute will force creation of a new resource.**
	Certificates string `pulumi:"certificates"`
	// Optional unique name for the certificate. **Modifying this attribute will force creation of a new resource.**
	Name *string `pulumi:"name"`
	// The certificate's private key. **Modifying this attribute will force creation of a new resource.**
	PrivateKey *string `pulumi:"privateKey"`
}

// The set of arguments for constructing a MtlsCertificate resource.
type MtlsCertificateArgs struct {
	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId pulumi.StringInput
	// Whether this is a CA or leaf certificate. **Modifying this attribute will force creation of a new resource.**
	Ca pulumi.BoolInput
	// Certificate you intend to use with mTLS-enabled services. **Modifying this attribute will force creation of a new resource.**
	Certificates pulumi.StringInput
	// Optional unique name for the certificate. **Modifying this attribute will force creation of a new resource.**
	Name pulumi.StringPtrInput
	// The certificate's private key. **Modifying this attribute will force creation of a new resource.**
	PrivateKey pulumi.StringPtrInput
}

func (MtlsCertificateArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*mtlsCertificateArgs)(nil)).Elem()
}

type MtlsCertificateInput interface {
	pulumi.Input

	ToMtlsCertificateOutput() MtlsCertificateOutput
	ToMtlsCertificateOutputWithContext(ctx context.Context) MtlsCertificateOutput
}

func (*MtlsCertificate) ElementType() reflect.Type {
	return reflect.TypeOf((**MtlsCertificate)(nil)).Elem()
}

func (i *MtlsCertificate) ToMtlsCertificateOutput() MtlsCertificateOutput {
	return i.ToMtlsCertificateOutputWithContext(context.Background())
}

func (i *MtlsCertificate) ToMtlsCertificateOutputWithContext(ctx context.Context) MtlsCertificateOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MtlsCertificateOutput)
}

// MtlsCertificateArrayInput is an input type that accepts MtlsCertificateArray and MtlsCertificateArrayOutput values.
// You can construct a concrete instance of `MtlsCertificateArrayInput` via:
//
//	MtlsCertificateArray{ MtlsCertificateArgs{...} }
type MtlsCertificateArrayInput interface {
	pulumi.Input

	ToMtlsCertificateArrayOutput() MtlsCertificateArrayOutput
	ToMtlsCertificateArrayOutputWithContext(context.Context) MtlsCertificateArrayOutput
}

type MtlsCertificateArray []MtlsCertificateInput

func (MtlsCertificateArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MtlsCertificate)(nil)).Elem()
}

func (i MtlsCertificateArray) ToMtlsCertificateArrayOutput() MtlsCertificateArrayOutput {
	return i.ToMtlsCertificateArrayOutputWithContext(context.Background())
}

func (i MtlsCertificateArray) ToMtlsCertificateArrayOutputWithContext(ctx context.Context) MtlsCertificateArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MtlsCertificateArrayOutput)
}

// MtlsCertificateMapInput is an input type that accepts MtlsCertificateMap and MtlsCertificateMapOutput values.
// You can construct a concrete instance of `MtlsCertificateMapInput` via:
//
//	MtlsCertificateMap{ "key": MtlsCertificateArgs{...} }
type MtlsCertificateMapInput interface {
	pulumi.Input

	ToMtlsCertificateMapOutput() MtlsCertificateMapOutput
	ToMtlsCertificateMapOutputWithContext(context.Context) MtlsCertificateMapOutput
}

type MtlsCertificateMap map[string]MtlsCertificateInput

func (MtlsCertificateMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MtlsCertificate)(nil)).Elem()
}

func (i MtlsCertificateMap) ToMtlsCertificateMapOutput() MtlsCertificateMapOutput {
	return i.ToMtlsCertificateMapOutputWithContext(context.Background())
}

func (i MtlsCertificateMap) ToMtlsCertificateMapOutputWithContext(ctx context.Context) MtlsCertificateMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MtlsCertificateMapOutput)
}

type MtlsCertificateOutput struct{ *pulumi.OutputState }

func (MtlsCertificateOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MtlsCertificate)(nil)).Elem()
}

func (o MtlsCertificateOutput) ToMtlsCertificateOutput() MtlsCertificateOutput {
	return o
}

func (o MtlsCertificateOutput) ToMtlsCertificateOutputWithContext(ctx context.Context) MtlsCertificateOutput {
	return o
}

// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
func (o MtlsCertificateOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *MtlsCertificate) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// Whether this is a CA or leaf certificate. **Modifying this attribute will force creation of a new resource.**
func (o MtlsCertificateOutput) Ca() pulumi.BoolOutput {
	return o.ApplyT(func(v *MtlsCertificate) pulumi.BoolOutput { return v.Ca }).(pulumi.BoolOutput)
}

// Certificate you intend to use with mTLS-enabled services. **Modifying this attribute will force creation of a new resource.**
func (o MtlsCertificateOutput) Certificates() pulumi.StringOutput {
	return o.ApplyT(func(v *MtlsCertificate) pulumi.StringOutput { return v.Certificates }).(pulumi.StringOutput)
}

// **Modifying this attribute will force creation of a new resource.**
func (o MtlsCertificateOutput) ExpiresOn() pulumi.StringOutput {
	return o.ApplyT(func(v *MtlsCertificate) pulumi.StringOutput { return v.ExpiresOn }).(pulumi.StringOutput)
}

// **Modifying this attribute will force creation of a new resource.**
func (o MtlsCertificateOutput) Issuer() pulumi.StringOutput {
	return o.ApplyT(func(v *MtlsCertificate) pulumi.StringOutput { return v.Issuer }).(pulumi.StringOutput)
}

// Optional unique name for the certificate. **Modifying this attribute will force creation of a new resource.**
func (o MtlsCertificateOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MtlsCertificate) pulumi.StringPtrOutput { return v.Name }).(pulumi.StringPtrOutput)
}

// The certificate's private key. **Modifying this attribute will force creation of a new resource.**
func (o MtlsCertificateOutput) PrivateKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MtlsCertificate) pulumi.StringPtrOutput { return v.PrivateKey }).(pulumi.StringPtrOutput)
}

// **Modifying this attribute will force creation of a new resource.**
func (o MtlsCertificateOutput) SerialNumber() pulumi.StringOutput {
	return o.ApplyT(func(v *MtlsCertificate) pulumi.StringOutput { return v.SerialNumber }).(pulumi.StringOutput)
}

// **Modifying this attribute will force creation of a new resource.**
func (o MtlsCertificateOutput) Signature() pulumi.StringOutput {
	return o.ApplyT(func(v *MtlsCertificate) pulumi.StringOutput { return v.Signature }).(pulumi.StringOutput)
}

// **Modifying this attribute will force creation of a new resource.**
func (o MtlsCertificateOutput) UploadedOn() pulumi.StringOutput {
	return o.ApplyT(func(v *MtlsCertificate) pulumi.StringOutput { return v.UploadedOn }).(pulumi.StringOutput)
}

type MtlsCertificateArrayOutput struct{ *pulumi.OutputState }

func (MtlsCertificateArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MtlsCertificate)(nil)).Elem()
}

func (o MtlsCertificateArrayOutput) ToMtlsCertificateArrayOutput() MtlsCertificateArrayOutput {
	return o
}

func (o MtlsCertificateArrayOutput) ToMtlsCertificateArrayOutputWithContext(ctx context.Context) MtlsCertificateArrayOutput {
	return o
}

func (o MtlsCertificateArrayOutput) Index(i pulumi.IntInput) MtlsCertificateOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MtlsCertificate {
		return vs[0].([]*MtlsCertificate)[vs[1].(int)]
	}).(MtlsCertificateOutput)
}

type MtlsCertificateMapOutput struct{ *pulumi.OutputState }

func (MtlsCertificateMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MtlsCertificate)(nil)).Elem()
}

func (o MtlsCertificateMapOutput) ToMtlsCertificateMapOutput() MtlsCertificateMapOutput {
	return o
}

func (o MtlsCertificateMapOutput) ToMtlsCertificateMapOutputWithContext(ctx context.Context) MtlsCertificateMapOutput {
	return o
}

func (o MtlsCertificateMapOutput) MapIndex(k pulumi.StringInput) MtlsCertificateOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MtlsCertificate {
		return vs[0].(map[string]*MtlsCertificate)[vs[1].(string)]
	}).(MtlsCertificateOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MtlsCertificateInput)(nil)).Elem(), &MtlsCertificate{})
	pulumi.RegisterInputType(reflect.TypeOf((*MtlsCertificateArrayInput)(nil)).Elem(), MtlsCertificateArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MtlsCertificateMapInput)(nil)).Elem(), MtlsCertificateMap{})
	pulumi.RegisterOutputType(MtlsCertificateOutput{})
	pulumi.RegisterOutputType(MtlsCertificateArrayOutput{})
	pulumi.RegisterOutputType(MtlsCertificateMapOutput{})
}
