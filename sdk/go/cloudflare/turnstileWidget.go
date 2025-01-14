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

// The [Turnstile Widget](https://developers.cloudflare.com/turnstile/) resource allows you to manage Cloudflare Turnstile Widgets.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-cloudflare/sdk/v5/go/cloudflare"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cloudflare.NewTurnstileWidget(ctx, "example", &cloudflare.TurnstileWidgetArgs{
//				AccountId:    pulumi.String("f037e56e89293a057740de681ac9abbe"),
//				BotFightMode: pulumi.Bool(false),
//				Domains: pulumi.StringArray{
//					pulumi.String("example.com"),
//				},
//				Mode:   pulumi.String("invisible"),
//				Name:   pulumi.String("example widget"),
//				Region: pulumi.String("world"),
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
//	$ pulumi import cloudflare:index/turnstileWidget:TurnstileWidget example <account_id>/<site_key>
//
// ```
type TurnstileWidget struct {
	pulumi.CustomResourceState

	// The account identifier to target for the resource.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// If bot*fight*mode is set to true, Cloudflare issues computationally expensive challenges in response to malicious bots (Enterprise only).
	BotFightMode pulumi.BoolOutput `pulumi:"botFightMode"`
	// Domains where the widget is deployed
	Domains pulumi.StringArrayOutput `pulumi:"domains"`
	// Widget Mode. Available values: `non-interactive`, `invisible`, `managed`
	Mode pulumi.StringOutput `pulumi:"mode"`
	// Human readable widget name.
	Name pulumi.StringOutput `pulumi:"name"`
	// Do not show any Cloudflare branding on the widget (Enterprise only).
	Offlabel pulumi.BoolOutput `pulumi:"offlabel"`
	// Region where this widget can be used.
	Region pulumi.StringOutput `pulumi:"region"`
	// Secret key for this widget.
	Secret pulumi.StringOutput `pulumi:"secret"`
}

// NewTurnstileWidget registers a new resource with the given unique name, arguments, and options.
func NewTurnstileWidget(ctx *pulumi.Context,
	name string, args *TurnstileWidgetArgs, opts ...pulumi.ResourceOption) (*TurnstileWidget, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.Domains == nil {
		return nil, errors.New("invalid value for required argument 'Domains'")
	}
	if args.Mode == nil {
		return nil, errors.New("invalid value for required argument 'Mode'")
	}
	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"secret",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource TurnstileWidget
	err := ctx.RegisterResource("cloudflare:index/turnstileWidget:TurnstileWidget", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTurnstileWidget gets an existing TurnstileWidget resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTurnstileWidget(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TurnstileWidgetState, opts ...pulumi.ResourceOption) (*TurnstileWidget, error) {
	var resource TurnstileWidget
	err := ctx.ReadResource("cloudflare:index/turnstileWidget:TurnstileWidget", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TurnstileWidget resources.
type turnstileWidgetState struct {
	// The account identifier to target for the resource.
	AccountId *string `pulumi:"accountId"`
	// If bot*fight*mode is set to true, Cloudflare issues computationally expensive challenges in response to malicious bots (Enterprise only).
	BotFightMode *bool `pulumi:"botFightMode"`
	// Domains where the widget is deployed
	Domains []string `pulumi:"domains"`
	// Widget Mode. Available values: `non-interactive`, `invisible`, `managed`
	Mode *string `pulumi:"mode"`
	// Human readable widget name.
	Name *string `pulumi:"name"`
	// Do not show any Cloudflare branding on the widget (Enterprise only).
	Offlabel *bool `pulumi:"offlabel"`
	// Region where this widget can be used.
	Region *string `pulumi:"region"`
	// Secret key for this widget.
	Secret *string `pulumi:"secret"`
}

type TurnstileWidgetState struct {
	// The account identifier to target for the resource.
	AccountId pulumi.StringPtrInput
	// If bot*fight*mode is set to true, Cloudflare issues computationally expensive challenges in response to malicious bots (Enterprise only).
	BotFightMode pulumi.BoolPtrInput
	// Domains where the widget is deployed
	Domains pulumi.StringArrayInput
	// Widget Mode. Available values: `non-interactive`, `invisible`, `managed`
	Mode pulumi.StringPtrInput
	// Human readable widget name.
	Name pulumi.StringPtrInput
	// Do not show any Cloudflare branding on the widget (Enterprise only).
	Offlabel pulumi.BoolPtrInput
	// Region where this widget can be used.
	Region pulumi.StringPtrInput
	// Secret key for this widget.
	Secret pulumi.StringPtrInput
}

func (TurnstileWidgetState) ElementType() reflect.Type {
	return reflect.TypeOf((*turnstileWidgetState)(nil)).Elem()
}

type turnstileWidgetArgs struct {
	// The account identifier to target for the resource.
	AccountId string `pulumi:"accountId"`
	// If bot*fight*mode is set to true, Cloudflare issues computationally expensive challenges in response to malicious bots (Enterprise only).
	BotFightMode *bool `pulumi:"botFightMode"`
	// Domains where the widget is deployed
	Domains []string `pulumi:"domains"`
	// Widget Mode. Available values: `non-interactive`, `invisible`, `managed`
	Mode string `pulumi:"mode"`
	// Human readable widget name.
	Name string `pulumi:"name"`
	// Do not show any Cloudflare branding on the widget (Enterprise only).
	Offlabel *bool `pulumi:"offlabel"`
	// Region where this widget can be used.
	Region *string `pulumi:"region"`
}

// The set of arguments for constructing a TurnstileWidget resource.
type TurnstileWidgetArgs struct {
	// The account identifier to target for the resource.
	AccountId pulumi.StringInput
	// If bot*fight*mode is set to true, Cloudflare issues computationally expensive challenges in response to malicious bots (Enterprise only).
	BotFightMode pulumi.BoolPtrInput
	// Domains where the widget is deployed
	Domains pulumi.StringArrayInput
	// Widget Mode. Available values: `non-interactive`, `invisible`, `managed`
	Mode pulumi.StringInput
	// Human readable widget name.
	Name pulumi.StringInput
	// Do not show any Cloudflare branding on the widget (Enterprise only).
	Offlabel pulumi.BoolPtrInput
	// Region where this widget can be used.
	Region pulumi.StringPtrInput
}

func (TurnstileWidgetArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*turnstileWidgetArgs)(nil)).Elem()
}

type TurnstileWidgetInput interface {
	pulumi.Input

	ToTurnstileWidgetOutput() TurnstileWidgetOutput
	ToTurnstileWidgetOutputWithContext(ctx context.Context) TurnstileWidgetOutput
}

func (*TurnstileWidget) ElementType() reflect.Type {
	return reflect.TypeOf((**TurnstileWidget)(nil)).Elem()
}

func (i *TurnstileWidget) ToTurnstileWidgetOutput() TurnstileWidgetOutput {
	return i.ToTurnstileWidgetOutputWithContext(context.Background())
}

func (i *TurnstileWidget) ToTurnstileWidgetOutputWithContext(ctx context.Context) TurnstileWidgetOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TurnstileWidgetOutput)
}

