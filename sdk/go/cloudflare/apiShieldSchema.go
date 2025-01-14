// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-cloudflare/sdk/v5/go/cloudflare/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a resource to manage a schema in API Shield Schema Validation 2.0.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"os"
//
//	"github.com/pulumi/pulumi-cloudflare/sdk/v5/go/cloudflare"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func readFileOrPanic(path string) pulumi.StringPtrInput {
//		data, err := os.ReadFile(path)
//		if err != nil {
//			panic(err.Error())
//		}
//		return pulumi.String(string(data))
//	}
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cloudflare.NewApiShieldSchema(ctx, "petstoreSchema", &cloudflare.ApiShieldSchemaArgs{
//				ZoneId:            pulumi.String("0da42c8d2132a9ddaf714f9e7c920711"),
//				Name:              pulumi.String("myschema"),
//				Kind:              pulumi.String("openapi_v3"),
//				ValidationEnabled: pulumi.Bool(true),
//				Source:            readFileOrPanic("./schemas/petstore.json"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type ApiShieldSchema struct {
	pulumi.CustomResourceState

	// Kind of schema. Defaults to `openapiV3`. **Modifying this attribute will force creation of a new resource.**
	Kind pulumi.StringPtrOutput `pulumi:"kind"`
	// Name of the schema. **Modifying this attribute will force creation of a new resource.**
	Name pulumi.StringOutput `pulumi:"name"`
	// Schema file bytes. **Modifying this attribute will force creation of a new resource.**
	Source pulumi.StringOutput `pulumi:"source"`
	// Flag whether schema is enabled for validation.
	ValidationEnabled pulumi.BoolPtrOutput `pulumi:"validationEnabled"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewApiShieldSchema registers a new resource with the given unique name, arguments, and options.
func NewApiShieldSchema(ctx *pulumi.Context,
	name string, args *ApiShieldSchemaArgs, opts ...pulumi.ResourceOption) (*ApiShieldSchema, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	if args.Source == nil {
		return nil, errors.New("invalid value for required argument 'Source'")
	}
	if args.ZoneId == nil {
		return nil, errors.New("invalid value for required argument 'ZoneId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ApiShieldSchema
	err := ctx.RegisterResource("cloudflare:index/apiShieldSchema:ApiShieldSchema", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetApiShieldSchema gets an existing ApiShieldSchema resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetApiShieldSchema(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ApiShieldSchemaState, opts ...pulumi.ResourceOption) (*ApiShieldSchema, error) {
	var resource ApiShieldSchema
	err := ctx.ReadResource("cloudflare:index/apiShieldSchema:ApiShieldSchema", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ApiShieldSchema resources.
type apiShieldSchemaState struct {
	// Kind of schema. Defaults to `openapiV3`. **Modifying this attribute will force creation of a new resource.**
	Kind *string `pulumi:"kind"`
	// Name of the schema. **Modifying this attribute will force creation of a new resource.**
	Name *string `pulumi:"name"`
	// Schema file bytes. **Modifying this attribute will force creation of a new resource.**
	Source *string `pulumi:"source"`
	// Flag whether schema is enabled for validation.
	ValidationEnabled *bool `pulumi:"validationEnabled"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId *string `pulumi:"zoneId"`
}

type ApiShieldSchemaState struct {
	// Kind of schema. Defaults to `openapiV3`. **Modifying this attribute will force creation of a new resource.**
	Kind pulumi.StringPtrInput
	// Name of the schema. **Modifying this attribute will force creation of a new resource.**
	Name pulumi.StringPtrInput
	// Schema file bytes. **Modifying this attribute will force creation of a new resource.**
	Source pulumi.StringPtrInput
	// Flag whether schema is enabled for validation.
	ValidationEnabled pulumi.BoolPtrInput
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringPtrInput
}

func (ApiShieldSchemaState) ElementType() reflect.Type {
	return reflect.TypeOf((*apiShieldSchemaState)(nil)).Elem()
}

type apiShieldSchemaArgs struct {
	// Kind of schema. Defaults to `openapiV3`. **Modifying this attribute will force creation of a new resource.**
	Kind *string `pulumi:"kind"`
	// Name of the schema. **Modifying this attribute will force creation of a new resource.**
	Name string `pulumi:"name"`
	// Schema file bytes. **Modifying this attribute will force creation of a new resource.**
	Source string `pulumi:"source"`
	// Flag whether schema is enabled for validation.
	ValidationEnabled *bool `pulumi:"validationEnabled"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a ApiShieldSchema resource.
type ApiShieldSchemaArgs struct {
	// Kind of schema. Defaults to `openapiV3`. **Modifying this attribute will force creation of a new resource.**
	Kind pulumi.StringPtrInput
	// Name of the schema. **Modifying this attribute will force creation of a new resource.**
	Name pulumi.StringInput
	// Schema file bytes. **Modifying this attribute will force creation of a new resource.**
	Source pulumi.StringInput
	// Flag whether schema is enabled for validation.
	ValidationEnabled pulumi.BoolPtrInput
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringInput
}

func (ApiShieldSchemaArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*apiShieldSchemaArgs)(nil)).Elem()
}

type ApiShieldSchemaInput interface {
	pulumi.Input

	ToApiShieldSchemaOutput() ApiShieldSchemaOutput
	ToApiShieldSchemaOutputWithContext(ctx context.Context) ApiShieldSchemaOutput
}

func (*ApiShieldSchema) ElementType() reflect.Type {
	return reflect.TypeOf((**ApiShieldSchema)(nil)).Elem()
}

func (i *ApiShieldSchema) ToApiShieldSchemaOutput() ApiShieldSchemaOutput {
	return i.ToApiShieldSchemaOutputWithContext(context.Background())
}

func (i *ApiShieldSchema) ToApiShieldSchemaOutputWithContext(ctx context.Context) ApiShieldSchemaOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApiShieldSchemaOutput)
}

// ApiShieldSchemaArrayInput is an input type that accepts ApiShieldSchemaArray and ApiShieldSchemaArrayOutput values.
// You can construct a concrete instance of `ApiShieldSchemaArrayInput` via:
//
//	ApiShieldSchemaArray{ ApiShieldSchemaArgs{...} }
type ApiShieldSchemaArrayInput interface {
	pulumi.Input

	ToApiShieldSchemaArrayOutput() ApiShieldSchemaArrayOutput
	ToApiShieldSchemaArrayOutputWithContext(context.Context) ApiShieldSchemaArrayOutput
}

type ApiShieldSchemaArray []ApiShieldSchemaInput

func (ApiShieldSchemaArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ApiShieldSchema)(nil)).Elem()
}

func (i ApiShieldSchemaArray) ToApiShieldSchemaArrayOutput() ApiShieldSchemaArrayOutput {
	return i.ToApiShieldSchemaArrayOutputWithContext(context.Background())
}

func (i ApiShieldSchemaArray) ToApiShieldSchemaArrayOutputWithContext(ctx context.Context) ApiShieldSchemaArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApiShieldSchemaArrayOutput)
}

// ApiShieldSchemaMapInput is an input type that accepts ApiShieldSchemaMap and ApiShieldSchemaMapOutput values.
// You can construct a concrete instance of `ApiShieldSchemaMapInput` via:
//
//	ApiShieldSchemaMap{ "key": ApiShieldSchemaArgs{...} }
type ApiShieldSchemaMapInput interface {
	pulumi.Input

	ToApiShieldSchemaMapOutput() ApiShieldSchemaMapOutput
	ToApiShieldSchemaMapOutputWithContext(context.Context) ApiShieldSchemaMapOutput
}

type ApiShieldSchemaMap map[string]ApiShieldSchemaInput

func (ApiShieldSchemaMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ApiShieldSchema)(nil)).Elem()
}

func (i ApiShieldSchemaMap) ToApiShieldSchemaMapOutput() ApiShieldSchemaMapOutput {
	return i.ToApiShieldSchemaMapOutputWithContext(context.Background())
}

func (i ApiShieldSchemaMap) ToApiShieldSchemaMapOutputWithContext(ctx context.Context) ApiShieldSchemaMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApiShieldSchemaMapOutput)
}

type ApiShieldSchemaOutput struct{ *pulumi.OutputState }

func (ApiShieldSchemaOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ApiShieldSchema)(nil)).Elem()
}

func (o ApiShieldSchemaOutput) ToApiShieldSchemaOutput() ApiShieldSchemaOutput {
	return o
}

func (o ApiShieldSchemaOutput) ToApiShieldSchemaOutputWithContext(ctx context.Context) ApiShieldSchemaOutput {
	return o
}

// Kind of schema. Defaults to `openapiV3`. **Modifying this attribute will force creation of a new resource.**
func (o ApiShieldSchemaOutput) Kind() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ApiShieldSchema) pulumi.StringPtrOutput { return v.Kind }).(pulumi.StringPtrOutput)
}

// Name of the schema. **Modifying this attribute will force creation of a new resource.**
func (o ApiShieldSchemaOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ApiShieldSchema) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Schema file bytes. **Modifying this attribute will force creation of a new resource.**
func (o ApiShieldSchemaOutput) Source() pulumi.StringOutput {
	return o.ApplyT(func(v *ApiShieldSchema) pulumi.StringOutput { return v.Source }).(pulumi.StringOutput)
}

// Flag whether schema is enabled for validation.
func (o ApiShieldSchemaOutput) ValidationEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ApiShieldSchema) pulumi.BoolPtrOutput { return v.ValidationEnabled }).(pulumi.BoolPtrOutput)
}

// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
func (o ApiShieldSchemaOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *ApiShieldSchema) pulumi.StringOutput { return v.ZoneId }).(pulumi.StringOutput)
}

type ApiShieldSchemaArrayOutput struct{ *pulumi.OutputState }

func (ApiShieldSchemaArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ApiShieldSchema)(nil)).Elem()
}

func (o ApiShieldSchemaArrayOutput) ToApiShieldSchemaArrayOutput() ApiShieldSchemaArrayOutput {
	return o
}

func (o ApiShieldSchemaArrayOutput) ToApiShieldSchemaArrayOutputWithContext(ctx context.Context) ApiShieldSchemaArrayOutput {
	return o
}

func (o ApiShieldSchemaArrayOutput) Index(i pulumi.IntInput) ApiShieldSchemaOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ApiShieldSchema {
		return vs[0].([]*ApiShieldSchema)[vs[1].(int)]
	}).(ApiShieldSchemaOutput)
}

type ApiShieldSchemaMapOutput struct{ *pulumi.OutputState }

func (ApiShieldSchemaMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ApiShieldSchema)(nil)).Elem()
}

func (o ApiShieldSchemaMapOutput) ToApiShieldSchemaMapOutput() ApiShieldSchemaMapOutput {
	return o
}

func (o ApiShieldSchemaMapOutput) ToApiShieldSchemaMapOutputWithContext(ctx context.Context) ApiShieldSchemaMapOutput {
	return o
}

func (o ApiShieldSchemaMapOutput) MapIndex(k pulumi.StringInput) ApiShieldSchemaOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ApiShieldSchema {
		return vs[0].(map[string]*ApiShieldSchema)[vs[1].(string)]
	}).(ApiShieldSchemaOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ApiShieldSchemaInput)(nil)).Elem(), &ApiShieldSchema{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApiShieldSchemaArrayInput)(nil)).Elem(), ApiShieldSchemaArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApiShieldSchemaMapInput)(nil)).Elem(), ApiShieldSchemaMap{})
	pulumi.RegisterOutputType(ApiShieldSchemaOutput{})
	pulumi.RegisterOutputType(ApiShieldSchemaArrayOutput{})
	pulumi.RegisterOutputType(ApiShieldSchemaMapOutput{})
}
