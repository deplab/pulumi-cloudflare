// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

type LogpushJob struct {
	pulumi.CustomResourceState

	// Which type of dataset resource to use. Available values are `"firewallEvents"`, `"httpRequests"`, and `"spectrumEvents"`.
	Dataset pulumi.StringOutput `pulumi:"dataset"`
	// Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#destination).
	DestinationConf pulumi.StringOutput `pulumi:"destinationConf"`
	// Whether to enable the job.
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// Configuration string for the Logshare API. It specifies things like requested fields and timestamp formats. See [Logpull options documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#options).
	LogpullOptions pulumi.StringPtrOutput `pulumi:"logpullOptions"`
	// The name of the logpush job to create. Must match the regular expression `^[a-zA-Z0-9\-\.]*$`.
	Name pulumi.StringPtrOutput `pulumi:"name"`
	// Ownership challenge token to prove destination ownership. See [Developer documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#usage).
	OwnershipChallenge pulumi.StringOutput `pulumi:"ownershipChallenge"`
	// The zone ID where the logpush job should be created.
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewLogpushJob registers a new resource with the given unique name, arguments, and options.
func NewLogpushJob(ctx *pulumi.Context,
	name string, args *LogpushJobArgs, opts ...pulumi.ResourceOption) (*LogpushJob, error) {
	if args == nil || args.Dataset == nil {
		return nil, errors.New("missing required argument 'Dataset'")
	}
	if args == nil || args.DestinationConf == nil {
		return nil, errors.New("missing required argument 'DestinationConf'")
	}
	if args == nil || args.OwnershipChallenge == nil {
		return nil, errors.New("missing required argument 'OwnershipChallenge'")
	}
	if args == nil || args.ZoneId == nil {
		return nil, errors.New("missing required argument 'ZoneId'")
	}
	if args == nil {
		args = &LogpushJobArgs{}
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
	// Which type of dataset resource to use. Available values are `"firewallEvents"`, `"httpRequests"`, and `"spectrumEvents"`.
	Dataset *string `pulumi:"dataset"`
	// Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#destination).
	DestinationConf *string `pulumi:"destinationConf"`
	// Whether to enable the job.
	Enabled *bool `pulumi:"enabled"`
	// Configuration string for the Logshare API. It specifies things like requested fields and timestamp formats. See [Logpull options documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#options).
	LogpullOptions *string `pulumi:"logpullOptions"`
	// The name of the logpush job to create. Must match the regular expression `^[a-zA-Z0-9\-\.]*$`.
	Name *string `pulumi:"name"`
	// Ownership challenge token to prove destination ownership. See [Developer documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#usage).
	OwnershipChallenge *string `pulumi:"ownershipChallenge"`
	// The zone ID where the logpush job should be created.
	ZoneId *string `pulumi:"zoneId"`
}

type LogpushJobState struct {
	// Which type of dataset resource to use. Available values are `"firewallEvents"`, `"httpRequests"`, and `"spectrumEvents"`.
	Dataset pulumi.StringPtrInput
	// Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#destination).
	DestinationConf pulumi.StringPtrInput
	// Whether to enable the job.
	Enabled pulumi.BoolPtrInput
	// Configuration string for the Logshare API. It specifies things like requested fields and timestamp formats. See [Logpull options documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#options).
	LogpullOptions pulumi.StringPtrInput
	// The name of the logpush job to create. Must match the regular expression `^[a-zA-Z0-9\-\.]*$`.
	Name pulumi.StringPtrInput
	// Ownership challenge token to prove destination ownership. See [Developer documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#usage).
	OwnershipChallenge pulumi.StringPtrInput
	// The zone ID where the logpush job should be created.
	ZoneId pulumi.StringPtrInput
}

func (LogpushJobState) ElementType() reflect.Type {
	return reflect.TypeOf((*logpushJobState)(nil)).Elem()
}

type logpushJobArgs struct {
	// Which type of dataset resource to use. Available values are `"firewallEvents"`, `"httpRequests"`, and `"spectrumEvents"`.
	Dataset string `pulumi:"dataset"`
	// Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#destination).
	DestinationConf string `pulumi:"destinationConf"`
	// Whether to enable the job.
	Enabled *bool `pulumi:"enabled"`
	// Configuration string for the Logshare API. It specifies things like requested fields and timestamp formats. See [Logpull options documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#options).
	LogpullOptions *string `pulumi:"logpullOptions"`
	// The name of the logpush job to create. Must match the regular expression `^[a-zA-Z0-9\-\.]*$`.
	Name *string `pulumi:"name"`
	// Ownership challenge token to prove destination ownership. See [Developer documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#usage).
	OwnershipChallenge string `pulumi:"ownershipChallenge"`
	// The zone ID where the logpush job should be created.
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a LogpushJob resource.
type LogpushJobArgs struct {
	// Which type of dataset resource to use. Available values are `"firewallEvents"`, `"httpRequests"`, and `"spectrumEvents"`.
	Dataset pulumi.StringInput
	// Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#destination).
	DestinationConf pulumi.StringInput
	// Whether to enable the job.
	Enabled pulumi.BoolPtrInput
	// Configuration string for the Logshare API. It specifies things like requested fields and timestamp formats. See [Logpull options documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#options).
	LogpullOptions pulumi.StringPtrInput
	// The name of the logpush job to create. Must match the regular expression `^[a-zA-Z0-9\-\.]*$`.
	Name pulumi.StringPtrInput
	// Ownership challenge token to prove destination ownership. See [Developer documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#usage).
	OwnershipChallenge pulumi.StringInput
	// The zone ID where the logpush job should be created.
	ZoneId pulumi.StringInput
}

func (LogpushJobArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*logpushJobArgs)(nil)).Elem()
}
