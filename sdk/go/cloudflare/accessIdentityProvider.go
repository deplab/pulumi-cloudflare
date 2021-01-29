// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a Cloudflare Access Identity Provider resource. Identity Providers are
// used as an authentication or authorisation source within Access.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"fmt"
//
// 	"github.com/pulumi/pulumi-cloudflare/sdk/v2/go/cloudflare"
// 	"github.com/pulumi/pulumi-cloudflare/sdk/v2/go/cloudflare/"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := cloudflare.NewAccessIdentityProvider(ctx, "pinLogin", &cloudflare.AccessIdentityProviderArgs{
// 			AccountId: pulumi.String("1d5fdc9e88c8a8c4518b068cd94331fe"),
// 			Name:      pulumi.String("PIN login"),
// 			Type:      pulumi.String("onetimepin"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = cloudflare.NewAccessIdentityProvider(ctx, "githubOauth", &cloudflare.AccessIdentityProviderArgs{
// 			AccountId: pulumi.String("1d5fdc9e88c8a8c4518b068cd94331fe"),
// 			Configs: cloudflare.AccessIdentityProviderConfigArray{
// 				&cloudflare.AccessIdentityProviderConfigArgs{
// 					ClientId:     pulumi.String("example"),
// 					ClientSecret: pulumi.String("secret_key"),
// 				},
// 			},
// 			Name: pulumi.String("GitHub OAuth"),
// 			Type: pulumi.String("github"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = cloudflare.NewAccessIdentityProvider(ctx, "jumpcloudSaml", &cloudflare.AccessIdentityProviderArgs{
// 			AccountId: pulumi.String("1d5fdc9e88c8a8c4518b068cd94331fe"),
// 			Configs: cloudflare.AccessIdentityProviderConfigArray{
// 				&cloudflare.AccessIdentityProviderConfigArgs{
// 					Attributes: pulumi.StringArray{
// 						pulumi.String("email"),
// 						pulumi.String("username"),
// 					},
// 					IdpPublicCert: pulumi.String(fmt.Sprintf("%v%v", "MIIDpDCCAoygAwIBAgIGAV2ka+55MA0GCSqGSIb3DQEBCwUAMIGSMQswCQ...GF/Q2/MHadws97cZg\n", "uTnQyuOqPuHbnN83d/2l1NSYKCbHt24o\n")),
// 					IssuerUrl:     pulumi.String("jumpcloud"),
// 					SignRequest:   pulumi.Bool(false),
// 					SsoTargetUrl:  pulumi.String("https://sso.myexample.jumpcloud.com/saml2/cloudflareaccess"),
// 				},
// 			},
// 			Name: pulumi.String("JumpCloud SAML"),
// 			Type: pulumi.String("saml"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// Please refer to the [developers.cloudflare.com Access documentation][accessIdentityProviderGuide]
// for full reference on what is available and how to configure your provider.
//
// ## Import
//
// Access Identity Providers can be imported using a composite ID formed of account ID and Access Identity Provider ID.
//
// ```sh
//  $ pulumi import cloudflare:index/accessIdentityProvider:AccessIdentityProvider my_idp cb029e245cfdd66dc8d2e570d5dd3322/e00e1c13-e350-44fe-96c5-fb75c954871c
// ```
//
//  [access_identity_provider_guide]https://developers.cloudflare.com/access/configuring-identity-providers/
type AccessIdentityProvider struct {
	pulumi.CustomResourceState

	// The account ID the provider should be associated with. Conflicts with `zoneId`.
	AccountId pulumi.StringPtrOutput `pulumi:"accountId"`
	// Provider configuration from the [developer documentation][accessIdentityProviderGuide].
	Configs AccessIdentityProviderConfigArrayOutput `pulumi:"configs"`
	// Friendly name of the Access Identity Provider configuration.
	Name pulumi.StringOutput `pulumi:"name"`
	// The provider type to use. Must be one of: `"centrify"`,
	// `"facebook"`, `"google-apps"`, `"oidc"`, `"github"`, `"google"`, `"saml"`,
	// `"linkedin"`, `"azureAD"`, `"okta"`, `"onetimepin"`, `"onelogin"`, `"yandex"`.
	Type pulumi.StringOutput `pulumi:"type"`
	// The zone ID the provider should be associated with. Conflicts with `accountId`.
	ZoneId pulumi.StringPtrOutput `pulumi:"zoneId"`
}

