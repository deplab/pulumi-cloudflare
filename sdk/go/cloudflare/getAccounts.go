// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source for looking up Cloudflare Accounts.
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
//			_, err := cloudflare.GetAccounts(ctx, &cloudflare.GetAccountsArgs{
//				Name: pulumi.StringRef("example account"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetAccounts(ctx *pulumi.Context, args *GetAccountsArgs, opts ...pulumi.InvokeOption) (*GetAccountsResult, error) {
	var rv GetAccountsResult
	err := ctx.Invoke("cloudflare:index/getAccounts:getAccounts", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAccounts.
type GetAccountsArgs struct {
	// The account name to target for the resource.
	Name *string `pulumi:"name"`
}

// A collection of values returned by getAccounts.
type GetAccountsResult struct {
	Accounts []GetAccountsAccount `pulumi:"accounts"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The account name to target for the resource.
	Name *string `pulumi:"name"`
}

func GetAccountsOutput(ctx *pulumi.Context, args GetAccountsOutputArgs, opts ...pulumi.InvokeOption) GetAccountsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetAccountsResult, error) {
			args := v.(GetAccountsArgs)
			r, err := GetAccounts(ctx, &args, opts...)
			var s GetAccountsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetAccountsResultOutput)
}

// A collection of arguments for invoking getAccounts.
type GetAccountsOutputArgs struct {
	// The account name to target for the resource.
	Name pulumi.StringPtrInput `pulumi:"name"`
}

func (GetAccountsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAccountsArgs)(nil)).Elem()
}

// A collection of values returned by getAccounts.
type GetAccountsResultOutput struct{ *pulumi.OutputState }

func (GetAccountsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAccountsResult)(nil)).Elem()
}

func (o GetAccountsResultOutput) ToGetAccountsResultOutput() GetAccountsResultOutput {
	return o
}

func (o GetAccountsResultOutput) ToGetAccountsResultOutputWithContext(ctx context.Context) GetAccountsResultOutput {
	return o
}

func (o GetAccountsResultOutput) Accounts() GetAccountsAccountArrayOutput {
	return o.ApplyT(func(v GetAccountsResult) []GetAccountsAccount { return v.Accounts }).(GetAccountsAccountArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetAccountsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetAccountsResult) string { return v.Id }).(pulumi.StringOutput)
}

// The account name to target for the resource.
func (o GetAccountsResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAccountsResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetAccountsResultOutput{})
}
