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

// Provides a Cloudflare Waiting Room Event resource.
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
//			_, err := cloudflare.NewWaitingRoomEvent(ctx, "example", &cloudflare.WaitingRoomEventArgs{
//				EventEndTime:   pulumi.String("2006-01-02T20:04:05Z"),
//				EventStartTime: pulumi.String("2006-01-02T15:04:05Z"),
//				Name:           pulumi.String("foo"),
//				WaitingRoomId:  pulumi.String("d41d8cd98f00b204e9800998ecf8427e"),
//				ZoneId:         pulumi.String("0da42c8d2132a9ddaf714f9e7c920711"),
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
// Use the Zone ID, Waiting Room ID, and Event ID to import.
//
// ```sh
//
//	$ pulumi import cloudflare:index/waitingRoomEvent:WaitingRoomEvent default <zone_id>/<waiting_room_id>/<waiting_room_event_id>
//
// ```
type WaitingRoomEvent struct {
	pulumi.CustomResourceState

	// Creation time.
	CreatedOn pulumi.StringOutput `pulumi:"createdOn"`
	// This is a templated html file that will be rendered at the edge.
	CustomPageHtml pulumi.StringPtrOutput `pulumi:"customPageHtml"`
	// A description to let users add more details about the event.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Disables automatic renewal of session cookies.
	DisableSessionRenewal pulumi.BoolPtrOutput `pulumi:"disableSessionRenewal"`
	// ISO 8601 timestamp that marks the end of the event. **Modifying this attribute will force creation of a new resource.**
	EventEndTime pulumi.StringOutput `pulumi:"eventEndTime"`
	// ISO 8601 timestamp that marks the start of the event. Must occur at least 1 minute before `eventEndTime`. **Modifying this attribute will force creation of a new resource.**
	EventStartTime pulumi.StringOutput `pulumi:"eventStartTime"`
	// Last modified time.
	ModifiedOn pulumi.StringOutput `pulumi:"modifiedOn"`
	// A unique name to identify the event. Only alphanumeric characters, hyphens, and underscores are allowed. **Modifying this attribute will force creation of a new resource.**
	Name pulumi.StringOutput `pulumi:"name"`
	// The number of new users that will be let into the route every minute.
	NewUsersPerMinute pulumi.IntPtrOutput `pulumi:"newUsersPerMinute"`
	// ISO 8601 timestamp that marks when to begin queueing all users before the event starts. Must occur at least 5 minutes before `eventStartTime`.
	PrequeueStartTime pulumi.StringPtrOutput `pulumi:"prequeueStartTime"`
	// The queueing method used by the waiting room. Available values: `fifo`, `random`, `passthrough`, `reject`.
	QueueingMethod pulumi.StringPtrOutput `pulumi:"queueingMethod"`
	// Lifetime of a cookie (in minutes) set by Cloudflare for users who get access to the origin.
	SessionDuration pulumi.IntPtrOutput `pulumi:"sessionDuration"`
	// Users in the prequeue will be shuffled randomly at the `eventStartTime`. Requires that `prequeueStartTime` is not null. Defaults to `false`.
	ShuffleAtEventStart pulumi.BoolPtrOutput `pulumi:"shuffleAtEventStart"`
	// If suspended, the event is ignored and traffic will be handled based on the waiting room configuration.
	Suspended pulumi.BoolPtrOutput `pulumi:"suspended"`
	// The total number of active user sessions on the route at a point in time.
	TotalActiveUsers pulumi.IntPtrOutput `pulumi:"totalActiveUsers"`
	// The Waiting Room ID the event should apply to. **Modifying this attribute will force creation of a new resource.**
	WaitingRoomId pulumi.StringOutput `pulumi:"waitingRoomId"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewWaitingRoomEvent registers a new resource with the given unique name, arguments, and options.
func NewWaitingRoomEvent(ctx *pulumi.Context,
	name string, args *WaitingRoomEventArgs, opts ...pulumi.ResourceOption) (*WaitingRoomEvent, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.EventEndTime == nil {
		return nil, errors.New("invalid value for required argument 'EventEndTime'")
	}
	if args.EventStartTime == nil {
		return nil, errors.New("invalid value for required argument 'EventStartTime'")
	}
	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	if args.WaitingRoomId == nil {
		return nil, errors.New("invalid value for required argument 'WaitingRoomId'")
	}
	if args.ZoneId == nil {
		return nil, errors.New("invalid value for required argument 'ZoneId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource WaitingRoomEvent
	err := ctx.RegisterResource("cloudflare:index/waitingRoomEvent:WaitingRoomEvent", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWaitingRoomEvent gets an existing WaitingRoomEvent resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWaitingRoomEvent(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WaitingRoomEventState, opts ...pulumi.ResourceOption) (*WaitingRoomEvent, error) {
	var resource WaitingRoomEvent
	err := ctx.ReadResource("cloudflare:index/waitingRoomEvent:WaitingRoomEvent", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering WaitingRoomEvent resources.
type waitingRoomEventState struct {
	// Creation time.
	CreatedOn *string `pulumi:"createdOn"`
	// This is a templated html file that will be rendered at the edge.
	CustomPageHtml *string `pulumi:"customPageHtml"`
	// A description to let users add more details about the event.
	Description *string `pulumi:"description"`
	// Disables automatic renewal of session cookies.
	DisableSessionRenewal *bool `pulumi:"disableSessionRenewal"`
	// ISO 8601 timestamp that marks the end of the event. **Modifying this attribute will force creation of a new resource.**
	EventEndTime *string `pulumi:"eventEndTime"`
	// ISO 8601 timestamp that marks the start of the event. Must occur at least 1 minute before `eventEndTime`. **Modifying this attribute will force creation of a new resource.**
	EventStartTime *string `pulumi:"eventStartTime"`
	// Last modified time.
	ModifiedOn *string `pulumi:"modifiedOn"`
	// A unique name to identify the event. Only alphanumeric characters, hyphens, and underscores are allowed. **Modifying this attribute will force creation of a new resource.**
	Name *string `pulumi:"name"`
	// The number of new users that will be let into the route every minute.
	NewUsersPerMinute *int `pulumi:"newUsersPerMinute"`
	// ISO 8601 timestamp that marks when to begin queueing all users before the event starts. Must occur at least 5 minutes before `eventStartTime`.
	PrequeueStartTime *string `pulumi:"prequeueStartTime"`
	// The queueing method used by the waiting room. Available values: `fifo`, `random`, `passthrough`, `reject`.
	QueueingMethod *string `pulumi:"queueingMethod"`
	// Lifetime of a cookie (in minutes) set by Cloudflare for users who get access to the origin.
	SessionDuration *int `pulumi:"sessionDuration"`
	// Users in the prequeue will be shuffled randomly at the `eventStartTime`. Requires that `prequeueStartTime` is not null. Defaults to `false`.
	ShuffleAtEventStart *bool `pulumi:"shuffleAtEventStart"`
	// If suspended, the event is ignored and traffic will be handled based on the waiting room configuration.
	Suspended *bool `pulumi:"suspended"`
	// The total number of active user sessions on the route at a point in time.
	TotalActiveUsers *int `pulumi:"totalActiveUsers"`
	// The Waiting Room ID the event should apply to. **Modifying this attribute will force creation of a new resource.**
	WaitingRoomId *string `pulumi:"waitingRoomId"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId *string `pulumi:"zoneId"`
}

