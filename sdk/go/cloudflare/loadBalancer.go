// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Provides a Cloudflare Load Balancer resource. This sits in front of a number of defined pools of origins and provides various options for geographically-aware load balancing. Note that the load balancing feature must be enabled in your Clouflare account before you can use this resource.
//
// > This content is derived from https://github.com/terraform-providers/terraform-provider-cloudflare/blob/master/website/docs/r/load_balancer.html.markdown.
type LoadBalancer struct {
	s *pulumi.ResourceState
}

// NewLoadBalancer registers a new resource with the given unique name, arguments, and options.
func NewLoadBalancer(ctx *pulumi.Context,
	name string, args *LoadBalancerArgs, opts ...pulumi.ResourceOpt) (*LoadBalancer, error) {
	if args == nil || args.DefaultPoolIds == nil {
		return nil, errors.New("missing required argument 'DefaultPoolIds'")
	}
	if args == nil || args.FallbackPoolId == nil {
		return nil, errors.New("missing required argument 'FallbackPoolId'")
	}
	if args == nil || args.Name == nil {
		return nil, errors.New("missing required argument 'Name'")
	}
	inputs := make(map[string]interface{})
	if args == nil {
		inputs["defaultPoolIds"] = nil
		inputs["description"] = nil
		inputs["enabled"] = nil
		inputs["fallbackPoolId"] = nil
		inputs["name"] = nil
		inputs["popPools"] = nil
		inputs["proxied"] = nil
		inputs["regionPools"] = nil
		inputs["sessionAffinity"] = nil
		inputs["steeringPolicy"] = nil
		inputs["ttl"] = nil
		inputs["zone"] = nil
		inputs["zoneId"] = nil
	} else {
		inputs["defaultPoolIds"] = args.DefaultPoolIds
		inputs["description"] = args.Description
		inputs["enabled"] = args.Enabled
		inputs["fallbackPoolId"] = args.FallbackPoolId
		inputs["name"] = args.Name
		inputs["popPools"] = args.PopPools
		inputs["proxied"] = args.Proxied
		inputs["regionPools"] = args.RegionPools
		inputs["sessionAffinity"] = args.SessionAffinity
		inputs["steeringPolicy"] = args.SteeringPolicy
		inputs["ttl"] = args.Ttl
		inputs["zone"] = args.Zone
		inputs["zoneId"] = args.ZoneId
	}
	inputs["createdOn"] = nil
	inputs["modifiedOn"] = nil
	s, err := ctx.RegisterResource("cloudflare:index/loadBalancer:LoadBalancer", name, true, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &LoadBalancer{s: s}, nil
}

// GetLoadBalancer gets an existing LoadBalancer resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLoadBalancer(ctx *pulumi.Context,
	name string, id pulumi.ID, state *LoadBalancerState, opts ...pulumi.ResourceOpt) (*LoadBalancer, error) {
	inputs := make(map[string]interface{})
	if state != nil {
		inputs["createdOn"] = state.CreatedOn
		inputs["defaultPoolIds"] = state.DefaultPoolIds
		inputs["description"] = state.Description
		inputs["enabled"] = state.Enabled
		inputs["fallbackPoolId"] = state.FallbackPoolId
		inputs["modifiedOn"] = state.ModifiedOn
		inputs["name"] = state.Name
		inputs["popPools"] = state.PopPools
		inputs["proxied"] = state.Proxied
		inputs["regionPools"] = state.RegionPools
		inputs["sessionAffinity"] = state.SessionAffinity
		inputs["steeringPolicy"] = state.SteeringPolicy
		inputs["ttl"] = state.Ttl
		inputs["zone"] = state.Zone
		inputs["zoneId"] = state.ZoneId
	}
	s, err := ctx.ReadResource("cloudflare:index/loadBalancer:LoadBalancer", name, id, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &LoadBalancer{s: s}, nil
}

// URN is this resource's unique name assigned by Pulumi.
func (r *LoadBalancer) URN() *pulumi.URNOutput {
	return r.s.URN()
}

// ID is this resource's unique identifier assigned by its provider.
func (r *LoadBalancer) ID() *pulumi.IDOutput {
	return r.s.ID()
}

// The RFC3339 timestamp of when the load balancer was created.
func (r *LoadBalancer) CreatedOn() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["createdOn"])
}

// A list of pool IDs ordered by their failover priority. Used whenever region/pop pools are not defined.
func (r *LoadBalancer) DefaultPoolIds() *pulumi.ArrayOutput {
	return (*pulumi.ArrayOutput)(r.s.State["defaultPoolIds"])
}

// Free text description.
func (r *LoadBalancer) Description() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["description"])
}

// Enable or disable the load balancer. Defaults to `true` (enabled).
func (r *LoadBalancer) Enabled() *pulumi.BoolOutput {
	return (*pulumi.BoolOutput)(r.s.State["enabled"])
}

// The pool ID to use when all other pools are detected as unhealthy.
func (r *LoadBalancer) FallbackPoolId() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["fallbackPoolId"])
}

// The RFC3339 timestamp of when the load balancer was last modified.
func (r *LoadBalancer) ModifiedOn() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["modifiedOn"])
}

// The DNS name (FQDN, including the zone) to associate with the load balancer.
func (r *LoadBalancer) Name() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["name"])
}

// A set containing mappings of Cloudflare Point-of-Presence (PoP) identifiers to a list of pool IDs (ordered by their failover priority) for the PoP (datacenter). This feature is only available to enterprise customers. Fields documented below.
func (r *LoadBalancer) PopPools() *pulumi.ArrayOutput {
	return (*pulumi.ArrayOutput)(r.s.State["popPools"])
}

