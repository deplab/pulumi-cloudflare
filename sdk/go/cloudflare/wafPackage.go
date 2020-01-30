// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

// nolint: lll
package cloudflare

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Provides a Cloudflare WAF rule package resource for a particular zone. This can be used to configure firewall behaviour for pre-defined firewall packages.
// 
// > This content is derived from https://github.com/terraform-providers/terraform-provider-cloudflare/blob/master/website/docs/r/waf_package.html.markdown.
type WafPackage struct {
	pulumi.CustomResourceState

	// The action mode of the package, can be one of ["block", "challenge", "simulate"].
	ActionMode pulumi.StringPtrOutput `pulumi:"actionMode"`
	// The WAF Package ID.
	PackageId pulumi.StringOutput `pulumi:"packageId"`
	// The sensitivity of the package, can be one of ["high", "medium", "low", "off"].
	Sensitivity pulumi.StringPtrOutput `pulumi:"sensitivity"`
	// The DNS zone ID to apply to.
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewWafPackage registers a new resource with the given unique name, arguments, and options.
func NewWafPackage(ctx *pulumi.Context,
	name string, args *WafPackageArgs, opts ...pulumi.ResourceOption) (*WafPackage, error) {
	if args == nil || args.PackageId == nil {
		return nil, errors.New("missing required argument 'PackageId'")
	}
	if args == nil || args.ZoneId == nil {
		return nil, errors.New("missing required argument 'ZoneId'")
	}
	if args == nil {
		args = &WafPackageArgs{}
	}
	var resource WafPackage
	err := ctx.RegisterResource("cloudflare:index/wafPackage:WafPackage", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWafPackage gets an existing WafPackage resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWafPackage(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WafPackageState, opts ...pulumi.ResourceOption) (*WafPackage, error) {
	var resource WafPackage
	err := ctx.ReadResource("cloudflare:index/wafPackage:WafPackage", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering WafPackage resources.
type wafPackageState struct {
	// The action mode of the package, can be one of ["block", "challenge", "simulate"].
	ActionMode *string `pulumi:"actionMode"`
	// The WAF Package ID.
	PackageId *string `pulumi:"packageId"`
	// The sensitivity of the package, can be one of ["high", "medium", "low", "off"].
	Sensitivity *string `pulumi:"sensitivity"`
	// The DNS zone ID to apply to.
	ZoneId *string `pulumi:"zoneId"`
}

type WafPackageState struct {
	// The action mode of the package, can be one of ["block", "challenge", "simulate"].
	ActionMode pulumi.StringPtrInput
	// The WAF Package ID.
	PackageId pulumi.StringPtrInput
	// The sensitivity of the package, can be one of ["high", "medium", "low", "off"].
	Sensitivity pulumi.StringPtrInput
	// The DNS zone ID to apply to.
	ZoneId pulumi.StringPtrInput
}

func (WafPackageState) ElementType() reflect.Type {
	return reflect.TypeOf((*wafPackageState)(nil)).Elem()
}

type wafPackageArgs struct {
	// The action mode of the package, can be one of ["block", "challenge", "simulate"].
	ActionMode *string `pulumi:"actionMode"`
	// The WAF Package ID.
	PackageId string `pulumi:"packageId"`
	// The sensitivity of the package, can be one of ["high", "medium", "low", "off"].
	Sensitivity *string `pulumi:"sensitivity"`
	// The DNS zone ID to apply to.
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a WafPackage resource.
type WafPackageArgs struct {
	// The action mode of the package, can be one of ["block", "challenge", "simulate"].
	ActionMode pulumi.StringPtrInput
	// The WAF Package ID.
	PackageId pulumi.StringInput
	// The sensitivity of the package, can be one of ["high", "medium", "low", "off"].
	Sensitivity pulumi.StringPtrInput
	// The DNS zone ID to apply to.
	ZoneId pulumi.StringInput
}

func (WafPackageArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*wafPackageArgs)(nil)).Elem()
}
