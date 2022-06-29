// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Cloudflare Waiting Room resource.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-cloudflare/sdk/v4/go/cloudflare"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := cloudflare.NewWaitingRoom(ctx, "example", &cloudflare.WaitingRoomArgs{
// 			Host:              pulumi.String("foo.example.com"),
// 			Name:              pulumi.String("foo"),
// 			NewUsersPerMinute: pulumi.Int(200),
// 			Path:              pulumi.String("/"),
// 			TotalActiveUsers:  pulumi.Int(200),
// 			ZoneId:            pulumi.String("ae36f999674d196762efcc5abb06b345"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// # Use the Zone ID and Waiting Room ID to import.
//
// ```sh
//  $ pulumi import cloudflare:index/waitingRoom:WaitingRoom default <zone_id>/<waiting_room_id>
// ```
type WaitingRoom struct {
	pulumi.CustomResourceState

	// This is a templated html file that will be rendered at the edge.
	CustomPageHtml pulumi.StringPtrOutput `pulumi:"customPageHtml"`
	// The language to use for the default waiting room page. Available values: `de-DE`, `es-ES`, `en-US`, `fr-FR`, `id-ID`,
	// `it-IT`, `ja-JP`, `ko-KR`, `nl-NL`, `pl-PL`, `pt-BR`, `tr-TR`, `zh-CN`, `zh-TW`
	DefaultTemplateLanguage pulumi.StringPtrOutput `pulumi:"defaultTemplateLanguage"`
	// A description to add more details about the waiting room.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Disables automatic renewal of session cookies.
	DisableSessionRenewal pulumi.BoolPtrOutput `pulumi:"disableSessionRenewal"`
	// Host name for which the waiting room will be applied (no wildcards)
	Host pulumi.StringOutput `pulumi:"host"`
	// If true, requests to the waiting room with the header `Accept: application/json` will receive a JSON response object.
	JsonResponseEnabled pulumi.BoolPtrOutput `pulumi:"jsonResponseEnabled"`
	// A unique name to identify the waiting room.
	Name pulumi.StringOutput `pulumi:"name"`
	// The number of new users that will be let into the route every minute.
	NewUsersPerMinute pulumi.IntOutput `pulumi:"newUsersPerMinute"`
	// The path within the host to enable the waiting room on.
	Path pulumi.StringPtrOutput `pulumi:"path"`
	// If queue_all is true, then all traffic will be sent to the waiting room.
	QueueAll pulumi.BoolPtrOutput `pulumi:"queueAll"`
	// Lifetime of a cookie (in minutes) set by Cloudflare for users who get access to the origin.
	SessionDuration pulumi.IntPtrOutput `pulumi:"sessionDuration"`
	// Suspends the waiting room.
	Suspended pulumi.BoolPtrOutput `pulumi:"suspended"`
	// The total number of active user sessions on the route at a point in time.
	TotalActiveUsers pulumi.IntOutput `pulumi:"totalActiveUsers"`
	// The zone identifier to target for the resource.
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewWaitingRoom registers a new resource with the given unique name, arguments, and options.
func NewWaitingRoom(ctx *pulumi.Context,
	name string, args *WaitingRoomArgs, opts ...pulumi.ResourceOption) (*WaitingRoom, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Host == nil {
		return nil, errors.New("invalid value for required argument 'Host'")
	}
	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	if args.NewUsersPerMinute == nil {
		return nil, errors.New("invalid value for required argument 'NewUsersPerMinute'")
	}
	if args.TotalActiveUsers == nil {
		return nil, errors.New("invalid value for required argument 'TotalActiveUsers'")
	}
	if args.ZoneId == nil {
		return nil, errors.New("invalid value for required argument 'ZoneId'")
	}
	var resource WaitingRoom
	err := ctx.RegisterResource("cloudflare:index/waitingRoom:WaitingRoom", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWaitingRoom gets an existing WaitingRoom resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWaitingRoom(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WaitingRoomState, opts ...pulumi.ResourceOption) (*WaitingRoom, error) {
	var resource WaitingRoom
	err := ctx.ReadResource("cloudflare:index/waitingRoom:WaitingRoom", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering WaitingRoom resources.
type waitingRoomState struct {
	// This is a templated html file that will be rendered at the edge.
	CustomPageHtml *string `pulumi:"customPageHtml"`
	// The language to use for the default waiting room page. Available values: `de-DE`, `es-ES`, `en-US`, `fr-FR`, `id-ID`,
	// `it-IT`, `ja-JP`, `ko-KR`, `nl-NL`, `pl-PL`, `pt-BR`, `tr-TR`, `zh-CN`, `zh-TW`
	DefaultTemplateLanguage *string `pulumi:"defaultTemplateLanguage"`
	// A description to add more details about the waiting room.
	Description *string `pulumi:"description"`
	// Disables automatic renewal of session cookies.
	DisableSessionRenewal *bool `pulumi:"disableSessionRenewal"`
	// Host name for which the waiting room will be applied (no wildcards)
	Host *string `pulumi:"host"`
	// If true, requests to the waiting room with the header `Accept: application/json` will receive a JSON response object.
	JsonResponseEnabled *bool `pulumi:"jsonResponseEnabled"`
	// A unique name to identify the waiting room.
	Name *string `pulumi:"name"`
	// The number of new users that will be let into the route every minute.
	NewUsersPerMinute *int `pulumi:"newUsersPerMinute"`
	// The path within the host to enable the waiting room on.
	Path *string `pulumi:"path"`
	// If queue_all is true, then all traffic will be sent to the waiting room.
	QueueAll *bool `pulumi:"queueAll"`
	// Lifetime of a cookie (in minutes) set by Cloudflare for users who get access to the origin.
	SessionDuration *int `pulumi:"sessionDuration"`
	// Suspends the waiting room.
	Suspended *bool `pulumi:"suspended"`
	// The total number of active user sessions on the route at a point in time.
	TotalActiveUsers *int `pulumi:"totalActiveUsers"`
	// The zone identifier to target for the resource.
	ZoneId *string `pulumi:"zoneId"`
}

type WaitingRoomState struct {
	// This is a templated html file that will be rendered at the edge.
	CustomPageHtml pulumi.StringPtrInput
	// The language to use for the default waiting room page. Available values: `de-DE`, `es-ES`, `en-US`, `fr-FR`, `id-ID`,
	// `it-IT`, `ja-JP`, `ko-KR`, `nl-NL`, `pl-PL`, `pt-BR`, `tr-TR`, `zh-CN`, `zh-TW`
	DefaultTemplateLanguage pulumi.StringPtrInput
	// A description to add more details about the waiting room.
	Description pulumi.StringPtrInput
	// Disables automatic renewal of session cookies.
	DisableSessionRenewal pulumi.BoolPtrInput
	// Host name for which the waiting room will be applied (no wildcards)
	Host pulumi.StringPtrInput
	// If true, requests to the waiting room with the header `Accept: application/json` will receive a JSON response object.
	JsonResponseEnabled pulumi.BoolPtrInput
	// A unique name to identify the waiting room.
	Name pulumi.StringPtrInput
	// The number of new users that will be let into the route every minute.
	NewUsersPerMinute pulumi.IntPtrInput
	// The path within the host to enable the waiting room on.
	Path pulumi.StringPtrInput
	// If queue_all is true, then all traffic will be sent to the waiting room.
	QueueAll pulumi.BoolPtrInput
	// Lifetime of a cookie (in minutes) set by Cloudflare for users who get access to the origin.
	SessionDuration pulumi.IntPtrInput
	// Suspends the waiting room.
	Suspended pulumi.BoolPtrInput
	// The total number of active user sessions on the route at a point in time.
	TotalActiveUsers pulumi.IntPtrInput
	// The zone identifier to target for the resource.
	ZoneId pulumi.StringPtrInput
}

func (WaitingRoomState) ElementType() reflect.Type {
	return reflect.TypeOf((*waitingRoomState)(nil)).Elem()
}

type waitingRoomArgs struct {
	// This is a templated html file that will be rendered at the edge.
	CustomPageHtml *string `pulumi:"customPageHtml"`
	// The language to use for the default waiting room page. Available values: `de-DE`, `es-ES`, `en-US`, `fr-FR`, `id-ID`,
	// `it-IT`, `ja-JP`, `ko-KR`, `nl-NL`, `pl-PL`, `pt-BR`, `tr-TR`, `zh-CN`, `zh-TW`
	DefaultTemplateLanguage *string `pulumi:"defaultTemplateLanguage"`
	// A description to add more details about the waiting room.
	Description *string `pulumi:"description"`
	// Disables automatic renewal of session cookies.
	DisableSessionRenewal *bool `pulumi:"disableSessionRenewal"`
	// Host name for which the waiting room will be applied (no wildcards)
	Host string `pulumi:"host"`
	// If true, requests to the waiting room with the header `Accept: application/json` will receive a JSON response object.
	JsonResponseEnabled *bool `pulumi:"jsonResponseEnabled"`
	// A unique name to identify the waiting room.
	Name string `pulumi:"name"`
	// The number of new users that will be let into the route every minute.
	NewUsersPerMinute int `pulumi:"newUsersPerMinute"`
	// The path within the host to enable the waiting room on.
	Path *string `pulumi:"path"`
	// If queue_all is true, then all traffic will be sent to the waiting room.
	QueueAll *bool `pulumi:"queueAll"`
	// Lifetime of a cookie (in minutes) set by Cloudflare for users who get access to the origin.
	SessionDuration *int `pulumi:"sessionDuration"`
	// Suspends the waiting room.
	Suspended *bool `pulumi:"suspended"`
	// The total number of active user sessions on the route at a point in time.
	TotalActiveUsers int `pulumi:"totalActiveUsers"`
	// The zone identifier to target for the resource.
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a WaitingRoom resource.
type WaitingRoomArgs struct {
	// This is a templated html file that will be rendered at the edge.
	CustomPageHtml pulumi.StringPtrInput
	// The language to use for the default waiting room page. Available values: `de-DE`, `es-ES`, `en-US`, `fr-FR`, `id-ID`,
	// `it-IT`, `ja-JP`, `ko-KR`, `nl-NL`, `pl-PL`, `pt-BR`, `tr-TR`, `zh-CN`, `zh-TW`
	DefaultTemplateLanguage pulumi.StringPtrInput
	// A description to add more details about the waiting room.
	Description pulumi.StringPtrInput
	// Disables automatic renewal of session cookies.
	DisableSessionRenewal pulumi.BoolPtrInput
	// Host name for which the waiting room will be applied (no wildcards)
	Host pulumi.StringInput
	// If true, requests to the waiting room with the header `Accept: application/json` will receive a JSON response object.
	JsonResponseEnabled pulumi.BoolPtrInput
	// A unique name to identify the waiting room.
	Name pulumi.StringInput
	// The number of new users that will be let into the route every minute.
	NewUsersPerMinute pulumi.IntInput
	// The path within the host to enable the waiting room on.
	Path pulumi.StringPtrInput
	// If queue_all is true, then all traffic will be sent to the waiting room.
	QueueAll pulumi.BoolPtrInput
	// Lifetime of a cookie (in minutes) set by Cloudflare for users who get access to the origin.
	SessionDuration pulumi.IntPtrInput
	// Suspends the waiting room.
	Suspended pulumi.BoolPtrInput
	// The total number of active user sessions on the route at a point in time.
	TotalActiveUsers pulumi.IntInput
	// The zone identifier to target for the resource.
	ZoneId pulumi.StringInput
}

func (WaitingRoomArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*waitingRoomArgs)(nil)).Elem()
}

type WaitingRoomInput interface {
	pulumi.Input

	ToWaitingRoomOutput() WaitingRoomOutput
	ToWaitingRoomOutputWithContext(ctx context.Context) WaitingRoomOutput
}

func (*WaitingRoom) ElementType() reflect.Type {
	return reflect.TypeOf((**WaitingRoom)(nil)).Elem()
}

func (i *WaitingRoom) ToWaitingRoomOutput() WaitingRoomOutput {
	return i.ToWaitingRoomOutputWithContext(context.Background())
}

func (i *WaitingRoom) ToWaitingRoomOutputWithContext(ctx context.Context) WaitingRoomOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WaitingRoomOutput)
}

// WaitingRoomArrayInput is an input type that accepts WaitingRoomArray and WaitingRoomArrayOutput values.
// You can construct a concrete instance of `WaitingRoomArrayInput` via:
//
//          WaitingRoomArray{ WaitingRoomArgs{...} }
type WaitingRoomArrayInput interface {
	pulumi.Input

	ToWaitingRoomArrayOutput() WaitingRoomArrayOutput
	ToWaitingRoomArrayOutputWithContext(context.Context) WaitingRoomArrayOutput
}

type WaitingRoomArray []WaitingRoomInput

func (WaitingRoomArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WaitingRoom)(nil)).Elem()
}

