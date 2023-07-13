// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Cloudflare Split Tunnel resource. Split tunnels are used to either
// include or exclude lists of routes from the WARP client's tunnel.
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
//			_, err := cloudflare.NewSplitTunnel(ctx, "exampleSplitTunnelExclude", &cloudflare.SplitTunnelArgs{
//				AccountId: pulumi.String("f037e56e89293a057740de681ac9abbe"),
//				Mode:      pulumi.String("exclude"),
//				Tunnels: cloudflare.SplitTunnelTunnelArray{
//					&cloudflare.SplitTunnelTunnelArgs{
//						Host:        pulumi.String("*.example.com"),
//						Description: pulumi.String("example domain"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = cloudflare.NewSplitTunnel(ctx, "exampleSplitTunnelIncludeSplitTunnel", &cloudflare.SplitTunnelArgs{
//				AccountId: pulumi.String("f037e56e89293a057740de681ac9abbe"),
//				Mode:      pulumi.String("include"),
//				Tunnels: cloudflare.SplitTunnelTunnelArray{
//					&cloudflare.SplitTunnelTunnelArgs{
//						Host:        pulumi.String("*.example.com"),
//						Description: pulumi.String("example domain"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			developerWarpPolicy, err := cloudflare.NewDeviceSettingsPolicy(ctx, "developerWarpPolicy", &cloudflare.DeviceSettingsPolicyArgs{
//				AccountId:    pulumi.String("f037e56e89293a057740de681ac9abbe"),
//				Name:         pulumi.String("Developers"),
//				Precedence:   pulumi.Int(10),
//				Match:        pulumi.String("any(identity.groups.name[*] in {\"Developers\"})"),
//				SwitchLocked: pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = cloudflare.NewSplitTunnel(ctx, "exampleDeviceSettingsPolicySplitTunnelExclude", &cloudflare.SplitTunnelArgs{
//				AccountId: pulumi.String("f037e56e89293a057740de681ac9abbe"),
//				PolicyId:  developerWarpPolicy.ID(),
//				Mode:      pulumi.String("exclude"),
//				Tunnels: cloudflare.SplitTunnelTunnelArray{
//					&cloudflare.SplitTunnelTunnelArgs{
//						Host:        pulumi.String("*.example.com"),
//						Description: pulumi.String("example domain"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = cloudflare.NewSplitTunnel(ctx, "exampleSplitTunnelIncludeIndex/splitTunnelSplitTunnel", &cloudflare.SplitTunnelArgs{
//				AccountId: pulumi.String("f037e56e89293a057740de681ac9abbe"),
//				PolicyId:  pulumi.Any(cloudflare_device_policy.Developer_warp_policy.Id),
//				Mode:      pulumi.String("include"),
//				Tunnels: cloudflare.SplitTunnelTunnelArray{
//					&cloudflare.SplitTunnelTunnelArgs{
//						Host:        pulumi.String("*.example.com"),
//						Description: pulumi.String("example domain"),
//					},
//				},
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
// Split Tunnels for default device policies must use "default" as the policy ID.
//
// ```sh
//
//	$ pulumi import cloudflare:index/splitTunnel:SplitTunnel example <account_id>/<policy_id>/<mode>
//
// ```
type SplitTunnel struct {
	pulumi.CustomResourceState

	// The account identifier to target for the resource.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// The mode of the split tunnel policy. Available values: `include`, `exclude`.
	Mode pulumi.StringOutput `pulumi:"mode"`
	// The settings policy for which to configure this split tunnel policy.
	PolicyId pulumi.StringPtrOutput `pulumi:"policyId"`
	// The value of the tunnel attributes.
	Tunnels SplitTunnelTunnelArrayOutput `pulumi:"tunnels"`
}

