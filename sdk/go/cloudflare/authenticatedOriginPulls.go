// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a Cloudflare Authenticated Origin Pulls resource. An `AuthenticatedOriginPulls` resource is required to use Per-Zone or Per-Hostname Authenticated Origin Pulls.
//
// ## Example Usage
//
// The arguments that you provide determine which form of Authenticated Origin Pulls to use:
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-cloudflare/sdk/v2/go/cloudflare"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := cloudflare.NewAuthenticatedOriginPulls(ctx, "myAop", &cloudflare.AuthenticatedOriginPullsArgs{
// 			ZoneId:  pulumi.Any(_var.Cloudflare_zone_id),
// 			Enabled: pulumi.Bool(true),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		myPerZoneAopCert, err := cloudflare.NewAuthenticatedOriginPullsCertificate(ctx, "myPerZoneAopCert", &cloudflare.AuthenticatedOriginPullsCertificateArgs{
// 			ZoneId:      pulumi.Any(_var.Cloudflare_zone_id),
// 			Certificate: pulumi.String("-----INSERT CERTIFICATE-----"),
// 			PrivateKey:  pulumi.String("-----INSERT PRIVATE KEY-----"),
// 			Type:        pulumi.String("per-zone"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = cloudflare.NewAuthenticatedOriginPulls(ctx, "myPerZoneAop", &cloudflare.AuthenticatedOriginPullsArgs{
// 			ZoneId:                              pulumi.Any(_var.Cloudflare_zone_id),
// 			AuthenticatedOriginPullsCertificate: myPerZoneAopCert.ID(),
// 			Enabled:                             pulumi.Bool(true),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		myPerHostnameAopCert, err := cloudflare.NewAuthenticatedOriginPullsCertificate(ctx, "myPerHostnameAopCert", &cloudflare.AuthenticatedOriginPullsCertificateArgs{
// 			ZoneId:      pulumi.Any(_var.Cloudflare_zone_id),
// 			Certificate: pulumi.String("-----INSERT CERTIFICATE-----"),
// 			PrivateKey:  pulumi.String("-----INSERT PRIVATE KEY-----"),
// 			Type:        pulumi.String("per-hostname"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = cloudflare.NewAuthenticatedOriginPulls(ctx, "myPerHostnameAop", &cloudflare.AuthenticatedOriginPullsArgs{
// 			ZoneId:                              pulumi.Any(_var.Cloudflare_zone_id),
// 			AuthenticatedOriginPullsCertificate: myPerHostnameAopCert.ID(),
// 			Hostname:                            pulumi.String("aop.example.com"),
// 			Enabled:                             pulumi.Bool(true),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
type AuthenticatedOriginPulls struct {
	pulumi.CustomResourceState

	// The id of an uploaded Authenticated Origin Pulls certificate. If no hostname is provided, this certificate will be used zone wide as Per-Zone Authenticated Origin Pulls.
	AuthenticatedOriginPullsCertificate pulumi.StringPtrOutput `pulumi:"authenticatedOriginPullsCertificate"`
	// Whether or not to enable Authenticated Origin Pulls on the given zone or hostname.
	Enabled pulumi.BoolOutput `pulumi:"enabled"`
	// Specify a hostname to enable Per-Hostname Authenticated Origin Pulls on, using the provided certificate.
	Hostname pulumi.StringPtrOutput `pulumi:"hostname"`
	// The zone ID to upload the certificate to.
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewAuthenticatedOriginPulls registers a new resource with the given unique name, arguments, and options.
func NewAuthenticatedOriginPulls(ctx *pulumi.Context,
	name string, args *AuthenticatedOriginPullsArgs, opts ...pulumi.ResourceOption) (*AuthenticatedOriginPulls, error) {
	if args == nil || args.Enabled == nil {
		return nil, errors.New("missing required argument 'Enabled'")
	}
	if args == nil || args.ZoneId == nil {
		return nil, errors.New("missing required argument 'ZoneId'")
	}
	if args == nil {
		args = &AuthenticatedOriginPullsArgs{}
	}
	var resource AuthenticatedOriginPulls
	err := ctx.RegisterResource("cloudflare:index/authenticatedOriginPulls:AuthenticatedOriginPulls", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAuthenticatedOriginPulls gets an existing AuthenticatedOriginPulls resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAuthenticatedOriginPulls(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AuthenticatedOriginPullsState, opts ...pulumi.ResourceOption) (*AuthenticatedOriginPulls, error) {
	var resource AuthenticatedOriginPulls
	err := ctx.ReadResource("cloudflare:index/authenticatedOriginPulls:AuthenticatedOriginPulls", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AuthenticatedOriginPulls resources.
type authenticatedOriginPullsState struct {
	// The id of an uploaded Authenticated Origin Pulls certificate. If no hostname is provided, this certificate will be used zone wide as Per-Zone Authenticated Origin Pulls.
	AuthenticatedOriginPullsCertificate *string `pulumi:"authenticatedOriginPullsCertificate"`
	// Whether or not to enable Authenticated Origin Pulls on the given zone or hostname.
	Enabled *bool `pulumi:"enabled"`
	// Specify a hostname to enable Per-Hostname Authenticated Origin Pulls on, using the provided certificate.
	Hostname *string `pulumi:"hostname"`
	// The zone ID to upload the certificate to.
	ZoneId *string `pulumi:"zoneId"`
}

type AuthenticatedOriginPullsState struct {
	// The id of an uploaded Authenticated Origin Pulls certificate. If no hostname is provided, this certificate will be used zone wide as Per-Zone Authenticated Origin Pulls.
	AuthenticatedOriginPullsCertificate pulumi.StringPtrInput
	// Whether or not to enable Authenticated Origin Pulls on the given zone or hostname.
	Enabled pulumi.BoolPtrInput
	// Specify a hostname to enable Per-Hostname Authenticated Origin Pulls on, using the provided certificate.
	Hostname pulumi.StringPtrInput
	// The zone ID to upload the certificate to.
	ZoneId pulumi.StringPtrInput
}

func (AuthenticatedOriginPullsState) ElementType() reflect.Type {
	return reflect.TypeOf((*authenticatedOriginPullsState)(nil)).Elem()
}

type authenticatedOriginPullsArgs struct {
	// The id of an uploaded Authenticated Origin Pulls certificate. If no hostname is provided, this certificate will be used zone wide as Per-Zone Authenticated Origin Pulls.
	AuthenticatedOriginPullsCertificate *string `pulumi:"authenticatedOriginPullsCertificate"`
	// Whether or not to enable Authenticated Origin Pulls on the given zone or hostname.
	Enabled bool `pulumi:"enabled"`
	// Specify a hostname to enable Per-Hostname Authenticated Origin Pulls on, using the provided certificate.
	Hostname *string `pulumi:"hostname"`
	// The zone ID to upload the certificate to.
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a AuthenticatedOriginPulls resource.
type AuthenticatedOriginPullsArgs struct {
	// The id of an uploaded Authenticated Origin Pulls certificate. If no hostname is provided, this certificate will be used zone wide as Per-Zone Authenticated Origin Pulls.
	AuthenticatedOriginPullsCertificate pulumi.StringPtrInput
	// Whether or not to enable Authenticated Origin Pulls on the given zone or hostname.
	Enabled pulumi.BoolInput
	// Specify a hostname to enable Per-Hostname Authenticated Origin Pulls on, using the provided certificate.
	Hostname pulumi.StringPtrInput
	// The zone ID to upload the certificate to.
	ZoneId pulumi.StringInput
}

func (AuthenticatedOriginPullsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*authenticatedOriginPullsArgs)(nil)).Elem()
}
