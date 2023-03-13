// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a resource, that manages GRE tunnels for Magic Transit.
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
//			_, err := cloudflare.NewGreTunnel(ctx, "example", &cloudflare.GreTunnelArgs{
//				AccountId:             pulumi.String("f037e56e89293a057740de681ac9abbe"),
//				CloudflareGreEndpoint: pulumi.String("203.0.113.1"),
//				CustomerGreEndpoint:   pulumi.String("203.0.113.1"),
//				Description:           pulumi.String("Tunnel for ISP X"),
//				HealthCheckEnabled:    pulumi.Bool(true),
//				HealthCheckTarget:     pulumi.String("203.0.113.1"),
//				HealthCheckType:       pulumi.String("reply"),
//				InterfaceAddress:      pulumi.String("192.0.2.0/31"),
//				Mtu:                   pulumi.Int(1476),
//				Name:                  pulumi.String("GRE_1"),
//				Ttl:                   pulumi.Int(64),
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
//	$ pulumi import cloudflare:index/greTunnel:GreTunnel example <account_id>/<tunnel_id>
//
// ```
type GreTunnel struct {
	pulumi.CustomResourceState

	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId pulumi.StringPtrOutput `pulumi:"accountId"`
	// The IP address assigned to the Cloudflare side of the GRE tunnel.
	CloudflareGreEndpoint pulumi.StringOutput `pulumi:"cloudflareGreEndpoint"`
	// The IP address assigned to the customer side of the GRE tunnel.
	CustomerGreEndpoint pulumi.StringOutput `pulumi:"customerGreEndpoint"`
	// Description of the GRE tunnel intent.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Specifies if ICMP tunnel health checks are enabled.
	HealthCheckEnabled pulumi.BoolOutput `pulumi:"healthCheckEnabled"`
	// The IP address of the customer endpoint that will receive tunnel health checks.
	HealthCheckTarget pulumi.StringOutput `pulumi:"healthCheckTarget"`
	// Specifies the ICMP echo type for the health check. Available values: `request`, `reply`.
	HealthCheckType pulumi.StringOutput `pulumi:"healthCheckType"`
	// 31-bit prefix (/31 in CIDR notation) supporting 2 hosts, one for each side of the tunnel.
	InterfaceAddress pulumi.StringOutput `pulumi:"interfaceAddress"`
	// Maximum Transmission Unit (MTU) in bytes for the GRE tunnel.
	Mtu pulumi.IntOutput `pulumi:"mtu"`
	// Name of the GRE tunnel.
	Name pulumi.StringOutput `pulumi:"name"`
	// Time To Live (TTL) in number of hops of the GRE tunnel.
	Ttl pulumi.IntOutput `pulumi:"ttl"`
}