// Whether the hostname gets Cloudflare's origin protection. Defaults to `false`.
func (r *LoadBalancer) Proxied() *pulumi.BoolOutput {
	return (*pulumi.BoolOutput)(r.s.State["proxied"])
}

// A set containing mappings of region/country codes to a list of pool IDs (ordered by their failover priority) for the given region. Fields documented below.
func (r *LoadBalancer) RegionPools() *pulumi.ArrayOutput {
	return (*pulumi.ArrayOutput)(r.s.State["regionPools"])
}

// Associates all requests coming from an end-user with a single origin. Cloudflare will set a cookie on the initial response to the client, such that consequent requests with the cookie in the request will go to the same origin, so long as it is available.
func (r *LoadBalancer) SessionAffinity() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["sessionAffinity"])
}

// Determine which method the load balancer uses to determine the fastest route to your origin. Valid values  are: `"off"`, `"geo"`, `"dynamicLatency"`, `"random"` or `""`. Default is `""`.
func (r *LoadBalancer) SteeringPolicy() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["steeringPolicy"])
}

// Time to live (TTL) of this load balancer's DNS `name`. Conflicts with `proxied` - this cannot be set for proxied load balancers. Default is `30`.
func (r *LoadBalancer) Ttl() *pulumi.IntOutput {
	return (*pulumi.IntOutput)(r.s.State["ttl"])
}

// The zone to add the load balancer to.
func (r *LoadBalancer) Zone() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["zone"])
}

// ID associated with the specified `zone`.
func (r *LoadBalancer) ZoneId() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["zoneId"])
}

// Input properties used for looking up and filtering LoadBalancer resources.
type LoadBalancerState struct {
	// The RFC3339 timestamp of when the load balancer was created.
	CreatedOn interface{}
	// A list of pool IDs ordered by their failover priority. Used whenever region/pop pools are not defined.
	DefaultPoolIds interface{}
	// Free text description.
	Description interface{}
	// Enable or disable the load balancer. Defaults to `true` (enabled).
	Enabled interface{}
	// The pool ID to use when all other pools are detected as unhealthy.
	FallbackPoolId interface{}
	// The RFC3339 timestamp of when the load balancer was last modified.
	ModifiedOn interface{}
	// The DNS name (FQDN, including the zone) to associate with the load balancer.
	Name interface{}
	// A set containing mappings of Cloudflare Point-of-Presence (PoP) identifiers to a list of pool IDs (ordered by their failover priority) for the PoP (datacenter). This feature is only available to enterprise customers. Fields documented below.
	PopPools interface{}
	// Whether the hostname gets Cloudflare's origin protection. Defaults to `false`.
	Proxied interface{}
	// A set containing mappings of region/country codes to a list of pool IDs (ordered by their failover priority) for the given region. Fields documented below.
	RegionPools interface{}
	// Associates all requests coming from an end-user with a single origin. Cloudflare will set a cookie on the initial response to the client, such that consequent requests with the cookie in the request will go to the same origin, so long as it is available.
	SessionAffinity interface{}
	// Determine which method the load balancer uses to determine the fastest route to your origin. Valid values  are: `"off"`, `"geo"`, `"dynamicLatency"`, `"random"` or `""`. Default is `""`.
	SteeringPolicy interface{}
	// Time to live (TTL) of this load balancer's DNS `name`. Conflicts with `proxied` - this cannot be set for proxied load balancers. Default is `30`.
	Ttl interface{}
	// The zone to add the load balancer to.
	Zone interface{}
	// ID associated with the specified `zone`.
	ZoneId interface{}
}

// The set of arguments for constructing a LoadBalancer resource.
type LoadBalancerArgs struct {
	// A list of pool IDs ordered by their failover priority. Used whenever region/pop pools are not defined.
	DefaultPoolIds interface{}
	// Free text description.
	Description interface{}
	// Enable or disable the load balancer. Defaults to `true` (enabled).
	Enabled interface{}
	// The pool ID to use when all other pools are detected as unhealthy.
	FallbackPoolId interface{}
	// The DNS name (FQDN, including the zone) to associate with the load balancer.
	Name interface{}
	// A set containing mappings of Cloudflare Point-of-Presence (PoP) identifiers to a list of pool IDs (ordered by their failover priority) for the PoP (datacenter). This feature is only available to enterprise customers. Fields documented below.
	PopPools interface{}
	// Whether the hostname gets Cloudflare's origin protection. Defaults to `false`.
	Proxied interface{}
	// A set containing mappings of region/country codes to a list of pool IDs (ordered by their failover priority) for the given region. Fields documented below.
	RegionPools interface{}
	// Associates all requests coming from an end-user with a single origin. Cloudflare will set a cookie on the initial response to the client, such that consequent requests with the cookie in the request will go to the same origin, so long as it is available.
	SessionAffinity interface{}
	// Determine which method the load balancer uses to determine the fastest route to your origin. Valid values  are: `"off"`, `"geo"`, `"dynamicLatency"`, `"random"` or `""`. Default is `""`.
	SteeringPolicy interface{}
	// Time to live (TTL) of this load balancer's DNS `name`. Conflicts with `proxied` - this cannot be set for proxied load balancers. Default is `30`.
	Ttl interface{}
	// The zone to add the load balancer to.
	Zone interface{}
	// ID associated with the specified `zone`.
	ZoneId interface{}
}
