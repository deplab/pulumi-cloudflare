// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a Cloudflare Load Balancer pool resource. This provides a pool of origins that can be used by a Cloudflare Load Balancer. Note that the load balancing feature must be enabled in your Cloudflare account before you can use this resource.
type LoadBalancerPool struct {
	pulumi.CustomResourceState

	// A list of regions (specified by region code) from which to run health checks. Empty means every Cloudflare data center (the default), but requires an Enterprise plan. Region codes can be found [here](https://support.cloudflare.com/hc/en-us/articles/115000540888-Load-Balancing-Geographic-Regions).
	CheckRegions pulumi.StringArrayOutput `pulumi:"checkRegions"`
	// The RFC3339 timestamp of when the load balancer was created.
	CreatedOn pulumi.StringOutput `pulumi:"createdOn"`
	// Free text description.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Whether to enable (the default) this origin within the Pool. Disabled origins will not receive traffic and are excluded from health checks. The origin will only be disabled for the current pool.
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// The minimum number of origins that must be healthy for this pool to serve traffic. If the number of healthy origins falls below this number, the pool will be marked unhealthy and we will failover to the next available pool. Default: 1.
	MinimumOrigins pulumi.IntPtrOutput `pulumi:"minimumOrigins"`
	// The RFC3339 timestamp of when the load balancer was last modified.
	ModifiedOn pulumi.StringOutput `pulumi:"modifiedOn"`
	// The ID of the Monitor to use for health checking origins within this pool.
	Monitor pulumi.StringPtrOutput `pulumi:"monitor"`
	// A human-identifiable name for the origin.
	Name pulumi.StringOutput `pulumi:"name"`
	// The email address to send health status notifications to. This can be an individual mailbox or a mailing list.
	NotificationEmail pulumi.StringPtrOutput `pulumi:"notificationEmail"`
	// The list of origins within this pool. Traffic directed at this pool is balanced across all currently healthy origins, provided the pool itself is healthy. It's a complex value. See description below.
	Origins LoadBalancerPoolOriginArrayOutput `pulumi:"origins"`
}