// NewSplitTunnel registers a new resource with the given unique name, arguments, and options.
func NewSplitTunnel(ctx *pulumi.Context,
	name string, args *SplitTunnelArgs, opts ...pulumi.ResourceOption) (*SplitTunnel, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.Mode == nil {
		return nil, errors.New("invalid value for required argument 'Mode'")
	}
	if args.Tunnels == nil {
		return nil, errors.New("invalid value for required argument 'Tunnels'")
	}
	var resource SplitTunnel
	err := ctx.RegisterResource("cloudflare:index/splitTunnel:SplitTunnel", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSplitTunnel gets an existing SplitTunnel resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSplitTunnel(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SplitTunnelState, opts ...pulumi.ResourceOption) (*SplitTunnel, error) {
	var resource SplitTunnel
	err := ctx.ReadResource("cloudflare:index/splitTunnel:SplitTunnel", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SplitTunnel resources.
type splitTunnelState struct {
	// The account identifier to target for the resource.
	AccountId *string `pulumi:"accountId"`
	// The mode of the split tunnel policy. Available values: `include`, `exclude`.
	Mode *string `pulumi:"mode"`
	// The settings policy for which to configure this split tunnel policy.
	PolicyId *string `pulumi:"policyId"`
	// The value of the tunnel attributes.
	Tunnels []SplitTunnelTunnel `pulumi:"tunnels"`
}

type SplitTunnelState struct {
	// The account identifier to target for the resource.
	AccountId pulumi.StringPtrInput
	// The mode of the split tunnel policy. Available values: `include`, `exclude`.
	Mode pulumi.StringPtrInput
	// The settings policy for which to configure this split tunnel policy.
	PolicyId pulumi.StringPtrInput
	// The value of the tunnel attributes.
	Tunnels SplitTunnelTunnelArrayInput
}

func (SplitTunnelState) ElementType() reflect.Type {
	return reflect.TypeOf((*splitTunnelState)(nil)).Elem()
}

type splitTunnelArgs struct {
	// The account identifier to target for the resource.
	AccountId string `pulumi:"accountId"`
	// The mode of the split tunnel policy. Available values: `include`, `exclude`.
	Mode string `pulumi:"mode"`
	// The settings policy for which to configure this split tunnel policy.
	PolicyId *string `pulumi:"policyId"`
	// The value of the tunnel attributes.
	Tunnels []SplitTunnelTunnel `pulumi:"tunnels"`
}

// The set of arguments for constructing a SplitTunnel resource.
type SplitTunnelArgs struct {
	// The account identifier to target for the resource.
	AccountId pulumi.StringInput
	// The mode of the split tunnel policy. Available values: `include`, `exclude`.
	Mode pulumi.StringInput
	// The settings policy for which to configure this split tunnel policy.
	PolicyId pulumi.StringPtrInput
	// The value of the tunnel attributes.
	Tunnels SplitTunnelTunnelArrayInput
}

func (SplitTunnelArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*splitTunnelArgs)(nil)).Elem()
}

type SplitTunnelInput interface {
	pulumi.Input

	ToSplitTunnelOutput() SplitTunnelOutput
	ToSplitTunnelOutputWithContext(ctx context.Context) SplitTunnelOutput
}

func (*SplitTunnel) ElementType() reflect.Type {
	return reflect.TypeOf((**SplitTunnel)(nil)).Elem()
}

func (i *SplitTunnel) ToSplitTunnelOutput() SplitTunnelOutput {
	return i.ToSplitTunnelOutputWithContext(context.Background())
}

func (i *SplitTunnel) ToSplitTunnelOutputWithContext(ctx context.Context) SplitTunnelOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SplitTunnelOutput)
}

// SplitTunnelArrayInput is an input type that accepts SplitTunnelArray and SplitTunnelArrayOutput values.
// You can construct a concrete instance of `SplitTunnelArrayInput` via:
//
//	SplitTunnelArray{ SplitTunnelArgs{...} }
type SplitTunnelArrayInput interface {
	pulumi.Input

	ToSplitTunnelArrayOutput() SplitTunnelArrayOutput
	ToSplitTunnelArrayOutputWithContext(context.Context) SplitTunnelArrayOutput
}

type SplitTunnelArray []SplitTunnelInput

func (SplitTunnelArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SplitTunnel)(nil)).Elem()
}

func (i SplitTunnelArray) ToSplitTunnelArrayOutput() SplitTunnelArrayOutput {
	return i.ToSplitTunnelArrayOutputWithContext(context.Background())
}

func (i SplitTunnelArray) ToSplitTunnelArrayOutputWithContext(ctx context.Context) SplitTunnelArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SplitTunnelArrayOutput)
}