// NewAccessIdentityProvider registers a new resource with the given unique name, arguments, and options.
func NewAccessIdentityProvider(ctx *pulumi.Context,
	name string, args *AccessIdentityProviderArgs, opts ...pulumi.ResourceOption) (*AccessIdentityProvider, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	var resource AccessIdentityProvider
	err := ctx.RegisterResource("cloudflare:index/accessIdentityProvider:AccessIdentityProvider", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAccessIdentityProvider gets an existing AccessIdentityProvider resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAccessIdentityProvider(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AccessIdentityProviderState, opts ...pulumi.ResourceOption) (*AccessIdentityProvider, error) {
	var resource AccessIdentityProvider
	err := ctx.ReadResource("cloudflare:index/accessIdentityProvider:AccessIdentityProvider", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AccessIdentityProvider resources.
type accessIdentityProviderState struct {
	// The account ID the provider should be associated with. Conflicts with `zoneId`.
	AccountId *string `pulumi:"accountId"`
	// Provider configuration from the [developer documentation][accessIdentityProviderGuide].
	Configs []AccessIdentityProviderConfig `pulumi:"configs"`
	// Friendly name of the Access Identity Provider configuration.
	Name *string `pulumi:"name"`
	// The provider type to use. Must be one of: `"centrify"`,
	// `"facebook"`, `"google-apps"`, `"oidc"`, `"github"`, `"google"`, `"saml"`,
	// `"linkedin"`, `"azureAD"`, `"okta"`, `"onetimepin"`, `"onelogin"`, `"yandex"`.
	Type *string `pulumi:"type"`
	// The zone ID the provider should be associated with. Conflicts with `accountId`.
	ZoneId *string `pulumi:"zoneId"`
}

type AccessIdentityProviderState struct {
	// The account ID the provider should be associated with. Conflicts with `zoneId`.
	AccountId pulumi.StringPtrInput
	// Provider configuration from the [developer documentation][accessIdentityProviderGuide].
	Configs AccessIdentityProviderConfigArrayInput
	// Friendly name of the Access Identity Provider configuration.
	Name pulumi.StringPtrInput
	// The provider type to use. Must be one of: `"centrify"`,
	// `"facebook"`, `"google-apps"`, `"oidc"`, `"github"`, `"google"`, `"saml"`,
	// `"linkedin"`, `"azureAD"`, `"okta"`, `"onetimepin"`, `"onelogin"`, `"yandex"`.
	Type pulumi.StringPtrInput
	// The zone ID the provider should be associated with. Conflicts with `accountId`.
	ZoneId pulumi.StringPtrInput
}

func (AccessIdentityProviderState) ElementType() reflect.Type {
	return reflect.TypeOf((*accessIdentityProviderState)(nil)).Elem()
}

type accessIdentityProviderArgs struct {
	// The account ID the provider should be associated with. Conflicts with `zoneId`.
	AccountId *string `pulumi:"accountId"`
	// Provider configuration from the [developer documentation][accessIdentityProviderGuide].
	Configs []AccessIdentityProviderConfig `pulumi:"configs"`
	// Friendly name of the Access Identity Provider configuration.
	Name string `pulumi:"name"`
	// The provider type to use. Must be one of: `"centrify"`,
	// `"facebook"`, `"google-apps"`, `"oidc"`, `"github"`, `"google"`, `"saml"`,
	// `"linkedin"`, `"azureAD"`, `"okta"`, `"onetimepin"`, `"onelogin"`, `"yandex"`.
	Type string `pulumi:"type"`
	// The zone ID the provider should be associated with. Conflicts with `accountId`.
	ZoneId *string `pulumi:"zoneId"`
}

// The set of arguments for constructing a AccessIdentityProvider resource.
type AccessIdentityProviderArgs struct {
	// The account ID the provider should be associated with. Conflicts with `zoneId`.
	AccountId pulumi.StringPtrInput
	// Provider configuration from the [developer documentation][accessIdentityProviderGuide].
	Configs AccessIdentityProviderConfigArrayInput
	// Friendly name of the Access Identity Provider configuration.
	Name pulumi.StringInput
	// The provider type to use. Must be one of: `"centrify"`,
	// `"facebook"`, `"google-apps"`, `"oidc"`, `"github"`, `"google"`, `"saml"`,
	// `"linkedin"`, `"azureAD"`, `"okta"`, `"onetimepin"`, `"onelogin"`, `"yandex"`.
	Type pulumi.StringInput
	// The zone ID the provider should be associated with. Conflicts with `accountId`.
	ZoneId pulumi.StringPtrInput
}

func (AccessIdentityProviderArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*accessIdentityProviderArgs)(nil)).Elem()
}

type AccessIdentityProviderInput interface {
	pulumi.Input

	ToAccessIdentityProviderOutput() AccessIdentityProviderOutput
	ToAccessIdentityProviderOutputWithContext(ctx context.Context) AccessIdentityProviderOutput
}

func (*AccessIdentityProvider) ElementType() reflect.Type {
	return reflect.TypeOf((*AccessIdentityProvider)(nil))
}

func (i *AccessIdentityProvider) ToAccessIdentityProviderOutput() AccessIdentityProviderOutput {
	return i.ToAccessIdentityProviderOutputWithContext(context.Background())
}

func (i *AccessIdentityProvider) ToAccessIdentityProviderOutputWithContext(ctx context.Context) AccessIdentityProviderOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessIdentityProviderOutput)
}

type AccessIdentityProviderOutput struct {
	*pulumi.OutputState
}

func (AccessIdentityProviderOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*AccessIdentityProvider)(nil))
}

func (o AccessIdentityProviderOutput) ToAccessIdentityProviderOutput() AccessIdentityProviderOutput {
	return o
}

func (o AccessIdentityProviderOutput) ToAccessIdentityProviderOutputWithContext(ctx context.Context) AccessIdentityProviderOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(AccessIdentityProviderOutput{})
}