type WaitingRoomEventState struct {
	// Creation time.
	CreatedOn pulumi.StringPtrInput
	// This is a templated html file that will be rendered at the edge.
	CustomPageHtml pulumi.StringPtrInput
	// A description to let users add more details about the event.
	Description pulumi.StringPtrInput
	// Disables automatic renewal of session cookies.
	DisableSessionRenewal pulumi.BoolPtrInput
	// ISO 8601 timestamp that marks the end of the event. **Modifying this attribute will force creation of a new resource.**
	EventEndTime pulumi.StringPtrInput
	// ISO 8601 timestamp that marks the start of the event. Must occur at least 1 minute before `eventEndTime`. **Modifying this attribute will force creation of a new resource.**
	EventStartTime pulumi.StringPtrInput
	// Last modified time.
	ModifiedOn pulumi.StringPtrInput
	// A unique name to identify the event. Only alphanumeric characters, hyphens, and underscores are allowed. **Modifying this attribute will force creation of a new resource.**
	Name pulumi.StringPtrInput
	// The number of new users that will be let into the route every minute.
	NewUsersPerMinute pulumi.IntPtrInput
	// ISO 8601 timestamp that marks when to begin queueing all users before the event starts. Must occur at least 5 minutes before `eventStartTime`.
	PrequeueStartTime pulumi.StringPtrInput
	// The queueing method used by the waiting room. Available values: `fifo`, `random`, `passthrough`, `reject`.
	QueueingMethod pulumi.StringPtrInput
	// Lifetime of a cookie (in minutes) set by Cloudflare for users who get access to the origin.
	SessionDuration pulumi.IntPtrInput
	// Users in the prequeue will be shuffled randomly at the `eventStartTime`. Requires that `prequeueStartTime` is not null. Defaults to `false`.
	ShuffleAtEventStart pulumi.BoolPtrInput
	// If suspended, the event is ignored and traffic will be handled based on the waiting room configuration.
	Suspended pulumi.BoolPtrInput
	// The total number of active user sessions on the route at a point in time.
	TotalActiveUsers pulumi.IntPtrInput
	// The Waiting Room ID the event should apply to. **Modifying this attribute will force creation of a new resource.**
	WaitingRoomId pulumi.StringPtrInput
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringPtrInput
}

