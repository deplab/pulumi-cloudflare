// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Provides a Cloudflare custom ssl resource.
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-cloudflare/blob/master/website/docs/r/custom_ssl.html.markdown.
type CustomSsl struct {
	s *pulumi.ResourceState
}

// NewCustomSsl registers a new resource with the given unique name, arguments, and options.
func NewCustomSsl(ctx *pulumi.Context,
	name string, args *CustomSslArgs, opts ...pulumi.ResourceOpt) (*CustomSsl, error) {
	if args == nil || args.ZoneId == nil {
		return nil, errors.New("missing required argument 'ZoneId'")
	}
	inputs := make(map[string]interface{})
	if args == nil {
		inputs["customSslOptions"] = nil
		inputs["customSslPriorities"] = nil
		inputs["zoneId"] = nil
	} else {
		inputs["customSslOptions"] = args.CustomSslOptions
		inputs["customSslPriorities"] = args.CustomSslPriorities
		inputs["zoneId"] = args.ZoneId
	}
	inputs["expiresOn"] = nil
	inputs["hosts"] = nil
	inputs["issuer"] = nil
	inputs["modifiedOn"] = nil
	inputs["priority"] = nil
	inputs["signature"] = nil
	inputs["status"] = nil
	inputs["uploadedOn"] = nil
	s, err := ctx.RegisterResource("cloudflare:index/customSsl:CustomSsl", name, true, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &CustomSsl{s: s}, nil
}

// GetCustomSsl gets an existing CustomSsl resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCustomSsl(ctx *pulumi.Context,
	name string, id pulumi.ID, state *CustomSslState, opts ...pulumi.ResourceOpt) (*CustomSsl, error) {
	inputs := make(map[string]interface{})
	if state != nil {
		inputs["customSslOptions"] = state.CustomSslOptions
		inputs["customSslPriorities"] = state.CustomSslPriorities
		inputs["expiresOn"] = state.ExpiresOn
		inputs["hosts"] = state.Hosts
		inputs["issuer"] = state.Issuer
		inputs["modifiedOn"] = state.ModifiedOn
		inputs["priority"] = state.Priority
		inputs["signature"] = state.Signature
		inputs["status"] = state.Status
		inputs["uploadedOn"] = state.UploadedOn
		inputs["zoneId"] = state.ZoneId
	}
	s, err := ctx.ReadResource("cloudflare:index/customSsl:CustomSsl", name, id, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &CustomSsl{s: s}, nil
}

// URN is this resource's unique name assigned by Pulumi.
func (r *CustomSsl) URN() *pulumi.URNOutput {
	return r.s.URN()
}

// ID is this resource's unique identifier assigned by its provider.
func (r *CustomSsl) ID() *pulumi.IDOutput {
	return r.s.ID()
}

// The certificate, private key and associated optional parameters, such as bundle_method, geo_restrictions, and type.
func (r *CustomSsl) CustomSslOptions() *pulumi.Output {
	return r.s.State["customSslOptions"]
}

func (r *CustomSsl) CustomSslPriorities() *pulumi.ArrayOutput {
	return (*pulumi.ArrayOutput)(r.s.State["customSslPriorities"])
}

func (r *CustomSsl) ExpiresOn() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["expiresOn"])
}

func (r *CustomSsl) Hosts() *pulumi.ArrayOutput {
	return (*pulumi.ArrayOutput)(r.s.State["hosts"])
}

func (r *CustomSsl) Issuer() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["issuer"])
}

func (r *CustomSsl) ModifiedOn() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["modifiedOn"])
}

func (r *CustomSsl) Priority() *pulumi.IntOutput {
	return (*pulumi.IntOutput)(r.s.State["priority"])
}

func (r *CustomSsl) Signature() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["signature"])
}

func (r *CustomSsl) Status() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["status"])
}

func (r *CustomSsl) UploadedOn() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["uploadedOn"])
}

// The DNS zone id to the custom ssl cert should be added.
func (r *CustomSsl) ZoneId() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["zoneId"])
}

// Input properties used for looking up and filtering CustomSsl resources.
type CustomSslState struct {
	// The certificate, private key and associated optional parameters, such as bundle_method, geo_restrictions, and type.
	CustomSslOptions interface{}
	CustomSslPriorities interface{}
	ExpiresOn interface{}
	Hosts interface{}
	Issuer interface{}
	ModifiedOn interface{}
	Priority interface{}
	Signature interface{}
	Status interface{}
	UploadedOn interface{}
	// The DNS zone id to the custom ssl cert should be added.
	ZoneId interface{}
}

// The set of arguments for constructing a CustomSsl resource.
type CustomSslArgs struct {
	// The certificate, private key and associated optional parameters, such as bundle_method, geo_restrictions, and type.
	CustomSslOptions interface{}
	CustomSslPriorities interface{}
	// The DNS zone id to the custom ssl cert should be added.
	ZoneId interface{}
}