func (i WaitingRoomArray) ToWaitingRoomArrayOutput() WaitingRoomArrayOutput {
	return i.ToWaitingRoomArrayOutputWithContext(context.Background())
}

func (i WaitingRoomArray) ToWaitingRoomArrayOutputWithContext(ctx context.Context) WaitingRoomArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WaitingRoomArrayOutput)
}

// WaitingRoomMapInput is an input type that accepts WaitingRoomMap and WaitingRoomMapOutput values.
// You can construct a concrete instance of `WaitingRoomMapInput` via:
//
//          WaitingRoomMap{ "key": WaitingRoomArgs{...} }
type WaitingRoomMapInput interface {
	pulumi.Input

	ToWaitingRoomMapOutput() WaitingRoomMapOutput
	ToWaitingRoomMapOutputWithContext(context.Context) WaitingRoomMapOutput
}

type WaitingRoomMap map[string]WaitingRoomInput

func (WaitingRoomMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WaitingRoom)(nil)).Elem()
}

func (i WaitingRoomMap) ToWaitingRoomMapOutput() WaitingRoomMapOutput {
	return i.ToWaitingRoomMapOutputWithContext(context.Background())
}

func (i WaitingRoomMap) ToWaitingRoomMapOutputWithContext(ctx context.Context) WaitingRoomMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WaitingRoomMapOutput)
}

