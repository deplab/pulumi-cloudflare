// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// Logpush jobs can be imported using a composite ID formed of* `identifierType` - Either `account` or `zone`. * `identifierID` - The ID of the account or zone. * `jobID` - The Logpush Job ID to import. Import an account-scoped job using `account/:accountID/:jobID`
//
// ```sh
//  $ pulumi import cloudflare:index/logpushJob:LogpushJob example account/1d5fdc9e88c8a8c4518b068cd94331fe/54321
// ```
//
//  Import a zone-scoped job using `zone/:zoneID/:jobID`
//
// ```sh
//  $ pulumi import cloudflare:index/logpushJob:LogpushJob example zone/d41d8cd98f00b204e9800998ecf8427e/54321
// ```
type LogpushJob struct {
	pulumi.CustomResourceState

	// The account ID where the logpush job should be created. Either `accountId` or `zoneId` are required.
	AccountId pulumi.StringPtrOutput `pulumi:"accountId"`
	// Which type of dataset resource to use. Available values are
	// - [account-scoped](https://developers.cloudflare.com/logs/reference/log-fields/account): `"auditLogs"`, `"gatewayDns"`, `"gatewayHttp"`, `"gatewayNetwork"`
	// - [zone-scoped](https://developers.cloudflare.com/logs/reference/log-fields/zone): `"firewallEvents"`, `"httpRequests"`, `"spectrumEvents"`, `"nelReports", "dnsLogs"`
	Dataset pulumi.StringOutput `pulumi:"dataset"`
	// Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/reference/logpush-api-configuration#destination).
	DestinationConf pulumi.StringOutput `pulumi:"destinationConf"`
	// Whether to enable the job.
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// Configuration string for the Logshare API. It specifies things like requested fields and timestamp formats. See [Logpull options documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#options).
	LogpullOptions pulumi.StringPtrOutput `pulumi:"logpullOptions"`
	// The name of the logpush job to create. Must match the regular expression `^[a-zA-Z0-9\-\.]*$`.
	Name pulumi.StringPtrOutput `pulumi:"name"`
	// Ownership challenge token to prove destination ownership, required when destination is Amazon S3, Google Cloud Storage,
	// Microsoft Azure or Sumo Logic. See [Developer documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#usage).
	OwnershipChallenge pulumi.StringPtrOutput `pulumi:"ownershipChallenge"`
	// The zone ID where the logpush job should be created. Either `accountId` or `zoneId` are required.
	ZoneId pulumi.StringPtrOutput `pulumi:"zoneId"`
}

