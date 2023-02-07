// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Cloudflare worker route resource. A route will also require a `WorkerScript`.
//
// > This resource uses the Cloudflare account APIs. This requires setting the
// `CLOUDFLARE_ACCOUNT_ID` environment variable or `accountId` provider argument
// if you do not explicitly set the resource level `accountId` value.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-cloudflare/sdk/v3/go/cloudflare"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			myScript, err := cloudflare.NewWorkerScript(ctx, "myScript", nil)
//			if err != nil {
//				return err
//			}
//			_, err = cloudflare.NewWorkerRoute(ctx, "myRoute", &cloudflare.WorkerRouteArgs{
//				ZoneId:     pulumi.String("0da42c8d2132a9ddaf714f9e7c920711"),
//				Pattern:    pulumi.String("example.com/*"),
//				ScriptName: myScript.Name,
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
//	$ pulumi import cloudflare:index/workerRoute:WorkerRoute example <zone_id>/<route_id>
//
// ```
type WorkerRoute struct {
	pulumi.CustomResourceState

	// The [route pattern](https://developers.cloudflare.com/workers/about/routes/) to associate the Worker with.
	Pattern pulumi.StringOutput `pulumi:"pattern"`
	// Worker script name to invoke for requests that match the route pattern.
	ScriptName pulumi.StringPtrOutput `pulumi:"scriptName"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewWorkerRoute registers a new resource with the given unique name, arguments, and options.
func NewWorkerRoute(ctx *pulumi.Context,
	name string, args *WorkerRouteArgs, opts ...pulumi.ResourceOption) (*WorkerRoute, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Pattern == nil {
		return nil, errors.New("invalid value for required argument 'Pattern'")
	}
	if args.ZoneId == nil {
		return nil, errors.New("invalid value for required argument 'ZoneId'")
	}
	var resource WorkerRoute
	err := ctx.RegisterResource("cloudflare:index/workerRoute:WorkerRoute", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWorkerRoute gets an existing WorkerRoute resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWorkerRoute(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WorkerRouteState, opts ...pulumi.ResourceOption) (*WorkerRoute, error) {
	var resource WorkerRoute
	err := ctx.ReadResource("cloudflare:index/workerRoute:WorkerRoute", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering WorkerRoute resources.
type workerRouteState struct {
	// The [route pattern](https://developers.cloudflare.com/workers/about/routes/) to associate the Worker with.
	Pattern *string `pulumi:"pattern"`
	// Worker script name to invoke for requests that match the route pattern.
	ScriptName *string `pulumi:"scriptName"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId *string `pulumi:"zoneId"`
}

type WorkerRouteState struct {
	// The [route pattern](https://developers.cloudflare.com/workers/about/routes/) to associate the Worker with.
	Pattern pulumi.StringPtrInput
	// Worker script name to invoke for requests that match the route pattern.
	ScriptName pulumi.StringPtrInput
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringPtrInput
}

func (WorkerRouteState) ElementType() reflect.Type {
	return reflect.TypeOf((*workerRouteState)(nil)).Elem()
}