type WaitingRoomOutput struct{ *pulumi.OutputState }

func (WaitingRoomOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**WaitingRoom)(nil)).Elem()
}

func (o WaitingRoomOutput) ToWaitingRoomOutput() WaitingRoomOutput {
	return o
}

func (o WaitingRoomOutput) ToWaitingRoomOutputWithContext(ctx context.Context) WaitingRoomOutput {
	return o
}

// This is a templated html file that will be rendered at the edge.
func (o WaitingRoomOutput) CustomPageHtml() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *WaitingRoom) pulumi.StringPtrOutput { return v.CustomPageHtml }).(pulumi.StringPtrOutput)
}

// The language to use for the default waiting room page. Available values: `de-DE`, `es-ES`, `en-US`, `fr-FR`, `id-ID`,
// `it-IT`, `ja-JP`, `ko-KR`, `nl-NL`, `pl-PL`, `pt-BR`, `tr-TR`, `zh-CN`, `zh-TW`
func (o WaitingRoomOutput) DefaultTemplateLanguage() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *WaitingRoom) pulumi.StringPtrOutput { return v.DefaultTemplateLanguage }).(pulumi.StringPtrOutput)
}

// A description to add more details about the waiting room.
func (o WaitingRoomOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *WaitingRoom) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Disables automatic renewal of session cookies.
func (o WaitingRoomOutput) DisableSessionRenewal() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *WaitingRoom) pulumi.BoolPtrOutput { return v.DisableSessionRenewal }).(pulumi.BoolPtrOutput)
}

