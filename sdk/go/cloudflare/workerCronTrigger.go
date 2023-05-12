// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Worker Cron Triggers allow users to map a cron expression to a Worker script
// using a `ScheduledEvent` listener that enables Workers to be executed on a
// schedule. Worker Cron Triggers are ideal for running periodic jobs for
// maintenance or calling third-party APIs to collect up-to-date data.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"os"
//
//	"github.com/pulumi/pulumi-cloudflare/sdk/v5/go/cloudflare"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func readFileOrPanic(path string) pulumi.StringPtrInput {
//		data, err := os.ReadFile(path)
//		if err != nil {
//			panic(err.Error())
//		}
//		return pulumi.String(string(data))
//	}
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			exampleScript, err := cloudflare.NewWorkerScript(ctx, "exampleScript", &cloudflare.WorkerScriptArgs{
//				AccountId: pulumi.String("f037e56e89293a057740de681ac9abbe"),
//				Name:      pulumi.String("example-script"),
//				Content:   readFileOrPanic("path/to/my.js"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = cloudflare.NewWorkerCronTrigger(ctx, "exampleTrigger", &cloudflare.WorkerCronTriggerArgs{
//				AccountId:  pulumi.String("f037e56e89293a057740de681ac9abbe"),
//				ScriptName: exampleScript.Name,
//				Schedules: pulumi.StringArray{
//					pulumi.String("*/5 * * * *"),
//					pulumi.String("10 7 * * mon-fri"),
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
// ```sh
//
//	$ pulumi import cloudflare:index/workerCronTrigger:WorkerCronTrigger example <account_id>/<script_name>
//
// ```
type WorkerCronTrigger struct {
	pulumi.CustomResourceState

	// The account identifier to target for the resource.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// Cron expressions to execute the Worker script.
	Schedules pulumi.StringArrayOutput `pulumi:"schedules"`
	// Worker script to target for the schedules.
	ScriptName pulumi.StringOutput `pulumi:"scriptName"`
}

// NewWorkerCronTrigger registers a new resource with the given unique name, arguments, and options.
func NewWorkerCronTrigger(ctx *pulumi.Context,
	name string, args *WorkerCronTriggerArgs, opts ...pulumi.ResourceOption) (*WorkerCronTrigger, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.Schedules == nil {
		return nil, errors.New("invalid value for required argument 'Schedules'")
	}
	if args.ScriptName == nil {
		return nil, errors.New("invalid value for required argument 'ScriptName'")
	}
	var resource WorkerCronTrigger
	err := ctx.RegisterResource("cloudflare:index/workerCronTrigger:WorkerCronTrigger", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWorkerCronTrigger gets an existing WorkerCronTrigger resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWorkerCronTrigger(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WorkerCronTriggerState, opts ...pulumi.ResourceOption) (*WorkerCronTrigger, error) {
	var resource WorkerCronTrigger
	err := ctx.ReadResource("cloudflare:index/workerCronTrigger:WorkerCronTrigger", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering WorkerCronTrigger resources.
type workerCronTriggerState struct {
	// The account identifier to target for the resource.
	AccountId *string `pulumi:"accountId"`
	// Cron expressions to execute the Worker script.
	Schedules []string `pulumi:"schedules"`
	// Worker script to target for the schedules.
	ScriptName *string `pulumi:"scriptName"`
}

type WorkerCronTriggerState struct {
	// The account identifier to target for the resource.
	AccountId pulumi.StringPtrInput
	// Cron expressions to execute the Worker script.
	Schedules pulumi.StringArrayInput
	// Worker script to target for the schedules.
	ScriptName pulumi.StringPtrInput
}

func (WorkerCronTriggerState) ElementType() reflect.Type {
	return reflect.TypeOf((*workerCronTriggerState)(nil)).Elem()
}

type workerCronTriggerArgs struct {
	// The account identifier to target for the resource.
	AccountId string `pulumi:"accountId"`
	// Cron expressions to execute the Worker script.
	Schedules []string `pulumi:"schedules"`
	// Worker script to target for the schedules.
	ScriptName string `pulumi:"scriptName"`
}

// The set of arguments for constructing a WorkerCronTrigger resource.
type WorkerCronTriggerArgs struct {
	// The account identifier to target for the resource.
	AccountId pulumi.StringInput
	// Cron expressions to execute the Worker script.
	Schedules pulumi.StringArrayInput
	// Worker script to target for the schedules.
	ScriptName pulumi.StringInput
}

func (WorkerCronTriggerArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*workerCronTriggerArgs)(nil)).Elem()
}

type WorkerCronTriggerInput interface {
	pulumi.Input

	ToWorkerCronTriggerOutput() WorkerCronTriggerOutput
	ToWorkerCronTriggerOutputWithContext(ctx context.Context) WorkerCronTriggerOutput
}

func (*WorkerCronTrigger) ElementType() reflect.Type {
	return reflect.TypeOf((**WorkerCronTrigger)(nil)).Elem()
}

func (i *WorkerCronTrigger) ToWorkerCronTriggerOutput() WorkerCronTriggerOutput {
	return i.ToWorkerCronTriggerOutputWithContext(context.Background())
}

func (i *WorkerCronTrigger) ToWorkerCronTriggerOutputWithContext(ctx context.Context) WorkerCronTriggerOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkerCronTriggerOutput)
}

// WorkerCronTriggerArrayInput is an input type that accepts WorkerCronTriggerArray and WorkerCronTriggerArrayOutput values.
// You can construct a concrete instance of `WorkerCronTriggerArrayInput` via:
//
//	WorkerCronTriggerArray{ WorkerCronTriggerArgs{...} }
type WorkerCronTriggerArrayInput interface {
	pulumi.Input

	ToWorkerCronTriggerArrayOutput() WorkerCronTriggerArrayOutput
	ToWorkerCronTriggerArrayOutputWithContext(context.Context) WorkerCronTriggerArrayOutput
}

type WorkerCronTriggerArray []WorkerCronTriggerInput

func (WorkerCronTriggerArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WorkerCronTrigger)(nil)).Elem()
}