// NewLogpushJob registers a new resource with the given unique name, arguments, and options.
func NewLogpushJob(ctx *pulumi.Context,
	name string, args *LogpushJobArgs, opts ...pulumi.ResourceOption) (*LogpushJob, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Dataset == nil {
		return nil, errors.New("invalid value for required argument 'Dataset'")
	}
	if args.DestinationConf == nil {
		return nil, errors.New("invalid value for required argument 'DestinationConf'")
	}
	var resource LogpushJob
	err := ctx.RegisterResource("cloudflare:index/logpushJob:LogpushJob", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLogpushJob gets an existing LogpushJob resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLogpushJob(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LogpushJobState, opts ...pulumi.ResourceOption) (*LogpushJob, error) {
	var resource LogpushJob
	err := ctx.ReadResource("cloudflare:index/logpushJob:LogpushJob", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LogpushJob resources.
type logpushJobState struct {
	// The account ID where the logpush job should be created. Either `accountId` or `zoneId` are required.
	AccountId *string `pulumi:"accountId"`
	// Which type of dataset resource to use. Available values are
	// - [account-scoped](https://developers.cloudflare.com/logs/reference/log-fields/account): `"auditLogs"`, `"gatewayDns"`, `"gatewayHttp"`, `"gatewayNetwork"`
	// - [zone-scoped](https://developers.cloudflare.com/logs/reference/log-fields/zone): `"firewallEvents"`, `"httpRequests"`, `"spectrumEvents"`, `"nelReports", "dnsLogs"`
	Dataset *string `pulumi:"dataset"`
	// Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/reference/logpush-api-configuration#destination).
	DestinationConf *string `pulumi:"destinationConf"`
	// Whether to enable the job.
	Enabled *bool `pulumi:"enabled"`
	// Configuration string for the Logshare API. It specifies things like requested fields and timestamp formats. See [Logpull options documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#options).
	LogpullOptions *string `pulumi:"logpullOptions"`
	// The name of the logpush job to create. Must match the regular expression `^[a-zA-Z0-9\-\.]*$`.
	Name *string `pulumi:"name"`
	// Ownership challenge token to prove destination ownership, required when destination is Amazon S3, Google Cloud Storage,
	// Microsoft Azure or Sumo Logic. See [Developer documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#usage).
	OwnershipChallenge *string `pulumi:"ownershipChallenge"`
	// The zone ID where the logpush job should be created. Either `accountId` or `zoneId` are required.
	ZoneId *string `pulumi:"zoneId"`
}

type LogpushJobState struct {
	// The account ID where the logpush job should be created. Either `accountId` or `zoneId` are required.
	AccountId pulumi.StringPtrInput
	// Which type of dataset resource to use. Available values are
	// - [account-scoped](https://developers.cloudflare.com/logs/reference/log-fields/account): `"auditLogs"`, `"gatewayDns"`, `"gatewayHttp"`, `"gatewayNetwork"`
	// - [zone-scoped](https://developers.cloudflare.com/logs/reference/log-fields/zone): `"firewallEvents"`, `"httpRequests"`, `"spectrumEvents"`, `"nelReports", "dnsLogs"`
	Dataset pulumi.StringPtrInput
	// Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/reference/logpush-api-configuration#destination).
	DestinationConf pulumi.StringPtrInput
	// Whether to enable the job.
	Enabled pulumi.BoolPtrInput
	// Configuration string for the Logshare API. It specifies things like requested fields and timestamp formats. See [Logpull options documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#options).
	LogpullOptions pulumi.StringPtrInput
	// The name of the logpush job to create. Must match the regular expression `^[a-zA-Z0-9\-\.]*$`.
	Name pulumi.StringPtrInput
	// Ownership challenge token to prove destination ownership, required when destination is Amazon S3, Google Cloud Storage,
	// Microsoft Azure or Sumo Logic. See [Developer documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#usage).
	OwnershipChallenge pulumi.StringPtrInput
	// The zone ID where the logpush job should be created. Either `accountId` or `zoneId` are required.
	ZoneId pulumi.StringPtrInput
}

func (LogpushJobState) ElementType() reflect.Type {
	return reflect.TypeOf((*logpushJobState)(nil)).Elem()
}

type logpushJobArgs struct {
	// The account ID where the logpush job should be created. Either `accountId` or `zoneId` are required.
	AccountId *string `pulumi:"accountId"`
	// Which type of dataset resource to use. Available values are
	// - [account-scoped](https://developers.cloudflare.com/logs/reference/log-fields/account): `"auditLogs"`, `"gatewayDns"`, `"gatewayHttp"`, `"gatewayNetwork"`
	// - [zone-scoped](https://developers.cloudflare.com/logs/reference/log-fields/zone): `"firewallEvents"`, `"httpRequests"`, `"spectrumEvents"`, `"nelReports", "dnsLogs"`
	Dataset string `pulumi:"dataset"`
	// Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/reference/logpush-api-configuration#destination).
	DestinationConf string `pulumi:"destinationConf"`
	// Whether to enable the job.
	Enabled *bool `pulumi:"enabled"`
	// Configuration string for the Logshare API. It specifies things like requested fields and timestamp formats. See [Logpull options documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#options).
	LogpullOptions *string `pulumi:"logpullOptions"`
	// The name of the logpush job to create. Must match the regular expression `^[a-zA-Z0-9\-\.]*$`.
	Name *string `pulumi:"name"`
	// Ownership challenge token to prove destination ownership, required when destination is Amazon S3, Google Cloud Storage,
	// Microsoft Azure or Sumo Logic. See [Developer documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#usage).
	OwnershipChallenge *string `pulumi:"ownershipChallenge"`
	// The zone ID where the logpush job should be created. Either `accountId` or `zoneId` are required.
	ZoneId *string `pulumi:"zoneId"`
}

// The set of arguments for constructing a LogpushJob resource.
type LogpushJobArgs struct {
	// The account ID where the logpush job should be created. Either `accountId` or `zoneId` are required.
	AccountId pulumi.StringPtrInput
	// Which type of dataset resource to use. Available values are
	// - [account-scoped](https://developers.cloudflare.com/logs/reference/log-fields/account): `"auditLogs"`, `"gatewayDns"`, `"gatewayHttp"`, `"gatewayNetwork"`
	// - [zone-scoped](https://developers.cloudflare.com/logs/reference/log-fields/zone): `"firewallEvents"`, `"httpRequests"`, `"spectrumEvents"`, `"nelReports", "dnsLogs"`
	Dataset pulumi.StringInput
	// Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/reference/logpush-api-configuration#destination).
	DestinationConf pulumi.StringInput
	// Whether to enable the job.
	Enabled pulumi.BoolPtrInput
	// Configuration string for the Logshare API. It specifies things like requested fields and timestamp formats. See [Logpull options documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#options).
	LogpullOptions pulumi.StringPtrInput
	// The name of the logpush job to create. Must match the regular expression `^[a-zA-Z0-9\-\.]*$`.
	Name pulumi.StringPtrInput
	// Ownership challenge token to prove destination ownership, required when destination is Amazon S3, Google Cloud Storage,
	// Microsoft Azure or Sumo Logic. See [Developer documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#usage).
	OwnershipChallenge pulumi.StringPtrInput
	// The zone ID where the logpush job should be created. Either `accountId` or `zoneId` are required.
	ZoneId pulumi.StringPtrInput
}

func (LogpushJobArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*logpushJobArgs)(nil)).Elem()
}

type LogpushJobInput interface {
	pulumi.Input

	ToLogpushJobOutput() LogpushJobOutput
	ToLogpushJobOutputWithContext(ctx context.Context) LogpushJobOutput
}

func (*LogpushJob) ElementType() reflect.Type {
	return reflect.TypeOf((**LogpushJob)(nil)).Elem()
}

func (i *LogpushJob) ToLogpushJobOutput() LogpushJobOutput {
	return i.ToLogpushJobOutputWithContext(context.Background())
}

func (i *LogpushJob) ToLogpushJobOutputWithContext(ctx context.Context) LogpushJobOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogpushJobOutput)
}