// SplitTunnelMapInput is an input type that accepts SplitTunnelMap and SplitTunnelMapOutput values.
// You can construct a concrete instance of `SplitTunnelMapInput` via:
//
//	SplitTunnelMap{ "key": SplitTunnelArgs{...} }
type SplitTunnelMapInput interface {
	pulumi.Input

	ToSplitTunnelMapOutput() SplitTunnelMapOutput
	ToSplitTunnelMapOutputWithContext(context.Context) SplitTunnelMapOutput
}

type SplitTunnelMap map[string]SplitTunnelInput

func (SplitTunnelMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SplitTunnel)(nil)).Elem()
}

func (i SplitTunnelMap) ToSplitTunnelMapOutput() SplitTunnelMapOutput {
	return i.ToSplitTunnelMapOutputWithContext(context.Background())
}

func (i SplitTunnelMap) ToSplitTunnelMapOutputWithContext(ctx context.Context) SplitTunnelMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SplitTunnelMapOutput)
}

type SplitTunnelOutput struct{ *pulumi.OutputState }

func (SplitTunnelOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SplitTunnel)(nil)).Elem()
}

func (o SplitTunnelOutput) ToSplitTunnelOutput() SplitTunnelOutput {
	return o
}

func (o SplitTunnelOutput) ToSplitTunnelOutputWithContext(ctx context.Context) SplitTunnelOutput {
	return o
}

// The account identifier to target for the resource.
func (o SplitTunnelOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *SplitTunnel) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// The mode of the split tunnel policy. Available values: `include`, `exclude`.
func (o SplitTunnelOutput) Mode() pulumi.StringOutput {
	return o.ApplyT(func(v *SplitTunnel) pulumi.StringOutput { return v.Mode }).(pulumi.StringOutput)
}

// The settings policy for which to configure this split tunnel policy.
func (o SplitTunnelOutput) PolicyId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SplitTunnel) pulumi.StringPtrOutput { return v.PolicyId }).(pulumi.StringPtrOutput)
}

// The value of the tunnel attributes.
func (o SplitTunnelOutput) Tunnels() SplitTunnelTunnelArrayOutput {
	return o.ApplyT(func(v *SplitTunnel) SplitTunnelTunnelArrayOutput { return v.Tunnels }).(SplitTunnelTunnelArrayOutput)
}

type SplitTunnelArrayOutput struct{ *pulumi.OutputState }

func (SplitTunnelArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SplitTunnel)(nil)).Elem()
}

func (o SplitTunnelArrayOutput) ToSplitTunnelArrayOutput() SplitTunnelArrayOutput {
	return o
}

func (o SplitTunnelArrayOutput) ToSplitTunnelArrayOutputWithContext(ctx context.Context) SplitTunnelArrayOutput {
	return o
}

func (o SplitTunnelArrayOutput) Index(i pulumi.IntInput) SplitTunnelOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SplitTunnel {
		return vs[0].([]*SplitTunnel)[vs[1].(int)]
	}).(SplitTunnelOutput)
}

type SplitTunnelMapOutput struct{ *pulumi.OutputState }

func (SplitTunnelMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SplitTunnel)(nil)).Elem()
}

func (o SplitTunnelMapOutput) ToSplitTunnelMapOutput() SplitTunnelMapOutput {
	return o
}

func (o SplitTunnelMapOutput) ToSplitTunnelMapOutputWithContext(ctx context.Context) SplitTunnelMapOutput {
	return o
}

func (o SplitTunnelMapOutput) MapIndex(k pulumi.StringInput) SplitTunnelOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SplitTunnel {
		return vs[0].(map[string]*SplitTunnel)[vs[1].(string)]
	}).(SplitTunnelOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SplitTunnelInput)(nil)).Elem(), &SplitTunnel{})
	pulumi.RegisterInputType(reflect.TypeOf((*SplitTunnelArrayInput)(nil)).Elem(), SplitTunnelArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SplitTunnelMapInput)(nil)).Elem(), SplitTunnelMap{})
	pulumi.RegisterOutputType(SplitTunnelOutput{})
	pulumi.RegisterOutputType(SplitTunnelArrayOutput{})
	pulumi.RegisterOutputType(SplitTunnelMapOutput{})
}