func (WaitingRoomEventState) ElementType() reflect.Type {
	return reflect.TypeOf((*waitingRoomEventState)(nil)).Elem()
}

type waitingRoomEventArgs struct {
	// This is a templated html file that will be rendered at the edge.
	CustomPageHtml *string `pulumi:"customPageHtml"`
	// A description to let users add more details about the event.
	Description *string `pulumi:"description"`
	// Disables automatic renewal of session cookies.
	DisableSessionRenewal *bool `pulumi:"disableSessionRenewal"`
	// ISO 8601 timestamp that marks the end of the event. **Modifying this attribute will force creation of a new resource.**
	EventEndTime string `pulumi:"eventEndTime"`
	// ISO 8601 timestamp that marks the start of the event. Must occur at least 1 minute before `eventEndTime`. **Modifying this attribute will force creation of a new resource.**
	EventStartTime string `pulumi:"eventStartTime"`
	// A unique name to identify the event. Only alphanumeric characters, hyphens, and underscores are allowed. **Modifying this attribute will force creation of a new resource.**
	Name string `pulumi:"name"`
	// The number of new users that will be let into the route every minute.
	NewUsersPerMinute *int `pulumi:"newUsersPerMinute"`
	// ISO 8601 timestamp that marks when to begin queueing all users before the event starts. Must occur at least 5 minutes before `eventStartTime`.
	PrequeueStartTime *string `pulumi:"prequeueStartTime"`
	// The queueing method used by the waiting room. Available values: `fifo`, `random`, `passthrough`, `reject`.
	QueueingMethod *string `pulumi:"queueingMethod"`
	// Lifetime of a cookie (in minutes) set by Cloudflare for users who get access to the origin.
	SessionDuration *int `pulumi:"sessionDuration"`
	// Users in the prequeue will be shuffled randomly at the `eventStartTime`. Requires that `prequeueStartTime` is not null. Defaults to `false`.
	ShuffleAtEventStart *bool `pulumi:"shuffleAtEventStart"`
	// If suspended, the event is ignored and traffic will be handled based on the waiting room configuration.
	Suspended *bool `pulumi:"suspended"`
	// The total number of active user sessions on the route at a point in time.
	TotalActiveUsers *int `pulumi:"totalActiveUsers"`
	// The Waiting Room ID the event should apply to. **Modifying this attribute will force creation of a new resource.**
	WaitingRoomId string `pulumi:"waitingRoomId"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a WaitingRoomEvent resource.
type WaitingRoomEventArgs struct {
	// This is a templated html file that will be rendered at the edge.
	CustomPageHtml pulumi.StringPtrInput
	// A description to let users add more details about the event.
	Description pulumi.StringPtrInput
	// Disables automatic renewal of session cookies.
	DisableSessionRenewal pulumi.BoolPtrInput
	// ISO 8601 timestamp that marks the end of the event. **Modifying this attribute will force creation of a new resource.**
	EventEndTime pulumi.StringInput
	// ISO 8601 timestamp that marks the start of the event. Must occur at least 1 minute before `eventEndTime`. **Modifying this attribute will force creation of a new resource.**
	EventStartTime pulumi.StringInput
	// A unique name to identify the event. Only alphanumeric characters, hyphens, and underscores are allowed. **Modifying this attribute will force creation of a new resource.**
	Name pulumi.StringInput
	// The number of new users that will be let into the route every minute.
	NewUsersPerMinute pulumi.IntPtrInput
	// ISO 8601 timestamp that marks when to begin queueing all users before the event starts. Must occur at least 5 minutes before `eventStartTime`.
	PrequeueStartTime pulumi.StringPtrInput
	// The queueing method used by the waiting room. Available values: `fifo`, `random`, `passthrough`, `reject`.
	QueueingMethod pulumi.StringPtrInput
	// Lifetime of a cookie (in minutes) set by Cloudflare for users who get access to the origin.
	SessionDuration pulumi.IntPtrInput
	// Users in the prequeue will be shuffled randomly at the `eventStartTime`. Requires that `prequeueStartTime` is not null. Defaults to `false`.
	ShuffleAtEventStart pulumi.BoolPtrInput
	// If suspended, the event is ignored and traffic will be handled based on the waiting room configuration.
	Suspended pulumi.BoolPtrInput
	// The total number of active user sessions on the route at a point in time.
	TotalActiveUsers pulumi.IntPtrInput
	// The Waiting Room ID the event should apply to. **Modifying this attribute will force creation of a new resource.**
	WaitingRoomId pulumi.StringInput
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringInput
}

func (WaitingRoomEventArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*waitingRoomEventArgs)(nil)).Elem()
}

type WaitingRoomEventInput interface {
	pulumi.Input

	ToWaitingRoomEventOutput() WaitingRoomEventOutput
	ToWaitingRoomEventOutputWithContext(ctx context.Context) WaitingRoomEventOutput
}

func (*WaitingRoomEvent) ElementType() reflect.Type {
	return reflect.TypeOf((**WaitingRoomEvent)(nil)).Elem()
}

func (i *WaitingRoomEvent) ToWaitingRoomEventOutput() WaitingRoomEventOutput {
	return i.ToWaitingRoomEventOutputWithContext(context.Background())
}

func (i *WaitingRoomEvent) ToWaitingRoomEventOutputWithContext(ctx context.Context) WaitingRoomEventOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WaitingRoomEventOutput)
}

// WaitingRoomEventArrayInput is an input type that accepts WaitingRoomEventArray and WaitingRoomEventArrayOutput values.
// You can construct a concrete instance of `WaitingRoomEventArrayInput` via:
//
//	WaitingRoomEventArray{ WaitingRoomEventArgs{...} }
type WaitingRoomEventArrayInput interface {
	pulumi.Input

	ToWaitingRoomEventArrayOutput() WaitingRoomEventArrayOutput
	ToWaitingRoomEventArrayOutputWithContext(context.Context) WaitingRoomEventArrayOutput
}

type WaitingRoomEventArray []WaitingRoomEventInput

func (WaitingRoomEventArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WaitingRoomEvent)(nil)).Elem()
}

func (i WaitingRoomEventArray) ToWaitingRoomEventArrayOutput() WaitingRoomEventArrayOutput {
	return i.ToWaitingRoomEventArrayOutputWithContext(context.Background())
}

func (i WaitingRoomEventArray) ToWaitingRoomEventArrayOutputWithContext(ctx context.Context) WaitingRoomEventArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WaitingRoomEventArrayOutput)
}

// WaitingRoomEventMapInput is an input type that accepts WaitingRoomEventMap and WaitingRoomEventMapOutput values.
// You can construct a concrete instance of `WaitingRoomEventMapInput` via:
//
//	WaitingRoomEventMap{ "key": WaitingRoomEventArgs{...} }
type WaitingRoomEventMapInput interface {
	pulumi.Input

	ToWaitingRoomEventMapOutput() WaitingRoomEventMapOutput
	ToWaitingRoomEventMapOutputWithContext(context.Context) WaitingRoomEventMapOutput
}

type WaitingRoomEventMap map[string]WaitingRoomEventInput

func (WaitingRoomEventMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WaitingRoomEvent)(nil)).Elem()
}

func (i WaitingRoomEventMap) ToWaitingRoomEventMapOutput() WaitingRoomEventMapOutput {
	return i.ToWaitingRoomEventMapOutputWithContext(context.Background())
}

func (i WaitingRoomEventMap) ToWaitingRoomEventMapOutputWithContext(ctx context.Context) WaitingRoomEventMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WaitingRoomEventMapOutput)
}

type WaitingRoomEventOutput struct{ *pulumi.OutputState }

func (WaitingRoomEventOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**WaitingRoomEvent)(nil)).Elem()
}

func (o WaitingRoomEventOutput) ToWaitingRoomEventOutput() WaitingRoomEventOutput {
	return o
}

func (o WaitingRoomEventOutput) ToWaitingRoomEventOutputWithContext(ctx context.Context) WaitingRoomEventOutput {
	return o
}

// Creation time.
func (o WaitingRoomEventOutput) CreatedOn() pulumi.StringOutput {
	return o.ApplyT(func(v *WaitingRoomEvent) pulumi.StringOutput { return v.CreatedOn }).(pulumi.StringOutput)
}

// This is a templated html file that will be rendered at the edge.
func (o WaitingRoomEventOutput) CustomPageHtml() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *WaitingRoomEvent) pulumi.StringPtrOutput { return v.CustomPageHtml }).(pulumi.StringPtrOutput)
}

// A description to let users add more details about the event.
func (o WaitingRoomEventOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *WaitingRoomEvent) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Disables automatic renewal of session cookies.
func (o WaitingRoomEventOutput) DisableSessionRenewal() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *WaitingRoomEvent) pulumi.BoolPtrOutput { return v.DisableSessionRenewal }).(pulumi.BoolPtrOutput)
}

// ISO 8601 timestamp that marks the end of the event. **Modifying this attribute will force creation of a new resource.**
func (o WaitingRoomEventOutput) EventEndTime() pulumi.StringOutput {
	return o.ApplyT(func(v *WaitingRoomEvent) pulumi.StringOutput { return v.EventEndTime }).(pulumi.StringOutput)
}

// ISO 8601 timestamp that marks the start of the event. Must occur at least 1 minute before `eventEndTime`. **Modifying this attribute will force creation of a new resource.**
func (o WaitingRoomEventOutput) EventStartTime() pulumi.StringOutput {
	return o.ApplyT(func(v *WaitingRoomEvent) pulumi.StringOutput { return v.EventStartTime }).(pulumi.StringOutput)
}

// Last modified time.
func (o WaitingRoomEventOutput) ModifiedOn() pulumi.StringOutput {
	return o.ApplyT(func(v *WaitingRoomEvent) pulumi.StringOutput { return v.ModifiedOn }).(pulumi.StringOutput)
}

// A unique name to identify the event. Only alphanumeric characters, hyphens, and underscores are allowed. **Modifying this attribute will force creation of a new resource.**
func (o WaitingRoomEventOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *WaitingRoomEvent) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The number of new users that will be let into the route every minute.
func (o WaitingRoomEventOutput) NewUsersPerMinute() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *WaitingRoomEvent) pulumi.IntPtrOutput { return v.NewUsersPerMinute }).(pulumi.IntPtrOutput)
}

// ISO 8601 timestamp that marks when to begin queueing all users before the event starts. Must occur at least 5 minutes before `eventStartTime`.
func (o WaitingRoomEventOutput) PrequeueStartTime() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *WaitingRoomEvent) pulumi.StringPtrOutput { return v.PrequeueStartTime }).(pulumi.StringPtrOutput)
}

// The queueing method used by the waiting room. Available values: `fifo`, `random`, `passthrough`, `reject`.
func (o WaitingRoomEventOutput) QueueingMethod() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *WaitingRoomEvent) pulumi.StringPtrOutput { return v.QueueingMethod }).(pulumi.StringPtrOutput)
}

// Lifetime of a cookie (in minutes) set by Cloudflare for users who get access to the origin.
func (o WaitingRoomEventOutput) SessionDuration() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *WaitingRoomEvent) pulumi.IntPtrOutput { return v.SessionDuration }).(pulumi.IntPtrOutput)
}

// Users in the prequeue will be shuffled randomly at the `eventStartTime`. Requires that `prequeueStartTime` is not null. Defaults to `false`.
func (o WaitingRoomEventOutput) ShuffleAtEventStart() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *WaitingRoomEvent) pulumi.BoolPtrOutput { return v.ShuffleAtEventStart }).(pulumi.BoolPtrOutput)
}

// If suspended, the event is ignored and traffic will be handled based on the waiting room configuration.
func (o WaitingRoomEventOutput) Suspended() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *WaitingRoomEvent) pulumi.BoolPtrOutput { return v.Suspended }).(pulumi.BoolPtrOutput)
}

// The total number of active user sessions on the route at a point in time.
func (o WaitingRoomEventOutput) TotalActiveUsers() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *WaitingRoomEvent) pulumi.IntPtrOutput { return v.TotalActiveUsers }).(pulumi.IntPtrOutput)
}

// The Waiting Room ID the event should apply to. **Modifying this attribute will force creation of a new resource.**
func (o WaitingRoomEventOutput) WaitingRoomId() pulumi.StringOutput {
	return o.ApplyT(func(v *WaitingRoomEvent) pulumi.StringOutput { return v.WaitingRoomId }).(pulumi.StringOutput)
}

// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
func (o WaitingRoomEventOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *WaitingRoomEvent) pulumi.StringOutput { return v.ZoneId }).(pulumi.StringOutput)
}

type WaitingRoomEventArrayOutput struct{ *pulumi.OutputState }

func (WaitingRoomEventArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WaitingRoomEvent)(nil)).Elem()
}

func (o WaitingRoomEventArrayOutput) ToWaitingRoomEventArrayOutput() WaitingRoomEventArrayOutput {
	return o
}

func (o WaitingRoomEventArrayOutput) ToWaitingRoomEventArrayOutputWithContext(ctx context.Context) WaitingRoomEventArrayOutput {
	return o
}

func (o WaitingRoomEventArrayOutput) Index(i pulumi.IntInput) WaitingRoomEventOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *WaitingRoomEvent {
		return vs[0].([]*WaitingRoomEvent)[vs[1].(int)]
	}).(WaitingRoomEventOutput)
}

type WaitingRoomEventMapOutput struct{ *pulumi.OutputState }

func (WaitingRoomEventMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WaitingRoomEvent)(nil)).Elem()
}

func (o WaitingRoomEventMapOutput) ToWaitingRoomEventMapOutput() WaitingRoomEventMapOutput {
	return o
}

func (o WaitingRoomEventMapOutput) ToWaitingRoomEventMapOutputWithContext(ctx context.Context) WaitingRoomEventMapOutput {
	return o
}

func (o WaitingRoomEventMapOutput) MapIndex(k pulumi.StringInput) WaitingRoomEventOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *WaitingRoomEvent {
		return vs[0].(map[string]*WaitingRoomEvent)[vs[1].(string)]
	}).(WaitingRoomEventOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*WaitingRoomEventInput)(nil)).Elem(), &WaitingRoomEvent{})
	pulumi.RegisterInputType(reflect.TypeOf((*WaitingRoomEventArrayInput)(nil)).Elem(), WaitingRoomEventArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*WaitingRoomEventMapInput)(nil)).Elem(), WaitingRoomEventMap{})
	pulumi.RegisterOutputType(WaitingRoomEventOutput{})
	pulumi.RegisterOutputType(WaitingRoomEventArrayOutput{})
	pulumi.RegisterOutputType(WaitingRoomEventMapOutput{})
}