// Host name for which the waiting room will be applied (no wildcards)
func (o WaitingRoomOutput) Host() pulumi.StringOutput {
	return o.ApplyT(func(v *WaitingRoom) pulumi.StringOutput { return v.Host }).(pulumi.StringOutput)
}

// If true, requests to the waiting room with the header `Accept: application/json` will receive a JSON response object.
func (o WaitingRoomOutput) JsonResponseEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *WaitingRoom) pulumi.BoolPtrOutput { return v.JsonResponseEnabled }).(pulumi.BoolPtrOutput)
}

// A unique name to identify the waiting room.
func (o WaitingRoomOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *WaitingRoom) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The number of new users that will be let into the route every minute.
func (o WaitingRoomOutput) NewUsersPerMinute() pulumi.IntOutput {
	return o.ApplyT(func(v *WaitingRoom) pulumi.IntOutput { return v.NewUsersPerMinute }).(pulumi.IntOutput)
}

// The path within the host to enable the waiting room on.
func (o WaitingRoomOutput) Path() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *WaitingRoom) pulumi.StringPtrOutput { return v.Path }).(pulumi.StringPtrOutput)
}

// If queue_all is true, then all traffic will be sent to the waiting room.
func (o WaitingRoomOutput) QueueAll() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *WaitingRoom) pulumi.BoolPtrOutput { return v.QueueAll }).(pulumi.BoolPtrOutput)
}