// LogpushJobArrayInput is an input type that accepts LogpushJobArray and LogpushJobArrayOutput values.
// You can construct a concrete instance of `LogpushJobArrayInput` via:
//
//          LogpushJobArray{ LogpushJobArgs{...} }
type LogpushJobArrayInput interface {
	pulumi.Input

	ToLogpushJobArrayOutput() LogpushJobArrayOutput
	ToLogpushJobArrayOutputWithContext(context.Context) LogpushJobArrayOutput
}

type LogpushJobArray []LogpushJobInput

func (LogpushJobArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LogpushJob)(nil)).Elem()
}

func (i LogpushJobArray) ToLogpushJobArrayOutput() LogpushJobArrayOutput {
	return i.ToLogpushJobArrayOutputWithContext(context.Background())
}

func (i LogpushJobArray) ToLogpushJobArrayOutputWithContext(ctx context.Context) LogpushJobArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogpushJobArrayOutput)
}

// LogpushJobMapInput is an input type that accepts LogpushJobMap and LogpushJobMapOutput values.
// You can construct a concrete instance of `LogpushJobMapInput` via:
//
//          LogpushJobMap{ "key": LogpushJobArgs{...} }
type LogpushJobMapInput interface {
	pulumi.Input

	ToLogpushJobMapOutput() LogpushJobMapOutput
	ToLogpushJobMapOutputWithContext(context.Context) LogpushJobMapOutput
}

type LogpushJobMap map[string]LogpushJobInput

func (LogpushJobMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LogpushJob)(nil)).Elem()
}

func (i LogpushJobMap) ToLogpushJobMapOutput() LogpushJobMapOutput {
	return i.ToLogpushJobMapOutputWithContext(context.Background())
}

func (i LogpushJobMap) ToLogpushJobMapOutputWithContext(ctx context.Context) LogpushJobMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogpushJobMapOutput)
}

type LogpushJobOutput struct{ *pulumi.OutputState }

func (LogpushJobOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LogpushJob)(nil)).Elem()
}

func (o LogpushJobOutput) ToLogpushJobOutput() LogpushJobOutput {
	return o
}

func (o LogpushJobOutput) ToLogpushJobOutputWithContext(ctx context.Context) LogpushJobOutput {
	return o
}

type LogpushJobArrayOutput struct{ *pulumi.OutputState }

func (LogpushJobArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LogpushJob)(nil)).Elem()
}

func (o LogpushJobArrayOutput) ToLogpushJobArrayOutput() LogpushJobArrayOutput {
	return o
}

func (o LogpushJobArrayOutput) ToLogpushJobArrayOutputWithContext(ctx context.Context) LogpushJobArrayOutput {
	return o
}

func (o LogpushJobArrayOutput) Index(i pulumi.IntInput) LogpushJobOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *LogpushJob {
		return vs[0].([]*LogpushJob)[vs[1].(int)]
	}).(LogpushJobOutput)
}

type LogpushJobMapOutput struct{ *pulumi.OutputState }

func (LogpushJobMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LogpushJob)(nil)).Elem()
}

func (o LogpushJobMapOutput) ToLogpushJobMapOutput() LogpushJobMapOutput {
	return o
}

func (o LogpushJobMapOutput) ToLogpushJobMapOutputWithContext(ctx context.Context) LogpushJobMapOutput {
	return o
}

func (o LogpushJobMapOutput) MapIndex(k pulumi.StringInput) LogpushJobOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *LogpushJob {
		return vs[0].(map[string]*LogpushJob)[vs[1].(string)]
	}).(LogpushJobOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LogpushJobInput)(nil)).Elem(), &LogpushJob{})
	pulumi.RegisterInputType(reflect.TypeOf((*LogpushJobArrayInput)(nil)).Elem(), LogpushJobArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LogpushJobMapInput)(nil)).Elem(), LogpushJobMap{})
	pulumi.RegisterOutputType(LogpushJobOutput{})
	pulumi.RegisterOutputType(LogpushJobArrayOutput{})
	pulumi.RegisterOutputType(LogpushJobMapOutput{})
}