// NewGreTunnel registers a new resource with the given unique name, arguments, and options.
func NewGreTunnel(ctx *pulumi.Context,
	name string, args *GreTunnelArgs, opts ...pulumi.ResourceOption) (*GreTunnel, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CloudflareGreEndpoint == nil {
		return nil, errors.New("invalid value for required argument 'CloudflareGreEndpoint'")
	}
	if args.CustomerGreEndpoint == nil {
		return nil, errors.New("invalid value for required argument 'CustomerGreEndpoint'")
	}
	if args.InterfaceAddress == nil {
		return nil, errors.New("invalid value for required argument 'InterfaceAddress'")
	}
	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	var resource GreTunnel
	err := ctx.RegisterResource("cloudflare:index/greTunnel:GreTunnel", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGreTunnel gets an existing GreTunnel resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGreTunnel(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GreTunnelState, opts ...pulumi.ResourceOption) (*GreTunnel, error) {
	var resource GreTunnel
	err := ctx.ReadResource("cloudflare:index/greTunnel:GreTunnel", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering GreTunnel resources.
type greTunnelState struct {
	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId *string `pulumi:"accountId"`
	// The IP address assigned to the Cloudflare side of the GRE tunnel.
	CloudflareGreEndpoint *string `pulumi:"cloudflareGreEndpoint"`
	// The IP address assigned to the customer side of the GRE tunnel.
	CustomerGreEndpoint *string `pulumi:"customerGreEndpoint"`
	// Description of the GRE tunnel intent.
	Description *string `pulumi:"description"`
	// Specifies if ICMP tunnel health checks are enabled.
	HealthCheckEnabled *bool `pulumi:"healthCheckEnabled"`
	// The IP address of the customer endpoint that will receive tunnel health checks.
	HealthCheckTarget *string `pulumi:"healthCheckTarget"`
	// Specifies the ICMP echo type for the health check. Available values: `request`, `reply`.
	HealthCheckType *string `pulumi:"healthCheckType"`
	// 31-bit prefix (/31 in CIDR notation) supporting 2 hosts, one for each side of the tunnel.
	InterfaceAddress *string `pulumi:"interfaceAddress"`
	// Maximum Transmission Unit (MTU) in bytes for the GRE tunnel.
	Mtu *int `pulumi:"mtu"`
	// Name of the GRE tunnel.
	Name *string `pulumi:"name"`
	// Time To Live (TTL) in number of hops of the GRE tunnel.
	Ttl *int `pulumi:"ttl"`
}

type GreTunnelState struct {
	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId pulumi.StringPtrInput
	// The IP address assigned to the Cloudflare side of the GRE tunnel.
	CloudflareGreEndpoint pulumi.StringPtrInput
	// The IP address assigned to the customer side of the GRE tunnel.
	CustomerGreEndpoint pulumi.StringPtrInput
	// Description of the GRE tunnel intent.
	Description pulumi.StringPtrInput
	// Specifies if ICMP tunnel health checks are enabled.
	HealthCheckEnabled pulumi.BoolPtrInput
	// The IP address of the customer endpoint that will receive tunnel health checks.
	HealthCheckTarget pulumi.StringPtrInput
	// Specifies the ICMP echo type for the health check. Available values: `request`, `reply`.
	HealthCheckType pulumi.StringPtrInput
	// 31-bit prefix (/31 in CIDR notation) supporting 2 hosts, one for each side of the tunnel.
	InterfaceAddress pulumi.StringPtrInput
	// Maximum Transmission Unit (MTU) in bytes for the GRE tunnel.
	Mtu pulumi.IntPtrInput
	// Name of the GRE tunnel.
	Name pulumi.StringPtrInput
	// Time To Live (TTL) in number of hops of the GRE tunnel.
	Ttl pulumi.IntPtrInput
}

func (GreTunnelState) ElementType() reflect.Type {
	return reflect.TypeOf((*greTunnelState)(nil)).Elem()
}

type greTunnelArgs struct {
	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId *string `pulumi:"accountId"`
	// The IP address assigned to the Cloudflare side of the GRE tunnel.
	CloudflareGreEndpoint string `pulumi:"cloudflareGreEndpoint"`
	// The IP address assigned to the customer side of the GRE tunnel.
	CustomerGreEndpoint string `pulumi:"customerGreEndpoint"`
	// Description of the GRE tunnel intent.
	Description *string `pulumi:"description"`
	// Specifies if ICMP tunnel health checks are enabled.
	HealthCheckEnabled *bool `pulumi:"healthCheckEnabled"`
	// The IP address of the customer endpoint that will receive tunnel health checks.
	HealthCheckTarget *string `pulumi:"healthCheckTarget"`
	// Specifies the ICMP echo type for the health check. Available values: `request`, `reply`.
	HealthCheckType *string `pulumi:"healthCheckType"`
	// 31-bit prefix (/31 in CIDR notation) supporting 2 hosts, one for each side of the tunnel.
	InterfaceAddress string `pulumi:"interfaceAddress"`
	// Maximum Transmission Unit (MTU) in bytes for the GRE tunnel.
	Mtu *int `pulumi:"mtu"`
	// Name of the GRE tunnel.
	Name string `pulumi:"name"`
	// Time To Live (TTL) in number of hops of the GRE tunnel.
	Ttl *int `pulumi:"ttl"`
}

// The set of arguments for constructing a GreTunnel resource.
type GreTunnelArgs struct {
	// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	AccountId pulumi.StringPtrInput
	// The IP address assigned to the Cloudflare side of the GRE tunnel.
	CloudflareGreEndpoint pulumi.StringInput
	// The IP address assigned to the customer side of the GRE tunnel.
	CustomerGreEndpoint pulumi.StringInput
	// Description of the GRE tunnel intent.
	Description pulumi.StringPtrInput
	// Specifies if ICMP tunnel health checks are enabled.
	HealthCheckEnabled pulumi.BoolPtrInput
	// The IP address of the customer endpoint that will receive tunnel health checks.
	HealthCheckTarget pulumi.StringPtrInput
	// Specifies the ICMP echo type for the health check. Available values: `request`, `reply`.
	HealthCheckType pulumi.StringPtrInput
	// 31-bit prefix (/31 in CIDR notation) supporting 2 hosts, one for each side of the tunnel.
	InterfaceAddress pulumi.StringInput
	// Maximum Transmission Unit (MTU) in bytes for the GRE tunnel.
	Mtu pulumi.IntPtrInput
	// Name of the GRE tunnel.
	Name pulumi.StringInput
	// Time To Live (TTL) in number of hops of the GRE tunnel.
	Ttl pulumi.IntPtrInput
}

func (GreTunnelArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*greTunnelArgs)(nil)).Elem()
}

type GreTunnelInput interface {
	pulumi.Input

	ToGreTunnelOutput() GreTunnelOutput
	ToGreTunnelOutputWithContext(ctx context.Context) GreTunnelOutput
}

func (*GreTunnel) ElementType() reflect.Type {
	return reflect.TypeOf((**GreTunnel)(nil)).Elem()
}

func (i *GreTunnel) ToGreTunnelOutput() GreTunnelOutput {
	return i.ToGreTunnelOutputWithContext(context.Background())
}

func (i *GreTunnel) ToGreTunnelOutputWithContext(ctx context.Context) GreTunnelOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GreTunnelOutput)
}

