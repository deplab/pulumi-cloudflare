// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a resource which manages Cloudflare API tokens.
//
// Read more about permission groups and their applicable scopes in
// [the official documentation](https://developers.cloudflare.com/api/tokens/create/permissions).
//
// ## Example Usage
type ApiToken struct {
	pulumi.CustomResourceState

	// Condition block. See the definition below.
	Condition ApiTokenConditionPtrOutput `pulumi:"condition"`
	// The RFC3339 timestamp of when the API Token was issued.
	IssuedOn pulumi.StringOutput `pulumi:"issuedOn"`
	// The RFC3339 timestamp of when the API Token was last modified.
	ModifiedOn pulumi.StringOutput `pulumi:"modifiedOn"`
	// Name of the APIToken.
	Name pulumi.StringOutput `pulumi:"name"`
	// Permissions policy. Multiple policy blocks can be defined.
	// See the definition below.
	Policies ApiTokenPolicyArrayOutput `pulumi:"policies"`
	Status   pulumi.StringOutput       `pulumi:"status"`
	// The value of the API Token.
	Value pulumi.StringOutput `pulumi:"value"`
}

// NewApiToken registers a new resource with the given unique name, arguments, and options.
func NewApiToken(ctx *pulumi.Context,
	name string, args *ApiTokenArgs, opts ...pulumi.ResourceOption) (*ApiToken, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	if args.Policies == nil {
		return nil, errors.New("invalid value for required argument 'Policies'")
	}
	var resource ApiToken
	err := ctx.RegisterResource("cloudflare:index/apiToken:ApiToken", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetApiToken gets an existing ApiToken resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetApiToken(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ApiTokenState, opts ...pulumi.ResourceOption) (*ApiToken, error) {
	var resource ApiToken
	err := ctx.ReadResource("cloudflare:index/apiToken:ApiToken", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ApiToken resources.
type apiTokenState struct {
	// Condition block. See the definition below.
	Condition *ApiTokenCondition `pulumi:"condition"`
	// The RFC3339 timestamp of when the API Token was issued.
	IssuedOn *string `pulumi:"issuedOn"`
	// The RFC3339 timestamp of when the API Token was last modified.
	ModifiedOn *string `pulumi:"modifiedOn"`
	// Name of the APIToken.
	Name *string `pulumi:"name"`
	// Permissions policy. Multiple policy blocks can be defined.
	// See the definition below.
	Policies []ApiTokenPolicy `pulumi:"policies"`
	Status   *string          `pulumi:"status"`
	// The value of the API Token.
	Value *string `pulumi:"value"`
}

type ApiTokenState struct {
	// Condition block. See the definition below.
	Condition ApiTokenConditionPtrInput
	// The RFC3339 timestamp of when the API Token was issued.
	IssuedOn pulumi.StringPtrInput
	// The RFC3339 timestamp of when the API Token was last modified.
	ModifiedOn pulumi.StringPtrInput
	// Name of the APIToken.
	Name pulumi.StringPtrInput
	// Permissions policy. Multiple policy blocks can be defined.
	// See the definition below.
	Policies ApiTokenPolicyArrayInput
	Status   pulumi.StringPtrInput
	// The value of the API Token.
	Value pulumi.StringPtrInput
}

func (ApiTokenState) ElementType() reflect.Type {
	return reflect.TypeOf((*apiTokenState)(nil)).Elem()
}

type apiTokenArgs struct {
	// Condition block. See the definition below.
	Condition *ApiTokenCondition `pulumi:"condition"`
	// Name of the APIToken.
	Name string `pulumi:"name"`
	// Permissions policy. Multiple policy blocks can be defined.
	// See the definition below.
	Policies []ApiTokenPolicy `pulumi:"policies"`
}

// The set of arguments for constructing a ApiToken resource.
type ApiTokenArgs struct {
	// Condition block. See the definition below.
	Condition ApiTokenConditionPtrInput
	// Name of the APIToken.
	Name pulumi.StringInput
	// Permissions policy. Multiple policy blocks can be defined.
	// See the definition below.
	Policies ApiTokenPolicyArrayInput
}

func (ApiTokenArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*apiTokenArgs)(nil)).Elem()
}

type ApiTokenInput interface {
	pulumi.Input

	ToApiTokenOutput() ApiTokenOutput
	ToApiTokenOutputWithContext(ctx context.Context) ApiTokenOutput
}

func (ApiToken) ElementType() reflect.Type {
	return reflect.TypeOf((*ApiToken)(nil)).Elem()
}

func (i ApiToken) ToApiTokenOutput() ApiTokenOutput {
	return i.ToApiTokenOutputWithContext(context.Background())
}

func (i ApiToken) ToApiTokenOutputWithContext(ctx context.Context) ApiTokenOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApiTokenOutput)
}

type ApiTokenOutput struct {
	*pulumi.OutputState
}

func (ApiTokenOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ApiTokenOutput)(nil)).Elem()
}

func (o ApiTokenOutput) ToApiTokenOutput() ApiTokenOutput {
	return o
}

func (o ApiTokenOutput) ToApiTokenOutputWithContext(ctx context.Context) ApiTokenOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(ApiTokenOutput{})
}