// Lifetime of a cookie (in minutes) set by Cloudflare for users who get access to the origin.
func (o WaitingRoomOutput) SessionDuration() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *WaitingRoom) pulumi.IntPtrOutput { return v.SessionDuration }).(pulumi.IntPtrOutput)
}

// Suspends the waiting room.
func (o WaitingRoomOutput) Suspended() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *WaitingRoom) pulumi.BoolPtrOutput { return v.Suspended }).(pulumi.BoolPtrOutput)
}

// The total number of active user sessions on the route at a point in time.
func (o WaitingRoomOutput) TotalActiveUsers() pulumi.IntOutput {
	return o.ApplyT(func(v *WaitingRoom) pulumi.IntOutput { return v.TotalActiveUsers }).(pulumi.IntOutput)
}

// The zone identifier to target for the resource.
func (o WaitingRoomOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *WaitingRoom) pulumi.StringOutput { return v.ZoneId }).(pulumi.StringOutput)
}

type WaitingRoomArrayOutput struct{ *pulumi.OutputState }

func (WaitingRoomArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WaitingRoom)(nil)).Elem()
}

func (o WaitingRoomArrayOutput) ToWaitingRoomArrayOutput() WaitingRoomArrayOutput {
	return o
}

func (o WaitingRoomArrayOutput) ToWaitingRoomArrayOutputWithContext(ctx context.Context) WaitingRoomArrayOutput {
	return o
}

func (o WaitingRoomArrayOutput) Index(i pulumi.IntInput) WaitingRoomOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *WaitingRoom {
		return vs[0].([]*WaitingRoom)[vs[1].(int)]
	}).(WaitingRoomOutput)
}

type WaitingRoomMapOutput struct{ *pulumi.OutputState }

func (WaitingRoomMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WaitingRoom)(nil)).Elem()
}

func (o WaitingRoomMapOutput) ToWaitingRoomMapOutput() WaitingRoomMapOutput {
	return o
}

func (o WaitingRoomMapOutput) ToWaitingRoomMapOutputWithContext(ctx context.Context) WaitingRoomMapOutput {
	return o
}

func (o WaitingRoomMapOutput) MapIndex(k pulumi.StringInput) WaitingRoomOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *WaitingRoom {
		return vs[0].(map[string]*WaitingRoom)[vs[1].(string)]
	}).(WaitingRoomOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*WaitingRoomInput)(nil)).Elem(), &WaitingRoom{})
	pulumi.RegisterInputType(reflect.TypeOf((*WaitingRoomArrayInput)(nil)).Elem(), WaitingRoomArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*WaitingRoomMapInput)(nil)).Elem(), WaitingRoomMap{})
	pulumi.RegisterOutputType(WaitingRoomOutput{})
	pulumi.RegisterOutputType(WaitingRoomArrayOutput{})
	pulumi.RegisterOutputType(WaitingRoomMapOutput{})
}