// GreTunnelArrayInput is an input type that accepts GreTunnelArray and GreTunnelArrayOutput values.
// You can construct a concrete instance of `GreTunnelArrayInput` via:
//
//	GreTunnelArray{ GreTunnelArgs{...} }
type GreTunnelArrayInput interface {
	pulumi.Input

	ToGreTunnelArrayOutput() GreTunnelArrayOutput
	ToGreTunnelArrayOutputWithContext(context.Context) GreTunnelArrayOutput
}

type GreTunnelArray []GreTunnelInput

func (GreTunnelArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GreTunnel)(nil)).Elem()
}

func (i GreTunnelArray) ToGreTunnelArrayOutput() GreTunnelArrayOutput {
	return i.ToGreTunnelArrayOutputWithContext(context.Background())
}

func (i GreTunnelArray) ToGreTunnelArrayOutputWithContext(ctx context.Context) GreTunnelArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GreTunnelArrayOutput)
}

// GreTunnelMapInput is an input type that accepts GreTunnelMap and GreTunnelMapOutput values.
// You can construct a concrete instance of `GreTunnelMapInput` via:
//
//	GreTunnelMap{ "key": GreTunnelArgs{...} }
type GreTunnelMapInput interface {
	pulumi.Input

	ToGreTunnelMapOutput() GreTunnelMapOutput
	ToGreTunnelMapOutputWithContext(context.Context) GreTunnelMapOutput
}

type GreTunnelMap map[string]GreTunnelInput

func (GreTunnelMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GreTunnel)(nil)).Elem()
}

func (i GreTunnelMap) ToGreTunnelMapOutput() GreTunnelMapOutput {
	return i.ToGreTunnelMapOutputWithContext(context.Background())
}

func (i GreTunnelMap) ToGreTunnelMapOutputWithContext(ctx context.Context) GreTunnelMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GreTunnelMapOutput)
}

type GreTunnelOutput struct{ *pulumi.OutputState }

func (GreTunnelOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**GreTunnel)(nil)).Elem()
}

func (o GreTunnelOutput) ToGreTunnelOutput() GreTunnelOutput {
	return o
}

func (o GreTunnelOutput) ToGreTunnelOutputWithContext(ctx context.Context) GreTunnelOutput {
	return o
}

// The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
func (o GreTunnelOutput) AccountId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GreTunnel) pulumi.StringPtrOutput { return v.AccountId }).(pulumi.StringPtrOutput)
}

// The IP address assigned to the Cloudflare side of the GRE tunnel.
func (o GreTunnelOutput) CloudflareGreEndpoint() pulumi.StringOutput {
	return o.ApplyT(func(v *GreTunnel) pulumi.StringOutput { return v.CloudflareGreEndpoint }).(pulumi.StringOutput)
}

