// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a Cloudflare Access Application resource. Access Applications
// are used to restrict access to a whole application using an
// authorisation gateway managed by Cloudflare.
type AccessApplication struct {
	pulumi.CustomResourceState

	// Application Audience (AUD) Tag of the application
	Aud pulumi.StringOutput `pulumi:"aud"`
	// The complete URL of the asset you wish to put
	// Cloudflare Access in front of. Can include subdomains or paths. Or both.
	Domain pulumi.StringOutput `pulumi:"domain"`
	// Friendly name of the Access Application.
	Name pulumi.StringOutput `pulumi:"name"`
	// How often a user will be forced to
	// re-authorise. Must be one of `30m`, `6h`, `12h`, `24h`, `168h`, `730h`.
	SessionDuration pulumi.StringPtrOutput `pulumi:"sessionDuration"`
	// The DNS zone to which the access rule should be added.
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewAccessApplication registers a new resource with the given unique name, arguments, and options.
func NewAccessApplication(ctx *pulumi.Context,
	name string, args *AccessApplicationArgs, opts ...pulumi.ResourceOption) (*AccessApplication, error) {
	if args == nil || args.Domain == nil {
		return nil, errors.New("missing required argument 'Domain'")
	}
	if args == nil || args.Name == nil {
		return nil, errors.New("missing required argument 'Name'")
	}
	if args == nil || args.ZoneId == nil {
		return nil, errors.New("missing required argument 'ZoneId'")
	}
	if args == nil {
		args = &AccessApplicationArgs{}
	}
	var resource AccessApplication
	err := ctx.RegisterResource("cloudflare:index/accessApplication:AccessApplication", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAccessApplication gets an existing AccessApplication resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAccessApplication(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AccessApplicationState, opts ...pulumi.ResourceOption) (*AccessApplication, error) {
	var resource AccessApplication
	err := ctx.ReadResource("cloudflare:index/accessApplication:AccessApplication", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AccessApplication resources.
type accessApplicationState struct {
	// Application Audience (AUD) Tag of the application
	Aud *string `pulumi:"aud"`
	// The complete URL of the asset you wish to put
	// Cloudflare Access in front of. Can include subdomains or paths. Or both.
	Domain *string `pulumi:"domain"`
	// Friendly name of the Access Application.
	Name *string `pulumi:"name"`
	// How often a user will be forced to
	// re-authorise. Must be one of `30m`, `6h`, `12h`, `24h`, `168h`, `730h`.
	SessionDuration *string `pulumi:"sessionDuration"`
	// The DNS zone to which the access rule should be added.
	ZoneId *string `pulumi:"zoneId"`
}

type AccessApplicationState struct {
	// Application Audience (AUD) Tag of the application
	Aud pulumi.StringPtrInput
	// The complete URL of the asset you wish to put
	// Cloudflare Access in front of. Can include subdomains or paths. Or both.
	Domain pulumi.StringPtrInput
	// Friendly name of the Access Application.
	Name pulumi.StringPtrInput
	// How often a user will be forced to
	// re-authorise. Must be one of `30m`, `6h`, `12h`, `24h`, `168h`, `730h`.
	SessionDuration pulumi.StringPtrInput
	// The DNS zone to which the access rule should be added.
	ZoneId pulumi.StringPtrInput
}

func (AccessApplicationState) ElementType() reflect.Type {
	return reflect.TypeOf((*accessApplicationState)(nil)).Elem()
}

type accessApplicationArgs struct {
	// The complete URL of the asset you wish to put
	// Cloudflare Access in front of. Can include subdomains or paths. Or both.
	Domain string `pulumi:"domain"`
	// Friendly name of the Access Application.
	Name string `pulumi:"name"`
	// How often a user will be forced to
	// re-authorise. Must be one of `30m`, `6h`, `12h`, `24h`, `168h`, `730h`.
	SessionDuration *string `pulumi:"sessionDuration"`
	// The DNS zone to which the access rule should be added.
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a AccessApplication resource.
type AccessApplicationArgs struct {
	// The complete URL of the asset you wish to put
	// Cloudflare Access in front of. Can include subdomains or paths. Or both.
	Domain pulumi.StringInput
	// Friendly name of the Access Application.
	Name pulumi.StringInput
	// How often a user will be forced to
	// re-authorise. Must be one of `30m`, `6h`, `12h`, `24h`, `168h`, `730h`.
	SessionDuration pulumi.StringPtrInput
	// The DNS zone to which the access rule should be added.
	ZoneId pulumi.StringInput
}

func (AccessApplicationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*accessApplicationArgs)(nil)).Elem()
}