// TurnstileWidgetArrayInput is an input type that accepts TurnstileWidgetArray and TurnstileWidgetArrayOutput values.
// You can construct a concrete instance of `TurnstileWidgetArrayInput` via:
//
//	TurnstileWidgetArray{ TurnstileWidgetArgs{...} }
type TurnstileWidgetArrayInput interface {
	pulumi.Input

	ToTurnstileWidgetArrayOutput() TurnstileWidgetArrayOutput
	ToTurnstileWidgetArrayOutputWithContext(context.Context) TurnstileWidgetArrayOutput
}

type TurnstileWidgetArray []TurnstileWidgetInput

func (TurnstileWidgetArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TurnstileWidget)(nil)).Elem()
}

func (i TurnstileWidgetArray) ToTurnstileWidgetArrayOutput() TurnstileWidgetArrayOutput {
	return i.ToTurnstileWidgetArrayOutputWithContext(context.Background())
}

func (i TurnstileWidgetArray) ToTurnstileWidgetArrayOutputWithContext(ctx context.Context) TurnstileWidgetArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TurnstileWidgetArrayOutput)
}

// TurnstileWidgetMapInput is an input type that accepts TurnstileWidgetMap and TurnstileWidgetMapOutput values.
// You can construct a concrete instance of `TurnstileWidgetMapInput` via:
//
//	TurnstileWidgetMap{ "key": TurnstileWidgetArgs{...} }
type TurnstileWidgetMapInput interface {
	pulumi.Input

	ToTurnstileWidgetMapOutput() TurnstileWidgetMapOutput
	ToTurnstileWidgetMapOutputWithContext(context.Context) TurnstileWidgetMapOutput
}

type TurnstileWidgetMap map[string]TurnstileWidgetInput

func (TurnstileWidgetMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TurnstileWidget)(nil)).Elem()
}

func (i TurnstileWidgetMap) ToTurnstileWidgetMapOutput() TurnstileWidgetMapOutput {
	return i.ToTurnstileWidgetMapOutputWithContext(context.Background())
}

