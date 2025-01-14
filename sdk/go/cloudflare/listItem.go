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

// Provides individual list items (IPs, Redirects) to be used in Edge Rules Engine
// across all zones within the same account.
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
//			exampleIpList, err := cloudflare.NewList(ctx, "exampleIpList", &cloudflare.ListArgs{
//				AccountId:   pulumi.String("f037e56e89293a057740de681ac9abbe"),
//				Name:        pulumi.String("example_list"),
//				Description: pulumi.String("example IPs for a list"),
//				Kind:        pulumi.String("ip"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = cloudflare.NewListItem(ctx, "exampleIpItem", &cloudflare.ListItemArgs{
//				AccountId: pulumi.String("f037e56e89293a057740de681ac9abbe"),
//				ListId:    exampleIpList.ID(),
//				Comment:   pulumi.String("List Item Comment"),
//				Ip:        pulumi.String("192.0.2.0"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = cloudflare.NewList(ctx, "exampleRedirectList", &cloudflare.ListArgs{
//				AccountId:   pulumi.String("f037e56e89293a057740de681ac9abbe"),
//				Name:        pulumi.String("example_list"),
//				Description: pulumi.String("example Redirects for a list"),
//				Kind:        pulumi.String("redirect"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = cloudflare.NewListItem(ctx, "exampleRedirectItem", &cloudflare.ListItemArgs{
//				AccountId: pulumi.String("f037e56e89293a057740de681ac9abbe"),
//				ListId:    exampleIpList.ID(),
//				Redirect: &cloudflare.ListItemRedirectArgs{
//					SourceUrl:       pulumi.String("https://source.tld"),
//					TargetUrl:       pulumi.String("https://target.tld"),
//					StatusCode:      pulumi.Int(302),
//					SubpathMatching: pulumi.String("enabled"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			exampleAsnList, err := cloudflare.NewList(ctx, "exampleAsnList", &cloudflare.ListArgs{
//				AccountId:   pulumi.String("f037e56e89293a057740de681ac9abbe"),
//				Name:        pulumi.String("example_asn_list"),
//				Description: pulumi.String("example ASNs for a list"),
//				Kind:        pulumi.String("asn"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = cloudflare.NewListItem(ctx, "exampleAsnItem", &cloudflare.ListItemArgs{
//				AccountId: pulumi.String("f037e56e89293a057740de681ac9abbe"),
//				ListId:    exampleAsnList.ID(),
//				Comment:   pulumi.String("List Item Comment"),
//				Asn:       pulumi.Int(6789),
//			})
//			if err != nil {
//				return err
//			}
//			exampleHostnameList, err := cloudflare.NewList(ctx, "exampleHostnameList", &cloudflare.ListArgs{
//				AccountId:   pulumi.String("f037e56e89293a057740de681ac9abbe"),
//				Name:        pulumi.String("example_hostname_list"),
//				Description: pulumi.String("example Hostnames for a list"),
//				Kind:        pulumi.String("hostname"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = cloudflare.NewListItem(ctx, "exampleHostnameItem", &cloudflare.ListItemArgs{
//				AccountId: pulumi.String("f037e56e89293a057740de681ac9abbe"),
//				ListId:    exampleHostnameList.ID(),
//				Comment:   pulumi.String("List Item Comment"),
//				Hostname: &cloudflare.ListItemHostnameArgs{
//					UrlHostname: pulumi.String("example.com"),
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
//	$ pulumi import cloudflare:index/listItem:ListItem example <account_id>/<list_id>/<item_id>
//
// ```
type ListItem struct {
	pulumi.CustomResourceState

	// The account identifier to target for the resource.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// Autonomous system number to include in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
	Asn pulumi.IntPtrOutput `pulumi:"asn"`
	// An optional comment for the item.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// Hostname to store in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
	Hostname ListItemHostnamePtrOutput `pulumi:"hostname"`
	// IP address to include in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
	Ip pulumi.StringPtrOutput `pulumi:"ip"`
	// The list identifier to target for the resource.
	ListId pulumi.StringOutput `pulumi:"listId"`
	// Redirect configuration to store in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
	Redirect ListItemRedirectPtrOutput `pulumi:"redirect"`
}