type workerRouteArgs struct {
	// The [route pattern](https://developers.cloudflare.com/workers/about/routes/) to associate the Worker with.
	Pattern string `pulumi:"pattern"`
	// Worker script name to invoke for requests that match the route pattern.
	ScriptName *string `pulumi:"scriptName"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a WorkerRoute resource.
type WorkerRouteArgs struct {
	// The [route pattern](https://developers.cloudflare.com/workers/about/routes/) to associate the Worker with.
	Pattern pulumi.StringInput
	// Worker script name to invoke for requests that match the route pattern.
	ScriptName pulumi.StringPtrInput
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringInput
}

func (WorkerRouteArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*workerRouteArgs)(nil)).Elem()
}

type WorkerRouteInput interface {
	pulumi.Input

	ToWorkerRouteOutput() WorkerRouteOutput
	ToWorkerRouteOutputWithContext(ctx context.Context) WorkerRouteOutput
}

func (*WorkerRoute) ElementType() reflect.Type {
	return reflect.TypeOf((**WorkerRoute)(nil)).Elem()
}

func (i *WorkerRoute) ToWorkerRouteOutput() WorkerRouteOutput {
	return i.ToWorkerRouteOutputWithContext(context.Background())
}

func (i *WorkerRoute) ToWorkerRouteOutputWithContext(ctx context.Context) WorkerRouteOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkerRouteOutput)
}

// WorkerRouteArrayInput is an input type that accepts WorkerRouteArray and WorkerRouteArrayOutput values.
// You can construct a concrete instance of `WorkerRouteArrayInput` via:
//
//	WorkerRouteArray{ WorkerRouteArgs{...} }
type WorkerRouteArrayInput interface {
	pulumi.Input

	ToWorkerRouteArrayOutput() WorkerRouteArrayOutput
	ToWorkerRouteArrayOutputWithContext(context.Context) WorkerRouteArrayOutput
}

type WorkerRouteArray []WorkerRouteInput

func (WorkerRouteArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WorkerRoute)(nil)).Elem()
}

func (i WorkerRouteArray) ToWorkerRouteArrayOutput() WorkerRouteArrayOutput {
	return i.ToWorkerRouteArrayOutputWithContext(context.Background())
}

func (i WorkerRouteArray) ToWorkerRouteArrayOutputWithContext(ctx context.Context) WorkerRouteArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkerRouteArrayOutput)
}

// WorkerRouteMapInput is an input type that accepts WorkerRouteMap and WorkerRouteMapOutput values.
// You can construct a concrete instance of `WorkerRouteMapInput` via:
//
//	WorkerRouteMap{ "key": WorkerRouteArgs{...} }
type WorkerRouteMapInput interface {
	pulumi.Input

	ToWorkerRouteMapOutput() WorkerRouteMapOutput
	ToWorkerRouteMapOutputWithContext(context.Context) WorkerRouteMapOutput
}

type WorkerRouteMap map[string]WorkerRouteInput

func (WorkerRouteMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WorkerRoute)(nil)).Elem()
}

func (i WorkerRouteMap) ToWorkerRouteMapOutput() WorkerRouteMapOutput {
	return i.ToWorkerRouteMapOutputWithContext(context.Background())
}

func (i WorkerRouteMap) ToWorkerRouteMapOutputWithContext(ctx context.Context) WorkerRouteMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkerRouteMapOutput)
}

type WorkerRouteOutput struct{ *pulumi.OutputState }

func (WorkerRouteOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**WorkerRoute)(nil)).Elem()
}

func (o WorkerRouteOutput) ToWorkerRouteOutput() WorkerRouteOutput {
	return o
}

func (o WorkerRouteOutput) ToWorkerRouteOutputWithContext(ctx context.Context) WorkerRouteOutput {
	return o
}

// The [route pattern](https://developers.cloudflare.com/workers/about/routes/) to associate the Worker with.
func (o WorkerRouteOutput) Pattern() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkerRoute) pulumi.StringOutput { return v.Pattern }).(pulumi.StringOutput)
}

// Worker script name to invoke for requests that match the route pattern.
func (o WorkerRouteOutput) ScriptName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *WorkerRoute) pulumi.StringPtrOutput { return v.ScriptName }).(pulumi.StringPtrOutput)
}

// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
func (o WorkerRouteOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkerRoute) pulumi.StringOutput { return v.ZoneId }).(pulumi.StringOutput)
}

type WorkerRouteArrayOutput struct{ *pulumi.OutputState }

func (WorkerRouteArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WorkerRoute)(nil)).Elem()
}

func (o WorkerRouteArrayOutput) ToWorkerRouteArrayOutput() WorkerRouteArrayOutput {
	return o
}

func (o WorkerRouteArrayOutput) ToWorkerRouteArrayOutputWithContext(ctx context.Context) WorkerRouteArrayOutput {
	return o
}

func (o WorkerRouteArrayOutput) Index(i pulumi.IntInput) WorkerRouteOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *WorkerRoute {
		return vs[0].([]*WorkerRoute)[vs[1].(int)]
	}).(WorkerRouteOutput)
}

type WorkerRouteMapOutput struct{ *pulumi.OutputState }

func (WorkerRouteMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WorkerRoute)(nil)).Elem()
}

func (o WorkerRouteMapOutput) ToWorkerRouteMapOutput() WorkerRouteMapOutput {
	return o
}

func (o WorkerRouteMapOutput) ToWorkerRouteMapOutputWithContext(ctx context.Context) WorkerRouteMapOutput {
	return o
}

func (o WorkerRouteMapOutput) MapIndex(k pulumi.StringInput) WorkerRouteOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *WorkerRoute {
		return vs[0].(map[string]*WorkerRoute)[vs[1].(string)]
	}).(WorkerRouteOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*WorkerRouteInput)(nil)).Elem(), &WorkerRoute{})
	pulumi.RegisterInputType(reflect.TypeOf((*WorkerRouteArrayInput)(nil)).Elem(), WorkerRouteArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*WorkerRouteMapInput)(nil)).Elem(), WorkerRouteMap{})
	pulumi.RegisterOutputType(WorkerRouteOutput{})
	pulumi.RegisterOutputType(WorkerRouteArrayOutput{})
	pulumi.RegisterOutputType(WorkerRouteMapOutput{})
}