func (i TurnstileWidgetMap) ToTurnstileWidgetMapOutputWithContext(ctx context.Context) TurnstileWidgetMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TurnstileWidgetMapOutput)
}

type TurnstileWidgetOutput struct{ *pulumi.OutputState }

func (TurnstileWidgetOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TurnstileWidget)(nil)).Elem()
}

func (o TurnstileWidgetOutput) ToTurnstileWidgetOutput() TurnstileWidgetOutput {
	return o
}

func (o TurnstileWidgetOutput) ToTurnstileWidgetOutputWithContext(ctx context.Context) TurnstileWidgetOutput {
	return o
}

// The account identifier to target for the resource.
func (o TurnstileWidgetOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *TurnstileWidget) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// If bot*fight*mode is set to true, Cloudflare issues computationally expensive challenges in response to malicious bots (Enterprise only).
func (o TurnstileWidgetOutput) BotFightMode() pulumi.BoolOutput {
	return o.ApplyT(func(v *TurnstileWidget) pulumi.BoolOutput { return v.BotFightMode }).(pulumi.BoolOutput)
}

// Domains where the widget is deployed
func (o TurnstileWidgetOutput) Domains() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *TurnstileWidget) pulumi.StringArrayOutput { return v.Domains }).(pulumi.StringArrayOutput)
}

// Widget Mode. Available values: `non-interactive`, `invisible`, `managed`
func (o TurnstileWidgetOutput) Mode() pulumi.StringOutput {
	return o.ApplyT(func(v *TurnstileWidget) pulumi.StringOutput { return v.Mode }).(pulumi.StringOutput)
}

// Human readable widget name.
func (o TurnstileWidgetOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *TurnstileWidget) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Do not show any Cloudflare branding on the widget (Enterprise only).
func (o TurnstileWidgetOutput) Offlabel() pulumi.BoolOutput {
	return o.ApplyT(func(v *TurnstileWidget) pulumi.BoolOutput { return v.Offlabel }).(pulumi.BoolOutput)
}

// Region where this widget can be used.
func (o TurnstileWidgetOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v *TurnstileWidget) pulumi.StringOutput { return v.Region }).(pulumi.StringOutput)
}

// Secret key for this widget.
func (o TurnstileWidgetOutput) Secret() pulumi.StringOutput {
	return o.ApplyT(func(v *TurnstileWidget) pulumi.StringOutput { return v.Secret }).(pulumi.StringOutput)
}

type TurnstileWidgetArrayOutput struct{ *pulumi.OutputState }

func (TurnstileWidgetArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TurnstileWidget)(nil)).Elem()
}

func (o TurnstileWidgetArrayOutput) ToTurnstileWidgetArrayOutput() TurnstileWidgetArrayOutput {
	return o
}

func (o TurnstileWidgetArrayOutput) ToTurnstileWidgetArrayOutputWithContext(ctx context.Context) TurnstileWidgetArrayOutput {
	return o
}

func (o TurnstileWidgetArrayOutput) Index(i pulumi.IntInput) TurnstileWidgetOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TurnstileWidget {
		return vs[0].([]*TurnstileWidget)[vs[1].(int)]
	}).(TurnstileWidgetOutput)
}

type TurnstileWidgetMapOutput struct{ *pulumi.OutputState }

func (TurnstileWidgetMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TurnstileWidget)(nil)).Elem()
}

func (o TurnstileWidgetMapOutput) ToTurnstileWidgetMapOutput() TurnstileWidgetMapOutput {
	return o
}

func (o TurnstileWidgetMapOutput) ToTurnstileWidgetMapOutputWithContext(ctx context.Context) TurnstileWidgetMapOutput {
	return o
}

func (o TurnstileWidgetMapOutput) MapIndex(k pulumi.StringInput) TurnstileWidgetOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TurnstileWidget {
		return vs[0].(map[string]*TurnstileWidget)[vs[1].(string)]
	}).(TurnstileWidgetOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TurnstileWidgetInput)(nil)).Elem(), &TurnstileWidget{})
	pulumi.RegisterInputType(reflect.TypeOf((*TurnstileWidgetArrayInput)(nil)).Elem(), TurnstileWidgetArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TurnstileWidgetMapInput)(nil)).Elem(), TurnstileWidgetMap{})
	pulumi.RegisterOutputType(TurnstileWidgetOutput{})
	pulumi.RegisterOutputType(TurnstileWidgetArrayOutput{})
	pulumi.RegisterOutputType(TurnstileWidgetMapOutput{})
}