// NewListItem registers a new resource with the given unique name, arguments, and options.
func NewListItem(ctx *pulumi.Context,
	name string, args *ListItemArgs, opts ...pulumi.ResourceOption) (*ListItem, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.ListId == nil {
		return nil, errors.New("invalid value for required argument 'ListId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ListItem
	err := ctx.RegisterResource("cloudflare:index/listItem:ListItem", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetListItem gets an existing ListItem resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetListItem(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ListItemState, opts ...pulumi.ResourceOption) (*ListItem, error) {
	var resource ListItem
	err := ctx.ReadResource("cloudflare:index/listItem:ListItem", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ListItem resources.
type listItemState struct {
	// The account identifier to target for the resource.
	AccountId *string `pulumi:"accountId"`
	// Autonomous system number to include in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
	Asn *int `pulumi:"asn"`
	// An optional comment for the item.
	Comment *string `pulumi:"comment"`
	// Hostname to store in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
	Hostname *ListItemHostname `pulumi:"hostname"`
	// IP address to include in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
	Ip *string `pulumi:"ip"`
	// The list identifier to target for the resource.
	ListId *string `pulumi:"listId"`
	// Redirect configuration to store in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
	Redirect *ListItemRedirect `pulumi:"redirect"`
}

type ListItemState struct {
	// The account identifier to target for the resource.
	AccountId pulumi.StringPtrInput
	// Autonomous system number to include in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
	Asn pulumi.IntPtrInput
	// An optional comment for the item.
	Comment pulumi.StringPtrInput
	// Hostname to store in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
	Hostname ListItemHostnamePtrInput
	// IP address to include in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
	Ip pulumi.StringPtrInput
	// The list identifier to target for the resource.
	ListId pulumi.StringPtrInput
	// Redirect configuration to store in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
	Redirect ListItemRedirectPtrInput
}

func (ListItemState) ElementType() reflect.Type {
	return reflect.TypeOf((*listItemState)(nil)).Elem()
}

type listItemArgs struct {
	// The account identifier to target for the resource.
	AccountId string `pulumi:"accountId"`
	// Autonomous system number to include in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
	Asn *int `pulumi:"asn"`
	// An optional comment for the item.
	Comment *string `pulumi:"comment"`
	// Hostname to store in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
	Hostname *ListItemHostname `pulumi:"hostname"`
	// IP address to include in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
	Ip *string `pulumi:"ip"`
	// The list identifier to target for the resource.
	ListId string `pulumi:"listId"`
	// Redirect configuration to store in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
	Redirect *ListItemRedirect `pulumi:"redirect"`
}

// The set of arguments for constructing a ListItem resource.
type ListItemArgs struct {
	// The account identifier to target for the resource.
	AccountId pulumi.StringInput
	// Autonomous system number to include in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
	Asn pulumi.IntPtrInput
	// An optional comment for the item.
	Comment pulumi.StringPtrInput
	// Hostname to store in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
	Hostname ListItemHostnamePtrInput
	// IP address to include in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
	Ip pulumi.StringPtrInput
	// The list identifier to target for the resource.
	ListId pulumi.StringInput
	// Redirect configuration to store in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
	Redirect ListItemRedirectPtrInput
}

func (ListItemArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*listItemArgs)(nil)).Elem()
}

type ListItemInput interface {
	pulumi.Input

	ToListItemOutput() ListItemOutput
	ToListItemOutputWithContext(ctx context.Context) ListItemOutput
}

func (*ListItem) ElementType() reflect.Type {
	return reflect.TypeOf((**ListItem)(nil)).Elem()
}

func (i *ListItem) ToListItemOutput() ListItemOutput {
	return i.ToListItemOutputWithContext(context.Background())
}

func (i *ListItem) ToListItemOutputWithContext(ctx context.Context) ListItemOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ListItemOutput)
}

// ListItemArrayInput is an input type that accepts ListItemArray and ListItemArrayOutput values.
// You can construct a concrete instance of `ListItemArrayInput` via:
//
//	ListItemArray{ ListItemArgs{...} }
type ListItemArrayInput interface {
	pulumi.Input

	ToListItemArrayOutput() ListItemArrayOutput
	ToListItemArrayOutputWithContext(context.Context) ListItemArrayOutput
}

type ListItemArray []ListItemInput

func (ListItemArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ListItem)(nil)).Elem()
}