func (i WorkerCronTriggerArray) ToWorkerCronTriggerArrayOutput() WorkerCronTriggerArrayOutput {
	return i.ToWorkerCronTriggerArrayOutputWithContext(context.Background())
}

func (i WorkerCronTriggerArray) ToWorkerCronTriggerArrayOutputWithContext(ctx context.Context) WorkerCronTriggerArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkerCronTriggerArrayOutput)
}

// WorkerCronTriggerMapInput is an input type that accepts WorkerCronTriggerMap and WorkerCronTriggerMapOutput values.
// You can construct a concrete instance of `WorkerCronTriggerMapInput` via:
//
//	WorkerCronTriggerMap{ "key": WorkerCronTriggerArgs{...} }
type WorkerCronTriggerMapInput interface {
	pulumi.Input

	ToWorkerCronTriggerMapOutput() WorkerCronTriggerMapOutput
	ToWorkerCronTriggerMapOutputWithContext(context.Context) WorkerCronTriggerMapOutput
}

type WorkerCronTriggerMap map[string]WorkerCronTriggerInput

func (WorkerCronTriggerMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WorkerCronTrigger)(nil)).Elem()
}

func (i WorkerCronTriggerMap) ToWorkerCronTriggerMapOutput() WorkerCronTriggerMapOutput {
	return i.ToWorkerCronTriggerMapOutputWithContext(context.Background())
}

func (i WorkerCronTriggerMap) ToWorkerCronTriggerMapOutputWithContext(ctx context.Context) WorkerCronTriggerMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkerCronTriggerMapOutput)
}

type WorkerCronTriggerOutput struct{ *pulumi.OutputState }

func (WorkerCronTriggerOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**WorkerCronTrigger)(nil)).Elem()
}

func (o WorkerCronTriggerOutput) ToWorkerCronTriggerOutput() WorkerCronTriggerOutput {
	return o
}

func (o WorkerCronTriggerOutput) ToWorkerCronTriggerOutputWithContext(ctx context.Context) WorkerCronTriggerOutput {
	return o
}

// The account identifier to target for the resource.
func (o WorkerCronTriggerOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkerCronTrigger) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// Cron expressions to execute the Worker script.
func (o WorkerCronTriggerOutput) Schedules() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *WorkerCronTrigger) pulumi.StringArrayOutput { return v.Schedules }).(pulumi.StringArrayOutput)
}

// Worker script to target for the schedules.
func (o WorkerCronTriggerOutput) ScriptName() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkerCronTrigger) pulumi.StringOutput { return v.ScriptName }).(pulumi.StringOutput)
}

type WorkerCronTriggerArrayOutput struct{ *pulumi.OutputState }

func (WorkerCronTriggerArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WorkerCronTrigger)(nil)).Elem()
}

func (o WorkerCronTriggerArrayOutput) ToWorkerCronTriggerArrayOutput() WorkerCronTriggerArrayOutput {
	return o
}

func (o WorkerCronTriggerArrayOutput) ToWorkerCronTriggerArrayOutputWithContext(ctx context.Context) WorkerCronTriggerArrayOutput {
	return o
}

func (o WorkerCronTriggerArrayOutput) Index(i pulumi.IntInput) WorkerCronTriggerOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *WorkerCronTrigger {
		return vs[0].([]*WorkerCronTrigger)[vs[1].(int)]
	}).(WorkerCronTriggerOutput)
}

type WorkerCronTriggerMapOutput struct{ *pulumi.OutputState }

func (WorkerCronTriggerMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WorkerCronTrigger)(nil)).Elem()
}

func (o WorkerCronTriggerMapOutput) ToWorkerCronTriggerMapOutput() WorkerCronTriggerMapOutput {
	return o
}

func (o WorkerCronTriggerMapOutput) ToWorkerCronTriggerMapOutputWithContext(ctx context.Context) WorkerCronTriggerMapOutput {
	return o
}

func (o WorkerCronTriggerMapOutput) MapIndex(k pulumi.StringInput) WorkerCronTriggerOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *WorkerCronTrigger {
		return vs[0].(map[string]*WorkerCronTrigger)[vs[1].(string)]
	}).(WorkerCronTriggerOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*WorkerCronTriggerInput)(nil)).Elem(), &WorkerCronTrigger{})
	pulumi.RegisterInputType(reflect.TypeOf((*WorkerCronTriggerArrayInput)(nil)).Elem(), WorkerCronTriggerArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*WorkerCronTriggerMapInput)(nil)).Elem(), WorkerCronTriggerMap{})
	pulumi.RegisterOutputType(WorkerCronTriggerOutput{})
	pulumi.RegisterOutputType(WorkerCronTriggerArrayOutput{})
	pulumi.RegisterOutputType(WorkerCronTriggerMapOutput{})
}