// NewLoadBalancerPool registers a new resource with the given unique name, arguments, and options.
func NewLoadBalancerPool(ctx *pulumi.Context,
	name string, args *LoadBalancerPoolArgs, opts ...pulumi.ResourceOption) (*LoadBalancerPool, error) {
	if args == nil || args.Name == nil {
		return nil, errors.New("missing required argument 'Name'")
	}
	if args == nil || args.Origins == nil {
		return nil, errors.New("missing required argument 'Origins'")
	}
	if args == nil {
		args = &LoadBalancerPoolArgs{}
	}
	var resource LoadBalancerPool
	err := ctx.RegisterResource("cloudflare:index/loadBalancerPool:LoadBalancerPool", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLoadBalancerPool gets an existing LoadBalancerPool resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLoadBalancerPool(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LoadBalancerPoolState, opts ...pulumi.ResourceOption) (*LoadBalancerPool, error) {
	var resource LoadBalancerPool
	err := ctx.ReadResource("cloudflare:index/loadBalancerPool:LoadBalancerPool", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LoadBalancerPool resources.
type loadBalancerPoolState struct {
	// A list of regions (specified by region code) from which to run health checks. Empty means every Cloudflare data center (the default), but requires an Enterprise plan. Region codes can be found [here](https://support.cloudflare.com/hc/en-us/articles/115000540888-Load-Balancing-Geographic-Regions).
	CheckRegions []string `pulumi:"checkRegions"`
	// The RFC3339 timestamp of when the load balancer was created.
	CreatedOn *string `pulumi:"createdOn"`
	// Free text description.
	Description *string `pulumi:"description"`
	// Whether to enable (the default) this origin within the Pool. Disabled origins will not receive traffic and are excluded from health checks. The origin will only be disabled for the current pool.
	Enabled *bool `pulumi:"enabled"`
	// The minimum number of origins that must be healthy for this pool to serve traffic. If the number of healthy origins falls below this number, the pool will be marked unhealthy and we will failover to the next available pool. Default: 1.
	MinimumOrigins *int `pulumi:"minimumOrigins"`
	// The RFC3339 timestamp of when the load balancer was last modified.
	ModifiedOn *string `pulumi:"modifiedOn"`
	// The ID of the Monitor to use for health checking origins within this pool.
	Monitor *string `pulumi:"monitor"`
	// A human-identifiable name for the origin.
	Name *string `pulumi:"name"`
	// The email address to send health status notifications to. This can be an individual mailbox or a mailing list.
	NotificationEmail *string `pulumi:"notificationEmail"`
	// The list of origins within this pool. Traffic directed at this pool is balanced across all currently healthy origins, provided the pool itself is healthy. It's a complex value. See description below.
	Origins []LoadBalancerPoolOrigin `pulumi:"origins"`
}

type LoadBalancerPoolState struct {
	// A list of regions (specified by region code) from which to run health checks. Empty means every Cloudflare data center (the default), but requires an Enterprise plan. Region codes can be found [here](https://support.cloudflare.com/hc/en-us/articles/115000540888-Load-Balancing-Geographic-Regions).
	CheckRegions pulumi.StringArrayInput
	// The RFC3339 timestamp of when the load balancer was created.
	CreatedOn pulumi.StringPtrInput
	// Free text description.
	Description pulumi.StringPtrInput
	// Whether to enable (the default) this origin within the Pool. Disabled origins will not receive traffic and are excluded from health checks. The origin will only be disabled for the current pool.
	Enabled pulumi.BoolPtrInput
	// The minimum number of origins that must be healthy for this pool to serve traffic. If the number of healthy origins falls below this number, the pool will be marked unhealthy and we will failover to the next available pool. Default: 1.
	MinimumOrigins pulumi.IntPtrInput
	// The RFC3339 timestamp of when the load balancer was last modified.
	ModifiedOn pulumi.StringPtrInput
	// The ID of the Monitor to use for health checking origins within this pool.
	Monitor pulumi.StringPtrInput
	// A human-identifiable name for the origin.
	Name pulumi.StringPtrInput
	// The email address to send health status notifications to. This can be an individual mailbox or a mailing list.
	NotificationEmail pulumi.StringPtrInput
	// The list of origins within this pool. Traffic directed at this pool is balanced across all currently healthy origins, provided the pool itself is healthy. It's a complex value. See description below.
	Origins LoadBalancerPoolOriginArrayInput
}

func (LoadBalancerPoolState) ElementType() reflect.Type {
	return reflect.TypeOf((*loadBalancerPoolState)(nil)).Elem()
}

type loadBalancerPoolArgs struct {
	// A list of regions (specified by region code) from which to run health checks. Empty means every Cloudflare data center (the default), but requires an Enterprise plan. Region codes can be found [here](https://support.cloudflare.com/hc/en-us/articles/115000540888-Load-Balancing-Geographic-Regions).
	CheckRegions []string `pulumi:"checkRegions"`
	// Free text description.
	Description *string `pulumi:"description"`
	// Whether to enable (the default) this origin within the Pool. Disabled origins will not receive traffic and are excluded from health checks. The origin will only be disabled for the current pool.
	Enabled *bool `pulumi:"enabled"`
	// The minimum number of origins that must be healthy for this pool to serve traffic. If the number of healthy origins falls below this number, the pool will be marked unhealthy and we will failover to the next available pool. Default: 1.
	MinimumOrigins *int `pulumi:"minimumOrigins"`
	// The ID of the Monitor to use for health checking origins within this pool.
	Monitor *string `pulumi:"monitor"`
	// A human-identifiable name for the origin.
	Name string `pulumi:"name"`
	// The email address to send health status notifications to. This can be an individual mailbox or a mailing list.
	NotificationEmail *string `pulumi:"notificationEmail"`
	// The list of origins within this pool. Traffic directed at this pool is balanced across all currently healthy origins, provided the pool itself is healthy. It's a complex value. See description below.
	Origins []LoadBalancerPoolOrigin `pulumi:"origins"`
}

// The set of arguments for constructing a LoadBalancerPool resource.
type LoadBalancerPoolArgs struct {
	// A list of regions (specified by region code) from which to run health checks. Empty means every Cloudflare data center (the default), but requires an Enterprise plan. Region codes can be found [here](https://support.cloudflare.com/hc/en-us/articles/115000540888-Load-Balancing-Geographic-Regions).
	CheckRegions pulumi.StringArrayInput
	// Free text description.
	Description pulumi.StringPtrInput
	// Whether to enable (the default) this origin within the Pool. Disabled origins will not receive traffic and are excluded from health checks. The origin will only be disabled for the current pool.
	Enabled pulumi.BoolPtrInput
	// The minimum number of origins that must be healthy for this pool to serve traffic. If the number of healthy origins falls below this number, the pool will be marked unhealthy and we will failover to the next available pool. Default: 1.
	MinimumOrigins pulumi.IntPtrInput
	// The ID of the Monitor to use for health checking origins within this pool.
	Monitor pulumi.StringPtrInput
	// A human-identifiable name for the origin.
	Name pulumi.StringInput
	// The email address to send health status notifications to. This can be an individual mailbox or a mailing list.
	NotificationEmail pulumi.StringPtrInput
	// The list of origins within this pool. Traffic directed at this pool is balanced across all currently healthy origins, provided the pool itself is healthy. It's a complex value. See description below.
	Origins LoadBalancerPoolOriginArrayInput
}

func (LoadBalancerPoolArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*loadBalancerPoolArgs)(nil)).Elem()
}