func (i ListItemArray) ToListItemArrayOutput() ListItemArrayOutput {
	return i.ToListItemArrayOutputWithContext(context.Background())
}

func (i ListItemArray) ToListItemArrayOutputWithContext(ctx context.Context) ListItemArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ListItemArrayOutput)
}

// ListItemMapInput is an input type that accepts ListItemMap and ListItemMapOutput values.
// You can construct a concrete instance of `ListItemMapInput` via:
//
//	ListItemMap{ "key": ListItemArgs{...} }
type ListItemMapInput interface {
	pulumi.Input

	ToListItemMapOutput() ListItemMapOutput
	ToListItemMapOutputWithContext(context.Context) ListItemMapOutput
}

type ListItemMap map[string]ListItemInput

func (ListItemMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ListItem)(nil)).Elem()
}

func (i ListItemMap) ToListItemMapOutput() ListItemMapOutput {
	return i.ToListItemMapOutputWithContext(context.Background())
}

func (i ListItemMap) ToListItemMapOutputWithContext(ctx context.Context) ListItemMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ListItemMapOutput)
}

type ListItemOutput struct{ *pulumi.OutputState }

func (ListItemOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ListItem)(nil)).Elem()
}

func (o ListItemOutput) ToListItemOutput() ListItemOutput {
	return o
}

func (o ListItemOutput) ToListItemOutputWithContext(ctx context.Context) ListItemOutput {
	return o
}

// The account identifier to target for the resource.
func (o ListItemOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *ListItem) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// Autonomous system number to include in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
func (o ListItemOutput) Asn() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *ListItem) pulumi.IntPtrOutput { return v.Asn }).(pulumi.IntPtrOutput)
}

// An optional comment for the item.
func (o ListItemOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ListItem) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// Hostname to store in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
func (o ListItemOutput) Hostname() ListItemHostnamePtrOutput {
	return o.ApplyT(func(v *ListItem) ListItemHostnamePtrOutput { return v.Hostname }).(ListItemHostnamePtrOutput)
}

// IP address to include in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
func (o ListItemOutput) Ip() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ListItem) pulumi.StringPtrOutput { return v.Ip }).(pulumi.StringPtrOutput)
}

// The list identifier to target for the resource.
func (o ListItemOutput) ListId() pulumi.StringOutput {
	return o.ApplyT(func(v *ListItem) pulumi.StringOutput { return v.ListId }).(pulumi.StringOutput)
}

// Redirect configuration to store in the list. Must provide only one of `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
func (o ListItemOutput) Redirect() ListItemRedirectPtrOutput {
	return o.ApplyT(func(v *ListItem) ListItemRedirectPtrOutput { return v.Redirect }).(ListItemRedirectPtrOutput)
}

type ListItemArrayOutput struct{ *pulumi.OutputState }

func (ListItemArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ListItem)(nil)).Elem()
}

func (o ListItemArrayOutput) ToListItemArrayOutput() ListItemArrayOutput {
	return o
}

func (o ListItemArrayOutput) ToListItemArrayOutputWithContext(ctx context.Context) ListItemArrayOutput {
	return o
}

func (o ListItemArrayOutput) Index(i pulumi.IntInput) ListItemOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ListItem {
		return vs[0].([]*ListItem)[vs[1].(int)]
	}).(ListItemOutput)
}

type ListItemMapOutput struct{ *pulumi.OutputState }

func (ListItemMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ListItem)(nil)).Elem()
}

func (o ListItemMapOutput) ToListItemMapOutput() ListItemMapOutput {
	return o
}

func (o ListItemMapOutput) ToListItemMapOutputWithContext(ctx context.Context) ListItemMapOutput {
	return o
}

func (o ListItemMapOutput) MapIndex(k pulumi.StringInput) ListItemOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ListItem {
		return vs[0].(map[string]*ListItem)[vs[1].(string)]
	}).(ListItemOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ListItemInput)(nil)).Elem(), &ListItem{})
	pulumi.RegisterInputType(reflect.TypeOf((*ListItemArrayInput)(nil)).Elem(), ListItemArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ListItemMapInput)(nil)).Elem(), ListItemMap{})
	pulumi.RegisterOutputType(ListItemOutput{})
	pulumi.RegisterOutputType(ListItemArrayOutput{})
	pulumi.RegisterOutputType(ListItemMapOutput{})
}