// The IP address assigned to the customer side of the GRE tunnel.
func (o GreTunnelOutput) CustomerGreEndpoint() pulumi.StringOutput {
	return o.ApplyT(func(v *GreTunnel) pulumi.StringOutput { return v.CustomerGreEndpoint }).(pulumi.StringOutput)
}

// Description of the GRE tunnel intent.
func (o GreTunnelOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GreTunnel) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Specifies if ICMP tunnel health checks are enabled.
func (o GreTunnelOutput) HealthCheckEnabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *GreTunnel) pulumi.BoolOutput { return v.HealthCheckEnabled }).(pulumi.BoolOutput)
}

// The IP address of the customer endpoint that will receive tunnel health checks.
func (o GreTunnelOutput) HealthCheckTarget() pulumi.StringOutput {
	return o.ApplyT(func(v *GreTunnel) pulumi.StringOutput { return v.HealthCheckTarget }).(pulumi.StringOutput)
}

// Specifies the ICMP echo type for the health check. Available values: `request`, `reply`.
func (o GreTunnelOutput) HealthCheckType() pulumi.StringOutput {
	return o.ApplyT(func(v *GreTunnel) pulumi.StringOutput { return v.HealthCheckType }).(pulumi.StringOutput)
}

// 31-bit prefix (/31 in CIDR notation) supporting 2 hosts, one for each side of the tunnel.
func (o GreTunnelOutput) InterfaceAddress() pulumi.StringOutput {
	return o.ApplyT(func(v *GreTunnel) pulumi.StringOutput { return v.InterfaceAddress }).(pulumi.StringOutput)
}

// Maximum Transmission Unit (MTU) in bytes for the GRE tunnel.
func (o GreTunnelOutput) Mtu() pulumi.IntOutput {
	return o.ApplyT(func(v *GreTunnel) pulumi.IntOutput { return v.Mtu }).(pulumi.IntOutput)
}

// Name of the GRE tunnel.
func (o GreTunnelOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *GreTunnel) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Time To Live (TTL) in number of hops of the GRE tunnel.
func (o GreTunnelOutput) Ttl() pulumi.IntOutput {
	return o.ApplyT(func(v *GreTunnel) pulumi.IntOutput { return v.Ttl }).(pulumi.IntOutput)
}

type GreTunnelArrayOutput struct{ *pulumi.OutputState }

func (GreTunnelArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GreTunnel)(nil)).Elem()
}

func (o GreTunnelArrayOutput) ToGreTunnelArrayOutput() GreTunnelArrayOutput {
	return o
}

func (o GreTunnelArrayOutput) ToGreTunnelArrayOutputWithContext(ctx context.Context) GreTunnelArrayOutput {
	return o
}

func (o GreTunnelArrayOutput) Index(i pulumi.IntInput) GreTunnelOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *GreTunnel {
		return vs[0].([]*GreTunnel)[vs[1].(int)]
	}).(GreTunnelOutput)
}

type GreTunnelMapOutput struct{ *pulumi.OutputState }

func (GreTunnelMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GreTunnel)(nil)).Elem()
}

func (o GreTunnelMapOutput) ToGreTunnelMapOutput() GreTunnelMapOutput {
	return o
}

func (o GreTunnelMapOutput) ToGreTunnelMapOutputWithContext(ctx context.Context) GreTunnelMapOutput {
	return o
}

func (o GreTunnelMapOutput) MapIndex(k pulumi.StringInput) GreTunnelOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *GreTunnel {
		return vs[0].(map[string]*GreTunnel)[vs[1].(string)]
	}).(GreTunnelOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GreTunnelInput)(nil)).Elem(), &GreTunnel{})
	pulumi.RegisterInputType(reflect.TypeOf((*GreTunnelArrayInput)(nil)).Elem(), GreTunnelArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GreTunnelMapInput)(nil)).Elem(), GreTunnelMap{})
	pulumi.RegisterOutputType(GreTunnelOutput{})
	pulumi.RegisterOutputType(GreTunnelArrayOutput{})
	pulumi.RegisterOutputType(GreTunnelMapOutput{})
}
